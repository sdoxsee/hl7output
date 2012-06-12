package org.openmrs.module.hl7output.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.ConceptMap;
import org.openmrs.Encounter;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.api.ConceptService;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.NK1;
import ca.uhn.hl7v2.model.v25.segment.OBR;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import ca.uhn.hl7v2.model.v25.segment.ORC;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.model.v25.segment.PV1;
import ca.uhn.hl7v2.parser.PipeParser;

public class Mapper extends MapperOBR {

	Log log = LogFactory.getLog(this.getClass());
	
	private MapperMSH mapperMSH;
	private MapperPID mapperPID;
	private MapperNK1 mapperNK1;
	private MapperPV1 mapperPV1;
	private MapperORC mapperORC;
	private MapperOBX mapperOBX;
	private MapperOBR mapperOBR;
	
	public Mapper(ConceptService conceptService) {
		this.mapperMSH = new MapperMSH();
		this.mapperPID = new MapperPID();
		this.mapperNK1 = new MapperNK1();
		this.mapperPV1 = new MapperPV1();
		this.mapperORC = new MapperORC();
		this.mapperOBX = new MapperOBX(conceptService);
		this.mapperOBR = new MapperOBR();
	}
	
	public void mapToMSH(MSH msh) 
			throws DataTypeException {
		mapperMSH.mapToMSH(msh);
	}

	public void mapToPID(PID pid, Patient patient) 
			throws DataTypeException, HL7Exception {
		this.mapperPID.mapToPID(pid, patient);
	}

	public void mapToNK1(NK1 nk1, Patient patient) 
			throws DataTypeException {
		this.mapperNK1.mapToNK1(nk1, patient);
	}
	
	public void mapToPV1(PV1 pv1, List<Encounter> encounterList) 
			throws DataTypeException, HL7Exception {
		this.mapperPV1.mapToPV1(pv1, encounterList);
	}

	public void mapToORC(ORC orc, Encounter encounter) 
			throws DataTypeException, HL7Exception {
		this.mapperORC.mapToORC(orc, encounter);
	}
	
	public void mapToOBR(OBR obr, Encounter e, int reps)
			throws DataTypeException {
		this.mapperOBR.mapToOBR(obr, e, reps);
	}

	public void mapToOBX(OBX obx, Obs obs, int obxIndex) 
			throws DataTypeException, HL7Exception {
		this.mapperOBX.mapToOBX(obx, obs, obxIndex);
	}

	public void mapToORCs(ORU_R01 r01, List<Encounter> encounterList) 
			throws Exception {
		mapToORCs(getORCsAsList(r01), encounterList);
	}

	private List<ORC> getORCsAsList(ORU_R01 r01) {
		List<ORC> orcs = new ArrayList<ORC>();
		int reps = r01.getPATIENT_RESULT().getORDER_OBSERVATIONReps();
		for (int orderORCCount=0; orderORCCount < reps; ++orderORCCount) {
			ORC orc = r01.getPATIENT_RESULT().getORDER_OBSERVATION(orderORCCount).getORC();
			orcs.add(orc);
		}
		return orcs;
	}
	
	private void mapToORCs(List<ORC> orcs, List<Encounter> encounterList) 
			throws DataTypeException, HL7Exception {
		Iterator<ORC> orcIterator = orcs.iterator();
		for (Encounter encounter : encounterList) {
			if (orcIterator.hasNext()) {
				this.mapperORC.mapToORC(orcIterator.next(), encounter);
			}
		}
	}
	
	public void mapToOBRs(ORU_R01 r01, List<Encounter> encounterList)
			throws Exception {
		mapToOBRs(getOBRsAsList(r01), encounterList);
	}

	private void mapToOBRs(List<OBR> obrs, List<Encounter> encounterList)
			throws DataTypeException {
		Iterator<OBR> obrIterator = obrs.iterator();
		for (Encounter e : encounterList) {
			if (obrIterator.hasNext()) {
				mapToOBR(obrIterator.next(), e, obrs.size());
			}
		}
	}

	private List<OBR> getOBRsAsList(ORU_R01 r01) {
		int reps = r01.getPATIENT_RESULT().getORDER_OBSERVATIONReps();
		List<OBR> obrs = new ArrayList<OBR>();
		for(int orderObsCount = 0; orderObsCount < reps; ++orderObsCount) {
			OBR obr = r01.getPATIENT_RESULT().getORDER_OBSERVATION(orderObsCount).getOBR();
			obrs.add(obr);
		}
		return obrs;
	}

	public void mapToOBXs(ORU_R01 message, List<Encounter> encounterList)
			throws HL7Exception, DataTypeException {
		int orderIndex = 0;
		message.getPATIENT_RESULT()
		.getORDER_OBSERVATION(orderIndex)
		.getOBSERVATIONReps();
		for (Encounter e : encounterList) {
			int obxIndex = 0;
			for (Obs observation : e.getAllObs()) {
				if (hasMapping(observation)) {
					log.info("Obs has a mapping for concept...");

					// for each observation
					OBX obx = message.getPATIENT_RESULT()
							.getORDER_OBSERVATION(orderIndex)
							.getOBSERVATION(obxIndex).getOBX();
					
					mapToOBX(obx, observation, obxIndex);
					
					obxIndex++;
				}
			}

			orderIndex++;
		}
	}
	
	boolean hasMapping(Obs observation) {
		Collection<ConceptMap> conceptMappings = observation.getConcept()
				.getConceptMappings();
		boolean mapping = false;
		for (ConceptMap conceptMap : conceptMappings) {
			if (conceptMap.getSource().getHl7Code()
					.equals(RHEAHL7Constants.RW_CS)) {
				mapping = true;
			}
		}
		return mapping;
	}

	public String getMessage(AbstractMessage messageObject) {
		PipeParser pipeParser = new PipeParser();
		String msg = null;
		try {
			msg = pipeParser.encode(messageObject);
		} catch (HL7Exception e) {
			log.error("Exception parsing constructed message.");
		}
		return msg;
	}

}

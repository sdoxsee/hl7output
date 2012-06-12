package org.openmrs.module.hl7output.util;

import java.util.Collection;
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
		int orderORCCount = 0;
		for (Encounter encounter : encounterList) {
			ORC orc = r01.getPATIENT_RESULT().getORDER_OBSERVATION(orderORCCount).getORC();
			
			mapToORC(orc, encounter);
			
			orderORCCount++;
		}
	}
	
	public void mapToOBRs(ORU_R01 r01, List<Encounter> encounterList)
			throws Exception {
		int orderObsCount = 0;
		for (Encounter e : encounterList) {
			OBR obr = r01.getPATIENT_RESULT()
					.getORDER_OBSERVATION(orderObsCount).getOBR();
			int reps = r01.getPATIENT_RESULT().getORDER_OBSERVATIONReps();

			mapToOBR(obr, e, reps);

			orderObsCount++;
		}
	}

	public void mapToOBXs(ORU_R01 message, List<Encounter> encounterList)
			throws HL7Exception, DataTypeException {
		int orderIndex = 0;
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

package org.openmrs.module.hl7output.util;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Encounter;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.api.ConceptService;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.EVN;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.NK1;
import ca.uhn.hl7v2.model.v25.segment.OBR;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import ca.uhn.hl7v2.model.v25.segment.ORC;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.model.v25.segment.PV1;
import ca.uhn.hl7v2.parser.PipeParser;

public abstract class Mapper {

	Log log = LogFactory.getLog(this.getClass());
	
	private MapperMSH mapperMSH;
	private MapperEVN mapperEVN;
	private MapperPID mapperPID;
	private MapperNK1 mapperNK1;
	private MapperPV1 mapperPV1;
	private MapperORC mapperORC;
	private MapperOBX mapperOBX;
	private MapperOBR mapperOBR;

	private final Constants constants;
	
	public Mapper(ConceptService conceptService, Constants constants) {
		this.constants = constants;
		this.mapperMSH = new MapperMSH(constants);
		this.mapperEVN = new MapperEVN(constants);
		this.mapperPID = new MapperPID(constants);
		this.mapperNK1 = new MapperNK1(constants);
		this.mapperPV1 = new MapperPV1(constants);
		this.mapperORC = new MapperORC(constants);
		this.mapperOBX = new MapperOBX(conceptService, constants);
		this.mapperOBR = new MapperOBR(constants);
	}
	

	protected Constants getConstants() {
		return constants;
	}
	
	public void mapToMSH(MSH msh) 
			throws DataTypeException {
		mapperMSH.mapToMSH(msh);
	}

	public void mapToEVN(EVN evn) 
			throws DataTypeException {
		mapperEVN.mapToEVN(evn);
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

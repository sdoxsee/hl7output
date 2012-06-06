package org.openmrs.module.hl7output.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Patient;
import org.openmrs.api.ConceptService;
import org.openmrs.module.hl7output.custommodel.v25.segment.EVN;
import org.openmrs.module.hl7output.custommodel.v25.segment.MSH;
import org.openmrs.module.hl7output.custommodel.v25.segment.NK1;
import org.openmrs.module.hl7output.custommodel.v25.segment.PID;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;

public class CustomMapper {

	Log log = LogFactory.getLog(this.getClass());
	
	protected ConceptService conceptService;
	private CustomMapperMSH mapperMSH;
	private CustomMapperEVN mapperEVN;
	private CustomMapperPID mapperPID;
	private CustomMapperNK1 mapperNK1;
	
	public CustomMapper(ConceptService conceptService) {
		this.conceptService = conceptService;
		this.mapperMSH = new CustomMapperMSH();
		this.mapperEVN = new CustomMapperEVN();
		this.mapperPID = new CustomMapperPID();
		this.mapperNK1 = new CustomMapperNK1();
	}
	
	protected void mapToMSH(MSH msh) throws DataTypeException {
		mapperMSH.mapToMSH(msh);
	}
	protected void mapToEVN(EVN evn) throws DataTypeException {
		mapperEVN.mapToEVN(evn);
	}
	protected void mapToPID(PID pid, Patient patient) throws HL7Exception {
		mapperPID.mapToPID(pid, patient);
	}
	protected void mapToNK1(NK1 nk1, Patient patient) throws HL7Exception {
		mapperNK1.mapToNK1(nk1, patient);
	}
}

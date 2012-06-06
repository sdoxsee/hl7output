package org.openmrs.module.hl7output.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Patient;
import org.openmrs.api.ConceptService;
import org.openmrs.module.hl7output.custommodel.v25.segment.MSH;
import org.openmrs.module.hl7output.custommodel.v25.segment.PID;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;

public class CustomMapper {

	Log log = LogFactory.getLog(this.getClass());
	
	protected ConceptService conceptService;
	private CustomMapperMSH mapperMSH;
	private CustomMapperPID mapperPID;
	
	public CustomMapper(ConceptService conceptService) {
		this.conceptService = conceptService;
		this.mapperMSH = new CustomMapperMSH();
		this.mapperPID = new CustomMapperPID();
	}
	
	protected void mapToMSH(MSH msh) throws DataTypeException {
		mapperMSH.mapToMSH(msh);
	}
	protected void mapToPID(PID pid, Patient patient) throws HL7Exception {
		mapperPID.mapToPID(pid, patient);
	}
}

package org.openmrs.module.hl7output.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.ConceptService;
import org.openmrs.module.hl7output.custommodel.v25.segment.MSH;

import ca.uhn.hl7v2.model.DataTypeException;

public class CustomMapper {

	Log log = LogFactory.getLog(this.getClass());
	
	protected ConceptService conceptService;
	private CustomMapperMSH mapperMsh;
	
	public CustomMapper(ConceptService conceptService) {
		this.conceptService = conceptService;
		this.mapperMsh = new CustomMapperMSH();
	}
	
	protected void mapToMSH(MSH msh) throws DataTypeException {
		mapperMsh.mapToMSH(msh);
	}
}

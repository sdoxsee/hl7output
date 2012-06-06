package org.openmrs.module.hl7output.util;

import java.util.Date;

import org.openmrs.module.hl7output.custommodel.v25.segment.EVN;

import ca.uhn.hl7v2.model.DataTypeException;

public class CustomMapperEVN {

	public void mapToEVN(EVN evn) throws DataTypeException {
		evn.getRecordedDateTime().getTime().setValue(new Date());
	}

}

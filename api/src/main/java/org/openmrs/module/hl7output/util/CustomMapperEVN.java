package org.openmrs.module.hl7output.util;

import java.util.Date;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.EVN;

public class CustomMapperEVN {

	public void mapToEVN(EVN evn) throws DataTypeException {
		evn.getRecordedDateTime().getTime().setValue(new Date());
	}

}

package org.openmrs.module.hl7output.web.controller;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openmrs.api.APIException;
import org.openmrs.module.webservices.rest.web.response.ResponseException;
import org.openmrs.test.BaseModuleContextSensitiveTest;

import ca.uhn.hl7v2.HL7Exception;

@Ignore
public class HL7OutputControllerTest extends BaseModuleContextSensitiveTest {

	@Before
	public void runBeforeEachTest() throws Exception {
		executeDataSet("src/test/resources/RHEAControllerTest-initialData.xml");
	}
	
	@Test
	public void test() throws APIException, ResponseException, HL7Exception {
		String hl7Message = (String)new HL7OutputController().getHL7Message("XML",null, null);
		System.out.println(hl7Message);
	}

}

/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.hl7output.web.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Patient;
import org.openmrs.api.APIException;
import org.openmrs.api.context.Context;
import org.openmrs.module.hl7output.custommodel.v25.message.ZPT_ZP1;
import org.openmrs.module.hl7output.util.GenerateZPT_ZP1;
import org.openmrs.module.webservices.rest.web.response.ResponseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.conf.ProfileException;
import ca.uhn.hl7v2.conf.check.DefaultValidator;
import ca.uhn.hl7v2.conf.parser.ProfileParser;
import ca.uhn.hl7v2.conf.spec.RuntimeProfile;
import ca.uhn.hl7v2.parser.CustomModelClassFactory;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;

@Controller
public class HL7OutputController {

	private Log log = LogFactory.getLog(this.getClass());

	@RequestMapping(value = "/rest/hl7output/sample", method = RequestMethod.GET)
	@ResponseBody
	public Object getHL7Message(HttpServletRequest request, HttpServletResponse response)
			throws ResponseException, APIException, HL7Exception {
		GenerateZPT_ZP1 generator = new GenerateZPT_ZP1();
		Patient patient = Context.getPatientService().getAllPatients().get(0);
		ZPT_ZP1 message = generator.generateZPT_ZP1Message(patient, null);
		
		Parser customParser = new GenericParser(new CustomModelClassFactory(
				"org.openmrs.module.hl7output.custommodel"));
		String encodedMessage = customParser.encode(message, "XML");
		
		try {
			validate(message);
		} catch (ProfileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return encodedMessage;
	}

	private void validate(ZPT_ZP1 message) throws ProfileException,
			IOException, HL7Exception {
		ProfileParser parser = new ProfileParser(false);
		RuntimeProfile profile = parser.parseClasspath("org/openmrs/module/hl7output/custommodel/v25/ZPT_ZP1-conformance-profile.xml");
		HL7Exception[] errors = new DefaultValidator().validate(message, profile.getMessage());
		for (HL7Exception hl7Exception : errors) {
			log.info(hl7Exception.getMessage());
		}
	}
}
package org.openmrs.module.web.controller;
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
 *//*
package org.openmrs.module.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.jfree.util.Log;
import org.openmrs.api.context.Context;
import org.openmrs.hl7.HL7InArchive;
import org.openmrs.hl7.HL7InQueue;
import org.openmrs.hl7.HL7Source;
import org.openmrs.module.extension.html.HL7Receiver;
import org.openmrs.module.webservices.rest.SimpleObject;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.openmrs.module.webservices.rest.web.RestUtil;
import org.openmrs.module.webservices.rest.web.response.ConversionException;
import org.openmrs.module.webservices.rest.web.response.ResourceDoesNotSupportOperationException;
import org.openmrs.module.webservices.rest.web.response.ResponseException;
import org.openmrs.module.webservices.rest.web.v1_0.controller.BaseCrudController;
import org.openmrs.module.webservices.rest.web.v1_0.resource.HL7MessageResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ca.uhn.hl7v2.HL7Exception;


 * Controller for REST web service access to the HL7 message resource. Supports pushing, retrieving
 * and reviewing on the resource itself.
 
@Controller
@RequestMapping(value = "/rest/RHEA/aaaaa")
public class RHEAhl7MessageController extends BaseCrudController<HL7MessageResource> {
	
	private HL7Receiver receiver = new HL7Receiver();
	
	@ResponseBody
	@RequestMapping(value = "/{uuid}/encounters", method = RequestMethod.POST)
	public Object create(@RequestBody String hl7, HttpServletRequest request, HttpServletResponse response)
	        throws ResponseException, JsonParseException, JsonMappingException, IOException {
		RequestContext context = RestUtil.getRequestContext(request);
		SimpleObject post = new SimpleObject();
	
		System.out.println("RHEA HL7 Message Controller call detected...");
		
		String[] hl7split = hl7.split("\\|");
		if (hl7split.length < 10) {
			throw new ConversionException("The HL7 message is too short or has a wrong format: " + hl7);
		}
		String sourceKey = hl7split[9];
		String source = hl7split[3];
		
		post.add("sourceKey", sourceKey);
		post.add("source", source);
		post.add("data", hl7);
		
		System.out.println(source);
		HL7Source hl7Source = Context.getHL7Service().getHL7SourceByName(source);
		
		if (hl7Source == null) {
			throw new ConversionException("The " + source + " source was not recognized");
		}
		
		System.out.println("Creating HL7InQueue object...");
		
		HL7InQueue hl7InQueue = new HL7InQueue();
		
		hl7InQueue.setHL7Data(hl7.toString());
		System.out.println("hl7 message is : " + hl7.toString());
		
		hl7InQueue.setHL7Source(Context.getHL7Service().getHL7Source(1));
		System.out.println("hl7 source is : " + Context.getHL7Service().getHL7Source(1));
		
		hl7InQueue.setHL7SourceKey(sourceKey);
		System.out.println("hl7 source key is : " + sourceKey);
		
		Context.getHL7Service().saveHL7InQueue(hl7InQueue);
		
		try {
			//Call the processor method
			processHL7InQueue(hl7InQueue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Object created = getResource().create(post, context);
		//return RestUtil.created(response, created);
		return null;
	}
	

	
	 public void processHL7InQueue(HL7InQueue hl7InQueue) throws Exception {
         if (Log.isDebugEnabled())
        	 Log.debug("Processing HL7 inbound queue (id=" + hl7InQueue.getHL7InQueueId() + ",key="
                                 + hl7InQueue.getHL7SourceKey() + ")");

         // Parse the HL7 into an HL7Message or abort with failure
         String hl7Message = hl7InQueue.getHL7Data();
         try {
                 // Send the inbound HL7 message to our receiver routine for
                 // processing
                 if (Log.isDebugEnabled())
                	 Log.debug("Sending HL7 message to HL7 receiver");
                 
                 System.out.println("gonna get trolled !");
                // receiver.processMessage(hl7Message);
                
                 receiver.processMessage("MSH|^~\\&|FORMENTRY|AMRS.ELD|HL7LISTENER|AMRS.ELD|20080226102656||ORU^R01|JqnfhKKtouEz8kzTk6Zo|P|2.5|1||||||||16^AMRS.ELD.FORMID\r"
			        + "PID|1|2|3^^^^||John3^Doe^||\r"
			        + "PV1||O|||||2^Hornblower^Horatio||||||||||||1|||||||||||||||||||||||||201204290117^IN^46202||||||||||||||||||20120504|true\r"
			        + "ORC|RE||||||||20080226102537|1^Super User\r"
			        + "OBR|1|||1238^MEDICAL RECORD OBSERVATIONS^99DCT\r"
			        + "OBX|18|DT|5096^RETURN VISIT DATE^99DCT||20080506|||||||||20080212\r"
			        + "OBX|1|CWE|5018^PROBLEM ADDED^99DCT||5096^HUMAN IMMUNODEFICIENCY VIRUS^99DCT|||||||||20081003\r"
			        + "OBX|2|CWE|5089^PROBLEM ADDED^99DCT||PROPOSED^ASDFASDFASDF^99DCT|||||||||20081003");

                 // Move HL7 inbound queue entry into the archive before exiting
                 if (Log.isDebugEnabled())
                	 Log.debug("Archiving HL7 inbound queue entry");
                 HL7InArchive hl7InArchive = new HL7InArchive(hl7InQueue);
                 Context.getHL7Service().saveHL7InArchive(hl7InArchive);
                 if (Log.isDebugEnabled())
                	 Log.debug("Removing HL7 message from inbound queue");
                 //NOTE : the purging of the HL7Queue is done in theOpenMRS Core (hl7serviceimpl class). DONT call it here.
         }
         catch (HL7Exception e) {
                 boolean skipError = false;
                 Log.error("Unable to process hl7inqueue: " + hl7InQueue.getHL7InQueueId(), e);
                 Log.error("Hl7inqueue source: " + hl7InQueue.getHL7Source());
                 Log.error("hl7_processor.ignore_missing_patient_non_local? "
                                 + Context.getAdministrationService().getGlobalProperty("hl7_processor.ignore_missing_patient_non_local",
                                 "false"));
                 if (e.getCause() != null
                                 && e.getCause().getMessage().equals("Could not resolve patient")
                                 && !hl7InQueue.getHL7Source().getName().equals("local")
                                 && Context.getAdministrationService().getGlobalProperty(
                                                 "hl7_processor.ignore_missing_patient_non_local", "false").equals("true")) {
                         skipError = true;
                 }
                 if (!skipError)
                         e.printStackTrace();
                 
                 
                 return;
         }
         catch (Exception e) {
               e.printStackTrace();
         }

         // clean up memory after processing each queue entry (otherwise, the
         // memory-intensive process may crash or eat up all our memory)
         try {
                 Context.getHL7Service().garbageCollect();
         }
         catch (Exception e) {
        	 Log.error("Exception while performing garbagecollect in hl7 inbound processor", e);
         }

 }
}*/
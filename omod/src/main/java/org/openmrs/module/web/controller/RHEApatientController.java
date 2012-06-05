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
package org.openmrs.module.web.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Encounter;
import org.openmrs.Patient;
import org.openmrs.PatientIdentifierType;
import org.openmrs.api.LogEncounterService;
import org.openmrs.api.context.Context;
import org.openmrs.hl7.HL7InArchive;
import org.openmrs.hl7.HL7InError;
import org.openmrs.hl7.HL7InQueue;
import org.openmrs.hl7.HL7Source;
import org.openmrs.module.hl7output.util.GenerateORU_R01;
import org.openmrs.module.extension.html.HL7Receiver;
import org.openmrs.module.model.GetEncounterLog;
import org.openmrs.module.model.MatchingEncounters;
import org.openmrs.module.model.PostEncounterLog;
import org.openmrs.module.webservices.rest.SimpleObject;
import org.openmrs.module.webservices.rest.web.v1_0.controller.BaseCrudController;
import org.openmrs.module.webservices.rest.web.v1_0.resource.PatientResource;
import org.openmrs.module.webservices.rest.web.response.ConversionException;
import org.openmrs.module.webservices.rest.web.response.ResponseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;

@Controller
@RequestMapping(value = "/rest/RHEA/patient/")
public class RHEApatientController extends BaseCrudController<PatientResource> {
	
	private Log log = LogFactory.getLog(this.getClass());
	private HL7Receiver receiver = new HL7Receiver();
	
	@RequestMapping(value = "/{ecID}/encounters", method = RequestMethod.GET)
	@ResponseBody
	public Object getEncounters(@PathVariable("ecID") String enterpriseId,
	        @RequestParam(value = "encounterUniqueId", required = false) String encounterUniqueId,
	        @RequestParam(value = "dateStart", required = false) String dateStart,
	        @RequestParam(value = "dateEnd", required = false) String dateEnd, HttpServletRequest request,
	        HttpServletResponse response) throws ResponseException {
		
		LogEncounterService service = Context.getService(LogEncounterService.class);
		
		Date fromDate = null;
		Date toDate = null;
		Patient p = null;
		ORU_R01 r01 = null;
		
		log.info("RHEA Controller call detected...");
		log.info("Enterprise Patient Id is :" + enterpriseId);
		log.info("encounterUniqueId is :" + encounterUniqueId);
		log.info("dateStart is :" + dateStart);
		
		GetEncounterLog getEncounterLog = new GetEncounterLog();
		getEncounterLog.setEncounterUniqueId(encounterUniqueId);
		
		// first, we create from and to data objects out of the String
		// parameters
		
		if(enterpriseId == null){
			log.info("Error : missing enterpriseId");
			getEncounterLog.setResult("Error, missing enterpriseId");
			service.saveGetEncounterLog(getEncounterLog);
			
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
		
		getEncounterLog.setEnterpriseId(enterpriseId);
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		try {
			if (dateStart != null)
				fromDate = format.parse(dateStart);
		}
		catch (ParseException e) {
			log.info("Error : failed to parse specidied start date : " + dateStart);
			getEncounterLog.setResult("Error, incorrectly parsed start date");
			service.saveGetEncounterLog(getEncounterLog);
			
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
		
		log.info("fromDate is :" + fromDate);
		
		try {
			if (dateEnd != null)
				toDate = format.parse(dateEnd);
		}
		catch (ParseException e) {
			log.info("Error : failed to parse specidied end date : " + dateEnd);
			getEncounterLog.setResult("Error, incorrectly parsed start date");
			service.saveGetEncounterLog(getEncounterLog);
			
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return null;
		}
		
		log.info("toDate is :" + toDate);

		getEncounterLog.setDateEnd(toDate);
		getEncounterLog.setDateStart(fromDate);
			
		// Next, we try to retrieve the matching patient object
		if (enterpriseId != null) {
			PatientIdentifierType patientIdentifierType = Context.getPatientService().getPatientIdentifierTypeByName("ECID");
			List<PatientIdentifierType> identifierTypeList = new ArrayList<PatientIdentifierType>();
			identifierTypeList.add(patientIdentifierType);
			
			List<Patient> patients = Context.getPatientService().getPatients(null, enterpriseId, identifierTypeList, false);
			//I am not checking the identifier type here. Need to come back and add a check for this
			if(patients.size() == 1 ){
				p = patients.get(0);
			}
		}
		
		// if the patient doesn't exist, we need to return 400-BAD REQUEST
		// because the parameters are malformed
		if (p == null) {
			log.info("Error : failed to retreive patient for the given uuid : " + enterpriseId);
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			
		} else {
			log.info("Patient id : " + p.getPatientId() + "was retreived...");
			
			if (p != null) {
				//get all the encounters for this patient
				List<Encounter> encounterList = Context.getEncounterService().getEncountersByPatient(p);
				//if the enconteruniqueId is not null, we can isolate the given encounter
				
				if (encounterUniqueId != null) {
					Iterator<Encounter> i = encounterList.iterator();
					while (i.hasNext()) {
						if (!i.next().getUuid().equals(encounterUniqueId))
							i.remove();
					}
				}
				
				//If the encounterUniqueId was not given, we will try to filter encounters based on from and to dates
				List<Encounter> filteredEncounterList = new ArrayList<Encounter>();
				
				if (fromDate != null || toDate != null) {
					for (Encounter encounter : encounterList) {
						if (fromDate != null && toDate != null) {
							if ((encounter.getEncounterDatetime().after(fromDate))
							        && (encounter.getEncounterDatetime().before(toDate))) {
								filteredEncounterList.add(encounter);
							}
							
						} else if (fromDate == null) {
							if (encounter.getEncounterDatetime().before(toDate)) {
								filteredEncounterList.add(encounter);
							}
							
						} else {
							if (encounter.getEncounterDatetime().after(fromDate)) {
								filteredEncounterList.add(encounter);
							}
							
						}
					}
					
					log.info("The number of matching encounters are :" + filteredEncounterList.size());
					encounterList = filteredEncounterList;
				}
				log.info("Calling the ORU_R01 parser...");
				
				SortedSet<MatchingEncounters> encounterSet = new TreeSet<MatchingEncounters>();
				
				for (Encounter e : encounterList){
					MatchingEncounters matchingEncounters = new MatchingEncounters();
					matchingEncounters.setGetEncounterLog(getEncounterLog);
					matchingEncounters.setEncounterId(e.getEncounterId());
					
					encounterSet.add(matchingEncounters);
				}
				
				 getEncounterLog.setLogTime(new Date());
				 if(encounterList.size() > 0)
				 getEncounterLog.setResult("Results Retrived");
				 if(encounterList.size() == 0)
				 getEncounterLog.setResult("No Results Retrived"); 
				
				//Now we will generate the HL7 message
				
				GenerateORU_R01 R01Util = new GenerateORU_R01();
				try {
					r01 = R01Util.generateORU_R01Message(p, encounterList);
				} catch (Exception e) {
					getEncounterLog.setResult("Error : Processing hl7 message failed");
					service.saveGetEncounterLog(getEncounterLog);
					response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
					return null;
				}
				
				 getEncounterLog.getMatchingEncounters().clear();
			     getEncounterLog.setMatchingEncounters(encounterSet);
			        
			     service.saveGetEncounterLog(getEncounterLog);
			     
			
			}
			
			try {
				// Convert the ORU_R01 object into a byte stream
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				oos.writeObject(r01);
				oos.flush();
				oos.close();
				bos.close();
				byte[] data = bos.toByteArray();
				
				// Write the bytestream into the HttpServletResponse
				ServletOutputStream stream = response.getOutputStream();
				stream.write(data);
				stream.flush();
				
				response.getWriter().flush();
				response.getWriter().close();
				
				//NOTE : Im returning the ORU_R01 object as a bytestream AND a session object. Why both ? remove one later !
				request.getSession().setAttribute("oru_r01", r01);
				
				response.setStatus(HttpServletResponse.SC_OK);
				
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		// Return null for now
		return null;
	}
	
	@RequestMapping(value = "/{ecID}/encounters", method = RequestMethod.POST)
	@ResponseBody
	public Object createEncounters(@RequestBody String hl7, @PathVariable("ecID") String enterpriseId,
	        HttpServletRequest request, HttpServletResponse response) throws ResponseException {
		Patient patient = null;
		
		LogEncounterService service = Context.getService(LogEncounterService.class);

		PostEncounterLog postEncounterLog = new PostEncounterLog();
		postEncounterLog.setEnterpriseId(enterpriseId);
		postEncounterLog.setHl7data(hl7);
		postEncounterLog.setDateCreated(new Date());
		postEncounterLog.setUserId(Context.getUserContext().getAuthenticatedUser().getUserId());
		
		SimpleObject post = new SimpleObject();

		log.info("RHEA HL7 Message Controller call detected...");
		
		String[] hl7split = hl7.split("\\|");
		if (hl7split.length < 10) {
			
			postEncounterLog.setErrorMessage("The HL7 message is too short or has a wrong format");
			postEncounterLog.setValid(false);
			service.savePostEncounterLog(postEncounterLog);
			
			log.info("The HL7 message is too short or has a wrong format: " + hl7);
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			
			return null;
		}
		
			postEncounterLog.setValid(true);
			service.savePostEncounterLog(postEncounterLog);
		
		if (enterpriseId != null) {
			PatientIdentifierType patientIdentifierType = Context.getPatientService().getPatientIdentifierTypeByName("ECID");
			List<PatientIdentifierType> identifierTypeList = new ArrayList<PatientIdentifierType>();
			identifierTypeList.add(patientIdentifierType);
			
			List<Patient> patients = Context.getPatientService().getPatients(null, enterpriseId, identifierTypeList, false);
			//I am not checking the identifier type here. Need to come back and add a check for this
			if(patients.size() == 1 ){
				patient = patients.get(0);
			}
		}
		
		if(patient == null){
			log.info("Error, Patient is missing : " + hl7);
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);		
		}else{
		String sourceKey = hl7split[9];
		String source = hl7split[3];
		log.info("Source key : " + sourceKey);
		log.info("Source  : " + source);
		log.info("data :" + hl7);
		log.info("enterprise id :" + enterpriseId);
		
		post.add("sourceKey", sourceKey);
		post.add("source", source);
		post.add("data", hl7);
		
		//For RHEA, should the source be a single static entity ?
		HL7Source hl7Source = Context.getHL7Service().getHL7SourceByName(source);
		
		if (hl7Source == null) {
			throw new ConversionException("The " + source + " source was not recognized");
		}
		
		log.info("Creating HL7InQueue object...");
		
		HL7InQueue hl7InQueue = new HL7InQueue();
		
		hl7InQueue.setHL7Data(hl7);
		log.info("hl7 message is : " + hl7.toString());
		
		hl7InQueue.setHL7Source(hl7Source);
		log.info("hl7 source is : " + hl7Source.toString());
		
		hl7InQueue.setHL7SourceKey(sourceKey);
		log.info("hl7 source key is : " + sourceKey);
		
		Context.getHL7Service().saveHL7InQueue(hl7InQueue);
		
		try {
			//Call the processor method
			processHL7InQueue(hl7InQueue, enterpriseId);
		}
		catch (HL7Exception e) {
			e.printStackTrace();
			HL7InError error = new HL7InError(hl7InQueue);
			error.setError(e.getMessage());
			Context.getHL7Service().saveHL7InError(error);
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		} catch (Exception e) {
			e.printStackTrace();
			HL7InError error = new HL7InError(hl7InQueue);
			error.setError(e.getMessage());
			Context.getHL7Service().saveHL7InError(error);
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		
		//Object created = getResource().create(post, context);
		//return RestUtil.created(response, created);
		}
		return null;
	}
	
	public void processHL7InQueue(HL7InQueue hl7InQueue, String enterpriseId) throws HL7Exception, Exception {
		if (log.isDebugEnabled())
			log.debug("Processing HL7 inbound queue (id=" + hl7InQueue.getHL7InQueueId() + ",key="
			        + hl7InQueue.getHL7SourceKey() + ")");
		
		// Parse the HL7 into an HL7Message or abort with failure
		String hl7Message = hl7InQueue.getHL7Data();

			// Send the inbound HL7 message to our receiver routine for
			// processing
			if (log.isDebugEnabled())
				log.debug("Sending HL7 message to HL7 receiver");
				
			receiver.processMessage(hl7Message, enterpriseId);
				
			// Move HL7 inbound queue entry into the archive before exiting
			if (log.isDebugEnabled())
				log.debug("Archiving HL7 inbound queue entry");
			HL7InArchive hl7InArchive = new HL7InArchive(hl7InQueue);
			Context.getHL7Service().saveHL7InArchive(hl7InArchive);
			if (log.isDebugEnabled())
				log.debug("Removing HL7 message from inbound queue");
			//NOTE : the purging of the HL7Queue is done in theOpenMRS Core (hl7serviceimpl class). DONT call it here.
		
		// clean up memory after processing each queue entry (otherwise, the
		// memory-intensive process may crash or eat up all our memory)
			Context.getHL7Service().garbageCollect();	
	}
	
}

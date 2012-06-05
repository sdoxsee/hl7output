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
package org.openmrs.module.hl7output.util;

import java.io.Serializable;
import java.util.List;

import org.openmrs.Encounter;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;

import ca.uhn.hl7v2.model.v25.group.ORU_R01_PATIENT;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;

public class GenerateORU_R01 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Mapper mapper;
	
	public GenerateORU_R01() {
		this(new Mapper(Context.getConceptService()));
	}
	
	public GenerateORU_R01(Mapper mapper) {
		this.mapper = mapper;
	}
	
	public ORU_R01 generateORU_R01Message(Patient patient, List<Encounter> encounterList) throws Exception {
		ORU_R01 message = new ORU_R01();
		
		this.mapper.mapToMSH(message.getMSH());

		ORU_R01_PATIENT oru_R01_PATIENT = message.getPATIENT_RESULT().getPATIENT();
		
		this.mapper.mapToPID(oru_R01_PATIENT.getPID(), patient);
		this.mapper.mapToPV1(oru_R01_PATIENT.getVISIT().getPV1(), encounterList);
		this.mapper.mapToNK1(oru_R01_PATIENT.getNK1(), patient);
		// populate ORC segments
		this.mapper.mapToORCs(message, encounterList);
		// populate OBR segments
		this.mapper.mapToOBRs(message, encounterList);
		// populate OBX segments
		this.mapper.mapToOBXs(message, encounterList);
		
		return message;
	}
}

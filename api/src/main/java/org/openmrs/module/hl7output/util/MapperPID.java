package org.openmrs.module.hl7output.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.openmrs.Cohort;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.PID;

public class MapperPID {

	protected void mapToPID(PID pid, Patient patient) throws DataTypeException,
			HL7Exception {
		Cohort singlePatientCohort = new Cohort();
		singlePatientCohort.addMember(patient.getId());

		Map<Integer, String> patientIdentifierMap = Context
				.getPatientSetService().getPatientIdentifierStringsByType(
						singlePatientCohort,
						Context.getPatientService()
								.getPatientIdentifierTypeByName(
										RHEAHL7Constants.IDENTIFIER_TYPE));

		pid.getSetIDPID().setValue(RHEAHL7Constants.IDPID);
		pid.getPatientIdentifierList(0)
				.getIDNumber()
				.setValue(
						patientIdentifierMap.get(patientIdentifierMap.keySet()
								.iterator().next()));
		pid.getPatientIdentifierList(0).getIdentifierTypeCode()
				.setValue(RHEAHL7Constants.IDENTIFIER_TYPE_CODE);
		pid.getPatientName(0).getFamilyName().getSurname()
				.setValue(patient.getFamilyName());

		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Date dob = patient.getBirthdate();
		Date dod = patient.getDeathDate();
		String dobStr = "";
		String dodStr = "";
		if (dob != null)
			dobStr = df.format(dob);
		if (dod != null)
			dodStr = df.format(dod);

		// Address
		pid.getPatientAddress(0).getStreetAddress().getStreetOrMailingAddress()
				.setValue(patient.getPersonAddress().getAddress1());
		pid.getPatientAddress(0).getOtherDesignation()
				.setValue(patient.getPersonAddress().getAddress2());
		pid.getPatientAddress(0).getCity()
				.setValue(patient.getPersonAddress().getCityVillage());
		pid.getPatientAddress(0).getStateOrProvince()
				.setValue(patient.getPersonAddress().getStateProvince());
		pid.getPatientAddress(0).getZipOrPostalCode()
				.setValue(patient.getPersonAddress().getPostalCode());

		// gender
		pid.getAdministrativeSex().setValue(patient.getGender());

		// dob
		pid.getDateTimeOfBirth().getTime().setValue(dobStr);

		// Death
		pid.getPatientDeathIndicator().setValue(patient.getDead().toString());
		pid.getPatientDeathDateAndTime().getTime().setValue(dodStr);
	}

}

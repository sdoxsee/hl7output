package org.openmrs.module.hl7output.util;

import java.text.SimpleDateFormat;
import java.util.List;

import org.openmrs.Encounter;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.PV1;

public class MapperPV1 {

	public void mapToPV1(PV1 pv1, List<Encounter> encounterList) throws DataTypeException,
			HL7Exception {
				pv1.getSetIDPV1().setValue(RHEAHL7Constants.IDPV1);
				pv1.getPatientClass().setValue(RHEAHL7Constants.PATIENT_CLASS);
				pv1.getAssignedPatientLocation().getFacility().getNamespaceID()
						.setValue(encounterList.get(0).getLocation().getDescription());
				if (encounterList.get(0).getProvider().getId() != null)
					pv1.getAttendingDoctor(0)
							.getIDNumber()
							.setValue(
									encounterList.get(0).getProvider().getId()
											.toString());
			
				pv1.getAttendingDoctor(0).getFamilyName().getSurname()
						.setValue(encounterList.get(0).getProvider().getFamilyName());
				pv1.getAttendingDoctor(0).getGivenName()
						.setValue(encounterList.get(0).getProvider().getGivenName());
				pv1.getVisitNumber().getIDNumber()
						.setValue(encounterList.get(0).getEncounterId().toString());
				pv1.getAdmitDateTime()
						.getTime()
						.setValue(
								new SimpleDateFormat("yyyyMMddhhmm")
										.format(encounterList.get(0).getDateCreated()));
			}

}

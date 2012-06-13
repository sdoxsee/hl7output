package org.openmrs.module.hl7output.util;

import java.text.SimpleDateFormat;
import java.util.List;

import org.openmrs.Encounter;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.PV1;

public class MapperPV1 {

	private final Constants constants;

	public MapperPV1(Constants constants) {
		this.constants = constants;
	}

	public Constants getConstants() {
		return constants;
	}

	public void mapToPV1(PV1 pv1, List<Encounter> encounterList)
			throws DataTypeException, HL7Exception {
		for (Encounter encounter : encounterList) {
			pv1.getSetIDPV1().setValue(getConstants().getProperty("IDPV1"));
			pv1.getPatientClass().setValue(getConstants().getProperty("PATIENT_CLASS"));
			pv1.getAssignedPatientLocation().getFacility().getNamespaceID()
					.setValue(encounter.getLocation().getDescription());
			if (encounter.getProvider().getId() != null)
				pv1.getAttendingDoctor(0).getIDNumber()
						.setValue(encounter.getProvider().getId().toString());

			pv1.getAttendingDoctor(0).getFamilyName().getSurname()
					.setValue(encounter.getProvider().getFamilyName());
			pv1.getAttendingDoctor(0).getGivenName()
					.setValue(encounter.getProvider().getGivenName());
			pv1.getVisitNumber().getIDNumber()
					.setValue(encounter.getEncounterId().toString());
			pv1.getAdmitDateTime()
					.getTime()
					.setValue(
							new SimpleDateFormat("yyyyMMddhhmm")
									.format(encounter.getDateCreated()));
			return; // right now, we're only mapping one encounter
		}
	}
}

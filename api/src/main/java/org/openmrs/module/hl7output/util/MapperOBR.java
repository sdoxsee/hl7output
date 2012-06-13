package org.openmrs.module.hl7output.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openmrs.Encounter;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.OBR;

public class MapperOBR {

	private final Constants constants;

	public MapperOBR(Constants constants) {
		this.constants = constants;
	}

	public Constants getConstants() {
		return constants;
	}

	protected void mapToOBR(OBR obr, Encounter e, int reps)
			throws DataTypeException {
		Date encDt = e.getEncounterDatetime();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyyMMdd");

		String encDateStr = "";
		String encDateOnly = "";
		if (encDt != null) {
			encDateStr = df.format(encDt);
			encDateOnly = dayFormat.format(encDt);
		}
		obr.getObservationDateTime().getTime().setValue(encDateStr);
		obr.getSetIDOBR().setValue(String.valueOf(reps));
		obr.getUniversalServiceIdentifier().getIdentifier()
				.setValue(getConstants().getUnivServiceID());
		obr.getUniversalServiceIdentifier().getText()
				.setValue(getConstants().getProperty("UNIV_SERVICE_NAME"));
		obr.getUniversalServiceIdentifier().getNameOfCodingSystem()
				.setValue(getConstants().getProperty("OBR_CODE_SYSTEM"));
		obr.getOrderingProvider(0).getFamilyName().getSurname()
				.setValue(e.getProvider().getFamilyName());
		obr.getOrderingProvider(0).getGivenName()
				.setValue(e.getProvider().getGivenName());
		obr.getOrderingProvider(0).getIDNumber()
				.setValue(Integer.toString(e.getProvider().getId()));
		obr.getResultCopiesTo(0).getFamilyName().getSurname()
				.setValue(e.getProvider().getFamilyName());
		obr.getResultCopiesTo(0).getGivenName()
				.setValue(e.getProvider().getGivenName());
		obr.getResultCopiesTo(0).getIDNumber()
				.setValue(Integer.toString(e.getProvider().getId()));
		obr.getResultStatus().setValue(getConstants().getProperty("RESULT_STATUS"));
		obr.getSpecimenActionCode().setValue(
				getConstants().getProperty("SPECIMEN_ACTION_CODE"));

		// Accession number
		String accessionNumber = String.valueOf(e.getEncounterId()) + "-"
				+ getConstants().getUnivServiceID() + "-" + encDateOnly;
		obr.getFillerOrderNumber().getEntityIdentifier()
				.setValue(accessionNumber);
	}

}

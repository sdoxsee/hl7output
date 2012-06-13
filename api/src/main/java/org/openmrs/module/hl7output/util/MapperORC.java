package org.openmrs.module.hl7output.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openmrs.Encounter;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.ORC;

public class MapperORC {

	private final Constants constants;

	public MapperORC(Constants constants) {
		this.constants = constants;
	}

	public Constants getConstants() {
		return constants;
	}

	public void mapToORC(ORC orc, Encounter encounter)
			throws DataTypeException, HL7Exception {
		orc.getPlacerOrderNumber().getNamespaceID()
				.setValue(getConstants().getProviderSendingApplication());
		orc.getOrderingProvider(0).getFamilyName().getSurname()
				.setValue(encounter.getProvider().getFamilyName());

		orc.getOrderingProvider(0).getGivenName()
				.setValue(encounter.getProvider().getGivenName());
		orc.getOrderingProvider(0).getIDNumber()
				.setValue(encounter.getProvider().getId().toString());

		orc.getOrderControlCodeReason().getIdentifier().setValue("");

		orc.getEnteredBy(0).getFamilyName().getSurname()
				.setValue(encounter.getCreator().getFamilyName());
		orc.getEnteredBy(0).getGivenName()
				.setValue(encounter.getCreator().getGivenName());
		orc.getEnteredBy(0).getIDNumber()
				.setValue(encounter.getCreator().getId().toString());

		// Cannot input ordering facility information since OpenMRS trunk does
		// not store these

		orc.getEnteringOrganization().getText()
				.setValue(getConstants().getEnteringOrganization());
		orc.getOrderingFacilityName(0).getOrganizationName()
				.setValue(getConstants().getOrderingOrganization());

		// How shall I fill in the Order control reason ?
		// orc.getOrderControlCodeReason();

		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
		String dateStr = "";
		Date d = new Date();
		dateStr = df.format(d);

		orc.getDateTimeOfTransaction().getTime().setValue(dateStr);
	}

}

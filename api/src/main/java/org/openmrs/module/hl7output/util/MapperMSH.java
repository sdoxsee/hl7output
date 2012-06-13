package org.openmrs.module.hl7output.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.MSH;

public class MapperMSH {

	private final Constants constants;

	public MapperMSH(Constants constants) {
		this.constants = constants;
	}

	public Constants getConstants() {
		return constants;
	}

	protected void mapToMSH(MSH msh) throws DataTypeException {
		msh.getFieldSeparator()
			.setValue(getConstants().getFieldSeparator());//
		msh.getEncodingCharacters()
			.setValue(getConstants().getEncodingCharacters());//
		msh.getVersionID().getInternationalizationCode().getIdentifier()
			.setValue(getConstants().getInternationalizationCode());//
		msh.getVersionID().getVersionID()
			.setValue(getConstants().getVersion());//
		msh.getDateTimeOfMessage().getTime()
			.setValue(getCurrentDate());//
		msh.getSendingApplication().getNamespaceID()
			.setValue(getConstants().getSendingApplication());
		msh.getSendingFacility().getNamespaceID()
			.setValue(getConstants().getSendingFacility());//
		msh.getMessageType().getMessageCode()
			.setValue(getConstants().getMessageType());//
		msh.getMessageType().getTriggerEvent()
			.setValue(getConstants().getTriggerEvent());//
		msh.getMessageType().getMessageStructure()
			.setValue(getConstants().getMessageStructure());//
		msh.getReceivingApplication().getNamespaceID()
			.setValue(getConstants().getReceivingApplication());
		msh.getReceivingFacility().getNamespaceID()
			.setValue(getConstants().getReceivingFacility());//
		msh.getProcessingID().getProcessingID()
			.setValue(getConstants().getProcessingID());//
		msh.getProcessingID().getProcessingMode()
			.setValue(getConstants().getProcessingMode());//
		msh.getMessageControlID()
			.setValue(UUID.randomUUID().toString());//
		msh.getAcceptAcknowledgmentType()
			.setValue(getConstants().getAckType());
		msh.getApplicationAcknowledgmentType()
			.setValue(getConstants().getApplicationAckType());
	}

	String getCurrentDate() {
		// Get current date
		String dateFormat = "yyyyMMddHHmmss";
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		String formattedDate = formatter.format(new Date());
		return formattedDate;
	}

}

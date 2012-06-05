package org.openmrs.module.hl7output.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.MSH;

public class MapperMSH {

	protected void mapToMSH(MSH msh) throws DataTypeException {
		msh.getFieldSeparator().setValue(RHEAHL7Constants.FIELD_SEPARATOR);//
		msh.getEncodingCharacters().setValue(
				RHEAHL7Constants.ENCODING_CHARACTERS);//
		msh.getVersionID().getInternationalizationCode().getIdentifier()
				.setValue(RHEAHL7Constants.INTERNATIONALIZATION_CODE);//
		msh.getVersionID().getVersionID().setValue(RHEAHL7Constants.VERSION);//
		msh.getDateTimeOfMessage().getTime().setValue(getCurrentDate());//
		msh.getSendingApplication().getNamespaceID()
				.setValue(RHEAHL7Constants.SENDING_APPLICATION);
		msh.getSendingFacility().getNamespaceID()
				.setValue(RHEAHL7Constants.SENDING_FACILITY);//
		msh.getMessageType().getMessageCode()
				.setValue(RHEAHL7Constants.MESSAGE_TYPE);//
		msh.getMessageType().getTriggerEvent()
				.setValue(RHEAHL7Constants.TRIGGER_EVENT);//
		msh.getMessageType().getMessageStructure()
				.setValue(RHEAHL7Constants.MESSAGE_STRUCTURE);//
		msh.getReceivingApplication().getNamespaceID()
				.setValue(RHEAHL7Constants.RECEIVING_APPLICATION);
		msh.getReceivingFacility().getNamespaceID()
				.setValue(RHEAHL7Constants.RECEIVING_FACILITY);//
		msh.getProcessingID().getProcessingID()
				.setValue(RHEAHL7Constants.PROCESSING_ID);//
		msh.getProcessingID().getProcessingMode()
				.setValue(RHEAHL7Constants.PROCESSING_MODE);//
		msh.getMessageControlID().setValue(UUID.randomUUID().toString());//
	
		msh.getAcceptAcknowledgmentType().setValue(RHEAHL7Constants.ACK_TYPE);
		msh.getApplicationAcknowledgmentType().setValue(
				RHEAHL7Constants.APPLICATION_ACK_TYPE);
	}

	String getCurrentDate() {
		// Get current date
		String dateFormat = "yyyyMMddHHmmss";
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		String formattedDate = formatter.format(new Date());
		return formattedDate;
	}

}

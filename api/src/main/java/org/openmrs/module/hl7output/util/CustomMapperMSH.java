package org.openmrs.module.hl7output.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.MSH;

public class CustomMapperMSH {

	protected void mapToMSH(MSH msh) throws DataTypeException {
		msh.getFieldSeparator().setValue(BaobabHL7Constants.FIELD_SEPARATOR);//
		msh.getEncodingCharacters().setValue(
				BaobabHL7Constants.ENCODING_CHARACTERS);//
		msh.getVersionID().getInternationalizationCode().getIdentifier()
				.setValue(BaobabHL7Constants.INTERNATIONALIZATION_CODE);//
		msh.getVersionID().getVersionID().setValue(BaobabHL7Constants.VERSION);//
		msh.getDateTimeOfMessage().getTime().setValue(getCurrentDate());//
		msh.getSendingApplication().getNamespaceID()
				.setValue(BaobabHL7Constants.SENDING_APPLICATION);
		msh.getSendingFacility().getNamespaceID()
				.setValue(BaobabHL7Constants.SENDING_FACILITY);//
		msh.getMessageType().getMessageCode()
				.setValue(BaobabHL7Constants.MESSAGE_TYPE);//
		msh.getMessageType().getTriggerEvent()
				.setValue(BaobabHL7Constants.TRIGGER_EVENT);//
		msh.getMessageType().getMessageStructure()
				.setValue(BaobabHL7Constants.MESSAGE_STRUCTURE);//
		msh.getReceivingApplication().getNamespaceID()
				.setValue(BaobabHL7Constants.RECEIVING_APPLICATION);
		msh.getReceivingFacility().getNamespaceID()
				.setValue(BaobabHL7Constants.RECEIVING_FACILITY);//
		msh.getProcessingID().getProcessingID()
				.setValue(BaobabHL7Constants.PROCESSING_ID);//
		msh.getProcessingID().getProcessingMode()
				.setValue(BaobabHL7Constants.PROCESSING_MODE);//
		msh.getMessageControlID().setValue(UUID.randomUUID().toString());//
	
		msh.getAcceptAcknowledgmentType().setValue(BaobabHL7Constants.ACK_TYPE);
		msh.getApplicationAcknowledgmentType().setValue(
				BaobabHL7Constants.APPLICATION_ACK_TYPE);
	}

	String getCurrentDate() {
		// Get current date
		String dateFormat = "yyyyMMddHHmmss";
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		String formattedDate = formatter.format(new Date());
		return formattedDate;
	}

}

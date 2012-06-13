package org.openmrs.module.hl7output.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Constants {
	
	private static final String MESSAGE_TYPE = "MESSAGE_TYPE";
	private static final String SENDING_FACILITY = "SENDING_FACILITY";
	private static final String SENDING_APPLICATION = "SENDING_APPLICATION";
	private static final String FIELD_SEPARATOR = "FIELD_SEPARATOR";
	private static final String ENCODING_CHARACTERS = "ENCODING_CHARACTERS";
	private static final String VERSION = "VERSION";
	private static final String INTERNATIONALIZATION_CODE = "INTERNATIONALIZATION_CODE";
	private static final String TRIGGER_EVENT = "TRIGGER_EVENT";
	private static final String MESSAGE_STRUCTURE = "MESSAGE_STRUCTURE";
	private static final String RECEIVING_APPLICATION = "RECEIVING_APPLICATION";
	private static final String RECEIVING_FACILITY = "RECEIVING_FACILITY";
	private static final String PROCESSING_ID = "PROCESSING_ID";
	private static final String PROCESSING_MODE = "PROCESSING_MODE";
	private static final String ACK_TYPE = "ACK_TYPE";
	private static final String APPLICATION_ACK_TYPE = "APPLICATION_ACK_TYPE";
	private static final String PROVIDER_SENDING_APPLICATION = "PROVIDER_SENDING_APPLICATION";
	private static final String ENTERING_ORGANIZATION = "ENTERING_ORGANIZATION";
	private static final String ORDERING_ORGANIZATION = "ORDERING_ORGANIZATION";
	private static final String ATTR_NEXT_OF_KIN = "ATTR_NEXT_OF_KIN";
	private static final String ATTR_TELEPHONE_NUMBER = "ATTR_TELEPHONE_NUMBER";
	private static final String UNIV_SERVICE_ID = "UNIV_SERVICE_ID";
	private static final String RW_CS = "RW_CS";
	private static final String IDENTIFIER_TYPE = "IDENTIFIER_TYPE";
	
	Log log = LogFactory.getLog(this.getClass());
	
	private Properties properties;
	private Properties defaultProperties;

	public Constants(InputStream inputStream) {
		this.properties = loadProperties(inputStream);
		this.defaultProperties = loadProperties(getClass().getResourceAsStream("default.properties"));
	}

	private Properties loadProperties(InputStream inputStream) {
		Properties properties = new Properties();
		try {
			if (inputStream == null) {
				throw new IOException("InputStream is null for " + inputStream);
			}
			properties.load(inputStream);
		} catch(IOException e) {
			e.printStackTrace();
			this.log.warn("Could not read " + inputStream + ". Defaults will be null", e);
		}
		return properties;
	}
	
	String getProperty(String propertyName) {
		return properties.getProperty(propertyName, 
				this.defaultProperties.getProperty(propertyName));
	}

	public String getFieldSeparator() {
		return getProperty(FIELD_SEPARATOR);
	}
	public String getInternationalizationCode() {
		return getProperty(INTERNATIONALIZATION_CODE);
	}
	public String getVersion() {
		return getProperty(VERSION);
	}
	public String getEncodingCharacters() {
		return getProperty(ENCODING_CHARACTERS);
	}
	public String getSendingApplication() {
		return getProperty(SENDING_APPLICATION);
	}
	public String getSendingFacility() {
		return getProperty(SENDING_FACILITY);
	}
	public String getMessageType() {
		return getProperty(MESSAGE_TYPE);
	}
	public String getTriggerEvent() {
		return getProperty(TRIGGER_EVENT);
	}
	public String getMessageStructure() {
		return getProperty(MESSAGE_STRUCTURE);
	}
	public String getReceivingApplication() {
		return getProperty(RECEIVING_APPLICATION);
	}
	public String getReceivingFacility() {
		return getProperty(RECEIVING_FACILITY);
	}
	public String getProcessingID() {
		return getProperty(PROCESSING_ID);
	}
	public String getProcessingMode() {
		return getProperty(PROCESSING_MODE);
	}
	public String getAckType() {
		return getProperty(ACK_TYPE);
	}
	public String getApplicationAckType() {
		return getProperty(APPLICATION_ACK_TYPE);
	}
	public String getProviderSendingApplication() {
		return getProperty(PROVIDER_SENDING_APPLICATION);
	}
	public String getEnteringOrganization() {
		return getProperty(ENTERING_ORGANIZATION);
	}
	public String getOrderingOrganization() {
		return getProperty(ORDERING_ORGANIZATION);
	}
	public String getNextOfKin() {
		return getProperty(ATTR_NEXT_OF_KIN);
	}
	public String getTelephoneNumber() {
		return getProperty(ATTR_TELEPHONE_NUMBER);
	}
	public String getUnivServiceID() {
		return getProperty(UNIV_SERVICE_ID);
	}
	public String getRW_CS() {
		return getProperty(RW_CS);
	}
	public String getIdentifierType() {
		return getProperty(IDENTIFIER_TYPE);
	}
}

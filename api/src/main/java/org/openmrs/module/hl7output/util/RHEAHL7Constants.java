package org.openmrs.module.hl7output.util;

public class RHEAHL7Constants {
	
	// MSH
	
	public static final String FIELD_SEPARATOR = "|";
	
	public static final String ENCODING_CHARACTERS = "^~\\&";
	
	public static final String MESSAGE_TYPE = "ORU";
	
	public static final String TRIGGER_EVENT = "RO1";
	
	public static final String MESSAGE_STRUCTURE = "ORU_RO1";
	
	public static final String INTERNATIONALIZATION_CODE = "RWA";
	
	public static final String VERSION = "2.5";
	
	public static final String PROCESSING_ID = "D";
	
	public static final String PROCESSING_MODE = "C";
	
	public static final String SENDING_FACILITY = "Shared Health Record";
	
	public static final String RECEIVING_FACILITY = "Point of Care";
	
	public static final String SENDING_APPLICATION = "sendingApplication";
	
	public static final String RECEIVING_APPLICATION = "receivingApplication";
	
	public static final String ACK_TYPE = "";
	
	public static final String APPLICATION_ACK_TYPE = "";
	
	// PV1
	
	public static final String IDPV1 = "1";
	
	public static final String PATIENT_CLASS = "0";
	
	// PID
	
	public static final String IDENTIFIER_TYPE = "Rwanda National ID";
	
	public static final String IDPID = "1";
	
	public static final String IDENTIFIER_TYPE_CODE = "CR_ID";
	
	public static final String ATTR_TELEPHONE_NUMBER = "attributeTelephoneNum";
	
	public static final String ATTR_NEXT_OF_KIN = "attributeNextOfKin";
	
	// OBX
	
	public static final String RW_CS = "RW_CS";
	
	public static final String RW_CN = "RW_CN";
	
	public static final String RW_AC = "RW_AC";
	
	public static final String RW_AS = "RW_AS";
	
	public static final String VALUE_TYPE_CE = "CE";
	
	public static final String VALUE_TYPE_NM = "NM";
	
	public static final String VALUE_TYPE_TS = "TS";
	
	public static final String VALUE_TYPE_ST = "ST";
	
	public static final String NAME_OF_CODING_SYSTEM = "MHM";
	
	public static final String CONCEPT_DATATYPE_NUMERIC = "Numeric";
	
	public static final String CONCEPT_DATATYPE_DATE = "Date";
	
	public static final String CONCEPT_DATATYPE_DATETIME = "Datetime";
	
	public static final String CONCEPT_DATATYPE_TEXT = "Text";
	
	public static final String CONCEPT_DATATYPE_CODED = "Coded";
	
	public static final String CODING_SYSTEM = "UCUM";
	
	public static final String OBSERVATION_TYPE = "ObservationType";
	
	public static final String UNIT_CODING_SYSTEM = "ucum";
	
	// OBR
	
	public static final String UNIV_SERVICE_ID = "univServiceId";
	
	public static final String UNIV_SERVICE_NAME = "univServIdName";
	
	public static final String OBR_CODE_SYSTEM = "codeSys";
	
	public static final String RESULT_STATUS = "resultStatus";
	
	// There may be
	// multiple
	// result
	// statuses ?
	
	public static final String SPECIMEN_ACTION_CODE = "specimenActionCode";
	
	//ORC
	
	public static final String PROVIDER_SENDING_APPLICATION = "sendingApplication";
	
	public static final String ENTERING_ORGANIZATION = "enteringOrganization";
	
	public static final String ORDERING_ORGANIZATION = "orderingOrganization";
	
}

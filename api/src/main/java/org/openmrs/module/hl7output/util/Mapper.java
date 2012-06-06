package org.openmrs.module.hl7output.util;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Concept;
import org.openmrs.ConceptDatatype;
import org.openmrs.ConceptMap;
import org.openmrs.ConceptNumeric;
import org.openmrs.Encounter;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.api.ConceptService;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.datatype.CE;
import ca.uhn.hl7v2.model.v25.datatype.NM;
import ca.uhn.hl7v2.model.v25.datatype.ST;
import ca.uhn.hl7v2.model.v25.datatype.TS;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.NK1;
import ca.uhn.hl7v2.model.v25.segment.OBR;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import ca.uhn.hl7v2.model.v25.segment.ORC;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.model.v25.segment.PV1;
import ca.uhn.hl7v2.parser.PipeParser;

public class Mapper extends MapperNK1 {

	Log log = LogFactory.getLog(this.getClass());
	
	protected ConceptService conceptService;
	private MapperMSH mapperMSH;
	private MapperPID mapperPID;
	private MapperNK1 mapperNK1;
	
	public Mapper(ConceptService conceptService) {
		this.conceptService = conceptService;
		this.mapperMSH = new MapperMSH();
		this.mapperPID = new MapperPID();
		this.mapperNK1 = new MapperNK1();
	}
	
	protected void mapToMSH(MSH msh) throws DataTypeException {
		mapperMSH.mapToMSH(msh);
	}

	protected void mapToORCs(ORU_R01 r01, List<Encounter> encounterList)
			throws Exception {
		int orderORCCount = 0;
		for (Encounter encounter : encounterList) {
			mapToORC(r01.getPATIENT_RESULT()
					.getORDER_OBSERVATION(orderORCCount).getORC(), encounter);
			orderORCCount++;
		}
	}
	
	protected void mapToPID(PID pid, Patient patient) throws DataTypeException, HL7Exception {
		this.mapperPID.mapToPID(pid, patient);
	}

	protected void mapToPV1(PV1 pv1, List<Encounter> encounterList)
			throws DataTypeException, HL7Exception {
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

	protected void mapToNK1(NK1 nk1, Patient patient) throws DataTypeException {
		this.mapperNK1.mapToNK1(nk1, patient);
	}

	void mapToORC(ORC orc, Encounter encounter) throws DataTypeException,
			HL7Exception {
		orc.getPlacerOrderNumber().getNamespaceID()
				.setValue(RHEAHL7Constants.PROVIDER_SENDING_APPLICATION);
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
				.setValue(RHEAHL7Constants.ENTERING_ORGANIZATION);
		orc.getOrderingFacilityName(0).getOrganizationName()
				.setValue(RHEAHL7Constants.ORDERING_ORGANIZATION);

		// How shall I fill in the Order control reason ?
		// orc.getOrderControlCodeReason();

		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
		String dateStr = "";
		Date d = new Date();
		dateStr = df.format(d);

		orc.getDateTimeOfTransaction().getTime().setValue(dateStr);
	}

	protected void mapToOBRs(ORU_R01 r01, List<Encounter> encounterList)
			throws Exception {
		int orderObsCount = 0;
		for (Encounter e : encounterList) {
			OBR obr = r01.getPATIENT_RESULT()
					.getORDER_OBSERVATION(orderObsCount).getOBR();
			int reps = r01.getPATIENT_RESULT().getORDER_OBSERVATIONReps();

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
					.setValue(RHEAHL7Constants.UNIV_SERVICE_ID);
			obr.getUniversalServiceIdentifier().getText()
					.setValue(RHEAHL7Constants.UNIV_SERVICE_NAME);
			obr.getUniversalServiceIdentifier().getNameOfCodingSystem()
					.setValue(RHEAHL7Constants.OBR_CODE_SYSTEM);
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
			obr.getResultStatus().setValue(RHEAHL7Constants.RESULT_STATUS);
			obr.getSpecimenActionCode().setValue(
					RHEAHL7Constants.SPECIMEN_ACTION_CODE);

			// Accession number
			String accessionNumber = String.valueOf(e.getEncounterId()) + "-"
					+ RHEAHL7Constants.UNIV_SERVICE_ID + "-" + encDateOnly;
			obr.getFillerOrderNumber().getEntityIdentifier()
					.setValue(accessionNumber);

			orderObsCount++;
		}
	}

	protected void mapToOBXs(ORU_R01 message, List<Encounter> encounterList)
			throws HL7Exception, DataTypeException {
		int orderIndex = 0;
		for (Encounter e : encounterList) {
			int obxIndex = 0;
			for (Obs observation : e.getAllObs()) {
				if (hasMapping(observation)) {
					log.info("Obs has a mapping for concept...");

					// for each observation
					OBX obx = message.getPATIENT_RESULT()
							.getORDER_OBSERVATION(orderIndex)
							.getOBSERVATION(obxIndex).getOBX();
					mapToOBX(obx, observation);
					obx.getSetIDOBX().setValue(obxIndex + "");

					ConceptDatatype datatype = observation.getConcept()
							.getDatatype();
					// if numeric value
					if (isNumeric(obx, datatype)) {
						mapToNumericObx(obx, observation);
					} else if (isDateOrDatetime(datatype)) {
						mapToDateOrDatetimeObx(obx, observation);
					} else if (isText(datatype)) {
						mapToTextObx(obx, observation);
					} else if (isCoded(datatype)) {
						mapToCodedObx(obx, observation);
					}
					obxIndex++;
				}
			}

			orderIndex++;
		}
	}

	boolean hasMapping(Obs observation) {
		Collection<ConceptMap> conceptMappings = observation.getConcept()
				.getConceptMappings();
		boolean mapping = false;
		for (ConceptMap conceptMap : conceptMappings) {
			if (conceptMap.getSource().getHl7Code()
					.equals(RHEAHL7Constants.RW_CS)) {
				mapping = true;
			}
		}
		return mapping;
	}

	void mapToOBX(OBX obx, Obs obs) throws HL7Exception, DataTypeException {

		Collection<ConceptMap> conceptMappings = obs.getConcept()
				.getConceptMappings();

		for (ConceptMap conceptMap : conceptMappings) {
			if (conceptMap.getSource().getHl7Code()
					.equals(RHEAHL7Constants.RW_CS)) {
				obx.getObservationIdentifier().getIdentifier()
						.setValue(conceptMap.getSourceCode());
			}
			if (conceptMap.getSource().getHl7Code()
					.equals(RHEAHL7Constants.RW_CN)) {
				obx.getObservationIdentifier().getText()
						.setValue(conceptMap.getSourceCode());
			}
		}

		if (obx.getObservationIdentifier().getText().getValue() == null
				|| obx.getObservationIdentifier().getText().getValue()
						.equals("")) {
			obx.getObservationIdentifier().getText()
					.setValue(obs.getConcept().getName().toString());
		}
		obx.getObservationIdentifier().getNameOfCodingSystem()
				.setValue(RHEAHL7Constants.NAME_OF_CODING_SYSTEM);
	}

	boolean isCoded(ConceptDatatype datatype) {
		return datatype
				.equals(conceptService
						.getConceptDatatypeByName(RHEAHL7Constants.CONCEPT_DATATYPE_CODED));
	}

	boolean isText(ConceptDatatype datatype) {
		return datatype
				.equals(conceptService
						.getConceptDatatypeByName(RHEAHL7Constants.CONCEPT_DATATYPE_TEXT));
	}

	boolean isDateOrDatetime(ConceptDatatype datatype) {
		return datatype
				.equals(conceptService
						.getConceptDatatypeByName(RHEAHL7Constants.CONCEPT_DATATYPE_DATETIME))
				|| datatype
						.equals(conceptService
								.getConceptDatatypeByName(RHEAHL7Constants.CONCEPT_DATATYPE_DATE));
	}

	boolean isNumeric(OBX obx, ConceptDatatype datatype) {
		return datatype
				.equals(conceptService
						.getConceptDatatypeByName(RHEAHL7Constants.CONCEPT_DATATYPE_NUMERIC));
	}

	void mapToCodedObx(OBX obx, Obs observation) throws HL7Exception,
			DataTypeException {

		obx.getValueType().setValue(RHEAHL7Constants.VALUE_TYPE_CE);

		CE ce = new CE(obx.getMessage());
		Concept concept = observation.getValueCoded();

		Collection<ConceptMap> conceptValueMappings = concept
				.getConceptMappings();

		for (ConceptMap conceptMap : conceptValueMappings) {
			if (conceptMap.getSource().getHl7Code()
					.equals(RHEAHL7Constants.RW_CN)) {
				ce.getText().setValue(conceptMap.getSourceCode());
			}
			if (conceptMap.getSource().getHl7Code().equals("RW_AC")) {
				ce.getIdentifier().setValue(conceptMap.getSourceCode());
			}
			if (conceptMap.getSource().getHl7Code().equals("RW_AS")) {
				ce.getNameOfCodingSystem().setValue(conceptMap.getSourceCode());
			}
		}

		if (ce.getText().getValue() == null
				|| ce.getText().getValue().equals("")) {
			String nameStr = concept.getName().toString();
			ce.getText().setValue(nameStr);
		}

		obx.getObservationValue(0).setData(ce);

		TS ts = new TS(obx.getMessage());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		ts.getTime().setValue(sdf.format(observation.getDateCreated()));
		obx.getDateTimeOfTheObservation().getTime().setValue(ts.toString());
	}

	void mapToTextObx(OBX obx, Obs observation) throws HL7Exception,
			DataTypeException {

		obx.getValueType().setValue(RHEAHL7Constants.VALUE_TYPE_ST);
		ST st = new ST(obx.getMessage());
		st.setValue(observation.getValueText());
		obx.getObservationValue(0).setData(st);

		TS ts = new TS(obx.getMessage());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		ts.getTime().setValue(sdf.format(observation.getDateCreated()));
		obx.getDateTimeOfTheObservation().getTime().setValue(ts.toString());
	}

	void mapToDateOrDatetimeObx(OBX obx, Obs obs) throws HL7Exception,
			DataTypeException {

		obx.getValueType().setValue(RHEAHL7Constants.VALUE_TYPE_TS);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		TS ts = new TS(obx.getMessage());
		ts.getTime().setValue(sdf.format(obs.getValueDatetime()));
		obx.getObservationValue(0).setData(ts);

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMddHHmmss");
		ts.getTime().setValue(sdf1.format(obs.getDateCreated()));
		obx.getDateTimeOfTheObservation().getTime().setValue(ts.toString());
	}

	void mapToNumericObx(OBX obx, Obs observation) throws HL7Exception,
			DataTypeException {
		obx.getValueType().setValue(RHEAHL7Constants.VALUE_TYPE_NM);

		NM nm = new NM(obx.getMessage());
		nm.setValue(observation.getValueNumeric() + "");

		Concept concept = observation.getConcept();
		if (concept.isNumeric()) {
			ConceptNumeric conceptNumeric = this.conceptService
					.getConceptNumeric(concept.getId());
			if (conceptNumeric.getUnits() != null
					&& !conceptNumeric.getUnits().equals("")) {
				obx.getUnits().getIdentifier()
						.setValue(conceptNumeric.getUnits());
				obx.getUnits().getNameOfCodingSystem()
						.setValue(RHEAHL7Constants.UNIT_CODING_SYSTEM);
			}
		}
		obx.getObservationValue(0).setData(nm);
		TS ts = new TS(obx.getMessage());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		ts.getTime().setValue(sdf.format(observation.getDateCreated()));
		obx.getDateTimeOfTheObservation().getTime().setValue(ts.toString());
	}

	public String getMessage(ORU_R01 r01) {
		PipeParser pipeParser = new PipeParser();
		String msg = null;
		try {
			msg = pipeParser.encode(r01);
		} catch (HL7Exception e) {
			log.error("Exception parsing constructed message.");
		}
		return msg;
	}

}

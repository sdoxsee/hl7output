package org.openmrs.module.hl7output.util;

import java.text.SimpleDateFormat;
import java.util.Collection;

import org.openmrs.Concept;
import org.openmrs.ConceptDatatype;
import org.openmrs.ConceptMap;
import org.openmrs.ConceptNumeric;
import org.openmrs.Obs;
import org.openmrs.api.ConceptService;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.datatype.CE;
import ca.uhn.hl7v2.model.v25.datatype.NM;
import ca.uhn.hl7v2.model.v25.datatype.ST;
import ca.uhn.hl7v2.model.v25.datatype.TS;
import ca.uhn.hl7v2.model.v25.segment.OBX;

public class MapperOBX {

	private final ConceptService conceptService;
	private final Constants constants;

	public MapperOBX(ConceptService conceptService, Constants constants) {
		this.conceptService = conceptService;
		this.constants = constants;
	}

	public Constants getConstants() {
		return constants;
	}

	public void mapToOBX(OBX obx, Obs observation, int obxIndex)
			throws HL7Exception, DataTypeException {
		mapToOBX(obx, observation);
		obx.getSetIDOBX().setValue(obxIndex + "");

		ConceptDatatype datatype = observation.getConcept().getDatatype();
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
	}

	public void mapToOBX(OBX obx, Obs obs) throws HL7Exception,
			DataTypeException {

		Collection<ConceptMap> conceptMappings = obs.getConcept()
				.getConceptMappings();

		for (ConceptMap conceptMap : conceptMappings) {
			if (conceptMap.getSource().getHl7Code()
					.equals(getConstants().getRW_CS())) {
				obx.getObservationIdentifier().getIdentifier()
						.setValue(conceptMap.getSourceCode());
			}
			if (conceptMap.getSource().getHl7Code()
					.equals(getConstants().getProperty("RW_CN"))) {
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
				.setValue(getConstants().getProperty("NAME_OF_CODING_SYSTEM"));
	}

	boolean isCoded(ConceptDatatype datatype) {
		return datatype
				.equals(conceptService
						.getConceptDatatypeByName(getConstants().getProperty("CONCEPT_DATATYPE_CODED")));
	}

	boolean isText(ConceptDatatype datatype) {
		return datatype
				.equals(conceptService
						.getConceptDatatypeByName(getConstants().getProperty("CONCEPT_DATATYPE_TEXT")));
	}

	boolean isDateOrDatetime(ConceptDatatype datatype) {
		return datatype
				.equals(conceptService
						.getConceptDatatypeByName(getConstants().getProperty("CONCEPT_DATATYPE_DATETIME")))
				|| datatype
						.equals(conceptService
								.getConceptDatatypeByName(getConstants().getProperty("CONCEPT_DATATYPE_DATE")));
	}

	boolean isNumeric(OBX obx, ConceptDatatype datatype) {
		return datatype
				.equals(conceptService
						.getConceptDatatypeByName(getConstants().getProperty("CONCEPT_DATATYPE_NUMERIC")));
	}

	void mapToCodedObx(OBX obx, Obs observation) throws HL7Exception,
			DataTypeException {

		obx.getValueType().setValue(getConstants().getProperty("VALUE_TYPE_CE"));

		CE ce = new CE(obx.getMessage());
		Concept concept = observation.getValueCoded();

		Collection<ConceptMap> conceptValueMappings = concept
				.getConceptMappings();

		for (ConceptMap conceptMap : conceptValueMappings) {
			if (conceptMap.getSource().getHl7Code()
					.equals(getConstants().getProperty("RW_CN"))) {
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

		obx.getValueType().setValue(getConstants().getProperty("VALUE_TYPE_ST"));
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

		obx.getValueType().setValue(getConstants().getProperty("VALUE_TYPE_TS"));
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
		obx.getValueType().setValue(getConstants().getProperty("VALUE_TYPE_NM"));

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
						.setValue(getConstants().getProperty("UNIT_CODING_SYSTEM"));
			}
		}
		obx.getObservationValue(0).setData(nm);
		TS ts = new TS(obx.getMessage());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		ts.getTime().setValue(sdf.format(observation.getDateCreated()));
		obx.getDateTimeOfTheObservation().getTime().setValue(ts.toString());
	}

}

package org.openmrs.module.hl7output.util;

import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.openmrs.ConceptMap;
import org.openmrs.Encounter;
import org.openmrs.Obs;
import org.openmrs.api.ConceptService;
import org.openmrs.api.context.Context;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.OBR;
import ca.uhn.hl7v2.model.v25.segment.OBX;
import ca.uhn.hl7v2.model.v25.segment.ORC;

public class ORU_OR1Mapper extends Mapper {

	public ORU_OR1Mapper() {
		this(Context.getConceptService(), 
				new Constants(ORU_OR1Mapper.class.getResourceAsStream("default.properties")));
	}
	
	public ORU_OR1Mapper(ConceptService conceptService, Constants constants) {
		super(conceptService, constants);
	}

	public void mapToORCs(ORU_R01 r01, List<Encounter> encounterList) 
			throws Exception {
		int orderORCCount = 0;
		for (Encounter encounter : encounterList) {
			ORC orc = r01.getPATIENT_RESULT().getORDER_OBSERVATION(orderORCCount).getORC();
			
			mapToORC(orc, encounter);
			
			orderORCCount++;
		}
	}
	
	public void mapToOBRs(ORU_R01 r01, List<Encounter> encounterList)
			throws Exception {
		int orderObsCount = 0;
		for (Encounter e : encounterList) {
			OBR obr = r01.getPATIENT_RESULT()
					.getORDER_OBSERVATION(orderObsCount).getOBR();
			int reps = r01.getPATIENT_RESULT().getORDER_OBSERVATIONReps();

			mapToOBR(obr, e, reps);

			orderObsCount++;
		}
	}

	public void mapToOBXs(ORU_R01 message, List<Encounter> encounterList)
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
					
					mapToOBX(obx, observation, obxIndex);
					
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
					.equals(getConstants().getRW_CS())) {
				mapping = true;
			}
		}
		return mapping;
	}
}

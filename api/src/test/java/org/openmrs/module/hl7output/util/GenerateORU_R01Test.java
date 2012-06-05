package org.openmrs.module.hl7output.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openmrs.Encounter;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.openmrs.test.Verifies;

import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.ORC;


public class GenerateORU_R01Test extends BaseModuleContextSensitiveTest{
	
	@Before
	public void runBeforeEachTest() throws Exception {
		executeDataSet("src/test/resources/initialDatabaseState.xml");
	}
	
	@Test
	@Verifies(value = "should Get Matching Encounters by patient UUiDFrom Database(", method = "generateORU_R01Message(ORU_R01, Patient, Encounter)")
	public void generateORU_R01Message_shouldCreateMessageSkeletonWithDefaultValues() throws Exception{
		GenerateORU_R01 r01Util = new GenerateORU_R01();
		ORU_R01 r01 = null;
		Patient p = Context.getPatientService().getPatient(2);
		Encounter encounter = Context.getEncounterService().getEncounter(1);
		
		List<Encounter> eList = new ArrayList<Encounter>();
		
		eList.add(encounter);
		r01 = r01Util.generateORU_R01Message( p, eList);
		
		//Validate the MSH segment
		MSH msh = r01.getMSH();
		
		assertEquals(msh.getVersionID().getInternationalizationCode().getIdentifier().getValue(),
		    RHEAHL7Constants.INTERNATIONALIZATION_CODE);
		assertEquals(msh.getVersionID().getVersionID().getValue(), RHEAHL7Constants.VERSION);
		assertEquals(msh.getSendingApplication().getNamespaceID().getValue(),RHEAHL7Constants.SENDING_APPLICATION);
		assertEquals(msh.getSendingFacility().getNamespaceID().getValue(),RHEAHL7Constants.SENDING_FACILITY);
		assertEquals(msh.getMessageType().getMessageCode().getValue(),RHEAHL7Constants.MESSAGE_TYPE);
		
		//Validate the ORC segment
		
		ORC orc = r01.getPATIENT_RESULT().getORDER_OBSERVATION().getORC();
		
		 orc.getPlacerOrderNumber().getNamespaceID().setValue(RHEAHL7Constants.PROVIDER_SENDING_APPLICATION);
		 assertEquals(orc.getOrderingProvider(0).getFamilyName().getSurname().toString(), eList.get(0).getProvider().getFamilyName());

		 assertEquals(orc.getOrderingProvider(0).getGivenName().toString(), eList.get(0).getProvider().getGivenName());
		 assertEquals(orc.getOrderingProvider(0).getIDNumber().toString(), eList.get(0).getProvider().getId().toString());
		 
		 assertEquals(orc.getEnteredBy(0).getFamilyName().getSurname().getValue().toString(), eList.get(0).getCreator().getFamilyName());
		 assertEquals(orc.getEnteredBy(0).getGivenName().getValue().toString(), eList.get(0).getCreator().getGivenName());
		 assertEquals(orc.getEnteredBy(0).getIDNumber().getValue().toString(), eList.get(0).getCreator().getId().toString());
		
	}
	
}

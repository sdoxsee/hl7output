package org.openmrs.module.hl7output.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openmrs.Encounter;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.hl7output.custommodel.v25.message.ZPT_ZP1;
import org.openmrs.module.hl7output.custommodel.v25.segment.MSH;
import org.openmrs.module.hl7output.custommodel.v25.segment.ORC;
import org.openmrs.module.hl7output.custommodel.v25.segment.PID;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.openmrs.test.Verifies;

import ca.uhn.hl7v2.parser.CustomModelClassFactory;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.XMLParser;

//@Ignore
public class GenerateZPT_ZP1Test extends BaseModuleContextSensitiveTest{
	
	@Before
	public void runBeforeEachTest() throws Exception {
		executeDataSet("src/test/resources/initialDatabaseState.xml");
	}
	
	@Test
	@Verifies(value = "should Get Matching Encounters by patient UUiDFrom Database(", method = "generateORU_R01Message(ORU_R01, Patient, Encounter)")
	public void generateZPT_ZP1Message_shouldCreateMessageSkeletonWithDefaultValues() throws Exception{
		GenerateZPT_ZP1 generator = new GenerateZPT_ZP1();
		ZPT_ZP1 message = null;
		Patient patient = Context.getPatientService().getPatient(2);
		Encounter encounter = Context.getEncounterService().getEncounter(1);
		message = generator.generateZPT_ZP1Message(patient, Arrays.asList(encounter));
		
		Parser customParser = new GenericParser(new CustomModelClassFactory(
				"org.openmrs.module.hl7output.custommodel"));
		System.out.println(customParser.encode(message, "XML"));
		
		//Validate the MSH segment
		MSH msh = message.getMSH();
		
		assertEquals(BaobabHL7Constants.INTERNATIONALIZATION_CODE, msh.getVersionID().getInternationalizationCode().getIdentifier().getValue());
		assertEquals(BaobabHL7Constants.VERSION, msh.getVersionID().getVersionID().getValue());
		assertEquals(BaobabHL7Constants.SENDING_APPLICATION, msh.getSendingApplication().getNamespaceID().getValue());
		assertEquals(BaobabHL7Constants.SENDING_FACILITY, msh.getSendingFacility().getNamespaceID().getValue());
		assertEquals(BaobabHL7Constants.MESSAGE_TYPE, msh.getMessageType().getMessageCode().getValue());
		
		//Validate the PID segment
		PID pid = message.getPID();
		
		assertEquals(patient.getFamilyName(), pid.getPatientName(0).getFamilyName().getSurname().getValue());
		assertEquals(patient.getGivenName() ,pid.getPatientName(0).getGivenName().getValue());
		assertEquals(patient.getGender(), pid.getAdministrativeSex().getValue());
		
//		//Validate the ORC segment
//		
//		ORC orc = message.getENCOUNTER().getORDER().getORC();
//		
//		 orc.getPlacerOrderNumber(0).getNamespaceID().setValue(BaobabHL7Constants.PROVIDER_SENDING_APPLICATION);
//		 assertEquals(orc.getOrderingProvider(0).getFamilyName().getSurname().toString(), encounters.get(0).getProvider().getFamilyName());
//
//		 assertEquals(orc.getOrderingProvider(0).getGivenName().toString(), encounters.get(0).getProvider().getGivenName());
//		 assertEquals(orc.getOrderingProvider(0).getIDNumber().toString(), encounters.get(0).getProvider().getId().toString());
//		 
//		 assertEquals(orc.getEnteredBy(0).getFamilyName().getSurname().getValue().toString(), encounters.get(0).getCreator().getFamilyName());
//		 assertEquals(orc.getEnteredBy(0).getGivenName().getValue().toString(), encounters.get(0).getCreator().getGivenName());
//		 assertEquals(orc.getEnteredBy(0).getIDNumber().getValue().toString(), encounters.get(0).getCreator().getId().toString());
//		
	}
}

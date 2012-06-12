package org.openmrs.module.hl7output.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.openmrs.Encounter;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.hl7output.custommodel.v25.message.ZPT_ZP1;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.openmrs.test.Verifies;

import ca.uhn.hl7v2.model.v25.segment.EVN;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.parser.CustomModelClassFactory;
import ca.uhn.hl7v2.parser.GenericParser;
import ca.uhn.hl7v2.parser.Parser;

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

	/**
	 * =========================
	 * ZPT_ZP1 Message Structure
	 * =========================
	 *  
	 * MSH,[SFT],EVN,PID,NK1,{(VISIT)PV1,{[(OBSERVATION)OBR,{OBX}]}{[(ORDER)ORC,TQ1,RXO,{[OBX]}]}{[RXD]}}
	 */
		
		MSH msh = message.getMSH();
		assertEquals(BaobabHL7Constants.INTERNATIONALIZATION_CODE, msh.getVersionID().getInternationalizationCode().getIdentifier().getValue());
		assertEquals(BaobabHL7Constants.VERSION, msh.getVersionID().getVersionID().getValue());
		assertEquals(BaobabHL7Constants.SENDING_APPLICATION, msh.getSendingApplication().getNamespaceID().getValue());
		assertEquals(BaobabHL7Constants.SENDING_FACILITY, msh.getSendingFacility().getNamespaceID().getValue());
		assertEquals(BaobabHL7Constants.MESSAGE_TYPE, msh.getMessageType().getMessageCode().getValue());
		
		EVN evn = message.getEVN();
		assertNotNull(evn.getRecordedDateTime().getTime().getValue());
		
		PID pid = message.getPID();
		assertEquals(patient.getFamilyName(), pid.getPatientName(0).getFamilyName().getSurname().getValue());
		assertEquals(patient.getGivenName() ,pid.getPatientName(0).getGivenName().getValue());
		assertEquals(patient.getGender(), pid.getAdministrativeSex().getValue());

//		NK1 nk1 = message.getNK1();
//		assertEquals(patient.getAttribute(BaobabHL7Constants.ATTR_NEXT_OF_KIN).getValue(), 
//				nk1.getNk12_Name(0).getGivenName().getValue() + " " + nk1.getNk12_Name(0).getFamilyName().getSurname().getValue());
	}
}

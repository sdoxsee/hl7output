package org.openmrs.module.web.controller;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openmrs.Concept;
import org.openmrs.Encounter;
import org.openmrs.Location;
import org.openmrs.Obs;
import org.openmrs.Person;
import org.openmrs.PersonAttributeType;
import org.openmrs.api.context.Context;
import org.openmrs.module.hl7output.util.RHEAHL7Constants;
import org.openmrs.module.web.controller.RHEApatientController;
import org.openmrs.test.BaseContextSensitiveTest;
import org.openmrs.test.Verifies;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import ca.uhn.hl7v2.model.v25.message.ORU_R01;
import ca.uhn.hl7v2.model.v25.segment.PID;

@Ignore
// ignoring for now
//
//org.hibernate.MappingException: Unknown entity: org.openmrs.module.model.GetEncounterLog
//at org.hibernate.impl.SessionFactoryImpl.getEntityPersister(SessionFactoryImpl.java:550)
public class RHEApatientControllerTest extends BaseContextSensitiveTest {
	
	@Before
	public void runBeforeEachTest() throws Exception {
		executeDataSet("src/test/resources/RHEAControllerTest-initialData.xml");
	}
	
	@Test
	@Verifies(value = "should Get Matching Encounters by patient ECID From Database(", method = "getEncounters(...)")
	public void getEncounters_shouldGetMatchingEncountersByPatientECIDFromDatabase() throws Exception {
		RHEApatientController controller = new RHEApatientController();
		
		MockHttpServletRequest request = new MockHttpServletRequest("GET", "");
		HttpServletResponse response = new MockHttpServletResponse();
		String enterpriseId = "1234";
		
		Object object = controller.getEncounters(enterpriseId, null, null, null, request, response);
		
		ORU_R01 r01 = (ORU_R01) request.getSession().getAttribute("oru_r01");
		
		assertNotNull(r01);
		assertTrue(r01 instanceof ORU_R01);	
		
		assertEquals(r01.getMSH().getVersionID().getInternationalizationCode().getIdentifier().getValue(),RHEAHL7Constants.INTERNATIONALIZATION_CODE);
		assertEquals(r01.getMSH().getSendingApplication().getNamespaceID().getValue(), RHEAHL7Constants.SENDING_APPLICATION);
		assertEquals(r01.getMSH().getSendingFacility().getNamespaceID().getValue(),RHEAHL7Constants.SENDING_FACILITY);
		
		PID pid = r01.getPATIENT_RESULT().getPATIENT().getPID();
		
	}
	
	@Test
	@Verifies(value = "should Parse HL7 Message Into POJOs(", method = "createEncounters(...)")
	public void createEncounters_shouldParseHL7MessageIntoPOJOs() throws Exception {
		RHEApatientController controller = new RHEApatientController();
		
		MockHttpServletRequest request = new MockHttpServletRequest("POST", "");
		HttpServletResponse response = new MockHttpServletResponse();
		
		String enterpriseId = "1234";
		
		assertEquals(Context.getEncounterService().getEncountersByPatientId(2).size(),1);
		
		String hl7 = "MSH|^~\\&|FORMENTRY|LOCAL|HL7LISTENER|LOCAL|20080226102656||ORU^R01|JqnfhKKtouEz8kzTk6Zo|P|2.5|1||||||||16^AMRS.ELD.FORMID\r"
			     + "PID|2|2|2^^^^||John3^Doe^||\r"
			     + "PV1||O|||||2^Hornblower^Horatio||||||||||||1|||||||||||||||||||||||||201204290117^IN^46202||||||||||||||||||20120504|true\r"
			     + "ORC|RE||||||||20080226102537|1^Super User\r"
			     + "OBR|1|||1238^MEDICAL RECORD OBSERVATIONS^99DCT\r"
			     + "OBX|18|DT|5096^RETURN VISIT DATE^99DCT||20080506|||||||||20080212\r"
			     + "OBX|1|CWE|5018^PROBLEM ADDED^99DCT||5096^HUMAN IMMUNODEFICIENCY VIRUS^99DCT|||||||||20081003\r"
			     + "OBX|2|CWE|5089^PROBLEM ADDED^99DCT||PROPOSED^ASDFASDFASDF^99DCT|||||||||20081003";
		
		controller.createEncounters(hl7, enterpriseId, request, response);
		
		assertEquals(Context.getEncounterService().getEncountersByPatientId(2).size(),2);	
		
	}	
	
	@Test
	@Verifies(value = "should create a blank patient if the given patient is missing(", method = "createEncounters(...)")
	public void createEncounters_shouldCreateABlankPatientIfTheGivenPatientIsMissing() throws Exception {
		RHEApatientController controller = new RHEApatientController();
		
		MockHttpServletRequest request = new MockHttpServletRequest("POST", "");
		HttpServletResponse response = new MockHttpServletResponse();
		
		String enterpriseId = "1234";
		
		PersonAttributeType personAttributeType = Context.getPersonService().getPersonAttributeType("ECID");
		assertNull(personAttributeType);
		
		String hl7 = "MSH|^~\\&|FORMENTRY|LOCAL|HL7LISTENER|LOCAL|20080226102656||ORU^R01|JqnfhKKtouEz8kzTk6Zo|P|2.5|1||||||||16^AMRS.ELD.FORMID\r"
			     + "PID|2|2|2^^^^||John3^Doe^||\r"
			     + "PV1|1|O|||||10^Kas^Suranga||||||||||||1|||||||||||||||||||||||||201204290117^IN^46202||||||||||||||||||20120504|true\r"
			     + "ORC|RE||||||||20080226102537|1^Super User\r"
			     + "OBR|1|||1238^MEDICAL RECORD OBSERVATIONS^99DCT\r"
			     + "OBX|18|DT|5096^RETURN VISIT DATE^99DCT||20080506|||||||||20080212\r"
			     + "OBX|1|CWE|5018^PROBLEM ADDED^99DCT||5096^HUMAN IMMUNODEFICIENCY VIRUS^99DCT|||||||||20081003\r"
			     + "OBX|2|CWE|5089^PROBLEM ADDED^99DCT||PROPOSED^ASDFASDFASDF^99DCT|||||||||20081003";
		
		controller.createEncounters(hl7, enterpriseId, request, response);
		
		PersonAttributeType newAttributeType = Context.getPersonService().getPersonAttributeType("ECID");
		assertNotNull(newAttributeType);
		
	}
	
	@Test
	@Verifies(value = "should create a blank location if the given location is missing(", method = "createEncounters(...)")
	public void createEncounters_shouldCreateABlankLocationIfTheGivenLocationIsMissing() throws Exception {
		RHEApatientController controller = new RHEApatientController();
		
		MockHttpServletRequest request = new MockHttpServletRequest("POST", "");
		HttpServletResponse response = new MockHttpServletResponse();
		
		String enterpriseId = "1234";
		
		Location location = Context.getLocationService().getLocation(10);
		assertNull(location);
		
		String hl7 = "MSH|^~\\&|FORMENTRY|LOCAL|HL7LISTENER|LOCAL|20080226102656||ORU^R01|JqnfhKKtouEz8kzTk6Zo|P|2.5|1||||||||16^AMRS.ELD.FORMID\r"
			     + "PID|2|2|2^^^^||John3^Doe^||\r"
			     + "PV1|10|O|||||10^Kas^Suranga||||||||||||1|||||||||||||||||||||||||201204290117^IN^46202||||||||||||||||||20120504|true\r"
			     + "ORC|RE||||||||20080226102537|1^Super User\r"
			     + "OBR|1|||1238^MEDICAL RECORD OBSERVATIONS^99DCT\r"
			     + "OBX|18|DT|5096^RETURN VISIT DATE^99DCT||20080506|||||||||20080212\r"
			     + "OBX|1|CWE|5018^PROBLEM ADDED^99DCT||5096^HUMAN IMMUNODEFICIENCY VIRUS^99DCT|||||||||20081003\r"
			     + "OBX|2|CWE|5089^PROBLEM ADDED^99DCT||PROPOSED^ASDFASDFASDF^99DCT|||||||||20081003";
		
		controller.createEncounters(hl7, enterpriseId, request, response);
		
		Location newLocation = Context.getLocationService().getLocation("10");
		assertNotNull(newLocation);
		
	}
	
}

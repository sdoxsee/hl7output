package org.openmrs.module.hl7output.util;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class ConstantsTest {

	@Test
	public void shouldUseDefaultValuesWhenNoPropertiesFile() {
		Constants constants = new Constants(null);
		assertEquals("|", constants.getFieldSeparator());
	}

	@Test
	public void shouldUseDefaultValuesWhenPropertyNotFound() throws IOException {
		Constants constants = new Constants(getClass().getResourceAsStream("test.properties"));
		assertEquals("^~\\&", constants.getEncodingCharacters());
	}
	
	@Test
	public void shouldUseValuesFromPropertiesFile() throws IOException {
		Constants constants = new Constants(getClass().getResourceAsStream("test.properties"));
		assertEquals("MWI", constants.getInternationalizationCode());
	}
	
}

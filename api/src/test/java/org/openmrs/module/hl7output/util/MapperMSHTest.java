package org.openmrs.module.hl7output.util;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;
import org.openmrs.module.hl7output.custommodel.v25.message.ZPT_ZP1;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.MSH;

public class MapperMSHTest {

	@Test
	public void shouldMapMshFields() throws DataTypeException {
		Constants constants = mock(Constants.class);
		Mockito.when(constants.getFieldSeparator()).thenReturn("FIELD_SEPARATOR");
		Mockito.when(constants.getInternationalizationCode()).thenReturn("INTERNATIONALIZATION_CODE");
		Mockito.when(constants.getVersion()).thenReturn("VERSION");
		
		ZPT_ZP1 message = new ZPT_ZP1();
		MSH msh = message.getMSH();
		
		new MapperMSH(constants).mapToMSH(msh);
		
		assertEquals(constants.getFieldSeparator(), msh.getFieldSeparator().getValue());
		assertEquals(constants.getInternationalizationCode(), msh.getVersionID().getInternationalizationCode().getIdentifier().getValue());
		assertEquals(constants.getVersion(), msh.getVersionID().getVersionID().getValue());
	}
}

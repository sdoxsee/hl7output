package org.openmrs.module.hl7output.util;

import java.io.Serializable;
import java.util.List;
import java.util.Properties;

import org.openmrs.Encounter;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.hl7output.custommodel.v25.message.ZPT_ZP1;

import ca.uhn.hl7v2.HL7Exception;

public class GenerateZPT_ZP1 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private ZPT_ZP1Mapper mapper;

	public GenerateZPT_ZP1() {
		this(new ZPT_ZP1Mapper(Context.getConceptService(), new Constants(GenerateZPT_ZP1.class.getResourceAsStream("baobab.properties"))));
	}

	GenerateZPT_ZP1(ZPT_ZP1Mapper mapper) {
		this.mapper = mapper;
	}

	public ZPT_ZP1 generateZPT_ZP1Message(Patient patient,
			List<Encounter> encounters) throws HL7Exception {
		ZPT_ZP1 message = new ZPT_ZP1();
		
		this.mapper.mapToMSH(message.getMSH());
		this.mapper.mapToEVN(message.getEVN());
		this.mapper.mapToPID(message.getPID(), patient);
		this.mapper.mapToNK1(message.getNK1(), patient);
		
		return message;
	}

}

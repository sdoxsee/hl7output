package org.openmrs.module.hl7output.util;

import org.openmrs.Patient;
import org.openmrs.PersonAddress;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.v25.segment.NK1;

public class CustomMapperNK1 {

	protected void mapToNK1(NK1 nk1, Patient patient)
			throws DataTypeException {
				String ln = "";
				String fn = "";
			
				if (patient.getAttribute(BaobabHL7Constants.ATTR_NEXT_OF_KIN) != null) {
					String nkName = patient.getAttribute(
							BaobabHL7Constants.ATTR_NEXT_OF_KIN).getValue();
			
					if ((patient != null)
							&& (patient
									.getAttribute(BaobabHL7Constants.ATTR_TELEPHONE_NUMBER) != null)) {
						String tel = patient.getAttribute(
								BaobabHL7Constants.ATTR_TELEPHONE_NUMBER).getValue();
						nk1.getPhoneNumber(0).getTelephoneNumber().setValue(tel);
					}
					if ((nkName != null) && !nkName.equals("")) {
						int indexSpace = nkName.indexOf(" ");
						if (!nkName.isEmpty()) {
							if (indexSpace < 0) {
								fn = nkName;
							} else {
								fn = nkName.substring(0, indexSpace - 1);
								ln = nkName.substring(indexSpace + 1);
							}
						}
					}
			
					nk1.getNk12_NKName(0).getFamilyName().getSurname().setValue(ln);
					nk1.getNk12_NKName(0).getGivenName().setValue(fn);
			
					nk1.getRelationship().getIdentifier()
							.setValue(BaobabHL7Constants.ATTR_NEXT_OF_KIN);
				}
			
				if (patient != null) {
					PersonAddress pa = patient.getPersonAddress();
					nk1.getAddress(0).getStreetAddress().getStreetOrMailingAddress()
							.setValue(pa.getAddress1());
					nk1.getAddress(0).getStreetAddress().getDwellingNumber()
							.setValue(pa.getAddress2());
					nk1.getAddress(0).getCity().setValue(pa.getCityVillage());
					nk1.getAddress(0).getStateOrProvince()
							.setValue(pa.getStateProvince());
					nk1.getAddress(0).getZipOrPostalCode().setValue(pa.getPostalCode());
					nk1.getAddress(0).getCountry().setValue(pa.getCountry());
				}
			}

}

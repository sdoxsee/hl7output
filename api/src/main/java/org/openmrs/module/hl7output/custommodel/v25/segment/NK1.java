/*
 * This class is an auto-generated source file for a HAPI
 * HL7 v2.x standard structure class.
 *
 * For more information, visit: http://hl7api.sourceforge.net/
 */

package org.openmrs.module.hl7output.custommodel.v25.segment;

// import org.openmrs.module.hl7output.custommodel.v25.group.*;
import ca.uhn.hl7v2.model.v25.datatype.*;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.Varies;

/**
 *<p>Represents an HL7 NK1 message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>NK1-1: Set ID - NK1 (SI) <b>optional </b>
     * <li>NK1-2: Name (XPN) <b>optional repeating</b>
     * <li>NK1-3: Relationship (CE) <b>optional </b>
     * <li>NK1-4: Address (XAD) <b>optional repeating</b>
     * <li>NK1-5: Phone Number (XTN) <b>optional repeating</b>
     * <li>NK1-6: Business Phone Number (XTN) <b>optional repeating</b>
     * <li>NK1-7: Contact Role (CE) <b>optional repeating</b>
     * <li>NK1-8: Start Date (DT) <b>optional repeating</b>
     * <li>NK1-9: End Date (DT) <b>optional repeating</b>
     * <li>NK1-10: Next of Kin / Associated Parties Job Title (ST) <b>optional repeating</b>
     * <li>NK1-11: Next of Kin / Associated Parties Job Code/Class (JCC) <b>optional repeating</b>
     * <li>NK1-12: Next of Kin / Associated Parties Employee Number (CX) <b>optional repeating</b>
     * <li>NK1-13: Organization Name - NK1 (XON) <b>optional repeating</b>
     * <li>NK1-14: Marital Status (CE) <b>optional repeating</b>
     * <li>NK1-15: Administrative Sex (IS) <b>optional repeating</b>
     * <li>NK1-16: Date/Time of Birth (TS) <b>optional repeating</b>
     * <li>NK1-17: Living Dependency (IS) <b>optional repeating</b>
     * <li>NK1-18: Ambulatory Status (IS) <b>optional repeating</b>
     * <li>NK1-19: Citizenship (CE) <b>optional repeating</b>
     * <li>NK1-20: Primary Language (CE) <b>optional repeating</b>
     * <li>NK1-21: Living Arrangement (IS) <b>optional repeating</b>
     * <li>NK1-22: Publicity Code (CE) <b>optional repeating</b>
     * <li>NK1-23: Protection Indicator (ID) <b>optional repeating</b>
     * <li>NK1-24: Student Indicator (IS) <b>optional repeating</b>
     * <li>NK1-25: Religion (CE) <b>optional repeating</b>
     * <li>NK1-26: Mother_s Maiden Name (XPN) <b>optional repeating</b>
     * <li>NK1-27: Nationality (CE) <b>optional repeating</b>
     * <li>NK1-28: Ethnic Group (CE) <b>optional repeating</b>
     * <li>NK1-29: Contact Reason (CE) <b>optional repeating</b>
     * <li>NK1-30: Contact Person_s Name (XPN) <b>optional repeating</b>
     * <li>NK1-31: Contact Person_s Telephone Number (XTN) <b>optional repeating</b>
     * <li>NK1-32: Contact Person_s Address (XAD) <b>optional repeating</b>
     * <li>NK1-33: Next of Kin/Associated Party_s Identifiers (CX) <b>optional repeating</b>
     * <li>NK1-34: Job Status (IS) <b>optional repeating</b>
     * <li>NK1-35: Race (CE) <b>optional repeating</b>
     * <li>NK1-36: Handicap (IS) <b>optional repeating</b>
     * <li>NK1-37: Contact Person Social Security Number (ST) <b>optional repeating</b>
     * <li>NK1-38: Next of Kin Birth Place (ST) <b>optional repeating</b>
     * <li>NK1-39: VIP Indicator (IS) <b>optional repeating</b>
 * </ul>
 */
public class NK1 extends AbstractSegment {

    /** 
     * Creates a new NK1 segment
     */
    public NK1(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SI.class, false, 1, 4, new Object[]{ getMessage(), new Integer(0) }, "Set ID - NK1");
                                  this.add(XPN.class, false, -1, 1044, new Object[]{ getMessage(), new Integer(0) }, "Name");
                                  this.add(CE.class, false, 1, 483, new Object[]{ getMessage(), new Integer(63) }, "Relationship");
                                  this.add(XAD.class, false, -1, 578, new Object[]{ getMessage(), new Integer(0) }, "Address");
                                  this.add(XTN.class, false, -1, 651, new Object[]{ getMessage(), new Integer(0) }, "Phone Number");
                                  this.add(XTN.class, false, 0, 651, new Object[]{ getMessage(), new Integer(0) }, "Business Phone Number");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(131) }, "Contact Role");
                                  this.add(DT.class, false, 0, 8, new Object[]{ getMessage(), new Integer(0) }, "Start Date");
                                  this.add(DT.class, false, 0, 8, new Object[]{ getMessage(), new Integer(0) }, "End Date");
                                  this.add(ST.class, false, 0, 60, new Object[]{ getMessage(), new Integer(0) }, "Next of Kin / Associated Parties Job Title");
                                  this.add(JCC.class, false, 0, 292, new Object[]{ getMessage(), new Integer(0) }, "Next of Kin / Associated Parties Job Code/Class");
                                  this.add(CX.class, false, 0, 1687, new Object[]{ getMessage(), new Integer(0) }, "Next of Kin / Associated Parties Employee Number");
                                  this.add(XON.class, false, 0, 563, new Object[]{ getMessage(), new Integer(0) }, "Organization Name - NK1");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(2) }, "Marital Status");
                                  this.add(IS.class, false, 0, 1, new Object[]{ getMessage() }, "Administrative Sex");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Date/Time of Birth");
                                  this.add(IS.class, false, 0, 2, new Object[]{ getMessage() }, "Living Dependency");
                                  this.add(IS.class, false, 0, 2, new Object[]{ getMessage() }, "Ambulatory Status");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(171) }, "Citizenship");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(296) }, "Primary Language");
                                  this.add(IS.class, false, 0, 2, new Object[]{ getMessage() }, "Living Arrangement");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(215) }, "Publicity Code");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Protection Indicator");
                                  this.add(IS.class, false, 0, 2, new Object[]{ getMessage() }, "Student Indicator");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(6) }, "Religion");
                                  this.add(XPN.class, false, 0, 1044, new Object[]{ getMessage(), new Integer(0) }, "Mother_s Maiden Name");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(212) }, "Nationality");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(189) }, "Ethnic Group");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(222) }, "Contact Reason");
                                  this.add(XPN.class, false, 0, 1044, new Object[]{ getMessage(), new Integer(0) }, "Contact Person_s Name");
                                  this.add(XTN.class, false, 0, 651, new Object[]{ getMessage(), new Integer(0) }, "Contact Person_s Telephone Number");
                                  this.add(XAD.class, false, 0, 578, new Object[]{ getMessage(), new Integer(0) }, "Contact Person_s Address");
                                  this.add(CX.class, false, 0, 1687, new Object[]{ getMessage(), new Integer(0) }, "Next of Kin/Associated Party_s Identifiers");
                                  this.add(IS.class, false, 0, 2, new Object[]{ getMessage() }, "Job Status");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(5) }, "Race");
                                  this.add(IS.class, false, 0, 2, new Object[]{ getMessage() }, "Handicap");
                                  this.add(ST.class, false, 0, 16, new Object[]{ getMessage(), new Integer(0) }, "Contact Person Social Security Number");
                                  this.add(ST.class, false, 0, 250, new Object[]{ getMessage(), new Integer(0) }, "Next of Kin Birth Place");
                                  this.add(IS.class, false, 0, 2, new Object[]{ getMessage() }, "VIP Indicator");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating NK1 - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * NK1-1: "Set ID - NK1" - creates it if necessary
     */
    public SI getSetIDNK1() { 
        SI ret = null;
        try {
            Type t = this.getField(1, 0);
            ret = (SI)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns
     * NK1-1: "Set ID - NK1" - creates it if necessary
     */
    public SI getNk11_SetIDNK1() { 
        SI ret = null;
        try {
            Type t = this.getField(1, 0);
            ret = (SI)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns all repetitions of Name (NK1-2).
     */
    public XPN[] getNK1Name() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(2);  
            ret = new XPN[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (XPN)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Name (NK1-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNK1NameReps() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(2);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-2: "Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getNK1Name(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(2, rep);
            ret = (XPN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-2: "Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getNk12_Name(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(2, rep);
            ret = (XPN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Name (NK1-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk12_NameReps() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(2);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-2: "Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertNK1Name(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(2, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-2: "Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertNk12_Name(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * NK1-2: "Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removeNK1Name(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * NK1-2: "Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removeNk12_Name(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(2, rep);
    }




    /**
     * Returns
     * NK1-3: "Relationship" - creates it if necessary
     */
    public CE getRelationship() { 
        CE ret = null;
        try {
            Type t = this.getField(3, 0);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns
     * NK1-3: "Relationship" - creates it if necessary
     */
    public CE getNk13_Relationship() { 
        CE ret = null;
        try {
            Type t = this.getField(3, 0);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns all repetitions of Address (NK1-4).
     */
    public XAD[] getAddress() {
        XAD[] ret = null;
        try {
            Type[] t = this.getField(4);  
            ret = new XAD[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (XAD)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Address (NK1-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAddressReps() {
        XAD[] ret = null;
        try {
            Type[] t = this.getField(4);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-4: "Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(4, rep);
            ret = (XAD)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-4: "Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getNk14_Address(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(4, rep);
            ret = (XAD)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Address (NK1-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk14_AddressReps() {
        XAD[] ret = null;
        try {
            Type[] t = this.getField(4);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-4: "Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(4, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-4: "Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertNk14_Address(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * NK1-4: "Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removeAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * NK1-4: "Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removeNk14_Address(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(4, rep);
    }



    /**
     * Returns all repetitions of Phone Number (NK1-5).
     */
    public XTN[] getPhoneNumber() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(5);  
            ret = new XTN[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (XTN)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Phone Number (NK1-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPhoneNumberReps() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(5);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-5: "Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getPhoneNumber(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(5, rep);
            ret = (XTN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-5: "Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getNk15_PhoneNumber(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(5, rep);
            ret = (XTN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Phone Number (NK1-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk15_PhoneNumberReps() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(5);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-5: "Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(5, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-5: "Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertNk15_PhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * NK1-5: "Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removePhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * NK1-5: "Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeNk15_PhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Business Phone Number (NK1-6).
     */
    public XTN[] getBusinessPhoneNumber() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(6);  
            ret = new XTN[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (XTN)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Business Phone Number (NK1-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getBusinessPhoneNumberReps() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(6);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-6: "Business Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getBusinessPhoneNumber(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(6, rep);
            ret = (XTN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-6: "Business Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getNk16_BusinessPhoneNumber(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(6, rep);
            ret = (XTN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Business Phone Number (NK1-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk16_BusinessPhoneNumberReps() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(6);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-6: "Business Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertBusinessPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(6, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-6: "Business Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertNk16_BusinessPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * NK1-6: "Business Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeBusinessPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * NK1-6: "Business Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeNk16_BusinessPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(6, rep);
    }



    /**
     * Returns all repetitions of Contact Role (NK1-7).
     */
    public CE[] getContactRole() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(7);  
            ret = new CE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CE)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Role (NK1-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContactRoleReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(7);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-7: "Contact Role" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getContactRole(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(7, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-7: "Contact Role" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNk17_ContactRole(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(7, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Role (NK1-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk17_ContactRoleReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(7);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-7: "Contact Role" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertContactRole(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(7, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-7: "Contact Role" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNk17_ContactRole(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * NK1-7: "Contact Role" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeContactRole(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * NK1-7: "Contact Role" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNk17_ContactRole(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(7, rep);
    }



    /**
     * Returns all repetitions of Start Date (NK1-8).
     */
    public DT[] getStartDate() {
        DT[] ret = null;
        try {
            Type[] t = this.getField(8);  
            ret = new DT[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (DT)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Start Date (NK1-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getStartDateReps() {
        DT[] ret = null;
        try {
            Type[] t = this.getField(8);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-8: "Start Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DT getStartDate(int rep) { 
        DT ret = null;
        try {
            Type t = this.getField(8, rep);
            ret = (DT)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-8: "Start Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DT getNk18_StartDate(int rep) { 
        DT ret = null;
        try {
            Type t = this.getField(8, rep);
            ret = (DT)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Start Date (NK1-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk18_StartDateReps() {
        DT[] ret = null;
        try {
            Type[] t = this.getField(8);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-8: "Start Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT insertStartDate(int rep) throws HL7Exception { 
        return (DT) super.insertRepetition(8, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-8: "Start Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT insertNk18_StartDate(int rep) throws HL7Exception { 
        return (DT) super.insertRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * NK1-8: "Start Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT removeStartDate(int rep) throws HL7Exception { 
        return (DT) super.removeRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * NK1-8: "Start Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT removeNk18_StartDate(int rep) throws HL7Exception { 
        return (DT) super.removeRepetition(8, rep);
    }



    /**
     * Returns all repetitions of End Date (NK1-9).
     */
    public DT[] getEndDate() {
        DT[] ret = null;
        try {
            Type[] t = this.getField(9);  
            ret = new DT[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (DT)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of End Date (NK1-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEndDateReps() {
        DT[] ret = null;
        try {
            Type[] t = this.getField(9);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-9: "End Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DT getEndDate(int rep) { 
        DT ret = null;
        try {
            Type t = this.getField(9, rep);
            ret = (DT)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-9: "End Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DT getNk19_EndDate(int rep) { 
        DT ret = null;
        try {
            Type t = this.getField(9, rep);
            ret = (DT)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of End Date (NK1-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk19_EndDateReps() {
        DT[] ret = null;
        try {
            Type[] t = this.getField(9);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-9: "End Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT insertEndDate(int rep) throws HL7Exception { 
        return (DT) super.insertRepetition(9, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-9: "End Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT insertNk19_EndDate(int rep) throws HL7Exception { 
        return (DT) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * NK1-9: "End Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT removeEndDate(int rep) throws HL7Exception { 
        return (DT) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * NK1-9: "End Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DT removeNk19_EndDate(int rep) throws HL7Exception { 
        return (DT) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Next of Kin / Associated Parties Job Title (NK1-10).
     */
    public ST[] getNextOfKinAssociatedPartiesJobTitle() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(10);  
            ret = new ST[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (ST)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Next of Kin / Associated Parties Job Title (NK1-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNextOfKinAssociatedPartiesJobTitleReps() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(10);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-10: "Next of Kin / Associated Parties Job Title" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getNextOfKinAssociatedPartiesJobTitle(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(10, rep);
            ret = (ST)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-10: "Next of Kin / Associated Parties Job Title" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getNk110_NextOfKinAssociatedPartiesJobTitle(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(10, rep);
            ret = (ST)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Next of Kin / Associated Parties Job Title (NK1-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk110_NextOfKinAssociatedPartiesJobTitleReps() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(10);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-10: "Next of Kin / Associated Parties Job Title" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertNextOfKinAssociatedPartiesJobTitle(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(10, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-10: "Next of Kin / Associated Parties Job Title" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertNk110_NextOfKinAssociatedPartiesJobTitle(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * NK1-10: "Next of Kin / Associated Parties Job Title" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeNextOfKinAssociatedPartiesJobTitle(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * NK1-10: "Next of Kin / Associated Parties Job Title" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeNk110_NextOfKinAssociatedPartiesJobTitle(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(10, rep);
    }



    /**
     * Returns all repetitions of Next of Kin / Associated Parties Job Code/Class (NK1-11).
     */
    public JCC[] getNextOfKinAssociatedPartiesJobCodeClass() {
        JCC[] ret = null;
        try {
            Type[] t = this.getField(11);  
            ret = new JCC[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (JCC)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Next of Kin / Associated Parties Job Code/Class (NK1-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNextOfKinAssociatedPartiesJobCodeClassReps() {
        JCC[] ret = null;
        try {
            Type[] t = this.getField(11);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-11: "Next of Kin / Associated Parties Job Code/Class" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public JCC getNextOfKinAssociatedPartiesJobCodeClass(int rep) { 
        JCC ret = null;
        try {
            Type t = this.getField(11, rep);
            ret = (JCC)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-11: "Next of Kin / Associated Parties Job Code/Class" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public JCC getNk111_NextOfKinAssociatedPartiesJobCodeClass(int rep) { 
        JCC ret = null;
        try {
            Type t = this.getField(11, rep);
            ret = (JCC)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Next of Kin / Associated Parties Job Code/Class (NK1-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk111_NextOfKinAssociatedPartiesJobCodeClassReps() {
        JCC[] ret = null;
        try {
            Type[] t = this.getField(11);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-11: "Next of Kin / Associated Parties Job Code/Class" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public JCC insertNextOfKinAssociatedPartiesJobCodeClass(int rep) throws HL7Exception { 
        return (JCC) super.insertRepetition(11, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-11: "Next of Kin / Associated Parties Job Code/Class" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public JCC insertNk111_NextOfKinAssociatedPartiesJobCodeClass(int rep) throws HL7Exception { 
        return (JCC) super.insertRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * NK1-11: "Next of Kin / Associated Parties Job Code/Class" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public JCC removeNextOfKinAssociatedPartiesJobCodeClass(int rep) throws HL7Exception { 
        return (JCC) super.removeRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * NK1-11: "Next of Kin / Associated Parties Job Code/Class" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public JCC removeNk111_NextOfKinAssociatedPartiesJobCodeClass(int rep) throws HL7Exception { 
        return (JCC) super.removeRepetition(11, rep);
    }



    /**
     * Returns all repetitions of Next of Kin / Associated Parties Employee Number (NK1-12).
     */
    public CX[] getNextOfKinAssociatedPartiesEmployeeNumber() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(12);  
            ret = new CX[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CX)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Next of Kin / Associated Parties Employee Number (NK1-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNextOfKinAssociatedPartiesEmployeeNumberReps() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(12);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-12: "Next of Kin / Associated Parties Employee Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getNextOfKinAssociatedPartiesEmployeeNumber(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(12, rep);
            ret = (CX)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-12: "Next of Kin / Associated Parties Employee Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getNk112_NextOfKinAssociatedPartiesEmployeeNumber(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(12, rep);
            ret = (CX)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Next of Kin / Associated Parties Employee Number (NK1-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk112_NextOfKinAssociatedPartiesEmployeeNumberReps() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(12);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-12: "Next of Kin / Associated Parties Employee Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertNextOfKinAssociatedPartiesEmployeeNumber(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(12, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-12: "Next of Kin / Associated Parties Employee Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertNk112_NextOfKinAssociatedPartiesEmployeeNumber(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * NK1-12: "Next of Kin / Associated Parties Employee Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removeNextOfKinAssociatedPartiesEmployeeNumber(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * NK1-12: "Next of Kin / Associated Parties Employee Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removeNk112_NextOfKinAssociatedPartiesEmployeeNumber(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(12, rep);
    }



    /**
     * Returns all repetitions of Organization Name - NK1 (NK1-13).
     */
    public XON[] getOrganizationNameNK1() {
        XON[] ret = null;
        try {
            Type[] t = this.getField(13);  
            ret = new XON[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (XON)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Organization Name - NK1 (NK1-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrganizationNameNK1Reps() {
        XON[] ret = null;
        try {
            Type[] t = this.getField(13);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-13: "Organization Name - NK1" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XON getOrganizationNameNK1(int rep) { 
        XON ret = null;
        try {
            Type t = this.getField(13, rep);
            ret = (XON)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-13: "Organization Name - NK1" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XON getNk113_OrganizationNameNK1(int rep) { 
        XON ret = null;
        try {
            Type t = this.getField(13, rep);
            ret = (XON)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Organization Name - NK1 (NK1-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk113_OrganizationNameNK1Reps() {
        XON[] ret = null;
        try {
            Type[] t = this.getField(13);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-13: "Organization Name - NK1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XON insertOrganizationNameNK1(int rep) throws HL7Exception { 
        return (XON) super.insertRepetition(13, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-13: "Organization Name - NK1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XON insertNk113_OrganizationNameNK1(int rep) throws HL7Exception { 
        return (XON) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * NK1-13: "Organization Name - NK1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XON removeOrganizationNameNK1(int rep) throws HL7Exception { 
        return (XON) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * NK1-13: "Organization Name - NK1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XON removeNk113_OrganizationNameNK1(int rep) throws HL7Exception { 
        return (XON) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Marital Status (NK1-14).
     */
    public CE[] getMaritalStatus() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(14);  
            ret = new CE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CE)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Marital Status (NK1-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMaritalStatusReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(14);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-14: "Marital Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getMaritalStatus(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(14, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-14: "Marital Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNk114_MaritalStatus(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(14, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Marital Status (NK1-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk114_MaritalStatusReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(14);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-14: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertMaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(14, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-14: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNk114_MaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * NK1-14: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeMaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * NK1-14: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNk114_MaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(14, rep);
    }



    /**
     * Returns all repetitions of Administrative Sex (NK1-15).
     */
    public IS[] getAdministrativeSex() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(15);  
            ret = new IS[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (IS)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Administrative Sex (NK1-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAdministrativeSexReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(15);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-15: "Administrative Sex" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getAdministrativeSex(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(15, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-15: "Administrative Sex" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getNk115_AdministrativeSex(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(15, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Administrative Sex (NK1-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk115_AdministrativeSexReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(15);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-15: "Administrative Sex" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertAdministrativeSex(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(15, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-15: "Administrative Sex" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertNk115_AdministrativeSex(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * NK1-15: "Administrative Sex" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeAdministrativeSex(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * NK1-15: "Administrative Sex" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeNk115_AdministrativeSex(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Date/Time of Birth (NK1-16).
     */
    public TS[] getDateTimeOfBirth() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(16);  
            ret = new TS[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (TS)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Date/Time of Birth (NK1-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDateTimeOfBirthReps() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(16);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-16: "Date/Time of Birth" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getDateTimeOfBirth(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(16, rep);
            ret = (TS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-16: "Date/Time of Birth" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getNk116_DateTimeOfBirth(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(16, rep);
            ret = (TS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Date/Time of Birth (NK1-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk116_DateTimeOfBirthReps() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(16);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-16: "Date/Time of Birth" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertDateTimeOfBirth(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(16, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-16: "Date/Time of Birth" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertNk116_DateTimeOfBirth(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * NK1-16: "Date/Time of Birth" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeDateTimeOfBirth(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * NK1-16: "Date/Time of Birth" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeNk116_DateTimeOfBirth(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Living Dependency (NK1-17).
     */
    public IS[] getLivingDependency() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(17);  
            ret = new IS[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (IS)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Living Dependency (NK1-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getLivingDependencyReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(17);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-17: "Living Dependency" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getLivingDependency(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(17, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-17: "Living Dependency" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getNk117_LivingDependency(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(17, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Living Dependency (NK1-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk117_LivingDependencyReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(17);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-17: "Living Dependency" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertLivingDependency(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(17, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-17: "Living Dependency" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertNk117_LivingDependency(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * NK1-17: "Living Dependency" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeLivingDependency(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * NK1-17: "Living Dependency" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeNk117_LivingDependency(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(17, rep);
    }



    /**
     * Returns all repetitions of Ambulatory Status (NK1-18).
     */
    public IS[] getAmbulatoryStatus() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(18);  
            ret = new IS[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (IS)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Ambulatory Status (NK1-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAmbulatoryStatusReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(18);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-18: "Ambulatory Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getAmbulatoryStatus(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(18, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-18: "Ambulatory Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getNk118_AmbulatoryStatus(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(18, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Ambulatory Status (NK1-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk118_AmbulatoryStatusReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(18);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-18: "Ambulatory Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertAmbulatoryStatus(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(18, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-18: "Ambulatory Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertNk118_AmbulatoryStatus(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * NK1-18: "Ambulatory Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeAmbulatoryStatus(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * NK1-18: "Ambulatory Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeNk118_AmbulatoryStatus(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(18, rep);
    }



    /**
     * Returns all repetitions of Citizenship (NK1-19).
     */
    public CE[] getCitizenship() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(19);  
            ret = new CE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CE)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Citizenship (NK1-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCitizenshipReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(19);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-19: "Citizenship" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getCitizenship(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(19, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-19: "Citizenship" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNk119_Citizenship(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(19, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Citizenship (NK1-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk119_CitizenshipReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(19);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-19: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertCitizenship(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(19, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-19: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNk119_Citizenship(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * NK1-19: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeCitizenship(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * NK1-19: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNk119_Citizenship(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(19, rep);
    }



    /**
     * Returns all repetitions of Primary Language (NK1-20).
     */
    public CE[] getPrimaryLanguage() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(20);  
            ret = new CE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CE)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Primary Language (NK1-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPrimaryLanguageReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(20);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-20: "Primary Language" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPrimaryLanguage(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(20, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-20: "Primary Language" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNk120_PrimaryLanguage(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(20, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Primary Language (NK1-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk120_PrimaryLanguageReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(20);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-20: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(20, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-20: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNk120_PrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * NK1-20: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * NK1-20: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNk120_PrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(20, rep);
    }



    /**
     * Returns all repetitions of Living Arrangement (NK1-21).
     */
    public IS[] getLivingArrangement() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(21);  
            ret = new IS[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (IS)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Living Arrangement (NK1-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getLivingArrangementReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(21);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-21: "Living Arrangement" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getLivingArrangement(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(21, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-21: "Living Arrangement" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getNk121_LivingArrangement(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(21, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Living Arrangement (NK1-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk121_LivingArrangementReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(21);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-21: "Living Arrangement" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertLivingArrangement(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(21, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-21: "Living Arrangement" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertNk121_LivingArrangement(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * NK1-21: "Living Arrangement" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeLivingArrangement(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * NK1-21: "Living Arrangement" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeNk121_LivingArrangement(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(21, rep);
    }



    /**
     * Returns all repetitions of Publicity Code (NK1-22).
     */
    public CE[] getPublicityCode() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(22);  
            ret = new CE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CE)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Publicity Code (NK1-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPublicityCodeReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(22);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-22: "Publicity Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPublicityCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(22, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-22: "Publicity Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNk122_PublicityCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(22, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Publicity Code (NK1-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk122_PublicityCodeReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(22);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-22: "Publicity Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPublicityCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(22, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-22: "Publicity Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNk122_PublicityCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * NK1-22: "Publicity Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePublicityCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * NK1-22: "Publicity Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNk122_PublicityCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(22, rep);
    }



    /**
     * Returns all repetitions of Protection Indicator (NK1-23).
     */
    public ID[] getProtectionIndicator() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(23);  
            ret = new ID[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (ID)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Protection Indicator (NK1-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProtectionIndicatorReps() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(23);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-23: "Protection Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getProtectionIndicator(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(23, rep);
            ret = (ID)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-23: "Protection Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getNk123_ProtectionIndicator(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(23, rep);
            ret = (ID)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Protection Indicator (NK1-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk123_ProtectionIndicatorReps() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(23);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-23: "Protection Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertProtectionIndicator(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(23, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-23: "Protection Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertNk123_ProtectionIndicator(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * NK1-23: "Protection Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeProtectionIndicator(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * NK1-23: "Protection Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeNk123_ProtectionIndicator(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(23, rep);
    }



    /**
     * Returns all repetitions of Student Indicator (NK1-24).
     */
    public IS[] getStudentIndicator() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(24);  
            ret = new IS[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (IS)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Student Indicator (NK1-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getStudentIndicatorReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(24);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-24: "Student Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getStudentIndicator(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(24, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-24: "Student Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getNk124_StudentIndicator(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(24, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Student Indicator (NK1-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk124_StudentIndicatorReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(24);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-24: "Student Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertStudentIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(24, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-24: "Student Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertNk124_StudentIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * NK1-24: "Student Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeStudentIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * NK1-24: "Student Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeNk124_StudentIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(24, rep);
    }



    /**
     * Returns all repetitions of Religion (NK1-25).
     */
    public CE[] getReligion() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(25);  
            ret = new CE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CE)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Religion (NK1-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getReligionReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(25);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-25: "Religion" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getReligion(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(25, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-25: "Religion" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNk125_Religion(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(25, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Religion (NK1-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk125_ReligionReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(25);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-25: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertReligion(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(25, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-25: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNk125_Religion(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * NK1-25: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeReligion(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * NK1-25: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNk125_Religion(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(25, rep);
    }



    /**
     * Returns all repetitions of Mother_s Maiden Name (NK1-26).
     */
    public XPN[] getMotherSMaidenName() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(26);  
            ret = new XPN[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (XPN)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Mother_s Maiden Name (NK1-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMotherSMaidenNameReps() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(26);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-26: "Mother_s Maiden Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getMotherSMaidenName(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(26, rep);
            ret = (XPN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-26: "Mother_s Maiden Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getNk126_MotherSMaidenName(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(26, rep);
            ret = (XPN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Mother_s Maiden Name (NK1-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk126_MotherSMaidenNameReps() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(26);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-26: "Mother_s Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertMotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(26, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-26: "Mother_s Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertNk126_MotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * NK1-26: "Mother_s Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removeMotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * NK1-26: "Mother_s Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removeNk126_MotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(26, rep);
    }



    /**
     * Returns all repetitions of Nationality (NK1-27).
     */
    public CE[] getNationality() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(27);  
            ret = new CE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CE)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Nationality (NK1-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNationalityReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(27);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-27: "Nationality" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNationality(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(27, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-27: "Nationality" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNk127_Nationality(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(27, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Nationality (NK1-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk127_NationalityReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(27);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-27: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNationality(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(27, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-27: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNk127_Nationality(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * NK1-27: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNationality(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * NK1-27: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNk127_Nationality(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(27, rep);
    }



    /**
     * Returns all repetitions of Ethnic Group (NK1-28).
     */
    public CE[] getEthnicGroup() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(28);  
            ret = new CE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CE)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Ethnic Group (NK1-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEthnicGroupReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(28);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-28: "Ethnic Group" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getEthnicGroup(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(28, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-28: "Ethnic Group" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNk128_EthnicGroup(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(28, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Ethnic Group (NK1-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk128_EthnicGroupReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(28);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-28: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertEthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(28, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-28: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNk128_EthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * NK1-28: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeEthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * NK1-28: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNk128_EthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(28, rep);
    }



    /**
     * Returns all repetitions of Contact Reason (NK1-29).
     */
    public CE[] getContactReason() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(29);  
            ret = new CE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CE)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Reason (NK1-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContactReasonReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(29);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-29: "Contact Reason" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getContactReason(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(29, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-29: "Contact Reason" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNk129_ContactReason(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(29, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Reason (NK1-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk129_ContactReasonReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(29);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-29: "Contact Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertContactReason(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(29, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-29: "Contact Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNk129_ContactReason(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * NK1-29: "Contact Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeContactReason(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * NK1-29: "Contact Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNk129_ContactReason(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(29, rep);
    }



    /**
     * Returns all repetitions of Contact Person_s Name (NK1-30).
     */
    public XPN[] getContactPersonSName() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(30);  
            ret = new XPN[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (XPN)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Person_s Name (NK1-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContactPersonSNameReps() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(30);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-30: "Contact Person_s Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getContactPersonSName(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(30, rep);
            ret = (XPN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-30: "Contact Person_s Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getNk130_ContactPersonSName(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(30, rep);
            ret = (XPN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Person_s Name (NK1-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk130_ContactPersonSNameReps() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(30);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-30: "Contact Person_s Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertContactPersonSName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(30, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-30: "Contact Person_s Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertNk130_ContactPersonSName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * NK1-30: "Contact Person_s Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removeContactPersonSName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * NK1-30: "Contact Person_s Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removeNk130_ContactPersonSName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(30, rep);
    }



    /**
     * Returns all repetitions of Contact Person_s Telephone Number (NK1-31).
     */
    public XTN[] getContactPersonSTelephoneNumber() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(31);  
            ret = new XTN[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (XTN)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Person_s Telephone Number (NK1-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContactPersonSTelephoneNumberReps() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(31);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-31: "Contact Person_s Telephone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getContactPersonSTelephoneNumber(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(31, rep);
            ret = (XTN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-31: "Contact Person_s Telephone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getNk131_ContactPersonSTelephoneNumber(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(31, rep);
            ret = (XTN)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Person_s Telephone Number (NK1-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk131_ContactPersonSTelephoneNumberReps() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(31);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-31: "Contact Person_s Telephone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertContactPersonSTelephoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(31, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-31: "Contact Person_s Telephone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertNk131_ContactPersonSTelephoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * NK1-31: "Contact Person_s Telephone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeContactPersonSTelephoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * NK1-31: "Contact Person_s Telephone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeNk131_ContactPersonSTelephoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(31, rep);
    }



    /**
     * Returns all repetitions of Contact Person_s Address (NK1-32).
     */
    public XAD[] getContactPersonSAddress() {
        XAD[] ret = null;
        try {
            Type[] t = this.getField(32);  
            ret = new XAD[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (XAD)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Person_s Address (NK1-32).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContactPersonSAddressReps() {
        XAD[] ret = null;
        try {
            Type[] t = this.getField(32);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-32: "Contact Person_s Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getContactPersonSAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(32, rep);
            ret = (XAD)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-32: "Contact Person_s Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getNk132_ContactPersonSAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(32, rep);
            ret = (XAD)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Person_s Address (NK1-32).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk132_ContactPersonSAddressReps() {
        XAD[] ret = null;
        try {
            Type[] t = this.getField(32);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-32: "Contact Person_s Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertContactPersonSAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(32, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-32: "Contact Person_s Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertNk132_ContactPersonSAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(32, rep);
    }


    /**
     * Removes a repetition of
     * NK1-32: "Contact Person_s Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removeContactPersonSAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(32, rep);
    }


    /**
     * Removes a repetition of
     * NK1-32: "Contact Person_s Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removeNk132_ContactPersonSAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(32, rep);
    }



    /**
     * Returns all repetitions of Next of Kin/Associated Party_s Identifiers (NK1-33).
     */
    public CX[] getNextOfKinAssociatedPartySIdentifiers() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(33);  
            ret = new CX[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CX)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Next of Kin/Associated Party_s Identifiers (NK1-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNextOfKinAssociatedPartySIdentifiersReps() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(33);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-33: "Next of Kin/Associated Party_s Identifiers" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getNextOfKinAssociatedPartySIdentifiers(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(33, rep);
            ret = (CX)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-33: "Next of Kin/Associated Party_s Identifiers" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getNk133_NextOfKinAssociatedPartySIdentifiers(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(33, rep);
            ret = (CX)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Next of Kin/Associated Party_s Identifiers (NK1-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk133_NextOfKinAssociatedPartySIdentifiersReps() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(33);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-33: "Next of Kin/Associated Party_s Identifiers" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertNextOfKinAssociatedPartySIdentifiers(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(33, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-33: "Next of Kin/Associated Party_s Identifiers" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertNk133_NextOfKinAssociatedPartySIdentifiers(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * NK1-33: "Next of Kin/Associated Party_s Identifiers" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removeNextOfKinAssociatedPartySIdentifiers(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * NK1-33: "Next of Kin/Associated Party_s Identifiers" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removeNk133_NextOfKinAssociatedPartySIdentifiers(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(33, rep);
    }



    /**
     * Returns all repetitions of Job Status (NK1-34).
     */
    public IS[] getJobStatus() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(34);  
            ret = new IS[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (IS)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Job Status (NK1-34).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getJobStatusReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(34);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-34: "Job Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getJobStatus(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(34, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-34: "Job Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getNk134_JobStatus(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(34, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Job Status (NK1-34).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk134_JobStatusReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(34);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-34: "Job Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertJobStatus(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(34, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-34: "Job Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertNk134_JobStatus(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(34, rep);
    }


    /**
     * Removes a repetition of
     * NK1-34: "Job Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeJobStatus(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(34, rep);
    }


    /**
     * Removes a repetition of
     * NK1-34: "Job Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeNk134_JobStatus(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(34, rep);
    }



    /**
     * Returns all repetitions of Race (NK1-35).
     */
    public CE[] getRace() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(35);  
            ret = new CE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CE)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Race (NK1-35).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRaceReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(35);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-35: "Race" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRace(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(35, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-35: "Race" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNk135_Race(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(35, rep);
            ret = (CE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Race (NK1-35).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk135_RaceReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(35);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-35: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRace(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(35, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-35: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNk135_Race(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(35, rep);
    }


    /**
     * Removes a repetition of
     * NK1-35: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRace(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(35, rep);
    }


    /**
     * Removes a repetition of
     * NK1-35: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNk135_Race(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(35, rep);
    }



    /**
     * Returns all repetitions of Handicap (NK1-36).
     */
    public IS[] getHandicap() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(36);  
            ret = new IS[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (IS)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Handicap (NK1-36).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getHandicapReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(36);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-36: "Handicap" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getHandicap(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(36, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-36: "Handicap" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getNk136_Handicap(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(36, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Handicap (NK1-36).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk136_HandicapReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(36);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-36: "Handicap" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertHandicap(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(36, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-36: "Handicap" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertNk136_Handicap(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(36, rep);
    }


    /**
     * Removes a repetition of
     * NK1-36: "Handicap" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeHandicap(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(36, rep);
    }


    /**
     * Removes a repetition of
     * NK1-36: "Handicap" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeNk136_Handicap(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(36, rep);
    }



    /**
     * Returns all repetitions of Contact Person Social Security Number (NK1-37).
     */
    public ST[] getContactPersonSocialSecurityNumber() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(37);  
            ret = new ST[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (ST)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Person Social Security Number (NK1-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContactPersonSocialSecurityNumberReps() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(37);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-37: "Contact Person Social Security Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getContactPersonSocialSecurityNumber(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(37, rep);
            ret = (ST)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-37: "Contact Person Social Security Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getNk137_ContactPersonSocialSecurityNumber(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(37, rep);
            ret = (ST)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Contact Person Social Security Number (NK1-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk137_ContactPersonSocialSecurityNumberReps() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(37);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-37: "Contact Person Social Security Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertContactPersonSocialSecurityNumber(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(37, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-37: "Contact Person Social Security Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertNk137_ContactPersonSocialSecurityNumber(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * NK1-37: "Contact Person Social Security Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeContactPersonSocialSecurityNumber(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * NK1-37: "Contact Person Social Security Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeNk137_ContactPersonSocialSecurityNumber(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(37, rep);
    }



    /**
     * Returns all repetitions of Next of Kin Birth Place (NK1-38).
     */
    public ST[] getNextOfKinBirthPlace() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(38);  
            ret = new ST[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (ST)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Next of Kin Birth Place (NK1-38).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNextOfKinBirthPlaceReps() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(38);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-38: "Next of Kin Birth Place" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getNextOfKinBirthPlace(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(38, rep);
            ret = (ST)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-38: "Next of Kin Birth Place" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getNk138_NextOfKinBirthPlace(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(38, rep);
            ret = (ST)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Next of Kin Birth Place (NK1-38).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk138_NextOfKinBirthPlaceReps() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(38);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-38: "Next of Kin Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertNextOfKinBirthPlace(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(38, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-38: "Next of Kin Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertNk138_NextOfKinBirthPlace(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(38, rep);
    }


    /**
     * Removes a repetition of
     * NK1-38: "Next of Kin Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeNextOfKinBirthPlace(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(38, rep);
    }


    /**
     * Removes a repetition of
     * NK1-38: "Next of Kin Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeNk138_NextOfKinBirthPlace(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(38, rep);
    }



    /**
     * Returns all repetitions of VIP Indicator (NK1-39).
     */
    public IS[] getVIPIndicator() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(39);  
            ret = new IS[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (IS)t[i];
            }
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of VIP Indicator (NK1-39).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getVIPIndicatorReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(39);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }


    /**
     * Returns a specific repetition of
     * NK1-39: "VIP Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getVIPIndicator(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(39, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }

    /**
     * Returns a specific repetition of
     * NK1-39: "VIP Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getNk139_VIPIndicator(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(39, rep);
            ret = (IS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of VIP Indicator (NK1-39).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNk139_VIPIndicatorReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(39);
            return t.length;  
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
    }



    /**
     * Inserts a repetition of
     * NK1-39: "VIP Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertVIPIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(39, rep);
    }



    /**
     * Inserts a repetition of
     * NK1-39: "VIP Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertNk139_VIPIndicator(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(39, rep);
    }


    /**
     * Removes a repetition of
     * NK1-39: "VIP Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeVIPIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(39, rep);
    }


    /**
     * Removes a repetition of
     * NK1-39: "VIP Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeNk139_VIPIndicator(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(39, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new SI(getMessage());
          case 1: return new XPN(getMessage());
          case 2: return new CE(getMessage());
          case 3: return new XAD(getMessage());
          case 4: return new XTN(getMessage());
          case 5: return new XTN(getMessage());
          case 6: return new CE(getMessage());
          case 7: return new DT(getMessage());
          case 8: return new DT(getMessage());
          case 9: return new ST(getMessage());
          case 10: return new JCC(getMessage());
          case 11: return new CX(getMessage());
          case 12: return new XON(getMessage());
          case 13: return new CE(getMessage());
          case 14: return new IS(getMessage(), new Integer( 1 ));
          case 15: return new TS(getMessage());
          case 16: return new IS(getMessage(), new Integer( 223 ));
          case 17: return new IS(getMessage(), new Integer( 9 ));
          case 18: return new CE(getMessage());
          case 19: return new CE(getMessage());
          case 20: return new IS(getMessage(), new Integer( 220 ));
          case 21: return new CE(getMessage());
          case 22: return new ID(getMessage(), new Integer( 136 ));
          case 23: return new IS(getMessage(), new Integer( 231 ));
          case 24: return new CE(getMessage());
          case 25: return new XPN(getMessage());
          case 26: return new CE(getMessage());
          case 27: return new CE(getMessage());
          case 28: return new CE(getMessage());
          case 29: return new XPN(getMessage());
          case 30: return new XTN(getMessage());
          case 31: return new XAD(getMessage());
          case 32: return new CX(getMessage());
          case 33: return new IS(getMessage(), new Integer( 311 ));
          case 34: return new CE(getMessage());
          case 35: return new IS(getMessage(), new Integer( 295 ));
          case 36: return new ST(getMessage());
          case 37: return new ST(getMessage());
          case 38: return new IS(getMessage(), new Integer( 99 ));
          default: return null;
       }
   }


}


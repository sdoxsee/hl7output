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
 *<p>Represents an HL7 PID message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>PID-1: Set ID - PID (SI) <b>optional </b>
     * <li>PID-2: Patient ID (CX) <b>optional repeating</b>
     * <li>PID-3: Patient Identifier List (CX) <b>optional repeating</b>
     * <li>PID-4: Alternate Patient ID - PID (CX) <b>optional repeating</b>
     * <li>PID-5: Patient Name (XPN) <b>optional repeating</b>
     * <li>PID-6: Mother_s Maiden Name (XPN) <b>optional repeating</b>
     * <li>PID-7: Date/Time of Birth (TS) <b>optional </b>
     * <li>PID-8: Administrative Sex (IS) <b>optional </b>
     * <li>PID-9: Patient Alias (XPN) <b>optional repeating</b>
     * <li>PID-10: Race (CE) <b>optional repeating</b>
     * <li>PID-11: Patient Address (XAD) <b>optional repeating</b>
     * <li>PID-12: County Code (IS) <b>optional repeating</b>
     * <li>PID-13: Phone Number - Home (XTN) <b>optional repeating</b>
     * <li>PID-14: Phone Number - Business (XTN) <b>optional repeating</b>
     * <li>PID-15: Primary Language (CE) <b>optional repeating</b>
     * <li>PID-16: Marital Status (CE) <b>optional repeating</b>
     * <li>PID-17: Religion (CE) <b>optional repeating</b>
     * <li>PID-18: Patient Account Number (CX) <b>optional repeating</b>
     * <li>PID-19: SSN Number - Patient (ST) <b>optional repeating</b>
     * <li>PID-20: Driver's License Number - Patient (DLN) <b>optional repeating</b>
     * <li>PID-21: Mother's Identifier (CX) <b>optional repeating</b>
     * <li>PID-22: Ethnic Group (CE) <b>optional repeating</b>
     * <li>PID-23: Birth Place (ST) <b>optional repeating</b>
     * <li>PID-24: Multiple Birth Indicator (ID) <b>optional repeating</b>
     * <li>PID-25: Birth Order (NM) <b>optional repeating</b>
     * <li>PID-26: Citizenship (CE) <b>optional repeating</b>
     * <li>PID-27: Veterans Military Status (CE) <b>optional repeating</b>
     * <li>PID-28: Nationality (CE) <b>optional repeating</b>
     * <li>PID-29: Patient Death Date and Time (TS) <b>optional </b>
     * <li>PID-30: Patient Death Indicator (ID) <b>optional </b>
     * <li>PID-31: Identity Unknown Indicator (ID) <b>optional repeating</b>
     * <li>PID-32: Identity Reliability Code (IS) <b>optional repeating</b>
     * <li>PID-33: Last Update Date/Time (TS) <b>optional repeating</b>
     * <li>PID-34: Last Update Facility (HD) <b>optional repeating</b>
     * <li>PID-35: Species Code (CE) <b>optional repeating</b>
     * <li>PID-36: Breed Code (CE) <b>optional repeating</b>
     * <li>PID-37: Strain (ST) <b>optional repeating</b>
     * <li>PID-38: Production Class Code (CE) <b>optional repeating</b>
     * <li>PID-39: Tribal Citizenship (CWE) <b>optional repeating</b>
 * </ul>
 */
public class PID extends AbstractSegment {

    /** 
     * Creates a new PID segment
     */
    public PID(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SI.class, false, 1, 4, new Object[]{ getMessage(), new Integer(0) }, "Set ID - PID");
                                  this.add(CX.class, false, 0, 1687, new Object[]{ getMessage(), new Integer(0) }, "Patient ID");
                                  this.add(CX.class, false, -1, 1687, new Object[]{ getMessage(), new Integer(0) }, "Patient Identifier List");
                                  this.add(CX.class, false, 0, 1687, new Object[]{ getMessage(), new Integer(0) }, "Alternate Patient ID - PID");
                                  this.add(XPN.class, false, -1, 1044, new Object[]{ getMessage(), new Integer(0) }, "Patient Name");
                                  this.add(XPN.class, false, 0, 1044, new Object[]{ getMessage(), new Integer(0) }, "Mother_s Maiden Name");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage(), new Integer(0) }, "Date/Time of Birth");
                                  this.add(IS.class, false, 1, 1, new Object[]{ getMessage() }, "Administrative Sex");
                                  this.add(XPN.class, false, 0, 1044, new Object[]{ getMessage(), new Integer(0) }, "Patient Alias");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(5) }, "Race");
                                  this.add(XAD.class, false, -1, 578, new Object[]{ getMessage(), new Integer(0) }, "Patient Address");
                                  this.add(IS.class, false, 0, 4, new Object[]{ getMessage() }, "County Code");
                                  this.add(XTN.class, false, -1, 651, new Object[]{ getMessage(), new Integer(0) }, "Phone Number - Home");
                                  this.add(XTN.class, false, 0, 651, new Object[]{ getMessage(), new Integer(0) }, "Phone Number - Business");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(296) }, "Primary Language");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(2) }, "Marital Status");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(6) }, "Religion");
                                  this.add(CX.class, false, 0, 1687, new Object[]{ getMessage(), new Integer(0) }, "Patient Account Number");
                                  this.add(ST.class, false, 0, 16, new Object[]{ getMessage(), new Integer(0) }, "SSN Number - Patient");
                                  this.add(DLN.class, false, 0, 66, new Object[]{ getMessage(), new Integer(0) }, "Driver's License Number - Patient");
                                  this.add(CX.class, false, 0, 1687, new Object[]{ getMessage(), new Integer(0) }, "Mother's Identifier");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(189) }, "Ethnic Group");
                                  this.add(ST.class, false, 0, 250, new Object[]{ getMessage(), new Integer(0) }, "Birth Place");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Multiple Birth Indicator");
                                  this.add(NM.class, false, 0, 2, new Object[]{ getMessage(), new Integer(0) }, "Birth Order");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(171) }, "Citizenship");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(172) }, "Veterans Military Status");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(212) }, "Nationality");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage(), new Integer(0) }, "Patient Death Date and Time");
                                  this.add(ID.class, false, 1, 1, new Object[]{ getMessage() }, "Patient Death Indicator");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Identity Unknown Indicator");
                                  this.add(IS.class, false, 0, 20, new Object[]{ getMessage() }, "Identity Reliability Code");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Last Update Date/Time");
                                  this.add(HD.class, false, 0, 241, new Object[]{ getMessage(), new Integer(0) }, "Last Update Facility");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(446) }, "Species Code");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(447) }, "Breed Code");
                                  this.add(ST.class, false, 0, 80, new Object[]{ getMessage(), new Integer(0) }, "Strain");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(429) }, "Production Class Code");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(171) }, "Tribal Citizenship");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating PID - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * PID-1: "Set ID - PID" - creates it if necessary
     */
    public SI getSetIDPID() { 
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
     * PID-1: "Set ID - PID" - creates it if necessary
     */
    public SI getPid1_SetIDPID() { 
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
     * Returns all repetitions of Patient ID (PID-2).
     */
    public CX[] getPatientID() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(2);  
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
     * Returns a count of the current number of repetitions of Patient ID (PID-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientIDReps() {
        CX[] ret = null;
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
     * PID-2: "Patient ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPatientID(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(2, rep);
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
     * PID-2: "Patient ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPid2_PatientID(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(2, rep);
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
     * Returns a count of the current number of repetitions of Patient ID (PID-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid2_PatientIDReps() {
        CX[] ret = null;
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
     * PID-2: "Patient ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPatientID(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(2, rep);
    }



    /**
     * Inserts a repetition of
     * PID-2: "Patient ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPid2_PatientID(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * PID-2: "Patient ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePatientID(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * PID-2: "Patient ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePid2_PatientID(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(2, rep);
    }



    /**
     * Returns all repetitions of Patient Identifier List (PID-3).
     */
    public CX[] getPatientIdentifierList() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(3);  
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
     * Returns a count of the current number of repetitions of Patient Identifier List (PID-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientIdentifierListReps() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(3);
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
     * PID-3: "Patient Identifier List" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPatientIdentifierList(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(3, rep);
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
     * PID-3: "Patient Identifier List" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPid3_PatientIdentifierList(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(3, rep);
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
     * Returns a count of the current number of repetitions of Patient Identifier List (PID-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid3_PatientIdentifierListReps() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(3);
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
     * PID-3: "Patient Identifier List" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPatientIdentifierList(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(3, rep);
    }



    /**
     * Inserts a repetition of
     * PID-3: "Patient Identifier List" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPid3_PatientIdentifierList(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * PID-3: "Patient Identifier List" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePatientIdentifierList(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * PID-3: "Patient Identifier List" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePid3_PatientIdentifierList(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(3, rep);
    }



    /**
     * Returns all repetitions of Alternate Patient ID - PID (PID-4).
     */
    public CX[] getAlternatePatientIDPID() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(4);  
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
     * Returns a count of the current number of repetitions of Alternate Patient ID - PID (PID-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAlternatePatientIDPIDReps() {
        CX[] ret = null;
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
     * PID-4: "Alternate Patient ID - PID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getAlternatePatientIDPID(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(4, rep);
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
     * PID-4: "Alternate Patient ID - PID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPid4_AlternatePatientIDPID(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(4, rep);
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
     * Returns a count of the current number of repetitions of Alternate Patient ID - PID (PID-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid4_AlternatePatientIDPIDReps() {
        CX[] ret = null;
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
     * PID-4: "Alternate Patient ID - PID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertAlternatePatientIDPID(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(4, rep);
    }



    /**
     * Inserts a repetition of
     * PID-4: "Alternate Patient ID - PID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPid4_AlternatePatientIDPID(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * PID-4: "Alternate Patient ID - PID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removeAlternatePatientIDPID(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * PID-4: "Alternate Patient ID - PID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePid4_AlternatePatientIDPID(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(4, rep);
    }



    /**
     * Returns all repetitions of Patient Name (PID-5).
     */
    public XPN[] getPatientName() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(5);  
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
     * Returns a count of the current number of repetitions of Patient Name (PID-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientNameReps() {
        XPN[] ret = null;
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
     * PID-5: "Patient Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getPatientName(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(5, rep);
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
     * PID-5: "Patient Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getPid5_PatientName(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(5, rep);
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
     * Returns a count of the current number of repetitions of Patient Name (PID-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid5_PatientNameReps() {
        XPN[] ret = null;
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
     * PID-5: "Patient Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertPatientName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(5, rep);
    }



    /**
     * Inserts a repetition of
     * PID-5: "Patient Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertPid5_PatientName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * PID-5: "Patient Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removePatientName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * PID-5: "Patient Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removePid5_PatientName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Mother_s Maiden Name (PID-6).
     */
    public XPN[] getMotherSMaidenName() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(6);  
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
     * Returns a count of the current number of repetitions of Mother_s Maiden Name (PID-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMotherSMaidenNameReps() {
        XPN[] ret = null;
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
     * PID-6: "Mother_s Maiden Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getMotherSMaidenName(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(6, rep);
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
     * PID-6: "Mother_s Maiden Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getPid6_MotherSMaidenName(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(6, rep);
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
     * Returns a count of the current number of repetitions of Mother_s Maiden Name (PID-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid6_MotherSMaidenNameReps() {
        XPN[] ret = null;
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
     * PID-6: "Mother_s Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertMotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(6, rep);
    }



    /**
     * Inserts a repetition of
     * PID-6: "Mother_s Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertPid6_MotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * PID-6: "Mother_s Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removeMotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * PID-6: "Mother_s Maiden Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removePid6_MotherSMaidenName(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(6, rep);
    }




    /**
     * Returns
     * PID-7: "Date/Time of Birth" - creates it if necessary
     */
    public TS getDateTimeOfBirth() { 
        TS ret = null;
        try {
            Type t = this.getField(7, 0);
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
     * Returns
     * PID-7: "Date/Time of Birth" - creates it if necessary
     */
    public TS getPid7_DateTimeOfBirth() { 
        TS ret = null;
        try {
            Type t = this.getField(7, 0);
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
     * Returns
     * PID-8: "Administrative Sex" - creates it if necessary
     */
    public IS getAdministrativeSex() { 
        IS ret = null;
        try {
            Type t = this.getField(8, 0);
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
     * Returns
     * PID-8: "Administrative Sex" - creates it if necessary
     */
    public IS getPid8_AdministrativeSex() { 
        IS ret = null;
        try {
            Type t = this.getField(8, 0);
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
     * Returns all repetitions of Patient Alias (PID-9).
     */
    public XPN[] getPatientAlias() {
        XPN[] ret = null;
        try {
            Type[] t = this.getField(9);  
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
     * Returns a count of the current number of repetitions of Patient Alias (PID-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientAliasReps() {
        XPN[] ret = null;
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
     * PID-9: "Patient Alias" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getPatientAlias(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * PID-9: "Patient Alias" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XPN getPid9_PatientAlias(int rep) { 
        XPN ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * Returns a count of the current number of repetitions of Patient Alias (PID-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid9_PatientAliasReps() {
        XPN[] ret = null;
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
     * PID-9: "Patient Alias" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertPatientAlias(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(9, rep);
    }



    /**
     * Inserts a repetition of
     * PID-9: "Patient Alias" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN insertPid9_PatientAlias(int rep) throws HL7Exception { 
        return (XPN) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * PID-9: "Patient Alias" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removePatientAlias(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * PID-9: "Patient Alias" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XPN removePid9_PatientAlias(int rep) throws HL7Exception { 
        return (XPN) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Race (PID-10).
     */
    public CE[] getRace() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(10);  
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
     * Returns a count of the current number of repetitions of Race (PID-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRaceReps() {
        CE[] ret = null;
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
     * PID-10: "Race" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRace(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(10, rep);
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
     * PID-10: "Race" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid10_Race(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(10, rep);
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
     * Returns a count of the current number of repetitions of Race (PID-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid10_RaceReps() {
        CE[] ret = null;
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
     * PID-10: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRace(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(10, rep);
    }



    /**
     * Inserts a repetition of
     * PID-10: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid10_Race(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * PID-10: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRace(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * PID-10: "Race" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid10_Race(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(10, rep);
    }



    /**
     * Returns all repetitions of Patient Address (PID-11).
     */
    public XAD[] getPatientAddress() {
        XAD[] ret = null;
        try {
            Type[] t = this.getField(11);  
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
     * Returns a count of the current number of repetitions of Patient Address (PID-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientAddressReps() {
        XAD[] ret = null;
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
     * PID-11: "Patient Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getPatientAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(11, rep);
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
     * PID-11: "Patient Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getPid11_PatientAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(11, rep);
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
     * Returns a count of the current number of repetitions of Patient Address (PID-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid11_PatientAddressReps() {
        XAD[] ret = null;
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
     * PID-11: "Patient Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertPatientAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(11, rep);
    }



    /**
     * Inserts a repetition of
     * PID-11: "Patient Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertPid11_PatientAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * PID-11: "Patient Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removePatientAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * PID-11: "Patient Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removePid11_PatientAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(11, rep);
    }



    /**
     * Returns all repetitions of County Code (PID-12).
     */
    public IS[] getCountyCode() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(12);  
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
     * Returns a count of the current number of repetitions of County Code (PID-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCountyCodeReps() {
        IS[] ret = null;
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
     * PID-12: "County Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getCountyCode(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(12, rep);
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
     * PID-12: "County Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPid12_CountyCode(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(12, rep);
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
     * Returns a count of the current number of repetitions of County Code (PID-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid12_CountyCodeReps() {
        IS[] ret = null;
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
     * PID-12: "County Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertCountyCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(12, rep);
    }



    /**
     * Inserts a repetition of
     * PID-12: "County Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPid12_CountyCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * PID-12: "County Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeCountyCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * PID-12: "County Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePid12_CountyCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(12, rep);
    }



    /**
     * Returns all repetitions of Phone Number - Home (PID-13).
     */
    public XTN[] getPhoneNumberHome() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(13);  
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
     * Returns a count of the current number of repetitions of Phone Number - Home (PID-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPhoneNumberHomeReps() {
        XTN[] ret = null;
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
     * PID-13: "Phone Number - Home" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getPhoneNumberHome(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(13, rep);
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
     * PID-13: "Phone Number - Home" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getPid13_PhoneNumberHome(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(13, rep);
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
     * Returns a count of the current number of repetitions of Phone Number - Home (PID-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid13_PhoneNumberHomeReps() {
        XTN[] ret = null;
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
     * PID-13: "Phone Number - Home" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertPhoneNumberHome(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(13, rep);
    }



    /**
     * Inserts a repetition of
     * PID-13: "Phone Number - Home" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertPid13_PhoneNumberHome(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * PID-13: "Phone Number - Home" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removePhoneNumberHome(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * PID-13: "Phone Number - Home" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removePid13_PhoneNumberHome(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Phone Number - Business (PID-14).
     */
    public XTN[] getPhoneNumberBusiness() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(14);  
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
     * Returns a count of the current number of repetitions of Phone Number - Business (PID-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPhoneNumberBusinessReps() {
        XTN[] ret = null;
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
     * PID-14: "Phone Number - Business" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getPhoneNumberBusiness(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * PID-14: "Phone Number - Business" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getPid14_PhoneNumberBusiness(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * Returns a count of the current number of repetitions of Phone Number - Business (PID-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid14_PhoneNumberBusinessReps() {
        XTN[] ret = null;
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
     * PID-14: "Phone Number - Business" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertPhoneNumberBusiness(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(14, rep);
    }



    /**
     * Inserts a repetition of
     * PID-14: "Phone Number - Business" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertPid14_PhoneNumberBusiness(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * PID-14: "Phone Number - Business" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removePhoneNumberBusiness(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * PID-14: "Phone Number - Business" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removePid14_PhoneNumberBusiness(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(14, rep);
    }



    /**
     * Returns all repetitions of Primary Language (PID-15).
     */
    public CE[] getPrimaryLanguage() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(15);  
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
     * Returns a count of the current number of repetitions of Primary Language (PID-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPrimaryLanguageReps() {
        CE[] ret = null;
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
     * PID-15: "Primary Language" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPrimaryLanguage(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(15, rep);
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
     * PID-15: "Primary Language" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid15_PrimaryLanguage(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(15, rep);
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
     * Returns a count of the current number of repetitions of Primary Language (PID-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid15_PrimaryLanguageReps() {
        CE[] ret = null;
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
     * PID-15: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(15, rep);
    }



    /**
     * Inserts a repetition of
     * PID-15: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid15_PrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * PID-15: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * PID-15: "Primary Language" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid15_PrimaryLanguage(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Marital Status (PID-16).
     */
    public CE[] getMaritalStatus() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(16);  
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
     * Returns a count of the current number of repetitions of Marital Status (PID-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMaritalStatusReps() {
        CE[] ret = null;
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
     * PID-16: "Marital Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getMaritalStatus(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(16, rep);
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
     * PID-16: "Marital Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid16_MaritalStatus(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(16, rep);
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
     * Returns a count of the current number of repetitions of Marital Status (PID-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid16_MaritalStatusReps() {
        CE[] ret = null;
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
     * PID-16: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertMaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(16, rep);
    }



    /**
     * Inserts a repetition of
     * PID-16: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid16_MaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * PID-16: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeMaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * PID-16: "Marital Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid16_MaritalStatus(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Religion (PID-17).
     */
    public CE[] getReligion() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(17);  
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
     * Returns a count of the current number of repetitions of Religion (PID-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getReligionReps() {
        CE[] ret = null;
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
     * PID-17: "Religion" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getReligion(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(17, rep);
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
     * PID-17: "Religion" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid17_Religion(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(17, rep);
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
     * Returns a count of the current number of repetitions of Religion (PID-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid17_ReligionReps() {
        CE[] ret = null;
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
     * PID-17: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertReligion(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }



    /**
     * Inserts a repetition of
     * PID-17: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid17_Religion(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * PID-17: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeReligion(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * PID-17: "Religion" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid17_Religion(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }



    /**
     * Returns all repetitions of Patient Account Number (PID-18).
     */
    public CX[] getPatientAccountNumber() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(18);  
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
     * Returns a count of the current number of repetitions of Patient Account Number (PID-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPatientAccountNumberReps() {
        CX[] ret = null;
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
     * PID-18: "Patient Account Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPatientAccountNumber(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(18, rep);
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
     * PID-18: "Patient Account Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPid18_PatientAccountNumber(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(18, rep);
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
     * Returns a count of the current number of repetitions of Patient Account Number (PID-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid18_PatientAccountNumberReps() {
        CX[] ret = null;
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
     * PID-18: "Patient Account Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPatientAccountNumber(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(18, rep);
    }



    /**
     * Inserts a repetition of
     * PID-18: "Patient Account Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPid18_PatientAccountNumber(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * PID-18: "Patient Account Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePatientAccountNumber(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * PID-18: "Patient Account Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePid18_PatientAccountNumber(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(18, rep);
    }



    /**
     * Returns all repetitions of SSN Number - Patient (PID-19).
     */
    public ST[] getSSNNumberPatient() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(19);  
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
     * Returns a count of the current number of repetitions of SSN Number - Patient (PID-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSSNNumberPatientReps() {
        ST[] ret = null;
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
     * PID-19: "SSN Number - Patient" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getSSNNumberPatient(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(19, rep);
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
     * PID-19: "SSN Number - Patient" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getPid19_SSNNumberPatient(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(19, rep);
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
     * Returns a count of the current number of repetitions of SSN Number - Patient (PID-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid19_SSNNumberPatientReps() {
        ST[] ret = null;
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
     * PID-19: "SSN Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertSSNNumberPatient(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(19, rep);
    }



    /**
     * Inserts a repetition of
     * PID-19: "SSN Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertPid19_SSNNumberPatient(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * PID-19: "SSN Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeSSNNumberPatient(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * PID-19: "SSN Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removePid19_SSNNumberPatient(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(19, rep);
    }



    /**
     * Returns all repetitions of Driver's License Number - Patient (PID-20).
     */
    public DLN[] getDriverSLicenseNumberPatient() {
        DLN[] ret = null;
        try {
            Type[] t = this.getField(20);  
            ret = new DLN[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (DLN)t[i];
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
     * Returns a count of the current number of repetitions of Driver's License Number - Patient (PID-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDriverSLicenseNumberPatientReps() {
        DLN[] ret = null;
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
     * PID-20: "Driver's License Number - Patient" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DLN getDriverSLicenseNumberPatient(int rep) { 
        DLN ret = null;
        try {
            Type t = this.getField(20, rep);
            ret = (DLN)t;
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
     * PID-20: "Driver's License Number - Patient" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DLN getPid20_DriverSLicenseNumberPatient(int rep) { 
        DLN ret = null;
        try {
            Type t = this.getField(20, rep);
            ret = (DLN)t;
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
     * Returns a count of the current number of repetitions of Driver's License Number - Patient (PID-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid20_DriverSLicenseNumberPatientReps() {
        DLN[] ret = null;
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
     * PID-20: "Driver's License Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLN insertDriverSLicenseNumberPatient(int rep) throws HL7Exception { 
        return (DLN) super.insertRepetition(20, rep);
    }



    /**
     * Inserts a repetition of
     * PID-20: "Driver's License Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLN insertPid20_DriverSLicenseNumberPatient(int rep) throws HL7Exception { 
        return (DLN) super.insertRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * PID-20: "Driver's License Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLN removeDriverSLicenseNumberPatient(int rep) throws HL7Exception { 
        return (DLN) super.removeRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * PID-20: "Driver's License Number - Patient" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DLN removePid20_DriverSLicenseNumberPatient(int rep) throws HL7Exception { 
        return (DLN) super.removeRepetition(20, rep);
    }



    /**
     * Returns all repetitions of Mother's Identifier (PID-21).
     */
    public CX[] getMotherSIdentifier() {
        CX[] ret = null;
        try {
            Type[] t = this.getField(21);  
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
     * Returns a count of the current number of repetitions of Mother's Identifier (PID-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMotherSIdentifierReps() {
        CX[] ret = null;
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
     * PID-21: "Mother's Identifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getMotherSIdentifier(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(21, rep);
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
     * PID-21: "Mother's Identifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CX getPid21_MotherSIdentifier(int rep) { 
        CX ret = null;
        try {
            Type t = this.getField(21, rep);
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
     * Returns a count of the current number of repetitions of Mother's Identifier (PID-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid21_MotherSIdentifierReps() {
        CX[] ret = null;
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
     * PID-21: "Mother's Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertMotherSIdentifier(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(21, rep);
    }



    /**
     * Inserts a repetition of
     * PID-21: "Mother's Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX insertPid21_MotherSIdentifier(int rep) throws HL7Exception { 
        return (CX) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * PID-21: "Mother's Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removeMotherSIdentifier(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * PID-21: "Mother's Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CX removePid21_MotherSIdentifier(int rep) throws HL7Exception { 
        return (CX) super.removeRepetition(21, rep);
    }



    /**
     * Returns all repetitions of Ethnic Group (PID-22).
     */
    public CE[] getEthnicGroup() {
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
     * Returns a count of the current number of repetitions of Ethnic Group (PID-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEthnicGroupReps() {
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
     * PID-22: "Ethnic Group" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getEthnicGroup(int rep) { 
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
     * PID-22: "Ethnic Group" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid22_EthnicGroup(int rep) { 
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
     * Returns a count of the current number of repetitions of Ethnic Group (PID-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid22_EthnicGroupReps() {
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
     * PID-22: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertEthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(22, rep);
    }



    /**
     * Inserts a repetition of
     * PID-22: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid22_EthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * PID-22: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeEthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * PID-22: "Ethnic Group" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid22_EthnicGroup(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(22, rep);
    }



    /**
     * Returns all repetitions of Birth Place (PID-23).
     */
    public ST[] getBirthPlace() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(23);  
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
     * Returns a count of the current number of repetitions of Birth Place (PID-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getBirthPlaceReps() {
        ST[] ret = null;
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
     * PID-23: "Birth Place" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getBirthPlace(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(23, rep);
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
     * PID-23: "Birth Place" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getPid23_BirthPlace(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(23, rep);
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
     * Returns a count of the current number of repetitions of Birth Place (PID-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid23_BirthPlaceReps() {
        ST[] ret = null;
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
     * PID-23: "Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertBirthPlace(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(23, rep);
    }



    /**
     * Inserts a repetition of
     * PID-23: "Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertPid23_BirthPlace(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * PID-23: "Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeBirthPlace(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * PID-23: "Birth Place" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removePid23_BirthPlace(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(23, rep);
    }



    /**
     * Returns all repetitions of Multiple Birth Indicator (PID-24).
     */
    public ID[] getMultipleBirthIndicator() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(24);  
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
     * Returns a count of the current number of repetitions of Multiple Birth Indicator (PID-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMultipleBirthIndicatorReps() {
        ID[] ret = null;
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
     * PID-24: "Multiple Birth Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getMultipleBirthIndicator(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(24, rep);
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
     * PID-24: "Multiple Birth Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getPid24_MultipleBirthIndicator(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(24, rep);
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
     * Returns a count of the current number of repetitions of Multiple Birth Indicator (PID-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid24_MultipleBirthIndicatorReps() {
        ID[] ret = null;
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
     * PID-24: "Multiple Birth Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertMultipleBirthIndicator(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(24, rep);
    }



    /**
     * Inserts a repetition of
     * PID-24: "Multiple Birth Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertPid24_MultipleBirthIndicator(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * PID-24: "Multiple Birth Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeMultipleBirthIndicator(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * PID-24: "Multiple Birth Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removePid24_MultipleBirthIndicator(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(24, rep);
    }



    /**
     * Returns all repetitions of Birth Order (PID-25).
     */
    public NM[] getBirthOrder() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(25);  
            ret = new NM[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (NM)t[i];
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
     * Returns a count of the current number of repetitions of Birth Order (PID-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getBirthOrderReps() {
        NM[] ret = null;
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
     * PID-25: "Birth Order" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getBirthOrder(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(25, rep);
            ret = (NM)t;
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
     * PID-25: "Birth Order" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getPid25_BirthOrder(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(25, rep);
            ret = (NM)t;
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
     * Returns a count of the current number of repetitions of Birth Order (PID-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid25_BirthOrderReps() {
        NM[] ret = null;
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
     * PID-25: "Birth Order" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertBirthOrder(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(25, rep);
    }



    /**
     * Inserts a repetition of
     * PID-25: "Birth Order" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertPid25_BirthOrder(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * PID-25: "Birth Order" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeBirthOrder(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * PID-25: "Birth Order" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removePid25_BirthOrder(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(25, rep);
    }



    /**
     * Returns all repetitions of Citizenship (PID-26).
     */
    public CE[] getCitizenship() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(26);  
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
     * Returns a count of the current number of repetitions of Citizenship (PID-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCitizenshipReps() {
        CE[] ret = null;
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
     * PID-26: "Citizenship" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getCitizenship(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(26, rep);
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
     * PID-26: "Citizenship" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid26_Citizenship(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(26, rep);
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
     * Returns a count of the current number of repetitions of Citizenship (PID-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid26_CitizenshipReps() {
        CE[] ret = null;
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
     * PID-26: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertCitizenship(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(26, rep);
    }



    /**
     * Inserts a repetition of
     * PID-26: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid26_Citizenship(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * PID-26: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeCitizenship(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * PID-26: "Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid26_Citizenship(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(26, rep);
    }



    /**
     * Returns all repetitions of Veterans Military Status (PID-27).
     */
    public CE[] getVeteransMilitaryStatus() {
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
     * Returns a count of the current number of repetitions of Veterans Military Status (PID-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getVeteransMilitaryStatusReps() {
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
     * PID-27: "Veterans Military Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getVeteransMilitaryStatus(int rep) { 
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
     * PID-27: "Veterans Military Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid27_VeteransMilitaryStatus(int rep) { 
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
     * Returns a count of the current number of repetitions of Veterans Military Status (PID-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid27_VeteransMilitaryStatusReps() {
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
     * PID-27: "Veterans Military Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertVeteransMilitaryStatus(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(27, rep);
    }



    /**
     * Inserts a repetition of
     * PID-27: "Veterans Military Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid27_VeteransMilitaryStatus(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * PID-27: "Veterans Military Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeVeteransMilitaryStatus(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * PID-27: "Veterans Military Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid27_VeteransMilitaryStatus(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(27, rep);
    }



    /**
     * Returns all repetitions of Nationality (PID-28).
     */
    public CE[] getNationality() {
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
     * Returns a count of the current number of repetitions of Nationality (PID-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNationalityReps() {
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
     * PID-28: "Nationality" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getNationality(int rep) { 
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
     * PID-28: "Nationality" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid28_Nationality(int rep) { 
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
     * Returns a count of the current number of repetitions of Nationality (PID-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid28_NationalityReps() {
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
     * PID-28: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertNationality(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(28, rep);
    }



    /**
     * Inserts a repetition of
     * PID-28: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid28_Nationality(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * PID-28: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeNationality(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * PID-28: "Nationality" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid28_Nationality(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(28, rep);
    }




    /**
     * Returns
     * PID-29: "Patient Death Date and Time" - creates it if necessary
     */
    public TS getPatientDeathDateAndTime() { 
        TS ret = null;
        try {
            Type t = this.getField(29, 0);
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
     * Returns
     * PID-29: "Patient Death Date and Time" - creates it if necessary
     */
    public TS getPid29_PatientDeathDateAndTime() { 
        TS ret = null;
        try {
            Type t = this.getField(29, 0);
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
     * Returns
     * PID-30: "Patient Death Indicator" - creates it if necessary
     */
    public ID getPatientDeathIndicator() { 
        ID ret = null;
        try {
            Type t = this.getField(30, 0);
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
     * Returns
     * PID-30: "Patient Death Indicator" - creates it if necessary
     */
    public ID getPid30_PatientDeathIndicator() { 
        ID ret = null;
        try {
            Type t = this.getField(30, 0);
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
     * Returns all repetitions of Identity Unknown Indicator (PID-31).
     */
    public ID[] getIdentityUnknownIndicator() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(31);  
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
     * Returns a count of the current number of repetitions of Identity Unknown Indicator (PID-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getIdentityUnknownIndicatorReps() {
        ID[] ret = null;
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
     * PID-31: "Identity Unknown Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getIdentityUnknownIndicator(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(31, rep);
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
     * PID-31: "Identity Unknown Indicator" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getPid31_IdentityUnknownIndicator(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(31, rep);
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
     * Returns a count of the current number of repetitions of Identity Unknown Indicator (PID-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid31_IdentityUnknownIndicatorReps() {
        ID[] ret = null;
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
     * PID-31: "Identity Unknown Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertIdentityUnknownIndicator(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(31, rep);
    }



    /**
     * Inserts a repetition of
     * PID-31: "Identity Unknown Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertPid31_IdentityUnknownIndicator(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * PID-31: "Identity Unknown Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeIdentityUnknownIndicator(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * PID-31: "Identity Unknown Indicator" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removePid31_IdentityUnknownIndicator(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(31, rep);
    }



    /**
     * Returns all repetitions of Identity Reliability Code (PID-32).
     */
    public IS[] getIdentityReliabilityCode() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(32);  
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
     * Returns a count of the current number of repetitions of Identity Reliability Code (PID-32).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getIdentityReliabilityCodeReps() {
        IS[] ret = null;
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
     * PID-32: "Identity Reliability Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getIdentityReliabilityCode(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(32, rep);
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
     * PID-32: "Identity Reliability Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getPid32_IdentityReliabilityCode(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(32, rep);
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
     * Returns a count of the current number of repetitions of Identity Reliability Code (PID-32).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid32_IdentityReliabilityCodeReps() {
        IS[] ret = null;
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
     * PID-32: "Identity Reliability Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertIdentityReliabilityCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(32, rep);
    }



    /**
     * Inserts a repetition of
     * PID-32: "Identity Reliability Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertPid32_IdentityReliabilityCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(32, rep);
    }


    /**
     * Removes a repetition of
     * PID-32: "Identity Reliability Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeIdentityReliabilityCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(32, rep);
    }


    /**
     * Removes a repetition of
     * PID-32: "Identity Reliability Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removePid32_IdentityReliabilityCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(32, rep);
    }



    /**
     * Returns all repetitions of Last Update Date/Time (PID-33).
     */
    public TS[] getLastUpdateDateTime() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(33);  
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
     * Returns a count of the current number of repetitions of Last Update Date/Time (PID-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getLastUpdateDateTimeReps() {
        TS[] ret = null;
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
     * PID-33: "Last Update Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getLastUpdateDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(33, rep);
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
     * PID-33: "Last Update Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getPid33_LastUpdateDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(33, rep);
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
     * Returns a count of the current number of repetitions of Last Update Date/Time (PID-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid33_LastUpdateDateTimeReps() {
        TS[] ret = null;
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
     * PID-33: "Last Update Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertLastUpdateDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(33, rep);
    }



    /**
     * Inserts a repetition of
     * PID-33: "Last Update Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertPid33_LastUpdateDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * PID-33: "Last Update Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeLastUpdateDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * PID-33: "Last Update Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removePid33_LastUpdateDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(33, rep);
    }



    /**
     * Returns all repetitions of Last Update Facility (PID-34).
     */
    public HD[] getLastUpdateFacility() {
        HD[] ret = null;
        try {
            Type[] t = this.getField(34);  
            ret = new HD[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (HD)t[i];
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
     * Returns a count of the current number of repetitions of Last Update Facility (PID-34).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getLastUpdateFacilityReps() {
        HD[] ret = null;
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
     * PID-34: "Last Update Facility" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public HD getLastUpdateFacility(int rep) { 
        HD ret = null;
        try {
            Type t = this.getField(34, rep);
            ret = (HD)t;
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
     * PID-34: "Last Update Facility" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public HD getPid34_LastUpdateFacility(int rep) { 
        HD ret = null;
        try {
            Type t = this.getField(34, rep);
            ret = (HD)t;
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
     * Returns a count of the current number of repetitions of Last Update Facility (PID-34).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid34_LastUpdateFacilityReps() {
        HD[] ret = null;
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
     * PID-34: "Last Update Facility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public HD insertLastUpdateFacility(int rep) throws HL7Exception { 
        return (HD) super.insertRepetition(34, rep);
    }



    /**
     * Inserts a repetition of
     * PID-34: "Last Update Facility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public HD insertPid34_LastUpdateFacility(int rep) throws HL7Exception { 
        return (HD) super.insertRepetition(34, rep);
    }


    /**
     * Removes a repetition of
     * PID-34: "Last Update Facility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public HD removeLastUpdateFacility(int rep) throws HL7Exception { 
        return (HD) super.removeRepetition(34, rep);
    }


    /**
     * Removes a repetition of
     * PID-34: "Last Update Facility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public HD removePid34_LastUpdateFacility(int rep) throws HL7Exception { 
        return (HD) super.removeRepetition(34, rep);
    }



    /**
     * Returns all repetitions of Species Code (PID-35).
     */
    public CE[] getSpeciesCode() {
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
     * Returns a count of the current number of repetitions of Species Code (PID-35).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSpeciesCodeReps() {
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
     * PID-35: "Species Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getSpeciesCode(int rep) { 
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
     * PID-35: "Species Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid35_SpeciesCode(int rep) { 
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
     * Returns a count of the current number of repetitions of Species Code (PID-35).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid35_SpeciesCodeReps() {
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
     * PID-35: "Species Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertSpeciesCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(35, rep);
    }



    /**
     * Inserts a repetition of
     * PID-35: "Species Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid35_SpeciesCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(35, rep);
    }


    /**
     * Removes a repetition of
     * PID-35: "Species Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeSpeciesCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(35, rep);
    }


    /**
     * Removes a repetition of
     * PID-35: "Species Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid35_SpeciesCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(35, rep);
    }



    /**
     * Returns all repetitions of Breed Code (PID-36).
     */
    public CE[] getBreedCode() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(36);  
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
     * Returns a count of the current number of repetitions of Breed Code (PID-36).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getBreedCodeReps() {
        CE[] ret = null;
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
     * PID-36: "Breed Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getBreedCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(36, rep);
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
     * PID-36: "Breed Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid36_BreedCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(36, rep);
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
     * Returns a count of the current number of repetitions of Breed Code (PID-36).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid36_BreedCodeReps() {
        CE[] ret = null;
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
     * PID-36: "Breed Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertBreedCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(36, rep);
    }



    /**
     * Inserts a repetition of
     * PID-36: "Breed Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid36_BreedCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(36, rep);
    }


    /**
     * Removes a repetition of
     * PID-36: "Breed Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeBreedCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(36, rep);
    }


    /**
     * Removes a repetition of
     * PID-36: "Breed Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid36_BreedCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(36, rep);
    }



    /**
     * Returns all repetitions of Strain (PID-37).
     */
    public ST[] getStrain() {
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
     * Returns a count of the current number of repetitions of Strain (PID-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getStrainReps() {
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
     * PID-37: "Strain" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getStrain(int rep) { 
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
     * PID-37: "Strain" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getPid37_Strain(int rep) { 
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
     * Returns a count of the current number of repetitions of Strain (PID-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid37_StrainReps() {
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
     * PID-37: "Strain" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertStrain(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(37, rep);
    }



    /**
     * Inserts a repetition of
     * PID-37: "Strain" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertPid37_Strain(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * PID-37: "Strain" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeStrain(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * PID-37: "Strain" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removePid37_Strain(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(37, rep);
    }



    /**
     * Returns all repetitions of Production Class Code (PID-38).
     */
    public CE[] getProductionClassCode() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(38);  
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
     * Returns a count of the current number of repetitions of Production Class Code (PID-38).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProductionClassCodeReps() {
        CE[] ret = null;
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
     * PID-38: "Production Class Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getProductionClassCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(38, rep);
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
     * PID-38: "Production Class Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPid38_ProductionClassCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(38, rep);
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
     * Returns a count of the current number of repetitions of Production Class Code (PID-38).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid38_ProductionClassCodeReps() {
        CE[] ret = null;
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
     * PID-38: "Production Class Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertProductionClassCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(38, rep);
    }



    /**
     * Inserts a repetition of
     * PID-38: "Production Class Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPid38_ProductionClassCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(38, rep);
    }


    /**
     * Removes a repetition of
     * PID-38: "Production Class Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeProductionClassCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(38, rep);
    }


    /**
     * Removes a repetition of
     * PID-38: "Production Class Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePid38_ProductionClassCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(38, rep);
    }



    /**
     * Returns all repetitions of Tribal Citizenship (PID-39).
     */
    public CWE[] getTribalCitizenship() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(39);  
            ret = new CWE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CWE)t[i];
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
     * Returns a count of the current number of repetitions of Tribal Citizenship (PID-39).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTribalCitizenshipReps() {
        CWE[] ret = null;
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
     * PID-39: "Tribal Citizenship" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getTribalCitizenship(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(39, rep);
            ret = (CWE)t;
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
     * PID-39: "Tribal Citizenship" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getPid39_TribalCitizenship(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(39, rep);
            ret = (CWE)t;
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
     * Returns a count of the current number of repetitions of Tribal Citizenship (PID-39).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPid39_TribalCitizenshipReps() {
        CWE[] ret = null;
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
     * PID-39: "Tribal Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertTribalCitizenship(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(39, rep);
    }



    /**
     * Inserts a repetition of
     * PID-39: "Tribal Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertPid39_TribalCitizenship(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(39, rep);
    }


    /**
     * Removes a repetition of
     * PID-39: "Tribal Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeTribalCitizenship(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(39, rep);
    }


    /**
     * Removes a repetition of
     * PID-39: "Tribal Citizenship" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removePid39_TribalCitizenship(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(39, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new SI(getMessage());
          case 1: return new CX(getMessage());
          case 2: return new CX(getMessage());
          case 3: return new CX(getMessage());
          case 4: return new XPN(getMessage());
          case 5: return new XPN(getMessage());
          case 6: return new TS(getMessage());
          case 7: return new IS(getMessage(), new Integer( 1 ));
          case 8: return new XPN(getMessage());
          case 9: return new CE(getMessage());
          case 10: return new XAD(getMessage());
          case 11: return new IS(getMessage(), new Integer( 289 ));
          case 12: return new XTN(getMessage());
          case 13: return new XTN(getMessage());
          case 14: return new CE(getMessage());
          case 15: return new CE(getMessage());
          case 16: return new CE(getMessage());
          case 17: return new CX(getMessage());
          case 18: return new ST(getMessage());
          case 19: return new DLN(getMessage());
          case 20: return new CX(getMessage());
          case 21: return new CE(getMessage());
          case 22: return new ST(getMessage());
          case 23: return new ID(getMessage(), new Integer( 136 ));
          case 24: return new NM(getMessage());
          case 25: return new CE(getMessage());
          case 26: return new CE(getMessage());
          case 27: return new CE(getMessage());
          case 28: return new TS(getMessage());
          case 29: return new ID(getMessage(), new Integer( 136 ));
          case 30: return new ID(getMessage(), new Integer( 136 ));
          case 31: return new IS(getMessage(), new Integer( 445 ));
          case 32: return new TS(getMessage());
          case 33: return new HD(getMessage());
          case 34: return new CE(getMessage());
          case 35: return new CE(getMessage());
          case 36: return new ST(getMessage());
          case 37: return new CE(getMessage());
          case 38: return new CWE(getMessage());
          default: return null;
       }
   }


}


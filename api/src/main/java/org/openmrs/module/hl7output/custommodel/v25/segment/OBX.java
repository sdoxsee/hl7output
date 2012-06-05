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
 *<p>Represents an HL7 OBX message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>OBX-1: Set ID - OBX (SI) <b>optional </b>
     * <li>OBX-2: Value Type (ID) <b>optional </b>
     * <li>OBX-3: Observation Identifier (CE) <b>optional </b>
     * <li>OBX-4: Observation Sub-ID (ST) <b>optional repeating</b>
     * <li>OBX-5: Observation Value (Varies) <b>optional repeating</b>
     * <li>OBX-6: Units (CE) <b>optional </b>
     * <li>OBX-7: References Range (ST) <b>optional repeating</b>
     * <li>OBX-8: Abnormal Flags (IS) <b>optional repeating</b>
     * <li>OBX-9: Probability (NM) <b>optional repeating</b>
     * <li>OBX-10: Nature of Abnormal Test (ID) <b>optional repeating</b>
     * <li>OBX-11: Observation Result Status (ID) <b>optional </b>
     * <li>OBX-12: Effective Date of Reference Range (TS) <b>optional repeating</b>
     * <li>OBX-13: User Defined Access Checks (ST) <b>optional repeating</b>
     * <li>OBX-14: Date/Time of the Observation (TS) <b>optional </b>
     * <li>OBX-15: Producer's ID (CE) <b>optional repeating</b>
     * <li>OBX-16: Responsible Observer (XCN) <b>optional repeating</b>
     * <li>OBX-17: Observation Method (CE) <b>optional repeating</b>
     * <li>OBX-18: Equipment Instance Identifier (EI) <b>optional repeating</b>
     * <li>OBX-19: Date/Time of the Analysis (TS) <b>optional repeating</b>
 * </ul>
 */
public class OBX extends AbstractSegment {

    /** 
     * Creates a new OBX segment
     */
    public OBX(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SI.class, false, 1, 4, new Object[]{ getMessage(), new Integer(0) }, "Set ID - OBX");
                                  this.add(ID.class, false, 1, 2, new Object[]{ getMessage() }, "Value Type");
                                  this.add(CE.class, false, 1, 483, new Object[]{ getMessage(), new Integer(0) }, "Observation Identifier");
                                  this.add(ST.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "Observation Sub-ID");
                                  this.add(Varies.class, false, -1, 99999, new Object[]{ getMessage(), new Integer(0) }, "Observation Value");
                                  this.add(CE.class, false, 1, 483, new Object[]{ getMessage(), new Integer(0) }, "Units");
                                  this.add(ST.class, false, 0, 60, new Object[]{ getMessage(), new Integer(0) }, "References Range");
                                  this.add(IS.class, false, -1, 5, new Object[]{ getMessage() }, "Abnormal Flags");
                                  this.add(NM.class, false, 0, 5, new Object[]{ getMessage(), new Integer(0) }, "Probability");
                                  this.add(ID.class, false, 0, 2, new Object[]{ getMessage() }, "Nature of Abnormal Test");
                                  this.add(ID.class, false, 1, 1, new Object[]{ getMessage() }, "Observation Result Status");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Effective Date of Reference Range");
                                  this.add(ST.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "User Defined Access Checks");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage(), new Integer(0) }, "Date/Time of the Observation");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Producer's ID");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Responsible Observer");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Observation Method");
                                  this.add(EI.class, false, 0, 427, new Object[]{ getMessage(), new Integer(0) }, "Equipment Instance Identifier");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Date/Time of the Analysis");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OBX - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * OBX-1: "Set ID - OBX" - creates it if necessary
     */
    public SI getSetIDOBX() { 
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
     * OBX-1: "Set ID - OBX" - creates it if necessary
     */
    public SI getObx1_SetIDOBX() { 
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
     * OBX-2: "Value Type" - creates it if necessary
     */
    public ID getValueType() { 
        ID ret = null;
        try {
            Type t = this.getField(2, 0);
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
     * OBX-2: "Value Type" - creates it if necessary
     */
    public ID getObx2_ValueType() { 
        ID ret = null;
        try {
            Type t = this.getField(2, 0);
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
     * OBX-3: "Observation Identifier" - creates it if necessary
     */
    public CE getObservationIdentifier() { 
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
     * OBX-3: "Observation Identifier" - creates it if necessary
     */
    public CE getObx3_ObservationIdentifier() { 
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
     * Returns all repetitions of Observation Sub-ID (OBX-4).
     */
    public ST[] getObservationSubID() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(4);  
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
     * Returns a count of the current number of repetitions of Observation Sub-ID (OBX-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObservationSubIDReps() {
        ST[] ret = null;
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
     * OBX-4: "Observation Sub-ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObservationSubID(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(4, rep);
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
     * OBX-4: "Observation Sub-ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObx4_ObservationSubID(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(4, rep);
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
     * Returns a count of the current number of repetitions of Observation Sub-ID (OBX-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx4_ObservationSubIDReps() {
        ST[] ret = null;
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
     * OBX-4: "Observation Sub-ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObservationSubID(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(4, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-4: "Observation Sub-ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObx4_ObservationSubID(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * OBX-4: "Observation Sub-ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObservationSubID(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * OBX-4: "Observation Sub-ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObx4_ObservationSubID(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(4, rep);
    }



    /**
     * Returns all repetitions of Observation Value (OBX-5).
     */
    public Varies[] getObservationValue() {
        Varies[] ret = null;
        try {
            Type[] t = this.getField(5);  
            ret = new Varies[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (Varies)t[i];
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
     * Returns a count of the current number of repetitions of Observation Value (OBX-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObservationValueReps() {
        Varies[] ret = null;
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
     * OBX-5: "Observation Value" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public Varies getObservationValue(int rep) { 
        Varies ret = null;
        try {
            Type t = this.getField(5, rep);
            ret = (Varies)t;
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
     * OBX-5: "Observation Value" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public Varies getObx5_ObservationValue(int rep) { 
        Varies ret = null;
        try {
            Type t = this.getField(5, rep);
            ret = (Varies)t;
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
     * Returns a count of the current number of repetitions of Observation Value (OBX-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx5_ObservationValueReps() {
        Varies[] ret = null;
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
     * OBX-5: "Observation Value" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public Varies insertObservationValue(int rep) throws HL7Exception { 
        return (Varies) super.insertRepetition(5, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-5: "Observation Value" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public Varies insertObx5_ObservationValue(int rep) throws HL7Exception { 
        return (Varies) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * OBX-5: "Observation Value" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public Varies removeObservationValue(int rep) throws HL7Exception { 
        return (Varies) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * OBX-5: "Observation Value" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public Varies removeObx5_ObservationValue(int rep) throws HL7Exception { 
        return (Varies) super.removeRepetition(5, rep);
    }




    /**
     * Returns
     * OBX-6: "Units" - creates it if necessary
     */
    public CE getUnits() { 
        CE ret = null;
        try {
            Type t = this.getField(6, 0);
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
     * OBX-6: "Units" - creates it if necessary
     */
    public CE getObx6_Units() { 
        CE ret = null;
        try {
            Type t = this.getField(6, 0);
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
     * Returns all repetitions of References Range (OBX-7).
     */
    public ST[] getReferencesRange() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(7);  
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
     * Returns a count of the current number of repetitions of References Range (OBX-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getReferencesRangeReps() {
        ST[] ret = null;
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
     * OBX-7: "References Range" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getReferencesRange(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(7, rep);
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
     * OBX-7: "References Range" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObx7_ReferencesRange(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(7, rep);
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
     * Returns a count of the current number of repetitions of References Range (OBX-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx7_ReferencesRangeReps() {
        ST[] ret = null;
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
     * OBX-7: "References Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertReferencesRange(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(7, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-7: "References Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObx7_ReferencesRange(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * OBX-7: "References Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeReferencesRange(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * OBX-7: "References Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObx7_ReferencesRange(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(7, rep);
    }



    /**
     * Returns all repetitions of Abnormal Flags (OBX-8).
     */
    public IS[] getAbnormalFlags() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(8);  
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
     * Returns a count of the current number of repetitions of Abnormal Flags (OBX-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAbnormalFlagsReps() {
        IS[] ret = null;
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
     * OBX-8: "Abnormal Flags" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getAbnormalFlags(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(8, rep);
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
     * OBX-8: "Abnormal Flags" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getObx8_AbnormalFlags(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(8, rep);
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
     * Returns a count of the current number of repetitions of Abnormal Flags (OBX-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx8_AbnormalFlagsReps() {
        IS[] ret = null;
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
     * OBX-8: "Abnormal Flags" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertAbnormalFlags(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(8, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-8: "Abnormal Flags" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertObx8_AbnormalFlags(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * OBX-8: "Abnormal Flags" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeAbnormalFlags(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * OBX-8: "Abnormal Flags" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeObx8_AbnormalFlags(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(8, rep);
    }



    /**
     * Returns all repetitions of Probability (OBX-9).
     */
    public NM[] getProbability() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(9);  
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
     * Returns a count of the current number of repetitions of Probability (OBX-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProbabilityReps() {
        NM[] ret = null;
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
     * OBX-9: "Probability" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getProbability(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * OBX-9: "Probability" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getObx9_Probability(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * Returns a count of the current number of repetitions of Probability (OBX-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx9_ProbabilityReps() {
        NM[] ret = null;
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
     * OBX-9: "Probability" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertProbability(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(9, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-9: "Probability" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertObx9_Probability(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * OBX-9: "Probability" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeProbability(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * OBX-9: "Probability" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeObx9_Probability(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Nature of Abnormal Test (OBX-10).
     */
    public ID[] getNatureOfAbnormalTest() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(10);  
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
     * Returns a count of the current number of repetitions of Nature of Abnormal Test (OBX-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNatureOfAbnormalTestReps() {
        ID[] ret = null;
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
     * OBX-10: "Nature of Abnormal Test" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getNatureOfAbnormalTest(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(10, rep);
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
     * OBX-10: "Nature of Abnormal Test" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObx10_NatureOfAbnormalTest(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(10, rep);
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
     * Returns a count of the current number of repetitions of Nature of Abnormal Test (OBX-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx10_NatureOfAbnormalTestReps() {
        ID[] ret = null;
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
     * OBX-10: "Nature of Abnormal Test" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertNatureOfAbnormalTest(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(10, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-10: "Nature of Abnormal Test" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObx10_NatureOfAbnormalTest(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * OBX-10: "Nature of Abnormal Test" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeNatureOfAbnormalTest(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * OBX-10: "Nature of Abnormal Test" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObx10_NatureOfAbnormalTest(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(10, rep);
    }




    /**
     * Returns
     * OBX-11: "Observation Result Status" - creates it if necessary
     */
    public ID getObservationResultStatus() { 
        ID ret = null;
        try {
            Type t = this.getField(11, 0);
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
     * OBX-11: "Observation Result Status" - creates it if necessary
     */
    public ID getObx11_ObservationResultStatus() { 
        ID ret = null;
        try {
            Type t = this.getField(11, 0);
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
     * Returns all repetitions of Effective Date of Reference Range (OBX-12).
     */
    public TS[] getEffectiveDateOfReferenceRange() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(12);  
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
     * Returns a count of the current number of repetitions of Effective Date of Reference Range (OBX-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEffectiveDateOfReferenceRangeReps() {
        TS[] ret = null;
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
     * OBX-12: "Effective Date of Reference Range" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getEffectiveDateOfReferenceRange(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(12, rep);
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
     * OBX-12: "Effective Date of Reference Range" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObx12_EffectiveDateOfReferenceRange(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(12, rep);
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
     * Returns a count of the current number of repetitions of Effective Date of Reference Range (OBX-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx12_EffectiveDateOfReferenceRangeReps() {
        TS[] ret = null;
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
     * OBX-12: "Effective Date of Reference Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertEffectiveDateOfReferenceRange(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(12, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-12: "Effective Date of Reference Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObx12_EffectiveDateOfReferenceRange(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * OBX-12: "Effective Date of Reference Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeEffectiveDateOfReferenceRange(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * OBX-12: "Effective Date of Reference Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObx12_EffectiveDateOfReferenceRange(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(12, rep);
    }



    /**
     * Returns all repetitions of User Defined Access Checks (OBX-13).
     */
    public ST[] getUserDefinedAccessChecks() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(13);  
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
     * Returns a count of the current number of repetitions of User Defined Access Checks (OBX-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getUserDefinedAccessChecksReps() {
        ST[] ret = null;
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
     * OBX-13: "User Defined Access Checks" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getUserDefinedAccessChecks(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(13, rep);
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
     * OBX-13: "User Defined Access Checks" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObx13_UserDefinedAccessChecks(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(13, rep);
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
     * Returns a count of the current number of repetitions of User Defined Access Checks (OBX-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx13_UserDefinedAccessChecksReps() {
        ST[] ret = null;
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
     * OBX-13: "User Defined Access Checks" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertUserDefinedAccessChecks(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(13, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-13: "User Defined Access Checks" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObx13_UserDefinedAccessChecks(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * OBX-13: "User Defined Access Checks" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeUserDefinedAccessChecks(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * OBX-13: "User Defined Access Checks" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObx13_UserDefinedAccessChecks(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(13, rep);
    }




    /**
     * Returns
     * OBX-14: "Date/Time of the Observation" - creates it if necessary
     */
    public TS getDateTimeOfTheObservation() { 
        TS ret = null;
        try {
            Type t = this.getField(14, 0);
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
     * OBX-14: "Date/Time of the Observation" - creates it if necessary
     */
    public TS getObx14_DateTimeOfTheObservation() { 
        TS ret = null;
        try {
            Type t = this.getField(14, 0);
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
     * Returns all repetitions of Producer's ID (OBX-15).
     */
    public CE[] getProducerSID() {
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
     * Returns a count of the current number of repetitions of Producer's ID (OBX-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProducerSIDReps() {
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
     * OBX-15: "Producer's ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getProducerSID(int rep) { 
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
     * OBX-15: "Producer's ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObx15_ProducerSID(int rep) { 
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
     * Returns a count of the current number of repetitions of Producer's ID (OBX-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx15_ProducerSIDReps() {
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
     * OBX-15: "Producer's ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertProducerSID(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(15, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-15: "Producer's ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObx15_ProducerSID(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * OBX-15: "Producer's ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeProducerSID(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * OBX-15: "Producer's ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObx15_ProducerSID(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Responsible Observer (OBX-16).
     */
    public XCN[] getResponsibleObserver() {
        XCN[] ret = null;
        try {
            Type[] t = this.getField(16);  
            ret = new XCN[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (XCN)t[i];
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
     * Returns a count of the current number of repetitions of Responsible Observer (OBX-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getResponsibleObserverReps() {
        XCN[] ret = null;
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
     * OBX-16: "Responsible Observer" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getResponsibleObserver(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(16, rep);
            ret = (XCN)t;
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
     * OBX-16: "Responsible Observer" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getObx16_ResponsibleObserver(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(16, rep);
            ret = (XCN)t;
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
     * Returns a count of the current number of repetitions of Responsible Observer (OBX-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx16_ResponsibleObserverReps() {
        XCN[] ret = null;
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
     * OBX-16: "Responsible Observer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertResponsibleObserver(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(16, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-16: "Responsible Observer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertObx16_ResponsibleObserver(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * OBX-16: "Responsible Observer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeResponsibleObserver(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * OBX-16: "Responsible Observer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeObx16_ResponsibleObserver(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Observation Method (OBX-17).
     */
    public CE[] getObservationMethod() {
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
     * Returns a count of the current number of repetitions of Observation Method (OBX-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObservationMethodReps() {
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
     * OBX-17: "Observation Method" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObservationMethod(int rep) { 
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
     * OBX-17: "Observation Method" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObx17_ObservationMethod(int rep) { 
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
     * Returns a count of the current number of repetitions of Observation Method (OBX-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx17_ObservationMethodReps() {
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
     * OBX-17: "Observation Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObservationMethod(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-17: "Observation Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObx17_ObservationMethod(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * OBX-17: "Observation Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObservationMethod(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * OBX-17: "Observation Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObx17_ObservationMethod(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }



    /**
     * Returns all repetitions of Equipment Instance Identifier (OBX-18).
     */
    public EI[] getEquipmentInstanceIdentifier() {
        EI[] ret = null;
        try {
            Type[] t = this.getField(18);  
            ret = new EI[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (EI)t[i];
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
     * Returns a count of the current number of repetitions of Equipment Instance Identifier (OBX-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEquipmentInstanceIdentifierReps() {
        EI[] ret = null;
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
     * OBX-18: "Equipment Instance Identifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getEquipmentInstanceIdentifier(int rep) { 
        EI ret = null;
        try {
            Type t = this.getField(18, rep);
            ret = (EI)t;
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
     * OBX-18: "Equipment Instance Identifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getObx18_EquipmentInstanceIdentifier(int rep) { 
        EI ret = null;
        try {
            Type t = this.getField(18, rep);
            ret = (EI)t;
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
     * Returns a count of the current number of repetitions of Equipment Instance Identifier (OBX-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx18_EquipmentInstanceIdentifierReps() {
        EI[] ret = null;
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
     * OBX-18: "Equipment Instance Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertEquipmentInstanceIdentifier(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(18, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-18: "Equipment Instance Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertObx18_EquipmentInstanceIdentifier(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * OBX-18: "Equipment Instance Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeEquipmentInstanceIdentifier(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * OBX-18: "Equipment Instance Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeObx18_EquipmentInstanceIdentifier(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(18, rep);
    }



    /**
     * Returns all repetitions of Date/Time of the Analysis (OBX-19).
     */
    public TS[] getDateTimeOfTheAnalysis() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(19);  
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
     * Returns a count of the current number of repetitions of Date/Time of the Analysis (OBX-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDateTimeOfTheAnalysisReps() {
        TS[] ret = null;
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
     * OBX-19: "Date/Time of the Analysis" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getDateTimeOfTheAnalysis(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(19, rep);
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
     * OBX-19: "Date/Time of the Analysis" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObx19_DateTimeOfTheAnalysis(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(19, rep);
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
     * Returns a count of the current number of repetitions of Date/Time of the Analysis (OBX-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObx19_DateTimeOfTheAnalysisReps() {
        TS[] ret = null;
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
     * OBX-19: "Date/Time of the Analysis" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertDateTimeOfTheAnalysis(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(19, rep);
    }



    /**
     * Inserts a repetition of
     * OBX-19: "Date/Time of the Analysis" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObx19_DateTimeOfTheAnalysis(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * OBX-19: "Date/Time of the Analysis" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeDateTimeOfTheAnalysis(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * OBX-19: "Date/Time of the Analysis" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObx19_DateTimeOfTheAnalysis(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(19, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new SI(getMessage());
          case 1: return new ID(getMessage(), new Integer( 125 ));
          case 2: return new CE(getMessage());
          case 3: return new ST(getMessage());
          case 4: return new Varies(getMessage());
          case 5: return new CE(getMessage());
          case 6: return new ST(getMessage());
          case 7: return new IS(getMessage(), new Integer( 78 ));
          case 8: return new NM(getMessage());
          case 9: return new ID(getMessage(), new Integer( 80 ));
          case 10: return new ID(getMessage(), new Integer( 85 ));
          case 11: return new TS(getMessage());
          case 12: return new ST(getMessage());
          case 13: return new TS(getMessage());
          case 14: return new CE(getMessage());
          case 15: return new XCN(getMessage());
          case 16: return new CE(getMessage());
          case 17: return new EI(getMessage());
          case 18: return new TS(getMessage());
          default: return null;
       }
   }


}


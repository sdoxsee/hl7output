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
 *<p>Represents an HL7 TQ1 message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>TQ1-1: Set ID - TQ1 (SI) <b>optional repeating</b>
     * <li>TQ1-2: Quantity (CQ) <b>optional repeating</b>
     * <li>TQ1-3: Repeat Pattern (RPT) <b>optional repeating</b>
     * <li>TQ1-4: Explicit Time (TM) <b>optional repeating</b>
     * <li>TQ1-5: Relative Time and Units (CQ) <b>optional repeating</b>
     * <li>TQ1-6: Service Duration (CQ) <b>optional repeating</b>
     * <li>TQ1-7: Start date/time (TS) <b>optional </b>
     * <li>TQ1-8: End date/time (TS) <b>optional repeating</b>
     * <li>TQ1-9: Priority (CWE) <b>optional repeating</b>
     * <li>TQ1-10: Condition text (TX) <b>optional repeating</b>
     * <li>TQ1-11: Text instruction (TX) <b>optional </b>
     * <li>TQ1-12: Conjunction (ID) <b>optional repeating</b>
     * <li>TQ1-13: Occurrence duration (CQ) <b>optional repeating</b>
     * <li>TQ1-14: Total occurrence's (NM) <b>optional repeating</b>
 * </ul>
 */
public class TQ1 extends AbstractSegment {

    /** 
     * Creates a new TQ1 segment
     */
    public TQ1(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SI.class, false, 0, 4, new Object[]{ getMessage(), new Integer(0) }, "Set ID - TQ1");
                                  this.add(CQ.class, false, 0, 500, new Object[]{ getMessage(), new Integer(0) }, "Quantity");
                                  this.add(RPT.class, false, -1, 984, new Object[]{ getMessage(), new Integer(335) }, "Repeat Pattern");
                                  this.add(TM.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "Explicit Time");
                                  this.add(CQ.class, false, 0, 500, new Object[]{ getMessage(), new Integer(0) }, "Relative Time and Units");
                                  this.add(CQ.class, false, 0, 500, new Object[]{ getMessage(), new Integer(0) }, "Service Duration");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage(), new Integer(0) }, "Start date/time");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "End date/time");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(485) }, "Priority");
                                  this.add(TX.class, false, 0, 250, new Object[]{ getMessage(), new Integer(0) }, "Condition text");
                                  this.add(TX.class, false, 1, 250, new Object[]{ getMessage(), new Integer(0) }, "Text instruction");
                                  this.add(ID.class, false, 0, 10, new Object[]{ getMessage() }, "Conjunction");
                                  this.add(CQ.class, false, 0, 500, new Object[]{ getMessage(), new Integer(0) }, "Occurrence duration");
                                  this.add(NM.class, false, 0, 10, new Object[]{ getMessage(), new Integer(0) }, "Total occurrence's");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating TQ1 - this is probably a bug in the source code generator.", e);
       }
    }


    /**
     * Returns all repetitions of Set ID - TQ1 (TQ1-1).
     */
    public SI[] getSetIDTQ1() {
        SI[] ret = null;
        try {
            Type[] t = this.getField(1);  
            ret = new SI[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (SI)t[i];
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
     * Returns a count of the current number of repetitions of Set ID - TQ1 (TQ1-1).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSetIDTQ1Reps() {
        SI[] ret = null;
        try {
            Type[] t = this.getField(1);
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
     * TQ1-1: "Set ID - TQ1" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public SI getSetIDTQ1(int rep) { 
        SI ret = null;
        try {
            Type t = this.getField(1, rep);
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
     * Returns a specific repetition of
     * TQ1-1: "Set ID - TQ1" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public SI getTq11_SetIDTQ1(int rep) { 
        SI ret = null;
        try {
            Type t = this.getField(1, rep);
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
     * Returns a count of the current number of repetitions of Set ID - TQ1 (TQ1-1).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq11_SetIDTQ1Reps() {
        SI[] ret = null;
        try {
            Type[] t = this.getField(1);
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
     * TQ1-1: "Set ID - TQ1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SI insertSetIDTQ1(int rep) throws HL7Exception { 
        return (SI) super.insertRepetition(1, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-1: "Set ID - TQ1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SI insertTq11_SetIDTQ1(int rep) throws HL7Exception { 
        return (SI) super.insertRepetition(1, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-1: "Set ID - TQ1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SI removeSetIDTQ1(int rep) throws HL7Exception { 
        return (SI) super.removeRepetition(1, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-1: "Set ID - TQ1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SI removeTq11_SetIDTQ1(int rep) throws HL7Exception { 
        return (SI) super.removeRepetition(1, rep);
    }



    /**
     * Returns all repetitions of Quantity (TQ1-2).
     */
    public CQ[] getQuantity() {
        CQ[] ret = null;
        try {
            Type[] t = this.getField(2);  
            ret = new CQ[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CQ)t[i];
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
     * Returns a count of the current number of repetitions of Quantity (TQ1-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getQuantityReps() {
        CQ[] ret = null;
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
     * TQ1-2: "Quantity" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getQuantity(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(2, rep);
            ret = (CQ)t;
        } catch (ClassCastException cce) {
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
     * TQ1-2: "Quantity" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getTq12_Quantity(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(2, rep);
            ret = (CQ)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Quantity (TQ1-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq12_QuantityReps() {
        CQ[] ret = null;
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
     * TQ1-2: "Quantity" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertQuantity(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(2, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-2: "Quantity" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertTq12_Quantity(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-2: "Quantity" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeQuantity(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-2: "Quantity" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeTq12_Quantity(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(2, rep);
    }



    /**
     * Returns all repetitions of Repeat Pattern (TQ1-3).
     */
    public RPT[] getRepeatPattern() {
        RPT[] ret = null;
        try {
            Type[] t = this.getField(3);  
            ret = new RPT[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (RPT)t[i];
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
     * Returns a count of the current number of repetitions of Repeat Pattern (TQ1-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRepeatPatternReps() {
        RPT[] ret = null;
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
     * TQ1-3: "Repeat Pattern" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public RPT getRepeatPattern(int rep) { 
        RPT ret = null;
        try {
            Type t = this.getField(3, rep);
            ret = (RPT)t;
        } catch (ClassCastException cce) {
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
     * TQ1-3: "Repeat Pattern" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public RPT getTq13_RepeatPattern(int rep) { 
        RPT ret = null;
        try {
            Type t = this.getField(3, rep);
            ret = (RPT)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Repeat Pattern (TQ1-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq13_RepeatPatternReps() {
        RPT[] ret = null;
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
     * TQ1-3: "Repeat Pattern" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public RPT insertRepeatPattern(int rep) throws HL7Exception { 
        return (RPT) super.insertRepetition(3, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-3: "Repeat Pattern" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public RPT insertTq13_RepeatPattern(int rep) throws HL7Exception { 
        return (RPT) super.insertRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-3: "Repeat Pattern" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public RPT removeRepeatPattern(int rep) throws HL7Exception { 
        return (RPT) super.removeRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-3: "Repeat Pattern" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public RPT removeTq13_RepeatPattern(int rep) throws HL7Exception { 
        return (RPT) super.removeRepetition(3, rep);
    }



    /**
     * Returns all repetitions of Explicit Time (TQ1-4).
     */
    public TM[] getExplicitTime() {
        TM[] ret = null;
        try {
            Type[] t = this.getField(4);  
            ret = new TM[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (TM)t[i];
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
     * Returns a count of the current number of repetitions of Explicit Time (TQ1-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getExplicitTimeReps() {
        TM[] ret = null;
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
     * TQ1-4: "Explicit Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TM getExplicitTime(int rep) { 
        TM ret = null;
        try {
            Type t = this.getField(4, rep);
            ret = (TM)t;
        } catch (ClassCastException cce) {
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
     * TQ1-4: "Explicit Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TM getTq14_ExplicitTime(int rep) { 
        TM ret = null;
        try {
            Type t = this.getField(4, rep);
            ret = (TM)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Explicit Time (TQ1-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq14_ExplicitTimeReps() {
        TM[] ret = null;
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
     * TQ1-4: "Explicit Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TM insertExplicitTime(int rep) throws HL7Exception { 
        return (TM) super.insertRepetition(4, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-4: "Explicit Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TM insertTq14_ExplicitTime(int rep) throws HL7Exception { 
        return (TM) super.insertRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-4: "Explicit Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TM removeExplicitTime(int rep) throws HL7Exception { 
        return (TM) super.removeRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-4: "Explicit Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TM removeTq14_ExplicitTime(int rep) throws HL7Exception { 
        return (TM) super.removeRepetition(4, rep);
    }



    /**
     * Returns all repetitions of Relative Time and Units (TQ1-5).
     */
    public CQ[] getRelativeTimeAndUnits() {
        CQ[] ret = null;
        try {
            Type[] t = this.getField(5);  
            ret = new CQ[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CQ)t[i];
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
     * Returns a count of the current number of repetitions of Relative Time and Units (TQ1-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRelativeTimeAndUnitsReps() {
        CQ[] ret = null;
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
     * TQ1-5: "Relative Time and Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getRelativeTimeAndUnits(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(5, rep);
            ret = (CQ)t;
        } catch (ClassCastException cce) {
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
     * TQ1-5: "Relative Time and Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getTq15_RelativeTimeAndUnits(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(5, rep);
            ret = (CQ)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Relative Time and Units (TQ1-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq15_RelativeTimeAndUnitsReps() {
        CQ[] ret = null;
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
     * TQ1-5: "Relative Time and Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertRelativeTimeAndUnits(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(5, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-5: "Relative Time and Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertTq15_RelativeTimeAndUnits(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-5: "Relative Time and Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeRelativeTimeAndUnits(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-5: "Relative Time and Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeTq15_RelativeTimeAndUnits(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Service Duration (TQ1-6).
     */
    public CQ[] getServiceDuration() {
        CQ[] ret = null;
        try {
            Type[] t = this.getField(6);  
            ret = new CQ[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CQ)t[i];
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
     * Returns a count of the current number of repetitions of Service Duration (TQ1-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getServiceDurationReps() {
        CQ[] ret = null;
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
     * TQ1-6: "Service Duration" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getServiceDuration(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(6, rep);
            ret = (CQ)t;
        } catch (ClassCastException cce) {
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
     * TQ1-6: "Service Duration" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getTq16_ServiceDuration(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(6, rep);
            ret = (CQ)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Service Duration (TQ1-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq16_ServiceDurationReps() {
        CQ[] ret = null;
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
     * TQ1-6: "Service Duration" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertServiceDuration(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(6, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-6: "Service Duration" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertTq16_ServiceDuration(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-6: "Service Duration" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeServiceDuration(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-6: "Service Duration" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeTq16_ServiceDuration(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(6, rep);
    }




    /**
     * Returns
     * TQ1-7: "Start date/time" - creates it if necessary
     */
    public TS getStartDateTime() { 
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
     * TQ1-7: "Start date/time" - creates it if necessary
     */
    public TS getTq17_StartDateTime() { 
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
     * Returns all repetitions of End date/time (TQ1-8).
     */
    public TS[] getEndDateTime() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(8);  
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
     * Returns a count of the current number of repetitions of End date/time (TQ1-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEndDateTimeReps() {
        TS[] ret = null;
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
     * TQ1-8: "End date/time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getEndDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(8, rep);
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
     * TQ1-8: "End date/time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getTq18_EndDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(8, rep);
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
     * Returns a count of the current number of repetitions of End date/time (TQ1-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq18_EndDateTimeReps() {
        TS[] ret = null;
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
     * TQ1-8: "End date/time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertEndDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(8, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-8: "End date/time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertTq18_EndDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-8: "End date/time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeEndDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-8: "End date/time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeTq18_EndDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(8, rep);
    }



    /**
     * Returns all repetitions of Priority (TQ1-9).
     */
    public CWE[] getPriority() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(9);  
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
     * Returns a count of the current number of repetitions of Priority (TQ1-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPriorityReps() {
        CWE[] ret = null;
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
     * TQ1-9: "Priority" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getPriority(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * TQ1-9: "Priority" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getTq19_Priority(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * Returns a count of the current number of repetitions of Priority (TQ1-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq19_PriorityReps() {
        CWE[] ret = null;
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
     * TQ1-9: "Priority" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertPriority(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(9, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-9: "Priority" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertTq19_Priority(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-9: "Priority" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removePriority(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-9: "Priority" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeTq19_Priority(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Condition text (TQ1-10).
     */
    public TX[] getConditionText() {
        TX[] ret = null;
        try {
            Type[] t = this.getField(10);  
            ret = new TX[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (TX)t[i];
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
     * Returns a count of the current number of repetitions of Condition text (TQ1-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getConditionTextReps() {
        TX[] ret = null;
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
     * TQ1-10: "Condition text" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TX getConditionText(int rep) { 
        TX ret = null;
        try {
            Type t = this.getField(10, rep);
            ret = (TX)t;
        } catch (ClassCastException cce) {
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
     * TQ1-10: "Condition text" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TX getTq110_ConditionText(int rep) { 
        TX ret = null;
        try {
            Type t = this.getField(10, rep);
            ret = (TX)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Condition text (TQ1-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq110_ConditionTextReps() {
        TX[] ret = null;
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
     * TQ1-10: "Condition text" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TX insertConditionText(int rep) throws HL7Exception { 
        return (TX) super.insertRepetition(10, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-10: "Condition text" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TX insertTq110_ConditionText(int rep) throws HL7Exception { 
        return (TX) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-10: "Condition text" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TX removeConditionText(int rep) throws HL7Exception { 
        return (TX) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-10: "Condition text" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TX removeTq110_ConditionText(int rep) throws HL7Exception { 
        return (TX) super.removeRepetition(10, rep);
    }




    /**
     * Returns
     * TQ1-11: "Text instruction" - creates it if necessary
     */
    public TX getTextInstruction() { 
        TX ret = null;
        try {
            Type t = this.getField(11, 0);
            ret = (TX)t;
        } catch (ClassCastException cce) {
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
     * TQ1-11: "Text instruction" - creates it if necessary
     */
    public TX getTq111_TextInstruction() { 
        TX ret = null;
        try {
            Type t = this.getField(11, 0);
            ret = (TX)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns all repetitions of Conjunction (TQ1-12).
     */
    public ID[] getConjunction() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(12);  
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
     * Returns a count of the current number of repetitions of Conjunction (TQ1-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getConjunctionReps() {
        ID[] ret = null;
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
     * TQ1-12: "Conjunction" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getConjunction(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(12, rep);
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
     * TQ1-12: "Conjunction" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getTq112_Conjunction(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(12, rep);
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
     * Returns a count of the current number of repetitions of Conjunction (TQ1-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq112_ConjunctionReps() {
        ID[] ret = null;
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
     * TQ1-12: "Conjunction" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertConjunction(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(12, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-12: "Conjunction" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertTq112_Conjunction(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-12: "Conjunction" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeConjunction(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-12: "Conjunction" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeTq112_Conjunction(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(12, rep);
    }



    /**
     * Returns all repetitions of Occurrence duration (TQ1-13).
     */
    public CQ[] getOccurrenceDuration() {
        CQ[] ret = null;
        try {
            Type[] t = this.getField(13);  
            ret = new CQ[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CQ)t[i];
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
     * Returns a count of the current number of repetitions of Occurrence duration (TQ1-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOccurrenceDurationReps() {
        CQ[] ret = null;
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
     * TQ1-13: "Occurrence duration" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getOccurrenceDuration(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(13, rep);
            ret = (CQ)t;
        } catch (ClassCastException cce) {
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
     * TQ1-13: "Occurrence duration" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getTq113_OccurrenceDuration(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(13, rep);
            ret = (CQ)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Occurrence duration (TQ1-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq113_OccurrenceDurationReps() {
        CQ[] ret = null;
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
     * TQ1-13: "Occurrence duration" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertOccurrenceDuration(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(13, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-13: "Occurrence duration" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertTq113_OccurrenceDuration(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-13: "Occurrence duration" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeOccurrenceDuration(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-13: "Occurrence duration" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeTq113_OccurrenceDuration(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Total occurrence's (TQ1-14).
     */
    public NM[] getTotalOccurrenceS() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(14);  
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
     * Returns a count of the current number of repetitions of Total occurrence's (TQ1-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTotalOccurrenceSReps() {
        NM[] ret = null;
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
     * TQ1-14: "Total occurrence's" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getTotalOccurrenceS(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * TQ1-14: "Total occurrence's" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getTq114_TotalOccurrenceS(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * Returns a count of the current number of repetitions of Total occurrence's (TQ1-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTq114_TotalOccurrenceSReps() {
        NM[] ret = null;
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
     * TQ1-14: "Total occurrence's" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertTotalOccurrenceS(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(14, rep);
    }



    /**
     * Inserts a repetition of
     * TQ1-14: "Total occurrence's" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertTq114_TotalOccurrenceS(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-14: "Total occurrence's" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeTotalOccurrenceS(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * TQ1-14: "Total occurrence's" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeTq114_TotalOccurrenceS(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(14, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new SI(getMessage());
          case 1: return new CQ(getMessage());
          case 2: return new RPT(getMessage());
          case 3: return new TM(getMessage());
          case 4: return new CQ(getMessage());
          case 5: return new CQ(getMessage());
          case 6: return new TS(getMessage());
          case 7: return new TS(getMessage());
          case 8: return new CWE(getMessage());
          case 9: return new TX(getMessage());
          case 10: return new TX(getMessage());
          case 11: return new ID(getMessage(), new Integer( 427 ));
          case 12: return new CQ(getMessage());
          case 13: return new NM(getMessage());
          default: return null;
       }
   }


}


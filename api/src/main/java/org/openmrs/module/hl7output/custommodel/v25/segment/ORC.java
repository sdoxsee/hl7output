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
 *<p>Represents an HL7 ORC message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>ORC-1: Order Control (ID) <b>optional </b>
     * <li>ORC-2: Placer Order Number (EI) <b>optional repeating</b>
     * <li>ORC-3: Filler Order Number (EI) <b>optional repeating</b>
     * <li>ORC-4: Placer Group Number (EI) <b>optional repeating</b>
     * <li>ORC-5: Order Status (ID) <b>optional repeating</b>
     * <li>ORC-6: Response Flag (ID) <b>optional repeating</b>
     * <li>ORC-7: Quantity/Timing (TQ) <b>optional repeating</b>
     * <li>ORC-8: Parent (EIP) <b>optional repeating</b>
     * <li>ORC-9: Date/Time of Transaction (TS) <b>optional repeating</b>
     * <li>ORC-10: Entered By (XCN) <b>optional repeating</b>
     * <li>ORC-11: Verified By (XCN) <b>optional repeating</b>
     * <li>ORC-12: Ordering Provider (XCN) <b>optional repeating</b>
     * <li>ORC-13: Enterer's Location (PL) <b>optional repeating</b>
     * <li>ORC-14: Call Back Phone Number (XTN) <b>optional repeating</b>
     * <li>ORC-15: Order Effective Date/Time (TS) <b>optional repeating</b>
     * <li>ORC-16: Order Control Code Reason (CE) <b>optional repeating</b>
     * <li>ORC-17: Entering Organization (CE) <b>optional repeating</b>
     * <li>ORC-18: Entering Device (CE) <b>optional repeating</b>
     * <li>ORC-19: Action By (XCN) <b>optional repeating</b>
     * <li>ORC-20: Advanced Beneficiary Notice Code (CE) <b>optional repeating</b>
     * <li>ORC-21: Ordering Facility Name (XON) <b>optional repeating</b>
     * <li>ORC-22: Ordering Facility Address (XAD) <b>optional repeating</b>
     * <li>ORC-23: Ordering Facility Phone Number (XTN) <b>optional repeating</b>
     * <li>ORC-24: Ordering Provider Address (XAD) <b>optional repeating</b>
     * <li>ORC-25: Order Status Modifier (CWE) <b>optional repeating</b>
     * <li>ORC-26: Advanced Beneficiary Notice Override Reason (CWE) <b>optional repeating</b>
     * <li>ORC-27: Filler's Expected Availability Date/Time (TS) <b>optional repeating</b>
     * <li>ORC-28: Confidentiality Code (CWE) <b>optional repeating</b>
     * <li>ORC-29: Order Type (CWE) <b>optional repeating</b>
     * <li>ORC-30: Enterer Authorization Mode (CNE) <b>optional repeating</b>
 * </ul>
 */
public class ORC extends AbstractSegment {

    /** 
     * Creates a new ORC segment
     */
    public ORC(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(ID.class, false, 1, 2, new Object[]{ getMessage() }, "Order Control");
                                  this.add(EI.class, false, 0, 427, new Object[]{ getMessage(), new Integer(0) }, "Placer Order Number");
                                  this.add(EI.class, false, 0, 427, new Object[]{ getMessage(), new Integer(0) }, "Filler Order Number");
                                  this.add(EI.class, false, 0, 427, new Object[]{ getMessage(), new Integer(0) }, "Placer Group Number");
                                  this.add(ID.class, false, 0, 2, new Object[]{ getMessage() }, "Order Status");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Response Flag");
                                  this.add(TQ.class, false, 0, 1788, new Object[]{ getMessage(), new Integer(0) }, "Quantity/Timing");
                                  this.add(EIP.class, false, 0, 855, new Object[]{ getMessage(), new Integer(0) }, "Parent");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Date/Time of Transaction");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Entered By");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Verified By");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Ordering Provider");
                                  this.add(PL.class, false, 0, 1230, new Object[]{ getMessage(), new Integer(0) }, "Enterer's Location");
                                  this.add(XTN.class, false, 0, 651, new Object[]{ getMessage(), new Integer(0) }, "Call Back Phone Number");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Order Effective Date/Time");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Order Control Code Reason");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Entering Organization");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Entering Device");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Action By");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(339) }, "Advanced Beneficiary Notice Code");
                                  this.add(XON.class, false, 0, 563, new Object[]{ getMessage(), new Integer(0) }, "Ordering Facility Name");
                                  this.add(XAD.class, false, 0, 578, new Object[]{ getMessage(), new Integer(0) }, "Ordering Facility Address");
                                  this.add(XTN.class, false, 0, 651, new Object[]{ getMessage(), new Integer(0) }, "Ordering Facility Phone Number");
                                  this.add(XAD.class, false, 0, 578, new Object[]{ getMessage(), new Integer(0) }, "Ordering Provider Address");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(0) }, "Order Status Modifier");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(552) }, "Advanced Beneficiary Notice Override Reason");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Filler's Expected Availability Date/Time");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(177) }, "Confidentiality Code");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(482) }, "Order Type");
                                  this.add(CNE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(483) }, "Enterer Authorization Mode");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating ORC - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * ORC-1: "Order Control" - creates it if necessary
     */
    public ID getOrderControl() { 
        ID ret = null;
        try {
            Type t = this.getField(1, 0);
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
     * ORC-1: "Order Control" - creates it if necessary
     */
    public ID getOrc1_OrderControl() { 
        ID ret = null;
        try {
            Type t = this.getField(1, 0);
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
     * Returns all repetitions of Placer Order Number (ORC-2).
     */
    public EI[] getPlacerOrderNumber() {
        EI[] ret = null;
        try {
            Type[] t = this.getField(2);  
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
     * Returns a count of the current number of repetitions of Placer Order Number (ORC-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPlacerOrderNumberReps() {
        EI[] ret = null;
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
     * ORC-2: "Placer Order Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getPlacerOrderNumber(int rep) { 
        EI ret = null;
        try {
            Type t = this.getField(2, rep);
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
     * ORC-2: "Placer Order Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getOrc2_PlacerOrderNumber(int rep) { 
        EI ret = null;
        try {
            Type t = this.getField(2, rep);
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
     * Returns a count of the current number of repetitions of Placer Order Number (ORC-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc2_PlacerOrderNumberReps() {
        EI[] ret = null;
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
     * ORC-2: "Placer Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertPlacerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(2, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-2: "Placer Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertOrc2_PlacerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * ORC-2: "Placer Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removePlacerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * ORC-2: "Placer Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeOrc2_PlacerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(2, rep);
    }



    /**
     * Returns all repetitions of Filler Order Number (ORC-3).
     */
    public EI[] getFillerOrderNumber() {
        EI[] ret = null;
        try {
            Type[] t = this.getField(3);  
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
     * Returns a count of the current number of repetitions of Filler Order Number (ORC-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getFillerOrderNumberReps() {
        EI[] ret = null;
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
     * ORC-3: "Filler Order Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getFillerOrderNumber(int rep) { 
        EI ret = null;
        try {
            Type t = this.getField(3, rep);
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
     * ORC-3: "Filler Order Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getOrc3_FillerOrderNumber(int rep) { 
        EI ret = null;
        try {
            Type t = this.getField(3, rep);
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
     * Returns a count of the current number of repetitions of Filler Order Number (ORC-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc3_FillerOrderNumberReps() {
        EI[] ret = null;
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
     * ORC-3: "Filler Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertFillerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(3, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-3: "Filler Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertOrc3_FillerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * ORC-3: "Filler Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeFillerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * ORC-3: "Filler Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeOrc3_FillerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(3, rep);
    }



    /**
     * Returns all repetitions of Placer Group Number (ORC-4).
     */
    public EI[] getPlacerGroupNumber() {
        EI[] ret = null;
        try {
            Type[] t = this.getField(4);  
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
     * Returns a count of the current number of repetitions of Placer Group Number (ORC-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPlacerGroupNumberReps() {
        EI[] ret = null;
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
     * ORC-4: "Placer Group Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getPlacerGroupNumber(int rep) { 
        EI ret = null;
        try {
            Type t = this.getField(4, rep);
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
     * ORC-4: "Placer Group Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getOrc4_PlacerGroupNumber(int rep) { 
        EI ret = null;
        try {
            Type t = this.getField(4, rep);
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
     * Returns a count of the current number of repetitions of Placer Group Number (ORC-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc4_PlacerGroupNumberReps() {
        EI[] ret = null;
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
     * ORC-4: "Placer Group Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertPlacerGroupNumber(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(4, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-4: "Placer Group Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertOrc4_PlacerGroupNumber(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * ORC-4: "Placer Group Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removePlacerGroupNumber(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * ORC-4: "Placer Group Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeOrc4_PlacerGroupNumber(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(4, rep);
    }



    /**
     * Returns all repetitions of Order Status (ORC-5).
     */
    public ID[] getOrderStatus() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(5);  
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
     * Returns a count of the current number of repetitions of Order Status (ORC-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderStatusReps() {
        ID[] ret = null;
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
     * ORC-5: "Order Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getOrderStatus(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(5, rep);
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
     * ORC-5: "Order Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getOrc5_OrderStatus(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(5, rep);
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
     * Returns a count of the current number of repetitions of Order Status (ORC-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc5_OrderStatusReps() {
        ID[] ret = null;
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
     * ORC-5: "Order Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertOrderStatus(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(5, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-5: "Order Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertOrc5_OrderStatus(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * ORC-5: "Order Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeOrderStatus(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * ORC-5: "Order Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeOrc5_OrderStatus(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Response Flag (ORC-6).
     */
    public ID[] getResponseFlag() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(6);  
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
     * Returns a count of the current number of repetitions of Response Flag (ORC-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getResponseFlagReps() {
        ID[] ret = null;
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
     * ORC-6: "Response Flag" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getResponseFlag(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(6, rep);
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
     * ORC-6: "Response Flag" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getOrc6_ResponseFlag(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(6, rep);
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
     * Returns a count of the current number of repetitions of Response Flag (ORC-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc6_ResponseFlagReps() {
        ID[] ret = null;
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
     * ORC-6: "Response Flag" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertResponseFlag(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(6, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-6: "Response Flag" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertOrc6_ResponseFlag(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * ORC-6: "Response Flag" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeResponseFlag(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * ORC-6: "Response Flag" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeOrc6_ResponseFlag(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(6, rep);
    }



    /**
     * Returns all repetitions of Quantity/Timing (ORC-7).
     */
    public TQ[] getQuantityTiming() {
        TQ[] ret = null;
        try {
            Type[] t = this.getField(7);  
            ret = new TQ[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (TQ)t[i];
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
     * Returns a count of the current number of repetitions of Quantity/Timing (ORC-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getQuantityTimingReps() {
        TQ[] ret = null;
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
     * ORC-7: "Quantity/Timing" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TQ getQuantityTiming(int rep) { 
        TQ ret = null;
        try {
            Type t = this.getField(7, rep);
            ret = (TQ)t;
        } catch (ClassCastException cce) {
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
     * ORC-7: "Quantity/Timing" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TQ getOrc7_QuantityTiming(int rep) { 
        TQ ret = null;
        try {
            Type t = this.getField(7, rep);
            ret = (TQ)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Quantity/Timing (ORC-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc7_QuantityTimingReps() {
        TQ[] ret = null;
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
     * ORC-7: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ insertQuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.insertRepetition(7, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-7: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ insertOrc7_QuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.insertRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * ORC-7: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ removeQuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.removeRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * ORC-7: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ removeOrc7_QuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.removeRepetition(7, rep);
    }



    /**
     * Returns all repetitions of Parent (ORC-8).
     */
    public EIP[] getORCParent() {
        EIP[] ret = null;
        try {
            Type[] t = this.getField(8);  
            ret = new EIP[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (EIP)t[i];
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
     * Returns a count of the current number of repetitions of Parent (ORC-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getORCParentReps() {
        EIP[] ret = null;
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
     * ORC-8: "Parent" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EIP getORCParent(int rep) { 
        EIP ret = null;
        try {
            Type t = this.getField(8, rep);
            ret = (EIP)t;
        } catch (ClassCastException cce) {
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
     * ORC-8: "Parent" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EIP getOrc8_Parent(int rep) { 
        EIP ret = null;
        try {
            Type t = this.getField(8, rep);
            ret = (EIP)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Parent (ORC-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc8_ParentReps() {
        EIP[] ret = null;
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
     * ORC-8: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP insertORCParent(int rep) throws HL7Exception { 
        return (EIP) super.insertRepetition(8, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-8: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP insertOrc8_Parent(int rep) throws HL7Exception { 
        return (EIP) super.insertRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * ORC-8: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP removeORCParent(int rep) throws HL7Exception { 
        return (EIP) super.removeRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * ORC-8: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP removeOrc8_Parent(int rep) throws HL7Exception { 
        return (EIP) super.removeRepetition(8, rep);
    }



    /**
     * Returns all repetitions of Date/Time of Transaction (ORC-9).
     */
    public TS[] getDateTimeOfTransaction() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(9);  
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
     * Returns a count of the current number of repetitions of Date/Time of Transaction (ORC-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDateTimeOfTransactionReps() {
        TS[] ret = null;
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
     * ORC-9: "Date/Time of Transaction" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getDateTimeOfTransaction(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * ORC-9: "Date/Time of Transaction" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getOrc9_DateTimeOfTransaction(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * Returns a count of the current number of repetitions of Date/Time of Transaction (ORC-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc9_DateTimeOfTransactionReps() {
        TS[] ret = null;
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
     * ORC-9: "Date/Time of Transaction" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertDateTimeOfTransaction(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(9, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-9: "Date/Time of Transaction" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertOrc9_DateTimeOfTransaction(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * ORC-9: "Date/Time of Transaction" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeDateTimeOfTransaction(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * ORC-9: "Date/Time of Transaction" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeOrc9_DateTimeOfTransaction(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Entered By (ORC-10).
     */
    public XCN[] getEnteredBy() {
        XCN[] ret = null;
        try {
            Type[] t = this.getField(10);  
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
     * Returns a count of the current number of repetitions of Entered By (ORC-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEnteredByReps() {
        XCN[] ret = null;
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
     * ORC-10: "Entered By" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getEnteredBy(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(10, rep);
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
     * ORC-10: "Entered By" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOrc10_EnteredBy(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(10, rep);
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
     * Returns a count of the current number of repetitions of Entered By (ORC-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc10_EnteredByReps() {
        XCN[] ret = null;
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
     * ORC-10: "Entered By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertEnteredBy(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(10, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-10: "Entered By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOrc10_EnteredBy(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * ORC-10: "Entered By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeEnteredBy(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * ORC-10: "Entered By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOrc10_EnteredBy(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(10, rep);
    }



    /**
     * Returns all repetitions of Verified By (ORC-11).
     */
    public XCN[] getVerifiedBy() {
        XCN[] ret = null;
        try {
            Type[] t = this.getField(11);  
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
     * Returns a count of the current number of repetitions of Verified By (ORC-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getVerifiedByReps() {
        XCN[] ret = null;
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
     * ORC-11: "Verified By" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getVerifiedBy(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(11, rep);
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
     * ORC-11: "Verified By" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOrc11_VerifiedBy(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(11, rep);
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
     * Returns a count of the current number of repetitions of Verified By (ORC-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc11_VerifiedByReps() {
        XCN[] ret = null;
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
     * ORC-11: "Verified By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertVerifiedBy(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(11, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-11: "Verified By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOrc11_VerifiedBy(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * ORC-11: "Verified By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeVerifiedBy(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * ORC-11: "Verified By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOrc11_VerifiedBy(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(11, rep);
    }



    /**
     * Returns all repetitions of Ordering Provider (ORC-12).
     */
    public XCN[] getOrderingProvider() {
        XCN[] ret = null;
        try {
            Type[] t = this.getField(12);  
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
     * Returns a count of the current number of repetitions of Ordering Provider (ORC-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderingProviderReps() {
        XCN[] ret = null;
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
     * ORC-12: "Ordering Provider" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOrderingProvider(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(12, rep);
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
     * ORC-12: "Ordering Provider" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOrc12_OrderingProvider(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(12, rep);
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
     * Returns a count of the current number of repetitions of Ordering Provider (ORC-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc12_OrderingProviderReps() {
        XCN[] ret = null;
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
     * ORC-12: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(12, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-12: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOrc12_OrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * ORC-12: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * ORC-12: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOrc12_OrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(12, rep);
    }



    /**
     * Returns all repetitions of Enterer's Location (ORC-13).
     */
    public PL[] getEntererSLocation() {
        PL[] ret = null;
        try {
            Type[] t = this.getField(13);  
            ret = new PL[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (PL)t[i];
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
     * Returns a count of the current number of repetitions of Enterer's Location (ORC-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEntererSLocationReps() {
        PL[] ret = null;
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
     * ORC-13: "Enterer's Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getEntererSLocation(int rep) { 
        PL ret = null;
        try {
            Type t = this.getField(13, rep);
            ret = (PL)t;
        } catch (ClassCastException cce) {
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
     * ORC-13: "Enterer's Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PL getOrc13_EntererSLocation(int rep) { 
        PL ret = null;
        try {
            Type t = this.getField(13, rep);
            ret = (PL)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Enterer's Location (ORC-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc13_EntererSLocationReps() {
        PL[] ret = null;
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
     * ORC-13: "Enterer's Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertEntererSLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(13, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-13: "Enterer's Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL insertOrc13_EntererSLocation(int rep) throws HL7Exception { 
        return (PL) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * ORC-13: "Enterer's Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removeEntererSLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * ORC-13: "Enterer's Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PL removeOrc13_EntererSLocation(int rep) throws HL7Exception { 
        return (PL) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Call Back Phone Number (ORC-14).
     */
    public XTN[] getCallBackPhoneNumber() {
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
     * Returns a count of the current number of repetitions of Call Back Phone Number (ORC-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCallBackPhoneNumberReps() {
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
     * ORC-14: "Call Back Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getCallBackPhoneNumber(int rep) { 
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
     * ORC-14: "Call Back Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getOrc14_CallBackPhoneNumber(int rep) { 
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
     * Returns a count of the current number of repetitions of Call Back Phone Number (ORC-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc14_CallBackPhoneNumberReps() {
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
     * ORC-14: "Call Back Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertCallBackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(14, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-14: "Call Back Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertOrc14_CallBackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * ORC-14: "Call Back Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeCallBackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * ORC-14: "Call Back Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeOrc14_CallBackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(14, rep);
    }



    /**
     * Returns all repetitions of Order Effective Date/Time (ORC-15).
     */
    public TS[] getOrderEffectiveDateTime() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(15);  
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
     * Returns a count of the current number of repetitions of Order Effective Date/Time (ORC-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderEffectiveDateTimeReps() {
        TS[] ret = null;
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
     * ORC-15: "Order Effective Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getOrderEffectiveDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(15, rep);
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
     * ORC-15: "Order Effective Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getOrc15_OrderEffectiveDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(15, rep);
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
     * Returns a count of the current number of repetitions of Order Effective Date/Time (ORC-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc15_OrderEffectiveDateTimeReps() {
        TS[] ret = null;
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
     * ORC-15: "Order Effective Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertOrderEffectiveDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(15, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-15: "Order Effective Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertOrc15_OrderEffectiveDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * ORC-15: "Order Effective Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeOrderEffectiveDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * ORC-15: "Order Effective Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeOrc15_OrderEffectiveDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Order Control Code Reason (ORC-16).
     */
    public CE[] getOrderControlCodeReason() {
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
     * Returns a count of the current number of repetitions of Order Control Code Reason (ORC-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderControlCodeReasonReps() {
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
     * ORC-16: "Order Control Code Reason" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getOrderControlCodeReason(int rep) { 
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
     * ORC-16: "Order Control Code Reason" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getOrc16_OrderControlCodeReason(int rep) { 
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
     * Returns a count of the current number of repetitions of Order Control Code Reason (ORC-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc16_OrderControlCodeReasonReps() {
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
     * ORC-16: "Order Control Code Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertOrderControlCodeReason(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(16, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-16: "Order Control Code Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertOrc16_OrderControlCodeReason(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * ORC-16: "Order Control Code Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeOrderControlCodeReason(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * ORC-16: "Order Control Code Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeOrc16_OrderControlCodeReason(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Entering Organization (ORC-17).
     */
    public CE[] getEnteringOrganization() {
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
     * Returns a count of the current number of repetitions of Entering Organization (ORC-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEnteringOrganizationReps() {
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
     * ORC-17: "Entering Organization" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getEnteringOrganization(int rep) { 
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
     * ORC-17: "Entering Organization" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getOrc17_EnteringOrganization(int rep) { 
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
     * Returns a count of the current number of repetitions of Entering Organization (ORC-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc17_EnteringOrganizationReps() {
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
     * ORC-17: "Entering Organization" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertEnteringOrganization(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-17: "Entering Organization" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertOrc17_EnteringOrganization(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * ORC-17: "Entering Organization" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeEnteringOrganization(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * ORC-17: "Entering Organization" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeOrc17_EnteringOrganization(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }



    /**
     * Returns all repetitions of Entering Device (ORC-18).
     */
    public CE[] getEnteringDevice() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(18);  
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
     * Returns a count of the current number of repetitions of Entering Device (ORC-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEnteringDeviceReps() {
        CE[] ret = null;
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
     * ORC-18: "Entering Device" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getEnteringDevice(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(18, rep);
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
     * ORC-18: "Entering Device" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getOrc18_EnteringDevice(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(18, rep);
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
     * Returns a count of the current number of repetitions of Entering Device (ORC-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc18_EnteringDeviceReps() {
        CE[] ret = null;
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
     * ORC-18: "Entering Device" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertEnteringDevice(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(18, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-18: "Entering Device" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertOrc18_EnteringDevice(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * ORC-18: "Entering Device" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeEnteringDevice(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * ORC-18: "Entering Device" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeOrc18_EnteringDevice(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(18, rep);
    }



    /**
     * Returns all repetitions of Action By (ORC-19).
     */
    public XCN[] getActionBy() {
        XCN[] ret = null;
        try {
            Type[] t = this.getField(19);  
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
     * Returns a count of the current number of repetitions of Action By (ORC-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getActionByReps() {
        XCN[] ret = null;
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
     * ORC-19: "Action By" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getActionBy(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(19, rep);
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
     * ORC-19: "Action By" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOrc19_ActionBy(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(19, rep);
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
     * Returns a count of the current number of repetitions of Action By (ORC-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc19_ActionByReps() {
        XCN[] ret = null;
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
     * ORC-19: "Action By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertActionBy(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(19, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-19: "Action By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOrc19_ActionBy(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * ORC-19: "Action By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeActionBy(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * ORC-19: "Action By" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOrc19_ActionBy(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(19, rep);
    }



    /**
     * Returns all repetitions of Advanced Beneficiary Notice Code (ORC-20).
     */
    public CE[] getAdvancedBeneficiaryNoticeCode() {
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
     * Returns a count of the current number of repetitions of Advanced Beneficiary Notice Code (ORC-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAdvancedBeneficiaryNoticeCodeReps() {
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
     * ORC-20: "Advanced Beneficiary Notice Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getAdvancedBeneficiaryNoticeCode(int rep) { 
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
     * ORC-20: "Advanced Beneficiary Notice Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getOrc20_AdvancedBeneficiaryNoticeCode(int rep) { 
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
     * Returns a count of the current number of repetitions of Advanced Beneficiary Notice Code (ORC-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc20_AdvancedBeneficiaryNoticeCodeReps() {
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
     * ORC-20: "Advanced Beneficiary Notice Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertAdvancedBeneficiaryNoticeCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(20, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-20: "Advanced Beneficiary Notice Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertOrc20_AdvancedBeneficiaryNoticeCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * ORC-20: "Advanced Beneficiary Notice Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeAdvancedBeneficiaryNoticeCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * ORC-20: "Advanced Beneficiary Notice Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeOrc20_AdvancedBeneficiaryNoticeCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(20, rep);
    }



    /**
     * Returns all repetitions of Ordering Facility Name (ORC-21).
     */
    public XON[] getOrderingFacilityName() {
        XON[] ret = null;
        try {
            Type[] t = this.getField(21);  
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
     * Returns a count of the current number of repetitions of Ordering Facility Name (ORC-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderingFacilityNameReps() {
        XON[] ret = null;
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
     * ORC-21: "Ordering Facility Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XON getOrderingFacilityName(int rep) { 
        XON ret = null;
        try {
            Type t = this.getField(21, rep);
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
     * ORC-21: "Ordering Facility Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XON getOrc21_OrderingFacilityName(int rep) { 
        XON ret = null;
        try {
            Type t = this.getField(21, rep);
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
     * Returns a count of the current number of repetitions of Ordering Facility Name (ORC-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc21_OrderingFacilityNameReps() {
        XON[] ret = null;
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
     * ORC-21: "Ordering Facility Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XON insertOrderingFacilityName(int rep) throws HL7Exception { 
        return (XON) super.insertRepetition(21, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-21: "Ordering Facility Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XON insertOrc21_OrderingFacilityName(int rep) throws HL7Exception { 
        return (XON) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * ORC-21: "Ordering Facility Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XON removeOrderingFacilityName(int rep) throws HL7Exception { 
        return (XON) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * ORC-21: "Ordering Facility Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XON removeOrc21_OrderingFacilityName(int rep) throws HL7Exception { 
        return (XON) super.removeRepetition(21, rep);
    }



    /**
     * Returns all repetitions of Ordering Facility Address (ORC-22).
     */
    public XAD[] getOrderingFacilityAddress() {
        XAD[] ret = null;
        try {
            Type[] t = this.getField(22);  
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
     * Returns a count of the current number of repetitions of Ordering Facility Address (ORC-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderingFacilityAddressReps() {
        XAD[] ret = null;
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
     * ORC-22: "Ordering Facility Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getOrderingFacilityAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(22, rep);
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
     * ORC-22: "Ordering Facility Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getOrc22_OrderingFacilityAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(22, rep);
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
     * Returns a count of the current number of repetitions of Ordering Facility Address (ORC-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc22_OrderingFacilityAddressReps() {
        XAD[] ret = null;
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
     * ORC-22: "Ordering Facility Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertOrderingFacilityAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(22, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-22: "Ordering Facility Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertOrc22_OrderingFacilityAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * ORC-22: "Ordering Facility Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removeOrderingFacilityAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * ORC-22: "Ordering Facility Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removeOrc22_OrderingFacilityAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(22, rep);
    }



    /**
     * Returns all repetitions of Ordering Facility Phone Number (ORC-23).
     */
    public XTN[] getOrderingFacilityPhoneNumber() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(23);  
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
     * Returns a count of the current number of repetitions of Ordering Facility Phone Number (ORC-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderingFacilityPhoneNumberReps() {
        XTN[] ret = null;
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
     * ORC-23: "Ordering Facility Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getOrderingFacilityPhoneNumber(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(23, rep);
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
     * ORC-23: "Ordering Facility Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getOrc23_OrderingFacilityPhoneNumber(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(23, rep);
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
     * Returns a count of the current number of repetitions of Ordering Facility Phone Number (ORC-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc23_OrderingFacilityPhoneNumberReps() {
        XTN[] ret = null;
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
     * ORC-23: "Ordering Facility Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertOrderingFacilityPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(23, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-23: "Ordering Facility Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertOrc23_OrderingFacilityPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * ORC-23: "Ordering Facility Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeOrderingFacilityPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * ORC-23: "Ordering Facility Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeOrc23_OrderingFacilityPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(23, rep);
    }



    /**
     * Returns all repetitions of Ordering Provider Address (ORC-24).
     */
    public XAD[] getOrderingProviderAddress() {
        XAD[] ret = null;
        try {
            Type[] t = this.getField(24);  
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
     * Returns a count of the current number of repetitions of Ordering Provider Address (ORC-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderingProviderAddressReps() {
        XAD[] ret = null;
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
     * ORC-24: "Ordering Provider Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getOrderingProviderAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(24, rep);
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
     * ORC-24: "Ordering Provider Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getOrc24_OrderingProviderAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(24, rep);
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
     * Returns a count of the current number of repetitions of Ordering Provider Address (ORC-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc24_OrderingProviderAddressReps() {
        XAD[] ret = null;
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
     * ORC-24: "Ordering Provider Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertOrderingProviderAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(24, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-24: "Ordering Provider Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertOrc24_OrderingProviderAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * ORC-24: "Ordering Provider Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removeOrderingProviderAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * ORC-24: "Ordering Provider Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removeOrc24_OrderingProviderAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(24, rep);
    }



    /**
     * Returns all repetitions of Order Status Modifier (ORC-25).
     */
    public CWE[] getOrderStatusModifier() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(25);  
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
     * Returns a count of the current number of repetitions of Order Status Modifier (ORC-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderStatusModifierReps() {
        CWE[] ret = null;
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
     * ORC-25: "Order Status Modifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getOrderStatusModifier(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(25, rep);
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
     * ORC-25: "Order Status Modifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getOrc25_OrderStatusModifier(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(25, rep);
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
     * Returns a count of the current number of repetitions of Order Status Modifier (ORC-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc25_OrderStatusModifierReps() {
        CWE[] ret = null;
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
     * ORC-25: "Order Status Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertOrderStatusModifier(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(25, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-25: "Order Status Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertOrc25_OrderStatusModifier(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * ORC-25: "Order Status Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeOrderStatusModifier(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * ORC-25: "Order Status Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeOrc25_OrderStatusModifier(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(25, rep);
    }



    /**
     * Returns all repetitions of Advanced Beneficiary Notice Override Reason (ORC-26).
     */
    public CWE[] getAdvancedBeneficiaryNoticeOverrideReason() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(26);  
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
     * Returns a count of the current number of repetitions of Advanced Beneficiary Notice Override Reason (ORC-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAdvancedBeneficiaryNoticeOverrideReasonReps() {
        CWE[] ret = null;
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
     * ORC-26: "Advanced Beneficiary Notice Override Reason" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getAdvancedBeneficiaryNoticeOverrideReason(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(26, rep);
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
     * ORC-26: "Advanced Beneficiary Notice Override Reason" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getOrc26_AdvancedBeneficiaryNoticeOverrideReason(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(26, rep);
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
     * Returns a count of the current number of repetitions of Advanced Beneficiary Notice Override Reason (ORC-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc26_AdvancedBeneficiaryNoticeOverrideReasonReps() {
        CWE[] ret = null;
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
     * ORC-26: "Advanced Beneficiary Notice Override Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertAdvancedBeneficiaryNoticeOverrideReason(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(26, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-26: "Advanced Beneficiary Notice Override Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertOrc26_AdvancedBeneficiaryNoticeOverrideReason(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * ORC-26: "Advanced Beneficiary Notice Override Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeAdvancedBeneficiaryNoticeOverrideReason(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * ORC-26: "Advanced Beneficiary Notice Override Reason" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeOrc26_AdvancedBeneficiaryNoticeOverrideReason(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(26, rep);
    }



    /**
     * Returns all repetitions of Filler's Expected Availability Date/Time (ORC-27).
     */
    public TS[] getFillerSExpectedAvailabilityDateTime() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(27);  
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
     * Returns a count of the current number of repetitions of Filler's Expected Availability Date/Time (ORC-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getFillerSExpectedAvailabilityDateTimeReps() {
        TS[] ret = null;
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
     * ORC-27: "Filler's Expected Availability Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getFillerSExpectedAvailabilityDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(27, rep);
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
     * ORC-27: "Filler's Expected Availability Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getOrc27_FillerSExpectedAvailabilityDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(27, rep);
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
     * Returns a count of the current number of repetitions of Filler's Expected Availability Date/Time (ORC-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc27_FillerSExpectedAvailabilityDateTimeReps() {
        TS[] ret = null;
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
     * ORC-27: "Filler's Expected Availability Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertFillerSExpectedAvailabilityDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(27, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-27: "Filler's Expected Availability Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertOrc27_FillerSExpectedAvailabilityDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * ORC-27: "Filler's Expected Availability Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeFillerSExpectedAvailabilityDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * ORC-27: "Filler's Expected Availability Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeOrc27_FillerSExpectedAvailabilityDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(27, rep);
    }



    /**
     * Returns all repetitions of Confidentiality Code (ORC-28).
     */
    public CWE[] getConfidentialityCode() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(28);  
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
     * Returns a count of the current number of repetitions of Confidentiality Code (ORC-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getConfidentialityCodeReps() {
        CWE[] ret = null;
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
     * ORC-28: "Confidentiality Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getConfidentialityCode(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(28, rep);
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
     * ORC-28: "Confidentiality Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getOrc28_ConfidentialityCode(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(28, rep);
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
     * Returns a count of the current number of repetitions of Confidentiality Code (ORC-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc28_ConfidentialityCodeReps() {
        CWE[] ret = null;
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
     * ORC-28: "Confidentiality Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertConfidentialityCode(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(28, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-28: "Confidentiality Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertOrc28_ConfidentialityCode(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * ORC-28: "Confidentiality Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeConfidentialityCode(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * ORC-28: "Confidentiality Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeOrc28_ConfidentialityCode(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(28, rep);
    }



    /**
     * Returns all repetitions of Order Type (ORC-29).
     */
    public CWE[] getOrderType() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(29);  
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
     * Returns a count of the current number of repetitions of Order Type (ORC-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderTypeReps() {
        CWE[] ret = null;
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
     * ORC-29: "Order Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getOrderType(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(29, rep);
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
     * ORC-29: "Order Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getOrc29_OrderType(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(29, rep);
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
     * Returns a count of the current number of repetitions of Order Type (ORC-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc29_OrderTypeReps() {
        CWE[] ret = null;
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
     * ORC-29: "Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertOrderType(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(29, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-29: "Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertOrc29_OrderType(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * ORC-29: "Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeOrderType(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * ORC-29: "Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeOrc29_OrderType(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(29, rep);
    }



    /**
     * Returns all repetitions of Enterer Authorization Mode (ORC-30).
     */
    public CNE[] getEntererAuthorizationMode() {
        CNE[] ret = null;
        try {
            Type[] t = this.getField(30);  
            ret = new CNE[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (CNE)t[i];
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
     * Returns a count of the current number of repetitions of Enterer Authorization Mode (ORC-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEntererAuthorizationModeReps() {
        CNE[] ret = null;
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
     * ORC-30: "Enterer Authorization Mode" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CNE getEntererAuthorizationMode(int rep) { 
        CNE ret = null;
        try {
            Type t = this.getField(30, rep);
            ret = (CNE)t;
        } catch (ClassCastException cce) {
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
     * ORC-30: "Enterer Authorization Mode" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CNE getOrc30_EntererAuthorizationMode(int rep) { 
        CNE ret = null;
        try {
            Type t = this.getField(30, rep);
            ret = (CNE)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Enterer Authorization Mode (ORC-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrc30_EntererAuthorizationModeReps() {
        CNE[] ret = null;
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
     * ORC-30: "Enterer Authorization Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CNE insertEntererAuthorizationMode(int rep) throws HL7Exception { 
        return (CNE) super.insertRepetition(30, rep);
    }



    /**
     * Inserts a repetition of
     * ORC-30: "Enterer Authorization Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CNE insertOrc30_EntererAuthorizationMode(int rep) throws HL7Exception { 
        return (CNE) super.insertRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * ORC-30: "Enterer Authorization Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CNE removeEntererAuthorizationMode(int rep) throws HL7Exception { 
        return (CNE) super.removeRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * ORC-30: "Enterer Authorization Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CNE removeOrc30_EntererAuthorizationMode(int rep) throws HL7Exception { 
        return (CNE) super.removeRepetition(30, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new ID(getMessage(), new Integer( 119 ));
          case 1: return new EI(getMessage());
          case 2: return new EI(getMessage());
          case 3: return new EI(getMessage());
          case 4: return new ID(getMessage(), new Integer( 38 ));
          case 5: return new ID(getMessage(), new Integer( 121 ));
          case 6: return new TQ(getMessage());
          case 7: return new EIP(getMessage());
          case 8: return new TS(getMessage());
          case 9: return new XCN(getMessage());
          case 10: return new XCN(getMessage());
          case 11: return new XCN(getMessage());
          case 12: return new PL(getMessage());
          case 13: return new XTN(getMessage());
          case 14: return new TS(getMessage());
          case 15: return new CE(getMessage());
          case 16: return new CE(getMessage());
          case 17: return new CE(getMessage());
          case 18: return new XCN(getMessage());
          case 19: return new CE(getMessage());
          case 20: return new XON(getMessage());
          case 21: return new XAD(getMessage());
          case 22: return new XTN(getMessage());
          case 23: return new XAD(getMessage());
          case 24: return new CWE(getMessage());
          case 25: return new CWE(getMessage());
          case 26: return new TS(getMessage());
          case 27: return new CWE(getMessage());
          case 28: return new CWE(getMessage());
          case 29: return new CNE(getMessage());
          default: return null;
       }
   }


}


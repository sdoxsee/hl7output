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
 *<p>Represents an HL7 RXD message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>RXD-1: Dispense Sub-ID Counter (NM) <b>optional </b>
     * <li>RXD-2: Dispense/Give Code (CE) <b>optional </b>
     * <li>RXD-3: Date/Time Dispensed (TS) <b>optional </b>
     * <li>RXD-4: Actual Dispense Amount (NM) <b>optional </b>
     * <li>RXD-5: Actual Dispense Units (CE) <b>optional </b>
     * <li>RXD-6: Actual Dosage Form (CE) <b>optional repeating</b>
     * <li>RXD-7: Prescription Number (ST) <b>optional </b>
     * <li>RXD-8: Number of Refills Remaining (NM) <b>optional repeating</b>
     * <li>RXD-9: Dispense Notes (ST) <b>optional repeating</b>
     * <li>RXD-10: Dispensing Provider (XCN) <b>optional repeating</b>
     * <li>RXD-11: Substitution Status (ID) <b>optional repeating</b>
     * <li>RXD-12: Total Daily Dose (CQ) <b>optional </b>
     * <li>RXD-13: Dispense-to Location (LA2) <b>optional repeating</b>
     * <li>RXD-14: Needs Human Review (ID) <b>optional repeating</b>
     * <li>RXD-15: Pharmacy/Treatment Supplier's Special Dispensing Instructions (CE) <b>optional repeating</b>
     * <li>RXD-16: Actual Strength (NM) <b>optional repeating</b>
     * <li>RXD-17: Actual Strength Unit (CE) <b>optional repeating</b>
     * <li>RXD-18: Substance Lot Number (ST) <b>optional repeating</b>
     * <li>RXD-19: Substance Expiration Date (TS) <b>optional repeating</b>
     * <li>RXD-20: Substance Manufacturer Name (CE) <b>optional repeating</b>
     * <li>RXD-21: Indication (CE) <b>optional repeating</b>
     * <li>RXD-22: Dispense Package Size (NM) <b>optional repeating</b>
     * <li>RXD-23: Dispense Package Size Unit (CE) <b>optional repeating</b>
     * <li>RXD-24: Dispense Package Method (ID) <b>optional repeating</b>
     * <li>RXD-25: Supplementary Code (CE) <b>optional repeating</b>
     * <li>RXD-26: Initiating Location (CE) <b>optional repeating</b>
     * <li>RXD-27: Packaging/Assembly Location (CE) <b>optional repeating</b>
     * <li>RXD-28: Actual Drug Strength Volume (NM) <b>optional repeating</b>
     * <li>RXD-29: Actual Drug Strength Volume Units (CWE) <b>optional repeating</b>
     * <li>RXD-30: Dispense to Pharmacy (CWE) <b>optional repeating</b>
     * <li>RXD-31: Dispense to Pharmacy Address (XAD) <b>optional repeating</b>
     * <li>RXD-32: Pharmacy Order Type (ID) <b>optional repeating</b>
     * <li>RXD-33: Dispense Type (CWE) <b>optional repeating</b>
 * </ul>
 */
public class RXD extends AbstractSegment {

    /** 
     * Creates a new RXD segment
     */
    public RXD(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(NM.class, false, 1, 4, new Object[]{ getMessage(), new Integer(0) }, "Dispense Sub-ID Counter");
                                  this.add(CE.class, false, 1, 483, new Object[]{ getMessage(), new Integer(292) }, "Dispense/Give Code");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage(), new Integer(0) }, "Date/Time Dispensed");
                                  this.add(NM.class, false, 1, 20, new Object[]{ getMessage(), new Integer(0) }, "Actual Dispense Amount");
                                  this.add(CE.class, false, 1, 483, new Object[]{ getMessage(), new Integer(0) }, "Actual Dispense Units");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Actual Dosage Form");
                                  this.add(ST.class, false, 1, 20, new Object[]{ getMessage(), new Integer(0) }, "Prescription Number");
                                  this.add(NM.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "Number of Refills Remaining");
                                  this.add(ST.class, false, 0, 200, new Object[]{ getMessage(), new Integer(0) }, "Dispense Notes");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Dispensing Provider");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Substitution Status");
                                  this.add(CQ.class, false, 1, 500, new Object[]{ getMessage(), new Integer(0) }, "Total Daily Dose");
                                  this.add(LA2.class, false, 0, 790, new Object[]{ getMessage(), new Integer(0) }, "Dispense-to Location");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Needs Human Review");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Pharmacy/Treatment Supplier's Special Dispensing Instructions");
                                  this.add(NM.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "Actual Strength");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Actual Strength Unit");
                                  this.add(ST.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "Substance Lot Number");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Substance Expiration Date");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(227) }, "Substance Manufacturer Name");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Indication");
                                  this.add(NM.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "Dispense Package Size");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Dispense Package Size Unit");
                                  this.add(ID.class, false, 0, 2, new Object[]{ getMessage() }, "Dispense Package Method");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Supplementary Code");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Initiating Location");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Packaging/Assembly Location");
                                  this.add(NM.class, false, 0, 5, new Object[]{ getMessage(), new Integer(0) }, "Actual Drug Strength Volume");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(0) }, "Actual Drug Strength Volume Units");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(0) }, "Dispense to Pharmacy");
                                  this.add(XAD.class, false, 0, 578, new Object[]{ getMessage(), new Integer(0) }, "Dispense to Pharmacy Address");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Pharmacy Order Type");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(484) }, "Dispense Type");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RXD - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * RXD-1: "Dispense Sub-ID Counter" - creates it if necessary
     */
    public NM getDispenseSubIDCounter() { 
        NM ret = null;
        try {
            Type t = this.getField(1, 0);
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
     * Returns
     * RXD-1: "Dispense Sub-ID Counter" - creates it if necessary
     */
    public NM getRxd1_DispenseSubIDCounter() { 
        NM ret = null;
        try {
            Type t = this.getField(1, 0);
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
     * Returns
     * RXD-2: "Dispense/Give Code" - creates it if necessary
     */
    public CE getDispenseGiveCode() { 
        CE ret = null;
        try {
            Type t = this.getField(2, 0);
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
     * RXD-2: "Dispense/Give Code" - creates it if necessary
     */
    public CE getRxd2_DispenseGiveCode() { 
        CE ret = null;
        try {
            Type t = this.getField(2, 0);
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
     * RXD-3: "Date/Time Dispensed" - creates it if necessary
     */
    public TS getDateTimeDispensed() { 
        TS ret = null;
        try {
            Type t = this.getField(3, 0);
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
     * RXD-3: "Date/Time Dispensed" - creates it if necessary
     */
    public TS getRxd3_DateTimeDispensed() { 
        TS ret = null;
        try {
            Type t = this.getField(3, 0);
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
     * RXD-4: "Actual Dispense Amount" - creates it if necessary
     */
    public NM getActualDispenseAmount() { 
        NM ret = null;
        try {
            Type t = this.getField(4, 0);
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
     * Returns
     * RXD-4: "Actual Dispense Amount" - creates it if necessary
     */
    public NM getRxd4_ActualDispenseAmount() { 
        NM ret = null;
        try {
            Type t = this.getField(4, 0);
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
     * Returns
     * RXD-5: "Actual Dispense Units" - creates it if necessary
     */
    public CE getActualDispenseUnits() { 
        CE ret = null;
        try {
            Type t = this.getField(5, 0);
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
     * RXD-5: "Actual Dispense Units" - creates it if necessary
     */
    public CE getRxd5_ActualDispenseUnits() { 
        CE ret = null;
        try {
            Type t = this.getField(5, 0);
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
     * Returns all repetitions of Actual Dosage Form (RXD-6).
     */
    public CE[] getActualDosageForm() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(6);  
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
     * Returns a count of the current number of repetitions of Actual Dosage Form (RXD-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getActualDosageFormReps() {
        CE[] ret = null;
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
     * RXD-6: "Actual Dosage Form" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getActualDosageForm(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(6, rep);
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
     * RXD-6: "Actual Dosage Form" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxd6_ActualDosageForm(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(6, rep);
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
     * Returns a count of the current number of repetitions of Actual Dosage Form (RXD-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd6_ActualDosageFormReps() {
        CE[] ret = null;
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
     * RXD-6: "Actual Dosage Form" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertActualDosageForm(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(6, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-6: "Actual Dosage Form" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxd6_ActualDosageForm(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * RXD-6: "Actual Dosage Form" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeActualDosageForm(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * RXD-6: "Actual Dosage Form" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxd6_ActualDosageForm(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(6, rep);
    }




    /**
     * Returns
     * RXD-7: "Prescription Number" - creates it if necessary
     */
    public ST getPrescriptionNumber() { 
        ST ret = null;
        try {
            Type t = this.getField(7, 0);
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
     * Returns
     * RXD-7: "Prescription Number" - creates it if necessary
     */
    public ST getRxd7_PrescriptionNumber() { 
        ST ret = null;
        try {
            Type t = this.getField(7, 0);
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
     * Returns all repetitions of Number of Refills Remaining (RXD-8).
     */
    public NM[] getNumberOfRefillsRemaining() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(8);  
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
     * Returns a count of the current number of repetitions of Number of Refills Remaining (RXD-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNumberOfRefillsRemainingReps() {
        NM[] ret = null;
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
     * RXD-8: "Number of Refills Remaining" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getNumberOfRefillsRemaining(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(8, rep);
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
     * RXD-8: "Number of Refills Remaining" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRxd8_NumberOfRefillsRemaining(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(8, rep);
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
     * Returns a count of the current number of repetitions of Number of Refills Remaining (RXD-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd8_NumberOfRefillsRemainingReps() {
        NM[] ret = null;
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
     * RXD-8: "Number of Refills Remaining" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertNumberOfRefillsRemaining(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(8, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-8: "Number of Refills Remaining" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRxd8_NumberOfRefillsRemaining(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * RXD-8: "Number of Refills Remaining" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeNumberOfRefillsRemaining(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * RXD-8: "Number of Refills Remaining" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRxd8_NumberOfRefillsRemaining(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(8, rep);
    }



    /**
     * Returns all repetitions of Dispense Notes (RXD-9).
     */
    public ST[] getDispenseNotes() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(9);  
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
     * Returns a count of the current number of repetitions of Dispense Notes (RXD-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDispenseNotesReps() {
        ST[] ret = null;
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
     * RXD-9: "Dispense Notes" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getDispenseNotes(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * RXD-9: "Dispense Notes" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getRxd9_DispenseNotes(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * Returns a count of the current number of repetitions of Dispense Notes (RXD-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd9_DispenseNotesReps() {
        ST[] ret = null;
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
     * RXD-9: "Dispense Notes" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertDispenseNotes(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(9, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-9: "Dispense Notes" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertRxd9_DispenseNotes(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * RXD-9: "Dispense Notes" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeDispenseNotes(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * RXD-9: "Dispense Notes" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeRxd9_DispenseNotes(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Dispensing Provider (RXD-10).
     */
    public XCN[] getDispensingProvider() {
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
     * Returns a count of the current number of repetitions of Dispensing Provider (RXD-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDispensingProviderReps() {
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
     * RXD-10: "Dispensing Provider" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getDispensingProvider(int rep) { 
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
     * RXD-10: "Dispensing Provider" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getRxd10_DispensingProvider(int rep) { 
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
     * Returns a count of the current number of repetitions of Dispensing Provider (RXD-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd10_DispensingProviderReps() {
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
     * RXD-10: "Dispensing Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertDispensingProvider(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(10, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-10: "Dispensing Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertRxd10_DispensingProvider(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * RXD-10: "Dispensing Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeDispensingProvider(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * RXD-10: "Dispensing Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeRxd10_DispensingProvider(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(10, rep);
    }



    /**
     * Returns all repetitions of Substitution Status (RXD-11).
     */
    public ID[] getSubstitutionStatus() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(11);  
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
     * Returns a count of the current number of repetitions of Substitution Status (RXD-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSubstitutionStatusReps() {
        ID[] ret = null;
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
     * RXD-11: "Substitution Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getSubstitutionStatus(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(11, rep);
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
     * RXD-11: "Substitution Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getRxd11_SubstitutionStatus(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(11, rep);
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
     * Returns a count of the current number of repetitions of Substitution Status (RXD-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd11_SubstitutionStatusReps() {
        ID[] ret = null;
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
     * RXD-11: "Substitution Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertSubstitutionStatus(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(11, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-11: "Substitution Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertRxd11_SubstitutionStatus(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * RXD-11: "Substitution Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeSubstitutionStatus(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * RXD-11: "Substitution Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeRxd11_SubstitutionStatus(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(11, rep);
    }




    /**
     * Returns
     * RXD-12: "Total Daily Dose" - creates it if necessary
     */
    public CQ getTotalDailyDose() { 
        CQ ret = null;
        try {
            Type t = this.getField(12, 0);
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
     * Returns
     * RXD-12: "Total Daily Dose" - creates it if necessary
     */
    public CQ getRxd12_TotalDailyDose() { 
        CQ ret = null;
        try {
            Type t = this.getField(12, 0);
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
     * Returns all repetitions of Dispense-to Location (RXD-13).
     */
    public LA2[] getDispenseToLocation() {
        LA2[] ret = null;
        try {
            Type[] t = this.getField(13);  
            ret = new LA2[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (LA2)t[i];
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
     * Returns a count of the current number of repetitions of Dispense-to Location (RXD-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDispenseToLocationReps() {
        LA2[] ret = null;
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
     * RXD-13: "Dispense-to Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public LA2 getDispenseToLocation(int rep) { 
        LA2 ret = null;
        try {
            Type t = this.getField(13, rep);
            ret = (LA2)t;
        } catch (ClassCastException cce) {
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
     * RXD-13: "Dispense-to Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public LA2 getRxd13_DispenseToLocation(int rep) { 
        LA2 ret = null;
        try {
            Type t = this.getField(13, rep);
            ret = (LA2)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Dispense-to Location (RXD-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd13_DispenseToLocationReps() {
        LA2[] ret = null;
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
     * RXD-13: "Dispense-to Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public LA2 insertDispenseToLocation(int rep) throws HL7Exception { 
        return (LA2) super.insertRepetition(13, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-13: "Dispense-to Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public LA2 insertRxd13_DispenseToLocation(int rep) throws HL7Exception { 
        return (LA2) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * RXD-13: "Dispense-to Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public LA2 removeDispenseToLocation(int rep) throws HL7Exception { 
        return (LA2) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * RXD-13: "Dispense-to Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public LA2 removeRxd13_DispenseToLocation(int rep) throws HL7Exception { 
        return (LA2) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Needs Human Review (RXD-14).
     */
    public ID[] getNeedsHumanReview() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(14);  
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
     * Returns a count of the current number of repetitions of Needs Human Review (RXD-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNeedsHumanReviewReps() {
        ID[] ret = null;
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
     * RXD-14: "Needs Human Review" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getNeedsHumanReview(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * RXD-14: "Needs Human Review" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getRxd14_NeedsHumanReview(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * Returns a count of the current number of repetitions of Needs Human Review (RXD-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd14_NeedsHumanReviewReps() {
        ID[] ret = null;
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
     * RXD-14: "Needs Human Review" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertNeedsHumanReview(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(14, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-14: "Needs Human Review" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertRxd14_NeedsHumanReview(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * RXD-14: "Needs Human Review" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeNeedsHumanReview(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * RXD-14: "Needs Human Review" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeRxd14_NeedsHumanReview(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(14, rep);
    }



    /**
     * Returns all repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15).
     */
    public CE[] getPharmacyTreatmentSupplierSSpecialDispensingInstructions() {
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
     * Returns a count of the current number of repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPharmacyTreatmentSupplierSSpecialDispensingInstructionsReps() {
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
     * RXD-15: "Pharmacy/Treatment Supplier's Special Dispensing Instructions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPharmacyTreatmentSupplierSSpecialDispensingInstructions(int rep) { 
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
     * RXD-15: "Pharmacy/Treatment Supplier's Special Dispensing Instructions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxd15_PharmacyTreatmentSupplierSSpecialDispensingInstructions(int rep) { 
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
     * Returns a count of the current number of repetitions of Pharmacy/Treatment Supplier's Special Dispensing Instructions (RXD-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd15_PharmacyTreatmentSupplierSSpecialDispensingInstructionsReps() {
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
     * RXD-15: "Pharmacy/Treatment Supplier's Special Dispensing Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPharmacyTreatmentSupplierSSpecialDispensingInstructions(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(15, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-15: "Pharmacy/Treatment Supplier's Special Dispensing Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxd15_PharmacyTreatmentSupplierSSpecialDispensingInstructions(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * RXD-15: "Pharmacy/Treatment Supplier's Special Dispensing Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePharmacyTreatmentSupplierSSpecialDispensingInstructions(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * RXD-15: "Pharmacy/Treatment Supplier's Special Dispensing Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxd15_PharmacyTreatmentSupplierSSpecialDispensingInstructions(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Actual Strength (RXD-16).
     */
    public NM[] getActualStrength() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(16);  
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
     * Returns a count of the current number of repetitions of Actual Strength (RXD-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getActualStrengthReps() {
        NM[] ret = null;
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
     * RXD-16: "Actual Strength" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getActualStrength(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(16, rep);
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
     * RXD-16: "Actual Strength" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRxd16_ActualStrength(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(16, rep);
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
     * Returns a count of the current number of repetitions of Actual Strength (RXD-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd16_ActualStrengthReps() {
        NM[] ret = null;
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
     * RXD-16: "Actual Strength" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertActualStrength(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(16, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-16: "Actual Strength" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRxd16_ActualStrength(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * RXD-16: "Actual Strength" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeActualStrength(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * RXD-16: "Actual Strength" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRxd16_ActualStrength(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Actual Strength Unit (RXD-17).
     */
    public CE[] getActualStrengthUnit() {
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
     * Returns a count of the current number of repetitions of Actual Strength Unit (RXD-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getActualStrengthUnitReps() {
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
     * RXD-17: "Actual Strength Unit" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getActualStrengthUnit(int rep) { 
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
     * RXD-17: "Actual Strength Unit" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxd17_ActualStrengthUnit(int rep) { 
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
     * Returns a count of the current number of repetitions of Actual Strength Unit (RXD-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd17_ActualStrengthUnitReps() {
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
     * RXD-17: "Actual Strength Unit" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertActualStrengthUnit(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-17: "Actual Strength Unit" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxd17_ActualStrengthUnit(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * RXD-17: "Actual Strength Unit" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeActualStrengthUnit(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * RXD-17: "Actual Strength Unit" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxd17_ActualStrengthUnit(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(17, rep);
    }



    /**
     * Returns all repetitions of Substance Lot Number (RXD-18).
     */
    public ST[] getSubstanceLotNumber() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(18);  
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
     * Returns a count of the current number of repetitions of Substance Lot Number (RXD-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSubstanceLotNumberReps() {
        ST[] ret = null;
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
     * RXD-18: "Substance Lot Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getSubstanceLotNumber(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(18, rep);
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
     * RXD-18: "Substance Lot Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getRxd18_SubstanceLotNumber(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(18, rep);
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
     * Returns a count of the current number of repetitions of Substance Lot Number (RXD-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd18_SubstanceLotNumberReps() {
        ST[] ret = null;
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
     * RXD-18: "Substance Lot Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertSubstanceLotNumber(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(18, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-18: "Substance Lot Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertRxd18_SubstanceLotNumber(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * RXD-18: "Substance Lot Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeSubstanceLotNumber(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * RXD-18: "Substance Lot Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeRxd18_SubstanceLotNumber(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(18, rep);
    }



    /**
     * Returns all repetitions of Substance Expiration Date (RXD-19).
     */
    public TS[] getSubstanceExpirationDate() {
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
     * Returns a count of the current number of repetitions of Substance Expiration Date (RXD-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSubstanceExpirationDateReps() {
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
     * RXD-19: "Substance Expiration Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getSubstanceExpirationDate(int rep) { 
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
     * RXD-19: "Substance Expiration Date" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getRxd19_SubstanceExpirationDate(int rep) { 
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
     * Returns a count of the current number of repetitions of Substance Expiration Date (RXD-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd19_SubstanceExpirationDateReps() {
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
     * RXD-19: "Substance Expiration Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertSubstanceExpirationDate(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(19, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-19: "Substance Expiration Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertRxd19_SubstanceExpirationDate(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * RXD-19: "Substance Expiration Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeSubstanceExpirationDate(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * RXD-19: "Substance Expiration Date" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeRxd19_SubstanceExpirationDate(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(19, rep);
    }



    /**
     * Returns all repetitions of Substance Manufacturer Name (RXD-20).
     */
    public CE[] getSubstanceManufacturerName() {
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
     * Returns a count of the current number of repetitions of Substance Manufacturer Name (RXD-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSubstanceManufacturerNameReps() {
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
     * RXD-20: "Substance Manufacturer Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getSubstanceManufacturerName(int rep) { 
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
     * RXD-20: "Substance Manufacturer Name" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxd20_SubstanceManufacturerName(int rep) { 
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
     * Returns a count of the current number of repetitions of Substance Manufacturer Name (RXD-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd20_SubstanceManufacturerNameReps() {
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
     * RXD-20: "Substance Manufacturer Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertSubstanceManufacturerName(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(20, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-20: "Substance Manufacturer Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxd20_SubstanceManufacturerName(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * RXD-20: "Substance Manufacturer Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeSubstanceManufacturerName(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * RXD-20: "Substance Manufacturer Name" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxd20_SubstanceManufacturerName(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(20, rep);
    }



    /**
     * Returns all repetitions of Indication (RXD-21).
     */
    public CE[] getIndication() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(21);  
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
     * Returns a count of the current number of repetitions of Indication (RXD-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getIndicationReps() {
        CE[] ret = null;
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
     * RXD-21: "Indication" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getIndication(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(21, rep);
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
     * RXD-21: "Indication" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxd21_Indication(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(21, rep);
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
     * Returns a count of the current number of repetitions of Indication (RXD-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd21_IndicationReps() {
        CE[] ret = null;
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
     * RXD-21: "Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertIndication(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(21, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-21: "Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxd21_Indication(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * RXD-21: "Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeIndication(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * RXD-21: "Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxd21_Indication(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(21, rep);
    }



    /**
     * Returns all repetitions of Dispense Package Size (RXD-22).
     */
    public NM[] getDispensePackageSize() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(22);  
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
     * Returns a count of the current number of repetitions of Dispense Package Size (RXD-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDispensePackageSizeReps() {
        NM[] ret = null;
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
     * RXD-22: "Dispense Package Size" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getDispensePackageSize(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(22, rep);
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
     * RXD-22: "Dispense Package Size" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRxd22_DispensePackageSize(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(22, rep);
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
     * Returns a count of the current number of repetitions of Dispense Package Size (RXD-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd22_DispensePackageSizeReps() {
        NM[] ret = null;
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
     * RXD-22: "Dispense Package Size" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertDispensePackageSize(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(22, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-22: "Dispense Package Size" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRxd22_DispensePackageSize(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * RXD-22: "Dispense Package Size" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeDispensePackageSize(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * RXD-22: "Dispense Package Size" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRxd22_DispensePackageSize(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(22, rep);
    }



    /**
     * Returns all repetitions of Dispense Package Size Unit (RXD-23).
     */
    public CE[] getDispensePackageSizeUnit() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(23);  
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
     * Returns a count of the current number of repetitions of Dispense Package Size Unit (RXD-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDispensePackageSizeUnitReps() {
        CE[] ret = null;
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
     * RXD-23: "Dispense Package Size Unit" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getDispensePackageSizeUnit(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(23, rep);
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
     * RXD-23: "Dispense Package Size Unit" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxd23_DispensePackageSizeUnit(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(23, rep);
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
     * Returns a count of the current number of repetitions of Dispense Package Size Unit (RXD-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd23_DispensePackageSizeUnitReps() {
        CE[] ret = null;
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
     * RXD-23: "Dispense Package Size Unit" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertDispensePackageSizeUnit(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(23, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-23: "Dispense Package Size Unit" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxd23_DispensePackageSizeUnit(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * RXD-23: "Dispense Package Size Unit" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeDispensePackageSizeUnit(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * RXD-23: "Dispense Package Size Unit" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxd23_DispensePackageSizeUnit(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(23, rep);
    }



    /**
     * Returns all repetitions of Dispense Package Method (RXD-24).
     */
    public ID[] getDispensePackageMethod() {
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
     * Returns a count of the current number of repetitions of Dispense Package Method (RXD-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDispensePackageMethodReps() {
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
     * RXD-24: "Dispense Package Method" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getDispensePackageMethod(int rep) { 
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
     * RXD-24: "Dispense Package Method" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getRxd24_DispensePackageMethod(int rep) { 
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
     * Returns a count of the current number of repetitions of Dispense Package Method (RXD-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd24_DispensePackageMethodReps() {
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
     * RXD-24: "Dispense Package Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertDispensePackageMethod(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(24, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-24: "Dispense Package Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertRxd24_DispensePackageMethod(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * RXD-24: "Dispense Package Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeDispensePackageMethod(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * RXD-24: "Dispense Package Method" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeRxd24_DispensePackageMethod(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(24, rep);
    }



    /**
     * Returns all repetitions of Supplementary Code (RXD-25).
     */
    public CE[] getSupplementaryCode() {
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
     * Returns a count of the current number of repetitions of Supplementary Code (RXD-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSupplementaryCodeReps() {
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
     * RXD-25: "Supplementary Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getSupplementaryCode(int rep) { 
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
     * RXD-25: "Supplementary Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxd25_SupplementaryCode(int rep) { 
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
     * Returns a count of the current number of repetitions of Supplementary Code (RXD-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd25_SupplementaryCodeReps() {
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
     * RXD-25: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertSupplementaryCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(25, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-25: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxd25_SupplementaryCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * RXD-25: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeSupplementaryCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * RXD-25: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxd25_SupplementaryCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(25, rep);
    }



    /**
     * Returns all repetitions of Initiating Location (RXD-26).
     */
    public CE[] getInitiatingLocation() {
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
     * Returns a count of the current number of repetitions of Initiating Location (RXD-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getInitiatingLocationReps() {
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
     * RXD-26: "Initiating Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getInitiatingLocation(int rep) { 
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
     * RXD-26: "Initiating Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxd26_InitiatingLocation(int rep) { 
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
     * Returns a count of the current number of repetitions of Initiating Location (RXD-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd26_InitiatingLocationReps() {
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
     * RXD-26: "Initiating Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertInitiatingLocation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(26, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-26: "Initiating Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxd26_InitiatingLocation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * RXD-26: "Initiating Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeInitiatingLocation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * RXD-26: "Initiating Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxd26_InitiatingLocation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(26, rep);
    }



    /**
     * Returns all repetitions of Packaging/Assembly Location (RXD-27).
     */
    public CE[] getPackagingAssemblyLocation() {
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
     * Returns a count of the current number of repetitions of Packaging/Assembly Location (RXD-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPackagingAssemblyLocationReps() {
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
     * RXD-27: "Packaging/Assembly Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPackagingAssemblyLocation(int rep) { 
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
     * RXD-27: "Packaging/Assembly Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxd27_PackagingAssemblyLocation(int rep) { 
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
     * Returns a count of the current number of repetitions of Packaging/Assembly Location (RXD-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd27_PackagingAssemblyLocationReps() {
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
     * RXD-27: "Packaging/Assembly Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPackagingAssemblyLocation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(27, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-27: "Packaging/Assembly Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxd27_PackagingAssemblyLocation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * RXD-27: "Packaging/Assembly Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePackagingAssemblyLocation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * RXD-27: "Packaging/Assembly Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxd27_PackagingAssemblyLocation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(27, rep);
    }



    /**
     * Returns all repetitions of Actual Drug Strength Volume (RXD-28).
     */
    public NM[] getActualDrugStrengthVolume() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(28);  
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
     * Returns a count of the current number of repetitions of Actual Drug Strength Volume (RXD-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getActualDrugStrengthVolumeReps() {
        NM[] ret = null;
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
     * RXD-28: "Actual Drug Strength Volume" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getActualDrugStrengthVolume(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(28, rep);
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
     * RXD-28: "Actual Drug Strength Volume" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRxd28_ActualDrugStrengthVolume(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(28, rep);
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
     * Returns a count of the current number of repetitions of Actual Drug Strength Volume (RXD-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd28_ActualDrugStrengthVolumeReps() {
        NM[] ret = null;
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
     * RXD-28: "Actual Drug Strength Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertActualDrugStrengthVolume(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(28, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-28: "Actual Drug Strength Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRxd28_ActualDrugStrengthVolume(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * RXD-28: "Actual Drug Strength Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeActualDrugStrengthVolume(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * RXD-28: "Actual Drug Strength Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRxd28_ActualDrugStrengthVolume(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(28, rep);
    }



    /**
     * Returns all repetitions of Actual Drug Strength Volume Units (RXD-29).
     */
    public CWE[] getActualDrugStrengthVolumeUnits() {
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
     * Returns a count of the current number of repetitions of Actual Drug Strength Volume Units (RXD-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getActualDrugStrengthVolumeUnitsReps() {
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
     * RXD-29: "Actual Drug Strength Volume Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getActualDrugStrengthVolumeUnits(int rep) { 
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
     * RXD-29: "Actual Drug Strength Volume Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getRxd29_ActualDrugStrengthVolumeUnits(int rep) { 
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
     * Returns a count of the current number of repetitions of Actual Drug Strength Volume Units (RXD-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd29_ActualDrugStrengthVolumeUnitsReps() {
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
     * RXD-29: "Actual Drug Strength Volume Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertActualDrugStrengthVolumeUnits(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(29, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-29: "Actual Drug Strength Volume Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertRxd29_ActualDrugStrengthVolumeUnits(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * RXD-29: "Actual Drug Strength Volume Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeActualDrugStrengthVolumeUnits(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * RXD-29: "Actual Drug Strength Volume Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeRxd29_ActualDrugStrengthVolumeUnits(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(29, rep);
    }



    /**
     * Returns all repetitions of Dispense to Pharmacy (RXD-30).
     */
    public CWE[] getDispenseToPharmacy() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(30);  
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
     * Returns a count of the current number of repetitions of Dispense to Pharmacy (RXD-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDispenseToPharmacyReps() {
        CWE[] ret = null;
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
     * RXD-30: "Dispense to Pharmacy" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getDispenseToPharmacy(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(30, rep);
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
     * RXD-30: "Dispense to Pharmacy" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getRxd30_DispenseToPharmacy(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(30, rep);
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
     * Returns a count of the current number of repetitions of Dispense to Pharmacy (RXD-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd30_DispenseToPharmacyReps() {
        CWE[] ret = null;
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
     * RXD-30: "Dispense to Pharmacy" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertDispenseToPharmacy(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(30, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-30: "Dispense to Pharmacy" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertRxd30_DispenseToPharmacy(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * RXD-30: "Dispense to Pharmacy" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeDispenseToPharmacy(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * RXD-30: "Dispense to Pharmacy" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeRxd30_DispenseToPharmacy(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(30, rep);
    }



    /**
     * Returns all repetitions of Dispense to Pharmacy Address (RXD-31).
     */
    public XAD[] getDispenseToPharmacyAddress() {
        XAD[] ret = null;
        try {
            Type[] t = this.getField(31);  
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
     * Returns a count of the current number of repetitions of Dispense to Pharmacy Address (RXD-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDispenseToPharmacyAddressReps() {
        XAD[] ret = null;
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
     * RXD-31: "Dispense to Pharmacy Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getDispenseToPharmacyAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(31, rep);
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
     * RXD-31: "Dispense to Pharmacy Address" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XAD getRxd31_DispenseToPharmacyAddress(int rep) { 
        XAD ret = null;
        try {
            Type t = this.getField(31, rep);
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
     * Returns a count of the current number of repetitions of Dispense to Pharmacy Address (RXD-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd31_DispenseToPharmacyAddressReps() {
        XAD[] ret = null;
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
     * RXD-31: "Dispense to Pharmacy Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertDispenseToPharmacyAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(31, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-31: "Dispense to Pharmacy Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD insertRxd31_DispenseToPharmacyAddress(int rep) throws HL7Exception { 
        return (XAD) super.insertRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * RXD-31: "Dispense to Pharmacy Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removeDispenseToPharmacyAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * RXD-31: "Dispense to Pharmacy Address" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XAD removeRxd31_DispenseToPharmacyAddress(int rep) throws HL7Exception { 
        return (XAD) super.removeRepetition(31, rep);
    }



    /**
     * Returns all repetitions of Pharmacy Order Type (RXD-32).
     */
    public ID[] getPharmacyOrderType() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(32);  
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
     * Returns a count of the current number of repetitions of Pharmacy Order Type (RXD-32).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPharmacyOrderTypeReps() {
        ID[] ret = null;
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
     * RXD-32: "Pharmacy Order Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getPharmacyOrderType(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(32, rep);
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
     * RXD-32: "Pharmacy Order Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getRxd32_PharmacyOrderType(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(32, rep);
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
     * Returns a count of the current number of repetitions of Pharmacy Order Type (RXD-32).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd32_PharmacyOrderTypeReps() {
        ID[] ret = null;
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
     * RXD-32: "Pharmacy Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertPharmacyOrderType(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(32, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-32: "Pharmacy Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertRxd32_PharmacyOrderType(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(32, rep);
    }


    /**
     * Removes a repetition of
     * RXD-32: "Pharmacy Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removePharmacyOrderType(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(32, rep);
    }


    /**
     * Removes a repetition of
     * RXD-32: "Pharmacy Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeRxd32_PharmacyOrderType(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(32, rep);
    }



    /**
     * Returns all repetitions of Dispense Type (RXD-33).
     */
    public CWE[] getDispenseType() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(33);  
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
     * Returns a count of the current number of repetitions of Dispense Type (RXD-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDispenseTypeReps() {
        CWE[] ret = null;
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
     * RXD-33: "Dispense Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getDispenseType(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(33, rep);
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
     * RXD-33: "Dispense Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getRxd33_DispenseType(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(33, rep);
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
     * Returns a count of the current number of repetitions of Dispense Type (RXD-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxd33_DispenseTypeReps() {
        CWE[] ret = null;
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
     * RXD-33: "Dispense Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertDispenseType(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(33, rep);
    }



    /**
     * Inserts a repetition of
     * RXD-33: "Dispense Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertRxd33_DispenseType(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * RXD-33: "Dispense Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeDispenseType(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * RXD-33: "Dispense Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeRxd33_DispenseType(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(33, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new NM(getMessage());
          case 1: return new CE(getMessage());
          case 2: return new TS(getMessage());
          case 3: return new NM(getMessage());
          case 4: return new CE(getMessage());
          case 5: return new CE(getMessage());
          case 6: return new ST(getMessage());
          case 7: return new NM(getMessage());
          case 8: return new ST(getMessage());
          case 9: return new XCN(getMessage());
          case 10: return new ID(getMessage(), new Integer( 167 ));
          case 11: return new CQ(getMessage());
          case 12: return new LA2(getMessage());
          case 13: return new ID(getMessage(), new Integer( 136 ));
          case 14: return new CE(getMessage());
          case 15: return new NM(getMessage());
          case 16: return new CE(getMessage());
          case 17: return new ST(getMessage());
          case 18: return new TS(getMessage());
          case 19: return new CE(getMessage());
          case 20: return new CE(getMessage());
          case 21: return new NM(getMessage());
          case 22: return new CE(getMessage());
          case 23: return new ID(getMessage(), new Integer( 321 ));
          case 24: return new CE(getMessage());
          case 25: return new CE(getMessage());
          case 26: return new CE(getMessage());
          case 27: return new NM(getMessage());
          case 28: return new CWE(getMessage());
          case 29: return new CWE(getMessage());
          case 30: return new XAD(getMessage());
          case 31: return new ID(getMessage(), new Integer( 480 ));
          case 32: return new CWE(getMessage());
          default: return null;
       }
   }


}


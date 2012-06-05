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
 *<p>Represents an HL7 RXO message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>RXO-1: Requested Give Code (CE) <b>optional </b>
     * <li>RXO-2: Requested Give Amount - Minimum (NM) <b>optional </b>
     * <li>RXO-3: Requested Give Amount - Maximum (NM) <b>optional repeating</b>
     * <li>RXO-4: Requested Give Units (CE) <b>optional </b>
     * <li>RXO-5: Requested Dosage Form (CE) <b>optional repeating</b>
     * <li>RXO-6: Provider's Pharmacy/Treatment Instructions (CE) <b>optional repeating</b>
     * <li>RXO-7: Provider's Administration Instructions (CE) <b>optional repeating</b>
     * <li>RXO-8: Deliver-To Location (LA1) <b>optional repeating</b>
     * <li>RXO-9: Allow Substitutions (ID) <b>optional repeating</b>
     * <li>RXO-10: Requested Dispense Code (CE) <b>optional repeating</b>
     * <li>RXO-11: Requested Dispense Amount (NM) <b>optional </b>
     * <li>RXO-12: Requested Dispense Units (CE) <b>optional </b>
     * <li>RXO-13: Number Of Refills (NM) <b>optional </b>
     * <li>RXO-14: Ordering Provider's DEA Number (XCN) <b>optional repeating</b>
     * <li>RXO-15: Pharmacist/Treatment Supplier's Verifier ID (XCN) <b>optional repeating</b>
     * <li>RXO-16: Needs Human Review (ID) <b>optional repeating</b>
     * <li>RXO-17: Requested Give Per (Time Unit) (ST) <b>optional repeating</b>
     * <li>RXO-18: Requested Give Strength (NM) <b>optional repeating</b>
     * <li>RXO-19: Requested Give Strength Units (CE) <b>optional repeating</b>
     * <li>RXO-20: Indication (CE) <b>optional repeating</b>
     * <li>RXO-21: Requested Give Rate Amount (ST) <b>optional repeating</b>
     * <li>RXO-22: Requested Give Rate Units (CE) <b>optional repeating</b>
     * <li>RXO-23: Total Daily Dose (CQ) <b>optional repeating</b>
     * <li>RXO-24: Supplementary Code (CE) <b>optional repeating</b>
     * <li>RXO-25: Requested Drug Strength Volume (NM) <b>optional repeating</b>
     * <li>RXO-26: Requested Drug Strength Volume Units (CWE) <b>optional repeating</b>
     * <li>RXO-27: Pharmacy Order Type (ID) <b>optional repeating</b>
     * <li>RXO-28: Dispensing Interval (NM) <b>optional repeating</b>
 * </ul>
 */
public class RXO extends AbstractSegment {

    /** 
     * Creates a new RXO segment
     */
    public RXO(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(CE.class, false, 1, 483, new Object[]{ getMessage(), new Integer(0) }, "Requested Give Code");
                                  this.add(NM.class, false, 1, 20, new Object[]{ getMessage(), new Integer(0) }, "Requested Give Amount - Minimum");
                                  this.add(NM.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "Requested Give Amount - Maximum");
                                  this.add(CE.class, false, 1, 483, new Object[]{ getMessage(), new Integer(0) }, "Requested Give Units");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Requested Dosage Form");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Provider's Pharmacy/Treatment Instructions");
                                  this.add(CE.class, false, -1, 483, new Object[]{ getMessage(), new Integer(0) }, "Provider's Administration Instructions");
                                  this.add(LA1.class, false, 0, 790, new Object[]{ getMessage(), new Integer(0) }, "Deliver-To Location");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Allow Substitutions");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Requested Dispense Code");
                                  this.add(NM.class, false, 1, 20, new Object[]{ getMessage(), new Integer(0) }, "Requested Dispense Amount");
                                  this.add(CE.class, false, 1, 483, new Object[]{ getMessage(), new Integer(0) }, "Requested Dispense Units");
                                  this.add(NM.class, false, 1, 3, new Object[]{ getMessage(), new Integer(0) }, "Number Of Refills");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Ordering Provider's DEA Number");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Pharmacist/Treatment Supplier's Verifier ID");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Needs Human Review");
                                  this.add(ST.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "Requested Give Per (Time Unit)");
                                  this.add(NM.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "Requested Give Strength");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Requested Give Strength Units");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Indication");
                                  this.add(ST.class, false, 0, 6, new Object[]{ getMessage(), new Integer(0) }, "Requested Give Rate Amount");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Requested Give Rate Units");
                                  this.add(CQ.class, false, 0, 500, new Object[]{ getMessage(), new Integer(0) }, "Total Daily Dose");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Supplementary Code");
                                  this.add(NM.class, false, 0, 5, new Object[]{ getMessage(), new Integer(0) }, "Requested Drug Strength Volume");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(0) }, "Requested Drug Strength Volume Units");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Pharmacy Order Type");
                                  this.add(NM.class, false, 0, 20, new Object[]{ getMessage(), new Integer(0) }, "Dispensing Interval");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RXO - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * RXO-1: "Requested Give Code" - creates it if necessary
     */
    public CE getRequestedGiveCode() { 
        CE ret = null;
        try {
            Type t = this.getField(1, 0);
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
     * RXO-1: "Requested Give Code" - creates it if necessary
     */
    public CE getRxo1_RequestedGiveCode() { 
        CE ret = null;
        try {
            Type t = this.getField(1, 0);
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
     * RXO-2: "Requested Give Amount - Minimum" - creates it if necessary
     */
    public NM getRequestedGiveAmountMinimum() { 
        NM ret = null;
        try {
            Type t = this.getField(2, 0);
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
     * RXO-2: "Requested Give Amount - Minimum" - creates it if necessary
     */
    public NM getRxo2_RequestedGiveAmountMinimum() { 
        NM ret = null;
        try {
            Type t = this.getField(2, 0);
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
     * Returns all repetitions of Requested Give Amount - Maximum (RXO-3).
     */
    public NM[] getRequestedGiveAmountMaximum() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(3);  
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
     * Returns a count of the current number of repetitions of Requested Give Amount - Maximum (RXO-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedGiveAmountMaximumReps() {
        NM[] ret = null;
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
     * RXO-3: "Requested Give Amount - Maximum" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRequestedGiveAmountMaximum(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(3, rep);
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
     * RXO-3: "Requested Give Amount - Maximum" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRxo3_RequestedGiveAmountMaximum(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(3, rep);
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
     * Returns a count of the current number of repetitions of Requested Give Amount - Maximum (RXO-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo3_RequestedGiveAmountMaximumReps() {
        NM[] ret = null;
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
     * RXO-3: "Requested Give Amount - Maximum" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRequestedGiveAmountMaximum(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(3, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-3: "Requested Give Amount - Maximum" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRxo3_RequestedGiveAmountMaximum(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * RXO-3: "Requested Give Amount - Maximum" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRequestedGiveAmountMaximum(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * RXO-3: "Requested Give Amount - Maximum" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRxo3_RequestedGiveAmountMaximum(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(3, rep);
    }




    /**
     * Returns
     * RXO-4: "Requested Give Units" - creates it if necessary
     */
    public CE getRequestedGiveUnits() { 
        CE ret = null;
        try {
            Type t = this.getField(4, 0);
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
     * RXO-4: "Requested Give Units" - creates it if necessary
     */
    public CE getRxo4_RequestedGiveUnits() { 
        CE ret = null;
        try {
            Type t = this.getField(4, 0);
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
     * Returns all repetitions of Requested Dosage Form (RXO-5).
     */
    public CE[] getRequestedDosageForm() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(5);  
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
     * Returns a count of the current number of repetitions of Requested Dosage Form (RXO-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedDosageFormReps() {
        CE[] ret = null;
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
     * RXO-5: "Requested Dosage Form" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRequestedDosageForm(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(5, rep);
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
     * RXO-5: "Requested Dosage Form" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxo5_RequestedDosageForm(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(5, rep);
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
     * Returns a count of the current number of repetitions of Requested Dosage Form (RXO-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo5_RequestedDosageFormReps() {
        CE[] ret = null;
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
     * RXO-5: "Requested Dosage Form" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRequestedDosageForm(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(5, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-5: "Requested Dosage Form" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxo5_RequestedDosageForm(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * RXO-5: "Requested Dosage Form" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRequestedDosageForm(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * RXO-5: "Requested Dosage Form" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxo5_RequestedDosageForm(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Provider's Pharmacy/Treatment Instructions (RXO-6).
     */
    public CE[] getProviderSPharmacyTreatmentInstructions() {
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
     * Returns a count of the current number of repetitions of Provider's Pharmacy/Treatment Instructions (RXO-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProviderSPharmacyTreatmentInstructionsReps() {
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
     * RXO-6: "Provider's Pharmacy/Treatment Instructions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getProviderSPharmacyTreatmentInstructions(int rep) { 
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
     * RXO-6: "Provider's Pharmacy/Treatment Instructions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxo6_ProviderSPharmacyTreatmentInstructions(int rep) { 
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
     * Returns a count of the current number of repetitions of Provider's Pharmacy/Treatment Instructions (RXO-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo6_ProviderSPharmacyTreatmentInstructionsReps() {
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
     * RXO-6: "Provider's Pharmacy/Treatment Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertProviderSPharmacyTreatmentInstructions(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(6, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-6: "Provider's Pharmacy/Treatment Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxo6_ProviderSPharmacyTreatmentInstructions(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * RXO-6: "Provider's Pharmacy/Treatment Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeProviderSPharmacyTreatmentInstructions(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * RXO-6: "Provider's Pharmacy/Treatment Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxo6_ProviderSPharmacyTreatmentInstructions(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(6, rep);
    }



    /**
     * Returns all repetitions of Provider's Administration Instructions (RXO-7).
     */
    public CE[] getProviderSAdministrationInstructions() {
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
     * Returns a count of the current number of repetitions of Provider's Administration Instructions (RXO-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProviderSAdministrationInstructionsReps() {
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
     * RXO-7: "Provider's Administration Instructions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getProviderSAdministrationInstructions(int rep) { 
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
     * RXO-7: "Provider's Administration Instructions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxo7_ProviderSAdministrationInstructions(int rep) { 
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
     * Returns a count of the current number of repetitions of Provider's Administration Instructions (RXO-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo7_ProviderSAdministrationInstructionsReps() {
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
     * RXO-7: "Provider's Administration Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertProviderSAdministrationInstructions(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(7, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-7: "Provider's Administration Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxo7_ProviderSAdministrationInstructions(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * RXO-7: "Provider's Administration Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeProviderSAdministrationInstructions(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * RXO-7: "Provider's Administration Instructions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxo7_ProviderSAdministrationInstructions(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(7, rep);
    }



    /**
     * Returns all repetitions of Deliver-To Location (RXO-8).
     */
    public LA1[] getDeliverToLocation() {
        LA1[] ret = null;
        try {
            Type[] t = this.getField(8);  
            ret = new LA1[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (LA1)t[i];
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
     * Returns a count of the current number of repetitions of Deliver-To Location (RXO-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDeliverToLocationReps() {
        LA1[] ret = null;
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
     * RXO-8: "Deliver-To Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public LA1 getDeliverToLocation(int rep) { 
        LA1 ret = null;
        try {
            Type t = this.getField(8, rep);
            ret = (LA1)t;
        } catch (ClassCastException cce) {
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
     * RXO-8: "Deliver-To Location" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public LA1 getRxo8_DeliverToLocation(int rep) { 
        LA1 ret = null;
        try {
            Type t = this.getField(8, rep);
            ret = (LA1)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Deliver-To Location (RXO-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo8_DeliverToLocationReps() {
        LA1[] ret = null;
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
     * RXO-8: "Deliver-To Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public LA1 insertDeliverToLocation(int rep) throws HL7Exception { 
        return (LA1) super.insertRepetition(8, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-8: "Deliver-To Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public LA1 insertRxo8_DeliverToLocation(int rep) throws HL7Exception { 
        return (LA1) super.insertRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * RXO-8: "Deliver-To Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public LA1 removeDeliverToLocation(int rep) throws HL7Exception { 
        return (LA1) super.removeRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * RXO-8: "Deliver-To Location" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public LA1 removeRxo8_DeliverToLocation(int rep) throws HL7Exception { 
        return (LA1) super.removeRepetition(8, rep);
    }



    /**
     * Returns all repetitions of Allow Substitutions (RXO-9).
     */
    public ID[] getAllowSubstitutions() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(9);  
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
     * Returns a count of the current number of repetitions of Allow Substitutions (RXO-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAllowSubstitutionsReps() {
        ID[] ret = null;
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
     * RXO-9: "Allow Substitutions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getAllowSubstitutions(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * RXO-9: "Allow Substitutions" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getRxo9_AllowSubstitutions(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * Returns a count of the current number of repetitions of Allow Substitutions (RXO-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo9_AllowSubstitutionsReps() {
        ID[] ret = null;
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
     * RXO-9: "Allow Substitutions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertAllowSubstitutions(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(9, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-9: "Allow Substitutions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertRxo9_AllowSubstitutions(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * RXO-9: "Allow Substitutions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeAllowSubstitutions(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * RXO-9: "Allow Substitutions" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeRxo9_AllowSubstitutions(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Requested Dispense Code (RXO-10).
     */
    public CE[] getRequestedDispenseCode() {
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
     * Returns a count of the current number of repetitions of Requested Dispense Code (RXO-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedDispenseCodeReps() {
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
     * RXO-10: "Requested Dispense Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRequestedDispenseCode(int rep) { 
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
     * RXO-10: "Requested Dispense Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxo10_RequestedDispenseCode(int rep) { 
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
     * Returns a count of the current number of repetitions of Requested Dispense Code (RXO-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo10_RequestedDispenseCodeReps() {
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
     * RXO-10: "Requested Dispense Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRequestedDispenseCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(10, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-10: "Requested Dispense Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxo10_RequestedDispenseCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * RXO-10: "Requested Dispense Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRequestedDispenseCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * RXO-10: "Requested Dispense Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxo10_RequestedDispenseCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(10, rep);
    }




    /**
     * Returns
     * RXO-11: "Requested Dispense Amount" - creates it if necessary
     */
    public NM getRequestedDispenseAmount() { 
        NM ret = null;
        try {
            Type t = this.getField(11, 0);
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
     * RXO-11: "Requested Dispense Amount" - creates it if necessary
     */
    public NM getRxo11_RequestedDispenseAmount() { 
        NM ret = null;
        try {
            Type t = this.getField(11, 0);
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
     * RXO-12: "Requested Dispense Units" - creates it if necessary
     */
    public CE getRequestedDispenseUnits() { 
        CE ret = null;
        try {
            Type t = this.getField(12, 0);
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
     * RXO-12: "Requested Dispense Units" - creates it if necessary
     */
    public CE getRxo12_RequestedDispenseUnits() { 
        CE ret = null;
        try {
            Type t = this.getField(12, 0);
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
     * RXO-13: "Number Of Refills" - creates it if necessary
     */
    public NM getNumberOfRefills() { 
        NM ret = null;
        try {
            Type t = this.getField(13, 0);
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
     * RXO-13: "Number Of Refills" - creates it if necessary
     */
    public NM getRxo13_NumberOfRefills() { 
        NM ret = null;
        try {
            Type t = this.getField(13, 0);
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
     * Returns all repetitions of Ordering Provider's DEA Number (RXO-14).
     */
    public XCN[] getOrderingProviderSDEANumber() {
        XCN[] ret = null;
        try {
            Type[] t = this.getField(14);  
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
     * Returns a count of the current number of repetitions of Ordering Provider's DEA Number (RXO-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderingProviderSDEANumberReps() {
        XCN[] ret = null;
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
     * RXO-14: "Ordering Provider's DEA Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOrderingProviderSDEANumber(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * RXO-14: "Ordering Provider's DEA Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getRxo14_OrderingProviderSDEANumber(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * Returns a count of the current number of repetitions of Ordering Provider's DEA Number (RXO-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo14_OrderingProviderSDEANumberReps() {
        XCN[] ret = null;
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
     * RXO-14: "Ordering Provider's DEA Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOrderingProviderSDEANumber(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(14, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-14: "Ordering Provider's DEA Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertRxo14_OrderingProviderSDEANumber(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * RXO-14: "Ordering Provider's DEA Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOrderingProviderSDEANumber(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * RXO-14: "Ordering Provider's DEA Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeRxo14_OrderingProviderSDEANumber(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(14, rep);
    }



    /**
     * Returns all repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXO-15).
     */
    public XCN[] getPharmacistTreatmentSupplierSVerifierID() {
        XCN[] ret = null;
        try {
            Type[] t = this.getField(15);  
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
     * Returns a count of the current number of repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXO-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPharmacistTreatmentSupplierSVerifierIDReps() {
        XCN[] ret = null;
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
     * RXO-15: "Pharmacist/Treatment Supplier's Verifier ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getPharmacistTreatmentSupplierSVerifierID(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(15, rep);
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
     * RXO-15: "Pharmacist/Treatment Supplier's Verifier ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getRxo15_PharmacistTreatmentSupplierSVerifierID(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(15, rep);
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
     * Returns a count of the current number of repetitions of Pharmacist/Treatment Supplier's Verifier ID (RXO-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo15_PharmacistTreatmentSupplierSVerifierIDReps() {
        XCN[] ret = null;
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
     * RXO-15: "Pharmacist/Treatment Supplier's Verifier ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertPharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(15, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-15: "Pharmacist/Treatment Supplier's Verifier ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertRxo15_PharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * RXO-15: "Pharmacist/Treatment Supplier's Verifier ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removePharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * RXO-15: "Pharmacist/Treatment Supplier's Verifier ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeRxo15_PharmacistTreatmentSupplierSVerifierID(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Needs Human Review (RXO-16).
     */
    public ID[] getNeedsHumanReview() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(16);  
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
     * Returns a count of the current number of repetitions of Needs Human Review (RXO-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNeedsHumanReviewReps() {
        ID[] ret = null;
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
     * RXO-16: "Needs Human Review" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getNeedsHumanReview(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(16, rep);
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
     * RXO-16: "Needs Human Review" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getRxo16_NeedsHumanReview(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(16, rep);
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
     * Returns a count of the current number of repetitions of Needs Human Review (RXO-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo16_NeedsHumanReviewReps() {
        ID[] ret = null;
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
     * RXO-16: "Needs Human Review" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertNeedsHumanReview(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(16, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-16: "Needs Human Review" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertRxo16_NeedsHumanReview(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * RXO-16: "Needs Human Review" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeNeedsHumanReview(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * RXO-16: "Needs Human Review" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeRxo16_NeedsHumanReview(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Requested Give Per (Time Unit) (RXO-17).
     */
    public ST[] getRequestedGivePerTimeUnit() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(17);  
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
     * Returns a count of the current number of repetitions of Requested Give Per (Time Unit) (RXO-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedGivePerTimeUnitReps() {
        ST[] ret = null;
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
     * RXO-17: "Requested Give Per (Time Unit)" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getRequestedGivePerTimeUnit(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(17, rep);
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
     * RXO-17: "Requested Give Per (Time Unit)" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getRxo17_RequestedGivePerTimeUnit(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(17, rep);
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
     * Returns a count of the current number of repetitions of Requested Give Per (Time Unit) (RXO-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo17_RequestedGivePerTimeUnitReps() {
        ST[] ret = null;
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
     * RXO-17: "Requested Give Per (Time Unit)" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertRequestedGivePerTimeUnit(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(17, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-17: "Requested Give Per (Time Unit)" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertRxo17_RequestedGivePerTimeUnit(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * RXO-17: "Requested Give Per (Time Unit)" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeRequestedGivePerTimeUnit(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * RXO-17: "Requested Give Per (Time Unit)" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeRxo17_RequestedGivePerTimeUnit(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(17, rep);
    }



    /**
     * Returns all repetitions of Requested Give Strength (RXO-18).
     */
    public NM[] getRequestedGiveStrength() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(18);  
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
     * Returns a count of the current number of repetitions of Requested Give Strength (RXO-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedGiveStrengthReps() {
        NM[] ret = null;
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
     * RXO-18: "Requested Give Strength" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRequestedGiveStrength(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(18, rep);
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
     * RXO-18: "Requested Give Strength" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRxo18_RequestedGiveStrength(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(18, rep);
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
     * Returns a count of the current number of repetitions of Requested Give Strength (RXO-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo18_RequestedGiveStrengthReps() {
        NM[] ret = null;
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
     * RXO-18: "Requested Give Strength" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRequestedGiveStrength(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(18, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-18: "Requested Give Strength" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRxo18_RequestedGiveStrength(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * RXO-18: "Requested Give Strength" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRequestedGiveStrength(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * RXO-18: "Requested Give Strength" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRxo18_RequestedGiveStrength(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(18, rep);
    }



    /**
     * Returns all repetitions of Requested Give Strength Units (RXO-19).
     */
    public CE[] getRequestedGiveStrengthUnits() {
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
     * Returns a count of the current number of repetitions of Requested Give Strength Units (RXO-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedGiveStrengthUnitsReps() {
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
     * RXO-19: "Requested Give Strength Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRequestedGiveStrengthUnits(int rep) { 
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
     * RXO-19: "Requested Give Strength Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxo19_RequestedGiveStrengthUnits(int rep) { 
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
     * Returns a count of the current number of repetitions of Requested Give Strength Units (RXO-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo19_RequestedGiveStrengthUnitsReps() {
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
     * RXO-19: "Requested Give Strength Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRequestedGiveStrengthUnits(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(19, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-19: "Requested Give Strength Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxo19_RequestedGiveStrengthUnits(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * RXO-19: "Requested Give Strength Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRequestedGiveStrengthUnits(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * RXO-19: "Requested Give Strength Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxo19_RequestedGiveStrengthUnits(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(19, rep);
    }



    /**
     * Returns all repetitions of Indication (RXO-20).
     */
    public CE[] getIndication() {
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
     * Returns a count of the current number of repetitions of Indication (RXO-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getIndicationReps() {
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
     * RXO-20: "Indication" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getIndication(int rep) { 
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
     * RXO-20: "Indication" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxo20_Indication(int rep) { 
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
     * Returns a count of the current number of repetitions of Indication (RXO-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo20_IndicationReps() {
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
     * RXO-20: "Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertIndication(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(20, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-20: "Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxo20_Indication(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * RXO-20: "Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeIndication(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * RXO-20: "Indication" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxo20_Indication(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(20, rep);
    }



    /**
     * Returns all repetitions of Requested Give Rate Amount (RXO-21).
     */
    public ST[] getRequestedGiveRateAmount() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(21);  
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
     * Returns a count of the current number of repetitions of Requested Give Rate Amount (RXO-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedGiveRateAmountReps() {
        ST[] ret = null;
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
     * RXO-21: "Requested Give Rate Amount" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getRequestedGiveRateAmount(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(21, rep);
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
     * RXO-21: "Requested Give Rate Amount" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getRxo21_RequestedGiveRateAmount(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(21, rep);
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
     * Returns a count of the current number of repetitions of Requested Give Rate Amount (RXO-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo21_RequestedGiveRateAmountReps() {
        ST[] ret = null;
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
     * RXO-21: "Requested Give Rate Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertRequestedGiveRateAmount(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(21, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-21: "Requested Give Rate Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertRxo21_RequestedGiveRateAmount(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * RXO-21: "Requested Give Rate Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeRequestedGiveRateAmount(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * RXO-21: "Requested Give Rate Amount" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeRxo21_RequestedGiveRateAmount(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(21, rep);
    }



    /**
     * Returns all repetitions of Requested Give Rate Units (RXO-22).
     */
    public CE[] getRequestedGiveRateUnits() {
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
     * Returns a count of the current number of repetitions of Requested Give Rate Units (RXO-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedGiveRateUnitsReps() {
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
     * RXO-22: "Requested Give Rate Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRequestedGiveRateUnits(int rep) { 
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
     * RXO-22: "Requested Give Rate Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxo22_RequestedGiveRateUnits(int rep) { 
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
     * Returns a count of the current number of repetitions of Requested Give Rate Units (RXO-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo22_RequestedGiveRateUnitsReps() {
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
     * RXO-22: "Requested Give Rate Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRequestedGiveRateUnits(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(22, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-22: "Requested Give Rate Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxo22_RequestedGiveRateUnits(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * RXO-22: "Requested Give Rate Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRequestedGiveRateUnits(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * RXO-22: "Requested Give Rate Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxo22_RequestedGiveRateUnits(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(22, rep);
    }



    /**
     * Returns all repetitions of Total Daily Dose (RXO-23).
     */
    public CQ[] getTotalDailyDose() {
        CQ[] ret = null;
        try {
            Type[] t = this.getField(23);  
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
     * Returns a count of the current number of repetitions of Total Daily Dose (RXO-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTotalDailyDoseReps() {
        CQ[] ret = null;
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
     * RXO-23: "Total Daily Dose" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getTotalDailyDose(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(23, rep);
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
     * RXO-23: "Total Daily Dose" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getRxo23_TotalDailyDose(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(23, rep);
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
     * Returns a count of the current number of repetitions of Total Daily Dose (RXO-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo23_TotalDailyDoseReps() {
        CQ[] ret = null;
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
     * RXO-23: "Total Daily Dose" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertTotalDailyDose(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(23, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-23: "Total Daily Dose" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertRxo23_TotalDailyDose(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * RXO-23: "Total Daily Dose" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeTotalDailyDose(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * RXO-23: "Total Daily Dose" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeRxo23_TotalDailyDose(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(23, rep);
    }



    /**
     * Returns all repetitions of Supplementary Code (RXO-24).
     */
    public CE[] getSupplementaryCode() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(24);  
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
     * Returns a count of the current number of repetitions of Supplementary Code (RXO-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSupplementaryCodeReps() {
        CE[] ret = null;
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
     * RXO-24: "Supplementary Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getSupplementaryCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(24, rep);
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
     * RXO-24: "Supplementary Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getRxo24_SupplementaryCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(24, rep);
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
     * Returns a count of the current number of repetitions of Supplementary Code (RXO-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo24_SupplementaryCodeReps() {
        CE[] ret = null;
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
     * RXO-24: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertSupplementaryCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(24, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-24: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertRxo24_SupplementaryCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * RXO-24: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeSupplementaryCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * RXO-24: "Supplementary Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeRxo24_SupplementaryCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(24, rep);
    }



    /**
     * Returns all repetitions of Requested Drug Strength Volume (RXO-25).
     */
    public NM[] getRequestedDrugStrengthVolume() {
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
     * Returns a count of the current number of repetitions of Requested Drug Strength Volume (RXO-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedDrugStrengthVolumeReps() {
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
     * RXO-25: "Requested Drug Strength Volume" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRequestedDrugStrengthVolume(int rep) { 
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
     * RXO-25: "Requested Drug Strength Volume" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRxo25_RequestedDrugStrengthVolume(int rep) { 
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
     * Returns a count of the current number of repetitions of Requested Drug Strength Volume (RXO-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo25_RequestedDrugStrengthVolumeReps() {
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
     * RXO-25: "Requested Drug Strength Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRequestedDrugStrengthVolume(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(25, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-25: "Requested Drug Strength Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRxo25_RequestedDrugStrengthVolume(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * RXO-25: "Requested Drug Strength Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRequestedDrugStrengthVolume(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * RXO-25: "Requested Drug Strength Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRxo25_RequestedDrugStrengthVolume(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(25, rep);
    }



    /**
     * Returns all repetitions of Requested Drug Strength Volume Units (RXO-26).
     */
    public CWE[] getRequestedDrugStrengthVolumeUnits() {
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
     * Returns a count of the current number of repetitions of Requested Drug Strength Volume Units (RXO-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedDrugStrengthVolumeUnitsReps() {
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
     * RXO-26: "Requested Drug Strength Volume Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getRequestedDrugStrengthVolumeUnits(int rep) { 
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
     * RXO-26: "Requested Drug Strength Volume Units" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getRxo26_RequestedDrugStrengthVolumeUnits(int rep) { 
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
     * Returns a count of the current number of repetitions of Requested Drug Strength Volume Units (RXO-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo26_RequestedDrugStrengthVolumeUnitsReps() {
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
     * RXO-26: "Requested Drug Strength Volume Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertRequestedDrugStrengthVolumeUnits(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(26, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-26: "Requested Drug Strength Volume Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertRxo26_RequestedDrugStrengthVolumeUnits(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * RXO-26: "Requested Drug Strength Volume Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeRequestedDrugStrengthVolumeUnits(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * RXO-26: "Requested Drug Strength Volume Units" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeRxo26_RequestedDrugStrengthVolumeUnits(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(26, rep);
    }



    /**
     * Returns all repetitions of Pharmacy Order Type (RXO-27).
     */
    public ID[] getPharmacyOrderType() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(27);  
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
     * Returns a count of the current number of repetitions of Pharmacy Order Type (RXO-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPharmacyOrderTypeReps() {
        ID[] ret = null;
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
     * RXO-27: "Pharmacy Order Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getPharmacyOrderType(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(27, rep);
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
     * RXO-27: "Pharmacy Order Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getRxo27_PharmacyOrderType(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(27, rep);
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
     * Returns a count of the current number of repetitions of Pharmacy Order Type (RXO-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo27_PharmacyOrderTypeReps() {
        ID[] ret = null;
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
     * RXO-27: "Pharmacy Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertPharmacyOrderType(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(27, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-27: "Pharmacy Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertRxo27_PharmacyOrderType(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * RXO-27: "Pharmacy Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removePharmacyOrderType(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * RXO-27: "Pharmacy Order Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeRxo27_PharmacyOrderType(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(27, rep);
    }



    /**
     * Returns all repetitions of Dispensing Interval (RXO-28).
     */
    public NM[] getDispensingInterval() {
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
     * Returns a count of the current number of repetitions of Dispensing Interval (RXO-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDispensingIntervalReps() {
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
     * RXO-28: "Dispensing Interval" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getDispensingInterval(int rep) { 
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
     * RXO-28: "Dispensing Interval" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getRxo28_DispensingInterval(int rep) { 
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
     * Returns a count of the current number of repetitions of Dispensing Interval (RXO-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRxo28_DispensingIntervalReps() {
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
     * RXO-28: "Dispensing Interval" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertDispensingInterval(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(28, rep);
    }



    /**
     * Inserts a repetition of
     * RXO-28: "Dispensing Interval" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertRxo28_DispensingInterval(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * RXO-28: "Dispensing Interval" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeDispensingInterval(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * RXO-28: "Dispensing Interval" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeRxo28_DispensingInterval(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(28, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new CE(getMessage());
          case 1: return new NM(getMessage());
          case 2: return new NM(getMessage());
          case 3: return new CE(getMessage());
          case 4: return new CE(getMessage());
          case 5: return new CE(getMessage());
          case 6: return new CE(getMessage());
          case 7: return new LA1(getMessage());
          case 8: return new ID(getMessage(), new Integer( 161 ));
          case 9: return new CE(getMessage());
          case 10: return new NM(getMessage());
          case 11: return new CE(getMessage());
          case 12: return new NM(getMessage());
          case 13: return new XCN(getMessage());
          case 14: return new XCN(getMessage());
          case 15: return new ID(getMessage(), new Integer( 136 ));
          case 16: return new ST(getMessage());
          case 17: return new NM(getMessage());
          case 18: return new CE(getMessage());
          case 19: return new CE(getMessage());
          case 20: return new ST(getMessage());
          case 21: return new CE(getMessage());
          case 22: return new CQ(getMessage());
          case 23: return new CE(getMessage());
          case 24: return new NM(getMessage());
          case 25: return new CWE(getMessage());
          case 26: return new ID(getMessage(), new Integer( 480 ));
          case 27: return new NM(getMessage());
          default: return null;
       }
   }


}


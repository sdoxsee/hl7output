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
 *<p>Represents an HL7 OBR message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>OBR-1: Set ID - OBR (SI) <b>optional </b>
     * <li>OBR-2: Placer Order Number (EI) <b>optional repeating</b>
     * <li>OBR-3: Filler Order Number (EI) <b>optional repeating</b>
     * <li>OBR-4: Universal Service Identifier (CE) <b>optional </b>
     * <li>OBR-5: Priority _ OBR (ID) <b>optional repeating</b>
     * <li>OBR-6: Requested Date/Time (TS) <b>optional repeating</b>
     * <li>OBR-7: Observation Date/Time (TS) <b>optional repeating</b>
     * <li>OBR-8: Observation End Date/Time (TS) <b>optional </b>
     * <li>OBR-9: Collection Volume (CQ) <b>optional repeating</b>
     * <li>OBR-10: Collector Identifier (XCN) <b>optional repeating</b>
     * <li>OBR-11: Specimen Action Code (ID) <b>optional repeating</b>
     * <li>OBR-12: Danger Code (CE) <b>optional repeating</b>
     * <li>OBR-13: Relevant Clinical Information (ST) <b>optional repeating</b>
     * <li>OBR-14: Specimen Received Date/Time (TS) <b>optional repeating</b>
     * <li>OBR-15: Specimen Source (SPS) <b>optional repeating</b>
     * <li>OBR-16: Ordering Provider (XCN) <b>optional repeating</b>
     * <li>OBR-17: Order Callback Phone Number (XTN) <b>optional repeating</b>
     * <li>OBR-18: Placer Field 1 (ST) <b>optional repeating</b>
     * <li>OBR-19: Placer Field 2 (ST) <b>optional repeating</b>
     * <li>OBR-20: Filler Field 1 (ST) <b>optional repeating</b>
     * <li>OBR-21: Filler Field 2 (ST) <b>optional repeating</b>
     * <li>OBR-22: Results Rpt/Status Chng - Date/Time (TS) <b>optional repeating</b>
     * <li>OBR-23: Charge to Practice (MOC) <b>optional repeating</b>
     * <li>OBR-24: Diagnostic Serv Sect ID (ID) <b>optional repeating</b>
     * <li>OBR-25: Result Status (ID) <b>optional repeating</b>
     * <li>OBR-26: Parent Result (PRL) <b>optional repeating</b>
     * <li>OBR-27: Quantity/Timing (TQ) <b>optional repeating</b>
     * <li>OBR-28: Result Copies To (XCN) <b>optional repeating</b>
     * <li>OBR-29: Parent (EIP) <b>optional repeating</b>
     * <li>OBR-30: Transportation Mode (ID) <b>optional repeating</b>
     * <li>OBR-31: Reason for Study (CE) <b>optional repeating</b>
     * <li>OBR-32: Principal Result Interpreter (NDL) <b>optional repeating</b>
     * <li>OBR-33: Assistant Result Interpreter (NDL) <b>optional repeating</b>
     * <li>OBR-34: Technician (NDL) <b>optional repeating</b>
     * <li>OBR-35: Transcriptionist (NDL) <b>optional repeating</b>
     * <li>OBR-36: Scheduled Date/Time (TS) <b>optional repeating</b>
     * <li>OBR-37: Number of Sample Containers * (NM) <b>optional repeating</b>
     * <li>OBR-38: Transport Logistics of Collected Sample (CE) <b>optional repeating</b>
     * <li>OBR-39: Collector's Comment * (CE) <b>optional repeating</b>
     * <li>OBR-40: Transport Arrangement Responsibility (CE) <b>optional repeating</b>
     * <li>OBR-41: Transport Arranged (ID) <b>optional repeating</b>
     * <li>OBR-42: Escort Required (ID) <b>optional repeating</b>
     * <li>OBR-43: Planned Patient Transport Comment (CE) <b>optional repeating</b>
     * <li>OBR-44: Procedure Code (CE) <b>optional repeating</b>
     * <li>OBR-45: Procedure Code Modifier (CE) <b>optional repeating</b>
     * <li>OBR-46: Placer Supplemental Service Information (CE) <b>optional repeating</b>
     * <li>OBR-47: Filler Supplemental Service Information (CE) <b>optional repeating</b>
     * <li>OBR-48: Medically Necessary Duplicate Procedure Reason. (CWE) <b>optional repeating</b>
     * <li>OBR-49: Result Handling (IS) <b>optional repeating</b>
 * </ul>
 */
public class OBR extends AbstractSegment {

    /** 
     * Creates a new OBR segment
     */
    public OBR(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SI.class, false, 1, 4, new Object[]{ getMessage(), new Integer(0) }, "Set ID - OBR");
                                  this.add(EI.class, false, 0, 427, new Object[]{ getMessage(), new Integer(0) }, "Placer Order Number");
                                  this.add(EI.class, false, 0, 427, new Object[]{ getMessage(), new Integer(0) }, "Filler Order Number");
                                  this.add(CE.class, false, 1, 483, new Object[]{ getMessage(), new Integer(0) }, "Universal Service Identifier");
                                  this.add(ID.class, false, 0, 2, new Object[]{ getMessage() }, "Priority _ OBR");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Requested Date/Time");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Observation Date/Time");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage(), new Integer(0) }, "Observation End Date/Time");
                                  this.add(CQ.class, false, 0, 500, new Object[]{ getMessage(), new Integer(0) }, "Collection Volume");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Collector Identifier");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Specimen Action Code");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Danger Code");
                                  this.add(ST.class, false, 0, 300, new Object[]{ getMessage(), new Integer(0) }, "Relevant Clinical Information");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Specimen Received Date/Time");
                                  this.add(SPS.class, false, 0, 4436, new Object[]{ getMessage(), new Integer(0) }, "Specimen Source");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Ordering Provider");
                                  this.add(XTN.class, false, 0, 651, new Object[]{ getMessage(), new Integer(0) }, "Order Callback Phone Number");
                                  this.add(ST.class, false, 0, 60, new Object[]{ getMessage(), new Integer(0) }, "Placer Field 1");
                                  this.add(ST.class, false, 0, 60, new Object[]{ getMessage(), new Integer(0) }, "Placer Field 2");
                                  this.add(ST.class, false, 0, 60, new Object[]{ getMessage(), new Integer(0) }, "Filler Field 1");
                                  this.add(ST.class, false, 0, 60, new Object[]{ getMessage(), new Integer(0) }, "Filler Field 2");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Results Rpt/Status Chng - Date/Time");
                                  this.add(MOC.class, false, 0, 504, new Object[]{ getMessage(), new Integer(0) }, "Charge to Practice");
                                  this.add(ID.class, false, 0, 10, new Object[]{ getMessage() }, "Diagnostic Serv Sect ID");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Result Status");
                                  this.add(PRL.class, false, 0, 755, new Object[]{ getMessage(), new Integer(0) }, "Parent Result");
                                  this.add(TQ.class, false, 0, 1788, new Object[]{ getMessage(), new Integer(0) }, "Quantity/Timing");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(0) }, "Result Copies To");
                                  this.add(EIP.class, false, 0, 855, new Object[]{ getMessage(), new Integer(0) }, "Parent");
                                  this.add(ID.class, false, 0, 20, new Object[]{ getMessage() }, "Transportation Mode");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Reason for Study");
                                  this.add(NDL.class, false, 0, 838, new Object[]{ getMessage(), new Integer(0) }, "Principal Result Interpreter");
                                  this.add(NDL.class, false, 0, 838, new Object[]{ getMessage(), new Integer(0) }, "Assistant Result Interpreter");
                                  this.add(NDL.class, false, 0, 838, new Object[]{ getMessage(), new Integer(0) }, "Technician");
                                  this.add(NDL.class, false, 0, 838, new Object[]{ getMessage(), new Integer(0) }, "Transcriptionist");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Scheduled Date/Time");
                                  this.add(NM.class, false, 0, 4, new Object[]{ getMessage(), new Integer(0) }, "Number of Sample Containers *");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Transport Logistics of Collected Sample");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Collector's Comment *");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Transport Arrangement Responsibility");
                                  this.add(ID.class, false, 0, 30, new Object[]{ getMessage() }, "Transport Arranged");
                                  this.add(ID.class, false, 0, 1, new Object[]{ getMessage() }, "Escort Required");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(0) }, "Planned Patient Transport Comment");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(88) }, "Procedure Code");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(340) }, "Procedure Code Modifier");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(411) }, "Placer Supplemental Service Information");
                                  this.add(CE.class, false, 0, 483, new Object[]{ getMessage(), new Integer(411) }, "Filler Supplemental Service Information");
                                  this.add(CWE.class, false, 0, 705, new Object[]{ getMessage(), new Integer(476) }, "Medically Necessary Duplicate Procedure Reason.");
                                  this.add(IS.class, false, 0, 2, new Object[]{ getMessage() }, "Result Handling");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating OBR - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * OBR-1: "Set ID - OBR" - creates it if necessary
     */
    public SI getSetIDOBR() { 
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
     * OBR-1: "Set ID - OBR" - creates it if necessary
     */
    public SI getObr1_SetIDOBR() { 
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
     * Returns all repetitions of Placer Order Number (OBR-2).
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
     * Returns a count of the current number of repetitions of Placer Order Number (OBR-2).
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
     * OBR-2: "Placer Order Number" - creates it if necessary
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
     * OBR-2: "Placer Order Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getObr2_PlacerOrderNumber(int rep) { 
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
     * Returns a count of the current number of repetitions of Placer Order Number (OBR-2).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr2_PlacerOrderNumberReps() {
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
     * OBR-2: "Placer Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertPlacerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(2, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-2: "Placer Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertObr2_PlacerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * OBR-2: "Placer Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removePlacerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(2, rep);
    }


    /**
     * Removes a repetition of
     * OBR-2: "Placer Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeObr2_PlacerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(2, rep);
    }



    /**
     * Returns all repetitions of Filler Order Number (OBR-3).
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
     * Returns a count of the current number of repetitions of Filler Order Number (OBR-3).
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
     * OBR-3: "Filler Order Number" - creates it if necessary
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
     * OBR-3: "Filler Order Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getObr3_FillerOrderNumber(int rep) { 
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
     * Returns a count of the current number of repetitions of Filler Order Number (OBR-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr3_FillerOrderNumberReps() {
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
     * OBR-3: "Filler Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertFillerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(3, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-3: "Filler Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertObr3_FillerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * OBR-3: "Filler Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeFillerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * OBR-3: "Filler Order Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeObr3_FillerOrderNumber(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(3, rep);
    }




    /**
     * Returns
     * OBR-4: "Universal Service Identifier" - creates it if necessary
     */
    public CE getUniversalServiceIdentifier() { 
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
     * OBR-4: "Universal Service Identifier" - creates it if necessary
     */
    public CE getObr4_UniversalServiceIdentifier() { 
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
     * Returns all repetitions of Priority _ OBR (OBR-5).
     */
    public ID[] getPriorityOBR() {
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
     * Returns a count of the current number of repetitions of Priority _ OBR (OBR-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPriorityOBRReps() {
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
     * OBR-5: "Priority _ OBR" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getPriorityOBR(int rep) { 
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
     * OBR-5: "Priority _ OBR" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr5_PriorityOBR(int rep) { 
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
     * Returns a count of the current number of repetitions of Priority _ OBR (OBR-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr5_PriorityOBRReps() {
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
     * OBR-5: "Priority _ OBR" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertPriorityOBR(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(5, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-5: "Priority _ OBR" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr5_PriorityOBR(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * OBR-5: "Priority _ OBR" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removePriorityOBR(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * OBR-5: "Priority _ OBR" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr5_PriorityOBR(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Requested Date/Time (OBR-6).
     */
    public TS[] getRequestedDateTime() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(6);  
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
     * Returns a count of the current number of repetitions of Requested Date/Time (OBR-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedDateTimeReps() {
        TS[] ret = null;
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
     * OBR-6: "Requested Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getRequestedDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(6, rep);
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
     * OBR-6: "Requested Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObr6_RequestedDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(6, rep);
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
     * Returns a count of the current number of repetitions of Requested Date/Time (OBR-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr6_RequestedDateTimeReps() {
        TS[] ret = null;
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
     * OBR-6: "Requested Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertRequestedDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(6, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-6: "Requested Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObr6_RequestedDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * OBR-6: "Requested Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeRequestedDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * OBR-6: "Requested Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObr6_RequestedDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(6, rep);
    }



    /**
     * Returns all repetitions of Observation Date/Time (OBR-7).
     */
    public TS[] getObservationDateTime() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(7);  
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
     * Returns a count of the current number of repetitions of Observation Date/Time (OBR-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObservationDateTimeReps() {
        TS[] ret = null;
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
     * OBR-7: "Observation Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObservationDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(7, rep);
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
     * OBR-7: "Observation Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObr7_ObservationDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(7, rep);
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
     * Returns a count of the current number of repetitions of Observation Date/Time (OBR-7).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr7_ObservationDateTimeReps() {
        TS[] ret = null;
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
     * OBR-7: "Observation Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObservationDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(7, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-7: "Observation Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObr7_ObservationDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * OBR-7: "Observation Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObservationDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(7, rep);
    }


    /**
     * Removes a repetition of
     * OBR-7: "Observation Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObr7_ObservationDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(7, rep);
    }




    /**
     * Returns
     * OBR-8: "Observation End Date/Time" - creates it if necessary
     */
    public TS getObservationEndDateTime() { 
        TS ret = null;
        try {
            Type t = this.getField(8, 0);
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
     * OBR-8: "Observation End Date/Time" - creates it if necessary
     */
    public TS getObr8_ObservationEndDateTime() { 
        TS ret = null;
        try {
            Type t = this.getField(8, 0);
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
     * Returns all repetitions of Collection Volume (OBR-9).
     */
    public CQ[] getCollectionVolume() {
        CQ[] ret = null;
        try {
            Type[] t = this.getField(9);  
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
     * Returns a count of the current number of repetitions of Collection Volume (OBR-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCollectionVolumeReps() {
        CQ[] ret = null;
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
     * OBR-9: "Collection Volume" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getCollectionVolume(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * OBR-9: "Collection Volume" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CQ getObr9_CollectionVolume(int rep) { 
        CQ ret = null;
        try {
            Type t = this.getField(9, rep);
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
     * Returns a count of the current number of repetitions of Collection Volume (OBR-9).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr9_CollectionVolumeReps() {
        CQ[] ret = null;
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
     * OBR-9: "Collection Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertCollectionVolume(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(9, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-9: "Collection Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ insertObr9_CollectionVolume(int rep) throws HL7Exception { 
        return (CQ) super.insertRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * OBR-9: "Collection Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeCollectionVolume(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(9, rep);
    }


    /**
     * Removes a repetition of
     * OBR-9: "Collection Volume" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CQ removeObr9_CollectionVolume(int rep) throws HL7Exception { 
        return (CQ) super.removeRepetition(9, rep);
    }



    /**
     * Returns all repetitions of Collector Identifier (OBR-10).
     */
    public XCN[] getCollectorIdentifier() {
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
     * Returns a count of the current number of repetitions of Collector Identifier (OBR-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCollectorIdentifierReps() {
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
     * OBR-10: "Collector Identifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getCollectorIdentifier(int rep) { 
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
     * OBR-10: "Collector Identifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getObr10_CollectorIdentifier(int rep) { 
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
     * Returns a count of the current number of repetitions of Collector Identifier (OBR-10).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr10_CollectorIdentifierReps() {
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
     * OBR-10: "Collector Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertCollectorIdentifier(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(10, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-10: "Collector Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertObr10_CollectorIdentifier(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * OBR-10: "Collector Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeCollectorIdentifier(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(10, rep);
    }


    /**
     * Removes a repetition of
     * OBR-10: "Collector Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeObr10_CollectorIdentifier(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(10, rep);
    }



    /**
     * Returns all repetitions of Specimen Action Code (OBR-11).
     */
    public ID[] getSpecimenActionCode() {
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
     * Returns a count of the current number of repetitions of Specimen Action Code (OBR-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSpecimenActionCodeReps() {
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
     * OBR-11: "Specimen Action Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getSpecimenActionCode(int rep) { 
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
     * OBR-11: "Specimen Action Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr11_SpecimenActionCode(int rep) { 
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
     * Returns a count of the current number of repetitions of Specimen Action Code (OBR-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr11_SpecimenActionCodeReps() {
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
     * OBR-11: "Specimen Action Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertSpecimenActionCode(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(11, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-11: "Specimen Action Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr11_SpecimenActionCode(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * OBR-11: "Specimen Action Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeSpecimenActionCode(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * OBR-11: "Specimen Action Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr11_SpecimenActionCode(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(11, rep);
    }



    /**
     * Returns all repetitions of Danger Code (OBR-12).
     */
    public CE[] getDangerCode() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(12);  
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
     * Returns a count of the current number of repetitions of Danger Code (OBR-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDangerCodeReps() {
        CE[] ret = null;
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
     * OBR-12: "Danger Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getDangerCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(12, rep);
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
     * OBR-12: "Danger Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr12_DangerCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(12, rep);
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
     * Returns a count of the current number of repetitions of Danger Code (OBR-12).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr12_DangerCodeReps() {
        CE[] ret = null;
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
     * OBR-12: "Danger Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertDangerCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(12, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-12: "Danger Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr12_DangerCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * OBR-12: "Danger Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeDangerCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(12, rep);
    }


    /**
     * Removes a repetition of
     * OBR-12: "Danger Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr12_DangerCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(12, rep);
    }



    /**
     * Returns all repetitions of Relevant Clinical Information (OBR-13).
     */
    public ST[] getRelevantClinicalInformation() {
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
     * Returns a count of the current number of repetitions of Relevant Clinical Information (OBR-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRelevantClinicalInformationReps() {
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
     * OBR-13: "Relevant Clinical Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getRelevantClinicalInformation(int rep) { 
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
     * OBR-13: "Relevant Clinical Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObr13_RelevantClinicalInformation(int rep) { 
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
     * Returns a count of the current number of repetitions of Relevant Clinical Information (OBR-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr13_RelevantClinicalInformationReps() {
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
     * OBR-13: "Relevant Clinical Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertRelevantClinicalInformation(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(13, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-13: "Relevant Clinical Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObr13_RelevantClinicalInformation(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * OBR-13: "Relevant Clinical Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeRelevantClinicalInformation(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * OBR-13: "Relevant Clinical Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObr13_RelevantClinicalInformation(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Specimen Received Date/Time (OBR-14).
     */
    public TS[] getSpecimenReceivedDateTime() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(14);  
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
     * Returns a count of the current number of repetitions of Specimen Received Date/Time (OBR-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSpecimenReceivedDateTimeReps() {
        TS[] ret = null;
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
     * OBR-14: "Specimen Received Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getSpecimenReceivedDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * OBR-14: "Specimen Received Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObr14_SpecimenReceivedDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * Returns a count of the current number of repetitions of Specimen Received Date/Time (OBR-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr14_SpecimenReceivedDateTimeReps() {
        TS[] ret = null;
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
     * OBR-14: "Specimen Received Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertSpecimenReceivedDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(14, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-14: "Specimen Received Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObr14_SpecimenReceivedDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * OBR-14: "Specimen Received Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeSpecimenReceivedDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * OBR-14: "Specimen Received Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObr14_SpecimenReceivedDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(14, rep);
    }



    /**
     * Returns all repetitions of Specimen Source (OBR-15).
     */
    public SPS[] getSpecimenSource() {
        SPS[] ret = null;
        try {
            Type[] t = this.getField(15);  
            ret = new SPS[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (SPS)t[i];
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
     * Returns a count of the current number of repetitions of Specimen Source (OBR-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSpecimenSourceReps() {
        SPS[] ret = null;
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
     * OBR-15: "Specimen Source" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public SPS getSpecimenSource(int rep) { 
        SPS ret = null;
        try {
            Type t = this.getField(15, rep);
            ret = (SPS)t;
        } catch (ClassCastException cce) {
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
     * OBR-15: "Specimen Source" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public SPS getObr15_SpecimenSource(int rep) { 
        SPS ret = null;
        try {
            Type t = this.getField(15, rep);
            ret = (SPS)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Specimen Source (OBR-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr15_SpecimenSourceReps() {
        SPS[] ret = null;
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
     * OBR-15: "Specimen Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SPS insertSpecimenSource(int rep) throws HL7Exception { 
        return (SPS) super.insertRepetition(15, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-15: "Specimen Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SPS insertObr15_SpecimenSource(int rep) throws HL7Exception { 
        return (SPS) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * OBR-15: "Specimen Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SPS removeSpecimenSource(int rep) throws HL7Exception { 
        return (SPS) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * OBR-15: "Specimen Source" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public SPS removeObr15_SpecimenSource(int rep) throws HL7Exception { 
        return (SPS) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Ordering Provider (OBR-16).
     */
    public XCN[] getOrderingProvider() {
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
     * Returns a count of the current number of repetitions of Ordering Provider (OBR-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderingProviderReps() {
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
     * OBR-16: "Ordering Provider" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOrderingProvider(int rep) { 
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
     * OBR-16: "Ordering Provider" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getObr16_OrderingProvider(int rep) { 
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
     * Returns a count of the current number of repetitions of Ordering Provider (OBR-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr16_OrderingProviderReps() {
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
     * OBR-16: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(16, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-16: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertObr16_OrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * OBR-16: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * OBR-16: "Ordering Provider" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeObr16_OrderingProvider(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(16, rep);
    }



    /**
     * Returns all repetitions of Order Callback Phone Number (OBR-17).
     */
    public XTN[] getOrderCallbackPhoneNumber() {
        XTN[] ret = null;
        try {
            Type[] t = this.getField(17);  
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
     * Returns a count of the current number of repetitions of Order Callback Phone Number (OBR-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOrderCallbackPhoneNumberReps() {
        XTN[] ret = null;
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
     * OBR-17: "Order Callback Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getOrderCallbackPhoneNumber(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(17, rep);
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
     * OBR-17: "Order Callback Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getObr17_OrderCallbackPhoneNumber(int rep) { 
        XTN ret = null;
        try {
            Type t = this.getField(17, rep);
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
     * Returns a count of the current number of repetitions of Order Callback Phone Number (OBR-17).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr17_OrderCallbackPhoneNumberReps() {
        XTN[] ret = null;
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
     * OBR-17: "Order Callback Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertOrderCallbackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(17, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-17: "Order Callback Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertObr17_OrderCallbackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * OBR-17: "Order Callback Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeOrderCallbackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(17, rep);
    }


    /**
     * Removes a repetition of
     * OBR-17: "Order Callback Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeObr17_OrderCallbackPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(17, rep);
    }



    /**
     * Returns all repetitions of Placer Field 1 (OBR-18).
     */
    public ST[] getPlacerField1() {
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
     * Returns a count of the current number of repetitions of Placer Field 1 (OBR-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPlacerField1Reps() {
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
     * OBR-18: "Placer Field 1" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getPlacerField1(int rep) { 
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
     * OBR-18: "Placer Field 1" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObr18_PlacerField1(int rep) { 
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
     * Returns a count of the current number of repetitions of Placer Field 1 (OBR-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr18_PlacerField1Reps() {
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
     * OBR-18: "Placer Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertPlacerField1(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(18, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-18: "Placer Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObr18_PlacerField1(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * OBR-18: "Placer Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removePlacerField1(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * OBR-18: "Placer Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObr18_PlacerField1(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(18, rep);
    }



    /**
     * Returns all repetitions of Placer Field 2 (OBR-19).
     */
    public ST[] getPlacerField2() {
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
     * Returns a count of the current number of repetitions of Placer Field 2 (OBR-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPlacerField2Reps() {
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
     * OBR-19: "Placer Field 2" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getPlacerField2(int rep) { 
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
     * OBR-19: "Placer Field 2" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObr19_PlacerField2(int rep) { 
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
     * Returns a count of the current number of repetitions of Placer Field 2 (OBR-19).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr19_PlacerField2Reps() {
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
     * OBR-19: "Placer Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertPlacerField2(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(19, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-19: "Placer Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObr19_PlacerField2(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * OBR-19: "Placer Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removePlacerField2(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(19, rep);
    }


    /**
     * Removes a repetition of
     * OBR-19: "Placer Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObr19_PlacerField2(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(19, rep);
    }



    /**
     * Returns all repetitions of Filler Field 1 (OBR-20).
     */
    public ST[] getFillerField1() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(20);  
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
     * Returns a count of the current number of repetitions of Filler Field 1 (OBR-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getFillerField1Reps() {
        ST[] ret = null;
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
     * OBR-20: "Filler Field 1" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getFillerField1(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(20, rep);
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
     * OBR-20: "Filler Field 1" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObr20_FillerField1(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(20, rep);
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
     * Returns a count of the current number of repetitions of Filler Field 1 (OBR-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr20_FillerField1Reps() {
        ST[] ret = null;
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
     * OBR-20: "Filler Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertFillerField1(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(20, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-20: "Filler Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObr20_FillerField1(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * OBR-20: "Filler Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeFillerField1(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * OBR-20: "Filler Field 1" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObr20_FillerField1(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(20, rep);
    }



    /**
     * Returns all repetitions of Filler Field 2 (OBR-21).
     */
    public ST[] getFillerField2() {
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
     * Returns a count of the current number of repetitions of Filler Field 2 (OBR-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getFillerField2Reps() {
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
     * OBR-21: "Filler Field 2" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getFillerField2(int rep) { 
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
     * OBR-21: "Filler Field 2" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getObr21_FillerField2(int rep) { 
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
     * Returns a count of the current number of repetitions of Filler Field 2 (OBR-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr21_FillerField2Reps() {
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
     * OBR-21: "Filler Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertFillerField2(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(21, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-21: "Filler Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertObr21_FillerField2(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * OBR-21: "Filler Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeFillerField2(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * OBR-21: "Filler Field 2" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeObr21_FillerField2(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(21, rep);
    }



    /**
     * Returns all repetitions of Results Rpt/Status Chng - Date/Time (OBR-22).
     */
    public TS[] getResultsRptStatusChngDateTime() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(22);  
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
     * Returns a count of the current number of repetitions of Results Rpt/Status Chng - Date/Time (OBR-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getResultsRptStatusChngDateTimeReps() {
        TS[] ret = null;
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
     * OBR-22: "Results Rpt/Status Chng - Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getResultsRptStatusChngDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(22, rep);
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
     * OBR-22: "Results Rpt/Status Chng - Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObr22_ResultsRptStatusChngDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(22, rep);
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
     * Returns a count of the current number of repetitions of Results Rpt/Status Chng - Date/Time (OBR-22).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr22_ResultsRptStatusChngDateTimeReps() {
        TS[] ret = null;
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
     * OBR-22: "Results Rpt/Status Chng - Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertResultsRptStatusChngDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(22, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-22: "Results Rpt/Status Chng - Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObr22_ResultsRptStatusChngDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * OBR-22: "Results Rpt/Status Chng - Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeResultsRptStatusChngDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(22, rep);
    }


    /**
     * Removes a repetition of
     * OBR-22: "Results Rpt/Status Chng - Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObr22_ResultsRptStatusChngDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(22, rep);
    }



    /**
     * Returns all repetitions of Charge to Practice (OBR-23).
     */
    public MOC[] getChargeToPractice() {
        MOC[] ret = null;
        try {
            Type[] t = this.getField(23);  
            ret = new MOC[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (MOC)t[i];
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
     * Returns a count of the current number of repetitions of Charge to Practice (OBR-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getChargeToPracticeReps() {
        MOC[] ret = null;
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
     * OBR-23: "Charge to Practice" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public MOC getChargeToPractice(int rep) { 
        MOC ret = null;
        try {
            Type t = this.getField(23, rep);
            ret = (MOC)t;
        } catch (ClassCastException cce) {
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
     * OBR-23: "Charge to Practice" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public MOC getObr23_ChargeToPractice(int rep) { 
        MOC ret = null;
        try {
            Type t = this.getField(23, rep);
            ret = (MOC)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Charge to Practice (OBR-23).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr23_ChargeToPracticeReps() {
        MOC[] ret = null;
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
     * OBR-23: "Charge to Practice" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public MOC insertChargeToPractice(int rep) throws HL7Exception { 
        return (MOC) super.insertRepetition(23, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-23: "Charge to Practice" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public MOC insertObr23_ChargeToPractice(int rep) throws HL7Exception { 
        return (MOC) super.insertRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * OBR-23: "Charge to Practice" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public MOC removeChargeToPractice(int rep) throws HL7Exception { 
        return (MOC) super.removeRepetition(23, rep);
    }


    /**
     * Removes a repetition of
     * OBR-23: "Charge to Practice" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public MOC removeObr23_ChargeToPractice(int rep) throws HL7Exception { 
        return (MOC) super.removeRepetition(23, rep);
    }



    /**
     * Returns all repetitions of Diagnostic Serv Sect ID (OBR-24).
     */
    public ID[] getDiagnosticServSectID() {
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
     * Returns a count of the current number of repetitions of Diagnostic Serv Sect ID (OBR-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDiagnosticServSectIDReps() {
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
     * OBR-24: "Diagnostic Serv Sect ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getDiagnosticServSectID(int rep) { 
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
     * OBR-24: "Diagnostic Serv Sect ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr24_DiagnosticServSectID(int rep) { 
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
     * Returns a count of the current number of repetitions of Diagnostic Serv Sect ID (OBR-24).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr24_DiagnosticServSectIDReps() {
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
     * OBR-24: "Diagnostic Serv Sect ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertDiagnosticServSectID(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(24, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-24: "Diagnostic Serv Sect ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr24_DiagnosticServSectID(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * OBR-24: "Diagnostic Serv Sect ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeDiagnosticServSectID(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(24, rep);
    }


    /**
     * Removes a repetition of
     * OBR-24: "Diagnostic Serv Sect ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr24_DiagnosticServSectID(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(24, rep);
    }



    /**
     * Returns all repetitions of Result Status (OBR-25).
     */
    public ID[] getResultStatus() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(25);  
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
     * Returns a count of the current number of repetitions of Result Status (OBR-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getResultStatusReps() {
        ID[] ret = null;
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
     * OBR-25: "Result Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getResultStatus(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(25, rep);
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
     * OBR-25: "Result Status" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr25_ResultStatus(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(25, rep);
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
     * Returns a count of the current number of repetitions of Result Status (OBR-25).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr25_ResultStatusReps() {
        ID[] ret = null;
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
     * OBR-25: "Result Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertResultStatus(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(25, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-25: "Result Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr25_ResultStatus(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * OBR-25: "Result Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeResultStatus(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(25, rep);
    }


    /**
     * Removes a repetition of
     * OBR-25: "Result Status" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr25_ResultStatus(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(25, rep);
    }



    /**
     * Returns all repetitions of Parent Result (OBR-26).
     */
    public PRL[] getParentResult() {
        PRL[] ret = null;
        try {
            Type[] t = this.getField(26);  
            ret = new PRL[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (PRL)t[i];
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
     * Returns a count of the current number of repetitions of Parent Result (OBR-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getParentResultReps() {
        PRL[] ret = null;
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
     * OBR-26: "Parent Result" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PRL getParentResult(int rep) { 
        PRL ret = null;
        try {
            Type t = this.getField(26, rep);
            ret = (PRL)t;
        } catch (ClassCastException cce) {
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
     * OBR-26: "Parent Result" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public PRL getObr26_ParentResult(int rep) { 
        PRL ret = null;
        try {
            Type t = this.getField(26, rep);
            ret = (PRL)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Parent Result (OBR-26).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr26_ParentResultReps() {
        PRL[] ret = null;
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
     * OBR-26: "Parent Result" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PRL insertParentResult(int rep) throws HL7Exception { 
        return (PRL) super.insertRepetition(26, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-26: "Parent Result" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PRL insertObr26_ParentResult(int rep) throws HL7Exception { 
        return (PRL) super.insertRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * OBR-26: "Parent Result" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PRL removeParentResult(int rep) throws HL7Exception { 
        return (PRL) super.removeRepetition(26, rep);
    }


    /**
     * Removes a repetition of
     * OBR-26: "Parent Result" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public PRL removeObr26_ParentResult(int rep) throws HL7Exception { 
        return (PRL) super.removeRepetition(26, rep);
    }



    /**
     * Returns all repetitions of Quantity/Timing (OBR-27).
     */
    public TQ[] getQuantityTiming() {
        TQ[] ret = null;
        try {
            Type[] t = this.getField(27);  
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
     * Returns a count of the current number of repetitions of Quantity/Timing (OBR-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getQuantityTimingReps() {
        TQ[] ret = null;
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
     * OBR-27: "Quantity/Timing" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TQ getQuantityTiming(int rep) { 
        TQ ret = null;
        try {
            Type t = this.getField(27, rep);
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
     * OBR-27: "Quantity/Timing" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TQ getObr27_QuantityTiming(int rep) { 
        TQ ret = null;
        try {
            Type t = this.getField(27, rep);
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
     * Returns a count of the current number of repetitions of Quantity/Timing (OBR-27).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr27_QuantityTimingReps() {
        TQ[] ret = null;
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
     * OBR-27: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ insertQuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.insertRepetition(27, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-27: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ insertObr27_QuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.insertRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * OBR-27: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ removeQuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.removeRepetition(27, rep);
    }


    /**
     * Removes a repetition of
     * OBR-27: "Quantity/Timing" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TQ removeObr27_QuantityTiming(int rep) throws HL7Exception { 
        return (TQ) super.removeRepetition(27, rep);
    }



    /**
     * Returns all repetitions of Result Copies To (OBR-28).
     */
    public XCN[] getResultCopiesTo() {
        XCN[] ret = null;
        try {
            Type[] t = this.getField(28);  
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
     * Returns a count of the current number of repetitions of Result Copies To (OBR-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getResultCopiesToReps() {
        XCN[] ret = null;
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
     * OBR-28: "Result Copies To" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getResultCopiesTo(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(28, rep);
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
     * OBR-28: "Result Copies To" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getObr28_ResultCopiesTo(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(28, rep);
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
     * Returns a count of the current number of repetitions of Result Copies To (OBR-28).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr28_ResultCopiesToReps() {
        XCN[] ret = null;
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
     * OBR-28: "Result Copies To" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertResultCopiesTo(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(28, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-28: "Result Copies To" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertObr28_ResultCopiesTo(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * OBR-28: "Result Copies To" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeResultCopiesTo(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(28, rep);
    }


    /**
     * Removes a repetition of
     * OBR-28: "Result Copies To" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeObr28_ResultCopiesTo(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(28, rep);
    }



    /**
     * Returns all repetitions of Parent (OBR-29).
     */
    public EIP[] getOBRParent() {
        EIP[] ret = null;
        try {
            Type[] t = this.getField(29);  
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
     * Returns a count of the current number of repetitions of Parent (OBR-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOBRParentReps() {
        EIP[] ret = null;
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
     * OBR-29: "Parent" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EIP getOBRParent(int rep) { 
        EIP ret = null;
        try {
            Type t = this.getField(29, rep);
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
     * OBR-29: "Parent" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EIP getObr29_Parent(int rep) { 
        EIP ret = null;
        try {
            Type t = this.getField(29, rep);
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
     * Returns a count of the current number of repetitions of Parent (OBR-29).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr29_ParentReps() {
        EIP[] ret = null;
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
     * OBR-29: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP insertOBRParent(int rep) throws HL7Exception { 
        return (EIP) super.insertRepetition(29, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-29: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP insertObr29_Parent(int rep) throws HL7Exception { 
        return (EIP) super.insertRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * OBR-29: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP removeOBRParent(int rep) throws HL7Exception { 
        return (EIP) super.removeRepetition(29, rep);
    }


    /**
     * Removes a repetition of
     * OBR-29: "Parent" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EIP removeObr29_Parent(int rep) throws HL7Exception { 
        return (EIP) super.removeRepetition(29, rep);
    }



    /**
     * Returns all repetitions of Transportation Mode (OBR-30).
     */
    public ID[] getTransportationMode() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(30);  
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
     * Returns a count of the current number of repetitions of Transportation Mode (OBR-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTransportationModeReps() {
        ID[] ret = null;
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
     * OBR-30: "Transportation Mode" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getTransportationMode(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(30, rep);
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
     * OBR-30: "Transportation Mode" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr30_TransportationMode(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(30, rep);
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
     * Returns a count of the current number of repetitions of Transportation Mode (OBR-30).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr30_TransportationModeReps() {
        ID[] ret = null;
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
     * OBR-30: "Transportation Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertTransportationMode(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(30, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-30: "Transportation Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr30_TransportationMode(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * OBR-30: "Transportation Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeTransportationMode(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(30, rep);
    }


    /**
     * Removes a repetition of
     * OBR-30: "Transportation Mode" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr30_TransportationMode(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(30, rep);
    }



    /**
     * Returns all repetitions of Reason for Study (OBR-31).
     */
    public CE[] getReasonForStudy() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(31);  
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
     * Returns a count of the current number of repetitions of Reason for Study (OBR-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getReasonForStudyReps() {
        CE[] ret = null;
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
     * OBR-31: "Reason for Study" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getReasonForStudy(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(31, rep);
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
     * OBR-31: "Reason for Study" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr31_ReasonForStudy(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(31, rep);
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
     * Returns a count of the current number of repetitions of Reason for Study (OBR-31).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr31_ReasonForStudyReps() {
        CE[] ret = null;
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
     * OBR-31: "Reason for Study" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertReasonForStudy(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(31, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-31: "Reason for Study" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr31_ReasonForStudy(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * OBR-31: "Reason for Study" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeReasonForStudy(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(31, rep);
    }


    /**
     * Removes a repetition of
     * OBR-31: "Reason for Study" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr31_ReasonForStudy(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(31, rep);
    }



    /**
     * Returns all repetitions of Principal Result Interpreter (OBR-32).
     */
    public NDL[] getPrincipalResultInterpreter() {
        NDL[] ret = null;
        try {
            Type[] t = this.getField(32);  
            ret = new NDL[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (NDL)t[i];
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
     * Returns a count of the current number of repetitions of Principal Result Interpreter (OBR-32).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPrincipalResultInterpreterReps() {
        NDL[] ret = null;
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
     * OBR-32: "Principal Result Interpreter" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getPrincipalResultInterpreter(int rep) { 
        NDL ret = null;
        try {
            Type t = this.getField(32, rep);
            ret = (NDL)t;
        } catch (ClassCastException cce) {
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
     * OBR-32: "Principal Result Interpreter" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getObr32_PrincipalResultInterpreter(int rep) { 
        NDL ret = null;
        try {
            Type t = this.getField(32, rep);
            ret = (NDL)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Principal Result Interpreter (OBR-32).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr32_PrincipalResultInterpreterReps() {
        NDL[] ret = null;
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
     * OBR-32: "Principal Result Interpreter" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertPrincipalResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(32, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-32: "Principal Result Interpreter" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertObr32_PrincipalResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(32, rep);
    }


    /**
     * Removes a repetition of
     * OBR-32: "Principal Result Interpreter" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removePrincipalResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(32, rep);
    }


    /**
     * Removes a repetition of
     * OBR-32: "Principal Result Interpreter" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeObr32_PrincipalResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(32, rep);
    }



    /**
     * Returns all repetitions of Assistant Result Interpreter (OBR-33).
     */
    public NDL[] getAssistantResultInterpreter() {
        NDL[] ret = null;
        try {
            Type[] t = this.getField(33);  
            ret = new NDL[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (NDL)t[i];
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
     * Returns a count of the current number of repetitions of Assistant Result Interpreter (OBR-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAssistantResultInterpreterReps() {
        NDL[] ret = null;
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
     * OBR-33: "Assistant Result Interpreter" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getAssistantResultInterpreter(int rep) { 
        NDL ret = null;
        try {
            Type t = this.getField(33, rep);
            ret = (NDL)t;
        } catch (ClassCastException cce) {
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
     * OBR-33: "Assistant Result Interpreter" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getObr33_AssistantResultInterpreter(int rep) { 
        NDL ret = null;
        try {
            Type t = this.getField(33, rep);
            ret = (NDL)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Assistant Result Interpreter (OBR-33).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr33_AssistantResultInterpreterReps() {
        NDL[] ret = null;
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
     * OBR-33: "Assistant Result Interpreter" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertAssistantResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(33, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-33: "Assistant Result Interpreter" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertObr33_AssistantResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * OBR-33: "Assistant Result Interpreter" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeAssistantResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(33, rep);
    }


    /**
     * Removes a repetition of
     * OBR-33: "Assistant Result Interpreter" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeObr33_AssistantResultInterpreter(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(33, rep);
    }



    /**
     * Returns all repetitions of Technician (OBR-34).
     */
    public NDL[] getTechnician() {
        NDL[] ret = null;
        try {
            Type[] t = this.getField(34);  
            ret = new NDL[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (NDL)t[i];
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
     * Returns a count of the current number of repetitions of Technician (OBR-34).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTechnicianReps() {
        NDL[] ret = null;
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
     * OBR-34: "Technician" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getTechnician(int rep) { 
        NDL ret = null;
        try {
            Type t = this.getField(34, rep);
            ret = (NDL)t;
        } catch (ClassCastException cce) {
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
     * OBR-34: "Technician" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getObr34_Technician(int rep) { 
        NDL ret = null;
        try {
            Type t = this.getField(34, rep);
            ret = (NDL)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Technician (OBR-34).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr34_TechnicianReps() {
        NDL[] ret = null;
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
     * OBR-34: "Technician" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertTechnician(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(34, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-34: "Technician" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertObr34_Technician(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(34, rep);
    }


    /**
     * Removes a repetition of
     * OBR-34: "Technician" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeTechnician(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(34, rep);
    }


    /**
     * Removes a repetition of
     * OBR-34: "Technician" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeObr34_Technician(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(34, rep);
    }



    /**
     * Returns all repetitions of Transcriptionist (OBR-35).
     */
    public NDL[] getTranscriptionist() {
        NDL[] ret = null;
        try {
            Type[] t = this.getField(35);  
            ret = new NDL[t.length];
            for (int i = 0; i < ret.length; i++) {
                ret[i] = (NDL)t[i];
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
     * Returns a count of the current number of repetitions of Transcriptionist (OBR-35).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTranscriptionistReps() {
        NDL[] ret = null;
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
     * OBR-35: "Transcriptionist" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getTranscriptionist(int rep) { 
        NDL ret = null;
        try {
            Type t = this.getField(35, rep);
            ret = (NDL)t;
        } catch (ClassCastException cce) {
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
     * OBR-35: "Transcriptionist" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NDL getObr35_Transcriptionist(int rep) { 
        NDL ret = null;
        try {
            Type t = this.getField(35, rep);
            ret = (NDL)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns a count of the current number of repetitions of Transcriptionist (OBR-35).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr35_TranscriptionistReps() {
        NDL[] ret = null;
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
     * OBR-35: "Transcriptionist" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertTranscriptionist(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(35, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-35: "Transcriptionist" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL insertObr35_Transcriptionist(int rep) throws HL7Exception { 
        return (NDL) super.insertRepetition(35, rep);
    }


    /**
     * Removes a repetition of
     * OBR-35: "Transcriptionist" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeTranscriptionist(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(35, rep);
    }


    /**
     * Removes a repetition of
     * OBR-35: "Transcriptionist" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NDL removeObr35_Transcriptionist(int rep) throws HL7Exception { 
        return (NDL) super.removeRepetition(35, rep);
    }



    /**
     * Returns all repetitions of Scheduled Date/Time (OBR-36).
     */
    public TS[] getScheduledDateTime() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(36);  
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
     * Returns a count of the current number of repetitions of Scheduled Date/Time (OBR-36).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getScheduledDateTimeReps() {
        TS[] ret = null;
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
     * OBR-36: "Scheduled Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getScheduledDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(36, rep);
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
     * OBR-36: "Scheduled Date/Time" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getObr36_ScheduledDateTime(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(36, rep);
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
     * Returns a count of the current number of repetitions of Scheduled Date/Time (OBR-36).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr36_ScheduledDateTimeReps() {
        TS[] ret = null;
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
     * OBR-36: "Scheduled Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertScheduledDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(36, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-36: "Scheduled Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertObr36_ScheduledDateTime(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(36, rep);
    }


    /**
     * Removes a repetition of
     * OBR-36: "Scheduled Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeScheduledDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(36, rep);
    }


    /**
     * Removes a repetition of
     * OBR-36: "Scheduled Date/Time" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeObr36_ScheduledDateTime(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(36, rep);
    }



    /**
     * Returns all repetitions of Number of Sample Containers * (OBR-37).
     */
    public NM[] getNumberOfSampleContainers() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(37);  
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
     * Returns a count of the current number of repetitions of Number of Sample Containers * (OBR-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getNumberOfSampleContainersReps() {
        NM[] ret = null;
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
     * OBR-37: "Number of Sample Containers *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getNumberOfSampleContainers(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(37, rep);
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
     * OBR-37: "Number of Sample Containers *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getObr37_NumberOfSampleContainers(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(37, rep);
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
     * Returns a count of the current number of repetitions of Number of Sample Containers * (OBR-37).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr37_NumberOfSampleContainersReps() {
        NM[] ret = null;
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
     * OBR-37: "Number of Sample Containers *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertNumberOfSampleContainers(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(37, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-37: "Number of Sample Containers *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertObr37_NumberOfSampleContainers(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * OBR-37: "Number of Sample Containers *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeNumberOfSampleContainers(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(37, rep);
    }


    /**
     * Removes a repetition of
     * OBR-37: "Number of Sample Containers *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeObr37_NumberOfSampleContainers(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(37, rep);
    }



    /**
     * Returns all repetitions of Transport Logistics of Collected Sample (OBR-38).
     */
    public CE[] getTransportLogisticsOfCollectedSample() {
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
     * Returns a count of the current number of repetitions of Transport Logistics of Collected Sample (OBR-38).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTransportLogisticsOfCollectedSampleReps() {
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
     * OBR-38: "Transport Logistics of Collected Sample" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getTransportLogisticsOfCollectedSample(int rep) { 
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
     * OBR-38: "Transport Logistics of Collected Sample" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr38_TransportLogisticsOfCollectedSample(int rep) { 
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
     * Returns a count of the current number of repetitions of Transport Logistics of Collected Sample (OBR-38).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr38_TransportLogisticsOfCollectedSampleReps() {
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
     * OBR-38: "Transport Logistics of Collected Sample" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertTransportLogisticsOfCollectedSample(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(38, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-38: "Transport Logistics of Collected Sample" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr38_TransportLogisticsOfCollectedSample(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(38, rep);
    }


    /**
     * Removes a repetition of
     * OBR-38: "Transport Logistics of Collected Sample" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeTransportLogisticsOfCollectedSample(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(38, rep);
    }


    /**
     * Removes a repetition of
     * OBR-38: "Transport Logistics of Collected Sample" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr38_TransportLogisticsOfCollectedSample(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(38, rep);
    }



    /**
     * Returns all repetitions of Collector's Comment * (OBR-39).
     */
    public CE[] getCollectorSComment() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(39);  
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
     * Returns a count of the current number of repetitions of Collector's Comment * (OBR-39).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCollectorSCommentReps() {
        CE[] ret = null;
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
     * OBR-39: "Collector's Comment *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getCollectorSComment(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(39, rep);
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
     * OBR-39: "Collector's Comment *" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr39_CollectorSComment(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(39, rep);
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
     * Returns a count of the current number of repetitions of Collector's Comment * (OBR-39).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr39_CollectorSCommentReps() {
        CE[] ret = null;
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
     * OBR-39: "Collector's Comment *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertCollectorSComment(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(39, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-39: "Collector's Comment *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr39_CollectorSComment(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(39, rep);
    }


    /**
     * Removes a repetition of
     * OBR-39: "Collector's Comment *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeCollectorSComment(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(39, rep);
    }


    /**
     * Removes a repetition of
     * OBR-39: "Collector's Comment *" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr39_CollectorSComment(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(39, rep);
    }



    /**
     * Returns all repetitions of Transport Arrangement Responsibility (OBR-40).
     */
    public CE[] getTransportArrangementResponsibility() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(40);  
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
     * Returns a count of the current number of repetitions of Transport Arrangement Responsibility (OBR-40).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTransportArrangementResponsibilityReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(40);
            return t.length;  
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
     * OBR-40: "Transport Arrangement Responsibility" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getTransportArrangementResponsibility(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(40, rep);
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
     * OBR-40: "Transport Arrangement Responsibility" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr40_TransportArrangementResponsibility(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(40, rep);
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
     * Returns a count of the current number of repetitions of Transport Arrangement Responsibility (OBR-40).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr40_TransportArrangementResponsibilityReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(40);
            return t.length;  
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
     * OBR-40: "Transport Arrangement Responsibility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertTransportArrangementResponsibility(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(40, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-40: "Transport Arrangement Responsibility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr40_TransportArrangementResponsibility(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(40, rep);
    }


    /**
     * Removes a repetition of
     * OBR-40: "Transport Arrangement Responsibility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeTransportArrangementResponsibility(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(40, rep);
    }


    /**
     * Removes a repetition of
     * OBR-40: "Transport Arrangement Responsibility" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr40_TransportArrangementResponsibility(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(40, rep);
    }



    /**
     * Returns all repetitions of Transport Arranged (OBR-41).
     */
    public ID[] getTransportArranged() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(41);  
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
     * Returns a count of the current number of repetitions of Transport Arranged (OBR-41).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getTransportArrangedReps() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(41);
            return t.length;  
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
     * OBR-41: "Transport Arranged" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getTransportArranged(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(41, rep);
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
     * OBR-41: "Transport Arranged" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr41_TransportArranged(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(41, rep);
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
     * Returns a count of the current number of repetitions of Transport Arranged (OBR-41).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr41_TransportArrangedReps() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(41);
            return t.length;  
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
     * OBR-41: "Transport Arranged" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertTransportArranged(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(41, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-41: "Transport Arranged" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr41_TransportArranged(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(41, rep);
    }


    /**
     * Removes a repetition of
     * OBR-41: "Transport Arranged" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeTransportArranged(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(41, rep);
    }


    /**
     * Removes a repetition of
     * OBR-41: "Transport Arranged" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr41_TransportArranged(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(41, rep);
    }



    /**
     * Returns all repetitions of Escort Required (OBR-42).
     */
    public ID[] getEscortRequired() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(42);  
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
     * Returns a count of the current number of repetitions of Escort Required (OBR-42).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEscortRequiredReps() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(42);
            return t.length;  
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
     * OBR-42: "Escort Required" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getEscortRequired(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(42, rep);
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
     * OBR-42: "Escort Required" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getObr42_EscortRequired(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(42, rep);
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
     * Returns a count of the current number of repetitions of Escort Required (OBR-42).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr42_EscortRequiredReps() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(42);
            return t.length;  
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
     * OBR-42: "Escort Required" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertEscortRequired(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(42, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-42: "Escort Required" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertObr42_EscortRequired(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(42, rep);
    }


    /**
     * Removes a repetition of
     * OBR-42: "Escort Required" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeEscortRequired(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(42, rep);
    }


    /**
     * Removes a repetition of
     * OBR-42: "Escort Required" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeObr42_EscortRequired(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(42, rep);
    }



    /**
     * Returns all repetitions of Planned Patient Transport Comment (OBR-43).
     */
    public CE[] getPlannedPatientTransportComment() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(43);  
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
     * Returns a count of the current number of repetitions of Planned Patient Transport Comment (OBR-43).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPlannedPatientTransportCommentReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(43);
            return t.length;  
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
     * OBR-43: "Planned Patient Transport Comment" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPlannedPatientTransportComment(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(43, rep);
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
     * OBR-43: "Planned Patient Transport Comment" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr43_PlannedPatientTransportComment(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(43, rep);
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
     * Returns a count of the current number of repetitions of Planned Patient Transport Comment (OBR-43).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr43_PlannedPatientTransportCommentReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(43);
            return t.length;  
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
     * OBR-43: "Planned Patient Transport Comment" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPlannedPatientTransportComment(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(43, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-43: "Planned Patient Transport Comment" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr43_PlannedPatientTransportComment(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(43, rep);
    }


    /**
     * Removes a repetition of
     * OBR-43: "Planned Patient Transport Comment" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePlannedPatientTransportComment(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(43, rep);
    }


    /**
     * Removes a repetition of
     * OBR-43: "Planned Patient Transport Comment" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr43_PlannedPatientTransportComment(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(43, rep);
    }



    /**
     * Returns all repetitions of Procedure Code (OBR-44).
     */
    public CE[] getProcedureCode() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(44);  
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
     * Returns a count of the current number of repetitions of Procedure Code (OBR-44).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProcedureCodeReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(44);
            return t.length;  
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
     * OBR-44: "Procedure Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getProcedureCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(44, rep);
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
     * OBR-44: "Procedure Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr44_ProcedureCode(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(44, rep);
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
     * Returns a count of the current number of repetitions of Procedure Code (OBR-44).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr44_ProcedureCodeReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(44);
            return t.length;  
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
     * OBR-44: "Procedure Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertProcedureCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(44, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-44: "Procedure Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr44_ProcedureCode(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(44, rep);
    }


    /**
     * Removes a repetition of
     * OBR-44: "Procedure Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeProcedureCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(44, rep);
    }


    /**
     * Removes a repetition of
     * OBR-44: "Procedure Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr44_ProcedureCode(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(44, rep);
    }



    /**
     * Returns all repetitions of Procedure Code Modifier (OBR-45).
     */
    public CE[] getProcedureCodeModifier() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(45);  
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
     * Returns a count of the current number of repetitions of Procedure Code Modifier (OBR-45).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getProcedureCodeModifierReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(45);
            return t.length;  
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
     * OBR-45: "Procedure Code Modifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getProcedureCodeModifier(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(45, rep);
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
     * OBR-45: "Procedure Code Modifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr45_ProcedureCodeModifier(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(45, rep);
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
     * Returns a count of the current number of repetitions of Procedure Code Modifier (OBR-45).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr45_ProcedureCodeModifierReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(45);
            return t.length;  
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
     * OBR-45: "Procedure Code Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertProcedureCodeModifier(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(45, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-45: "Procedure Code Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr45_ProcedureCodeModifier(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(45, rep);
    }


    /**
     * Removes a repetition of
     * OBR-45: "Procedure Code Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeProcedureCodeModifier(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(45, rep);
    }


    /**
     * Removes a repetition of
     * OBR-45: "Procedure Code Modifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr45_ProcedureCodeModifier(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(45, rep);
    }



    /**
     * Returns all repetitions of Placer Supplemental Service Information (OBR-46).
     */
    public CE[] getPlacerSupplementalServiceInformation() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(46);  
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
     * Returns a count of the current number of repetitions of Placer Supplemental Service Information (OBR-46).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getPlacerSupplementalServiceInformationReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(46);
            return t.length;  
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
     * OBR-46: "Placer Supplemental Service Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getPlacerSupplementalServiceInformation(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(46, rep);
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
     * OBR-46: "Placer Supplemental Service Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr46_PlacerSupplementalServiceInformation(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(46, rep);
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
     * Returns a count of the current number of repetitions of Placer Supplemental Service Information (OBR-46).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr46_PlacerSupplementalServiceInformationReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(46);
            return t.length;  
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
     * OBR-46: "Placer Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertPlacerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(46, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-46: "Placer Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr46_PlacerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(46, rep);
    }


    /**
     * Removes a repetition of
     * OBR-46: "Placer Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removePlacerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(46, rep);
    }


    /**
     * Removes a repetition of
     * OBR-46: "Placer Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr46_PlacerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(46, rep);
    }



    /**
     * Returns all repetitions of Filler Supplemental Service Information (OBR-47).
     */
    public CE[] getFillerSupplementalServiceInformation() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(47);  
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
     * Returns a count of the current number of repetitions of Filler Supplemental Service Information (OBR-47).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getFillerSupplementalServiceInformationReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(47);
            return t.length;  
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
     * OBR-47: "Filler Supplemental Service Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getFillerSupplementalServiceInformation(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(47, rep);
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
     * OBR-47: "Filler Supplemental Service Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CE getObr47_FillerSupplementalServiceInformation(int rep) { 
        CE ret = null;
        try {
            Type t = this.getField(47, rep);
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
     * Returns a count of the current number of repetitions of Filler Supplemental Service Information (OBR-47).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr47_FillerSupplementalServiceInformationReps() {
        CE[] ret = null;
        try {
            Type[] t = this.getField(47);
            return t.length;  
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
     * OBR-47: "Filler Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertFillerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(47, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-47: "Filler Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE insertObr47_FillerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.insertRepetition(47, rep);
    }


    /**
     * Removes a repetition of
     * OBR-47: "Filler Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeFillerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(47, rep);
    }


    /**
     * Removes a repetition of
     * OBR-47: "Filler Supplemental Service Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CE removeObr47_FillerSupplementalServiceInformation(int rep) throws HL7Exception { 
        return (CE) super.removeRepetition(47, rep);
    }



    /**
     * Returns all repetitions of Medically Necessary Duplicate Procedure Reason. (OBR-48).
     */
    public CWE[] getMedicallyNecessaryDuplicateProcedureReason() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(48);  
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
     * Returns a count of the current number of repetitions of Medically Necessary Duplicate Procedure Reason. (OBR-48).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMedicallyNecessaryDuplicateProcedureReasonReps() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(48);
            return t.length;  
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
     * OBR-48: "Medically Necessary Duplicate Procedure Reason." - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getMedicallyNecessaryDuplicateProcedureReason(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(48, rep);
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
     * OBR-48: "Medically Necessary Duplicate Procedure Reason." - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public CWE getObr48_MedicallyNecessaryDuplicateProcedureReason(int rep) { 
        CWE ret = null;
        try {
            Type t = this.getField(48, rep);
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
     * Returns a count of the current number of repetitions of Medically Necessary Duplicate Procedure Reason. (OBR-48).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr48_MedicallyNecessaryDuplicateProcedureReasonReps() {
        CWE[] ret = null;
        try {
            Type[] t = this.getField(48);
            return t.length;  
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
     * OBR-48: "Medically Necessary Duplicate Procedure Reason." at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertMedicallyNecessaryDuplicateProcedureReason(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(48, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-48: "Medically Necessary Duplicate Procedure Reason." at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE insertObr48_MedicallyNecessaryDuplicateProcedureReason(int rep) throws HL7Exception { 
        return (CWE) super.insertRepetition(48, rep);
    }


    /**
     * Removes a repetition of
     * OBR-48: "Medically Necessary Duplicate Procedure Reason." at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeMedicallyNecessaryDuplicateProcedureReason(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(48, rep);
    }


    /**
     * Removes a repetition of
     * OBR-48: "Medically Necessary Duplicate Procedure Reason." at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public CWE removeObr48_MedicallyNecessaryDuplicateProcedureReason(int rep) throws HL7Exception { 
        return (CWE) super.removeRepetition(48, rep);
    }



    /**
     * Returns all repetitions of Result Handling (OBR-49).
     */
    public IS[] getResultHandling() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(49);  
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
     * Returns a count of the current number of repetitions of Result Handling (OBR-49).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getResultHandlingReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(49);
            return t.length;  
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
     * OBR-49: "Result Handling" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getResultHandling(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(49, rep);
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
     * OBR-49: "Result Handling" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getObr49_ResultHandling(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(49, rep);
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
     * Returns a count of the current number of repetitions of Result Handling (OBR-49).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getObr49_ResultHandlingReps() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(49);
            return t.length;  
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
     * OBR-49: "Result Handling" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertResultHandling(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(49, rep);
    }



    /**
     * Inserts a repetition of
     * OBR-49: "Result Handling" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertObr49_ResultHandling(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(49, rep);
    }


    /**
     * Removes a repetition of
     * OBR-49: "Result Handling" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeResultHandling(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(49, rep);
    }


    /**
     * Removes a repetition of
     * OBR-49: "Result Handling" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeObr49_ResultHandling(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(49, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new SI(getMessage());
          case 1: return new EI(getMessage());
          case 2: return new EI(getMessage());
          case 3: return new CE(getMessage());
          case 4: return new ID(getMessage(), new Integer( 0 ));
          case 5: return new TS(getMessage());
          case 6: return new TS(getMessage());
          case 7: return new TS(getMessage());
          case 8: return new CQ(getMessage());
          case 9: return new XCN(getMessage());
          case 10: return new ID(getMessage(), new Integer( 65 ));
          case 11: return new CE(getMessage());
          case 12: return new ST(getMessage());
          case 13: return new TS(getMessage());
          case 14: return new SPS(getMessage());
          case 15: return new XCN(getMessage());
          case 16: return new XTN(getMessage());
          case 17: return new ST(getMessage());
          case 18: return new ST(getMessage());
          case 19: return new ST(getMessage());
          case 20: return new ST(getMessage());
          case 21: return new TS(getMessage());
          case 22: return new MOC(getMessage());
          case 23: return new ID(getMessage(), new Integer( 74 ));
          case 24: return new ID(getMessage(), new Integer( 123 ));
          case 25: return new PRL(getMessage());
          case 26: return new TQ(getMessage());
          case 27: return new XCN(getMessage());
          case 28: return new EIP(getMessage());
          case 29: return new ID(getMessage(), new Integer( 124 ));
          case 30: return new CE(getMessage());
          case 31: return new NDL(getMessage());
          case 32: return new NDL(getMessage());
          case 33: return new NDL(getMessage());
          case 34: return new NDL(getMessage());
          case 35: return new TS(getMessage());
          case 36: return new NM(getMessage());
          case 37: return new CE(getMessage());
          case 38: return new CE(getMessage());
          case 39: return new CE(getMessage());
          case 40: return new ID(getMessage(), new Integer( 224 ));
          case 41: return new ID(getMessage(), new Integer( 225 ));
          case 42: return new CE(getMessage());
          case 43: return new CE(getMessage());
          case 44: return new CE(getMessage());
          case 45: return new CE(getMessage());
          case 46: return new CE(getMessage());
          case 47: return new CWE(getMessage());
          case 48: return new IS(getMessage(), new Integer( 507 ));
          default: return null;
       }
   }


}


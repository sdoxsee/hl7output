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
 *<p>Represents an HL7 MSH message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>MSH-1: Field Separator (ST) <b>optional </b>
     * <li>MSH-2: Encoding Characters (ST) <b>optional </b>
     * <li>MSH-3: Sending Application (HD) <b>optional </b>
     * <li>MSH-4: Sending Facility (HD) <b>optional </b>
     * <li>MSH-5: Receiving Application (HD) <b>optional </b>
     * <li>MSH-6: Receiving Facility (HD) <b>optional </b>
     * <li>MSH-7: Date/Time Of Message (TS) <b>optional </b>
     * <li>MSH-8: Security (ST) <b>optional repeating</b>
     * <li>MSH-9: Message Type (MSG) <b>optional </b>
     * <li>MSH-10: Message Control ID (ST) <b>optional </b>
     * <li>MSH-11: Processing ID (PT) <b>optional </b>
     * <li>MSH-12: Version ID (VID) <b>optional </b>
     * <li>MSH-13: Sequence Number (NM) <b>optional repeating</b>
     * <li>MSH-14: Continuation Pointer (ST) <b>optional repeating</b>
     * <li>MSH-15: Accept Acknowledgment Type (ID) <b>optional repeating</b>
     * <li>MSH-16: Application Acknowledgment Type (ID) <b>optional repeating</b>
     * <li>MSH-17: Country Code (ID) <b>optional </b>
     * <li>MSH-18: Character Set (ID) <b>optional repeating</b>
     * <li>MSH-19: Principal Language Of Message (CE) <b>optional </b>
     * <li>MSH-20: Alternate Character Set Handling Scheme (ID) <b>optional </b>
     * <li>MSH-21: Message Profile Identifier (EI) <b>optional repeating</b>
 * </ul>
 */
public class MSH extends AbstractSegment {

    /** 
     * Creates a new MSH segment
     */
    public MSH(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(ST.class, false, 1, 1, new Object[]{ getMessage(), new Integer(0) }, "Field Separator");
                                  this.add(ST.class, false, 1, 4, new Object[]{ getMessage(), new Integer(0) }, "Encoding Characters");
                                  this.add(HD.class, false, 1, 227, new Object[]{ getMessage(), new Integer(361) }, "Sending Application");
                                  this.add(HD.class, false, 1, 227, new Object[]{ getMessage(), new Integer(362) }, "Sending Facility");
                                  this.add(HD.class, false, 1, 227, new Object[]{ getMessage(), new Integer(361) }, "Receiving Application");
                                  this.add(HD.class, false, 1, 227, new Object[]{ getMessage(), new Integer(362) }, "Receiving Facility");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage(), new Integer(0) }, "Date/Time Of Message");
                                  this.add(ST.class, false, 0, 40, new Object[]{ getMessage(), new Integer(0) }, "Security");
                                  this.add(MSG.class, false, 1, 15, new Object[]{ getMessage(), new Integer(0) }, "Message Type");
                                  this.add(ST.class, false, 1, 20, new Object[]{ getMessage(), new Integer(0) }, "Message Control ID");
                                  this.add(PT.class, false, 1, 3, new Object[]{ getMessage(), new Integer(0) }, "Processing ID");
                                  this.add(VID.class, false, 1, 973, new Object[]{ getMessage(), new Integer(0) }, "Version ID");
                                  this.add(NM.class, false, 0, 15, new Object[]{ getMessage(), new Integer(0) }, "Sequence Number");
                                  this.add(ST.class, false, 0, 180, new Object[]{ getMessage(), new Integer(0) }, "Continuation Pointer");
                                  this.add(ID.class, false, 0, 2, new Object[]{ getMessage() }, "Accept Acknowledgment Type");
                                  this.add(ID.class, false, 0, 2, new Object[]{ getMessage() }, "Application Acknowledgment Type");
                                  this.add(ID.class, false, 1, 3, new Object[]{ getMessage() }, "Country Code");
                                  this.add(ID.class, false, -1, 16, new Object[]{ getMessage() }, "Character Set");
                                  this.add(CE.class, false, 1, 483, new Object[]{ getMessage(), new Integer(0) }, "Principal Language Of Message");
                                  this.add(ID.class, false, 1, 20, new Object[]{ getMessage() }, "Alternate Character Set Handling Scheme");
                                  this.add(EI.class, false, -1, 427, new Object[]{ getMessage(), new Integer(0) }, "Message Profile Identifier");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating MSH - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * MSH-1: "Field Separator" - creates it if necessary
     */
    public ST getFieldSeparator() { 
        ST ret = null;
        try {
            Type t = this.getField(1, 0);
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
     * MSH-1: "Field Separator" - creates it if necessary
     */
    public ST getMsh1_FieldSeparator() { 
        ST ret = null;
        try {
            Type t = this.getField(1, 0);
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
     * MSH-2: "Encoding Characters" - creates it if necessary
     */
    public ST getEncodingCharacters() { 
        ST ret = null;
        try {
            Type t = this.getField(2, 0);
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
     * MSH-2: "Encoding Characters" - creates it if necessary
     */
    public ST getMsh2_EncodingCharacters() { 
        ST ret = null;
        try {
            Type t = this.getField(2, 0);
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
     * MSH-3: "Sending Application" - creates it if necessary
     */
    public HD getSendingApplication() { 
        HD ret = null;
        try {
            Type t = this.getField(3, 0);
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
     * Returns
     * MSH-3: "Sending Application" - creates it if necessary
     */
    public HD getMsh3_SendingApplication() { 
        HD ret = null;
        try {
            Type t = this.getField(3, 0);
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
     * Returns
     * MSH-4: "Sending Facility" - creates it if necessary
     */
    public HD getSendingFacility() { 
        HD ret = null;
        try {
            Type t = this.getField(4, 0);
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
     * Returns
     * MSH-4: "Sending Facility" - creates it if necessary
     */
    public HD getMsh4_SendingFacility() { 
        HD ret = null;
        try {
            Type t = this.getField(4, 0);
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
     * Returns
     * MSH-5: "Receiving Application" - creates it if necessary
     */
    public HD getReceivingApplication() { 
        HD ret = null;
        try {
            Type t = this.getField(5, 0);
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
     * Returns
     * MSH-5: "Receiving Application" - creates it if necessary
     */
    public HD getMsh5_ReceivingApplication() { 
        HD ret = null;
        try {
            Type t = this.getField(5, 0);
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
     * Returns
     * MSH-6: "Receiving Facility" - creates it if necessary
     */
    public HD getReceivingFacility() { 
        HD ret = null;
        try {
            Type t = this.getField(6, 0);
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
     * Returns
     * MSH-6: "Receiving Facility" - creates it if necessary
     */
    public HD getMsh6_ReceivingFacility() { 
        HD ret = null;
        try {
            Type t = this.getField(6, 0);
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
     * Returns
     * MSH-7: "Date/Time Of Message" - creates it if necessary
     */
    public TS getDateTimeOfMessage() { 
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
     * MSH-7: "Date/Time Of Message" - creates it if necessary
     */
    public TS getMsh7_DateTimeOfMessage() { 
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
     * Returns all repetitions of Security (MSH-8).
     */
    public ST[] getSecurity() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(8);  
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
     * Returns a count of the current number of repetitions of Security (MSH-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSecurityReps() {
        ST[] ret = null;
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
     * MSH-8: "Security" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getSecurity(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(8, rep);
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
     * MSH-8: "Security" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getMsh8_Security(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(8, rep);
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
     * Returns a count of the current number of repetitions of Security (MSH-8).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMsh8_SecurityReps() {
        ST[] ret = null;
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
     * MSH-8: "Security" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertSecurity(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(8, rep);
    }



    /**
     * Inserts a repetition of
     * MSH-8: "Security" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertMsh8_Security(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * MSH-8: "Security" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeSecurity(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(8, rep);
    }


    /**
     * Removes a repetition of
     * MSH-8: "Security" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeMsh8_Security(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(8, rep);
    }




    /**
     * Returns
     * MSH-9: "Message Type" - creates it if necessary
     */
    public MSG getMessageType() { 
        MSG ret = null;
        try {
            Type t = this.getField(9, 0);
            ret = (MSG)t;
        } catch (ClassCastException cce) {
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
     * MSH-9: "Message Type" - creates it if necessary
     */
    public MSG getMsh9_MessageType() { 
        MSG ret = null;
        try {
            Type t = this.getField(9, 0);
            ret = (MSG)t;
        } catch (ClassCastException cce) {
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
     * MSH-10: "Message Control ID" - creates it if necessary
     */
    public ST getMessageControlID() { 
        ST ret = null;
        try {
            Type t = this.getField(10, 0);
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
     * MSH-10: "Message Control ID" - creates it if necessary
     */
    public ST getMsh10_MessageControlID() { 
        ST ret = null;
        try {
            Type t = this.getField(10, 0);
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
     * MSH-11: "Processing ID" - creates it if necessary
     */
    public PT getProcessingID() { 
        PT ret = null;
        try {
            Type t = this.getField(11, 0);
            ret = (PT)t;
        } catch (ClassCastException cce) {
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
     * MSH-11: "Processing ID" - creates it if necessary
     */
    public PT getMsh11_ProcessingID() { 
        PT ret = null;
        try {
            Type t = this.getField(11, 0);
            ret = (PT)t;
        } catch (ClassCastException cce) {
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
     * MSH-12: "Version ID" - creates it if necessary
     */
    public VID getVersionID() { 
        VID ret = null;
        try {
            Type t = this.getField(12, 0);
            ret = (VID)t;
        } catch (ClassCastException cce) {
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
     * MSH-12: "Version ID" - creates it if necessary
     */
    public VID getMsh12_VersionID() { 
        VID ret = null;
        try {
            Type t = this.getField(12, 0);
            ret = (VID)t;
        } catch (ClassCastException cce) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", cce);
            throw new RuntimeException(cce);
        } catch (HL7Exception he) {
            HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected problem obtaining field value.  This is a bug.", he);
            throw new RuntimeException(he);
        }
        return ret;
    }


    /**
     * Returns all repetitions of Sequence Number (MSH-13).
     */
    public NM[] getSequenceNumber() {
        NM[] ret = null;
        try {
            Type[] t = this.getField(13);  
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
     * Returns a count of the current number of repetitions of Sequence Number (MSH-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSequenceNumberReps() {
        NM[] ret = null;
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
     * MSH-13: "Sequence Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getSequenceNumber(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(13, rep);
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
     * MSH-13: "Sequence Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public NM getMsh13_SequenceNumber(int rep) { 
        NM ret = null;
        try {
            Type t = this.getField(13, rep);
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
     * Returns a count of the current number of repetitions of Sequence Number (MSH-13).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMsh13_SequenceNumberReps() {
        NM[] ret = null;
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
     * MSH-13: "Sequence Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertSequenceNumber(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(13, rep);
    }



    /**
     * Inserts a repetition of
     * MSH-13: "Sequence Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM insertMsh13_SequenceNumber(int rep) throws HL7Exception { 
        return (NM) super.insertRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * MSH-13: "Sequence Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeSequenceNumber(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(13, rep);
    }


    /**
     * Removes a repetition of
     * MSH-13: "Sequence Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public NM removeMsh13_SequenceNumber(int rep) throws HL7Exception { 
        return (NM) super.removeRepetition(13, rep);
    }



    /**
     * Returns all repetitions of Continuation Pointer (MSH-14).
     */
    public ST[] getContinuationPointer() {
        ST[] ret = null;
        try {
            Type[] t = this.getField(14);  
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
     * Returns a count of the current number of repetitions of Continuation Pointer (MSH-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getContinuationPointerReps() {
        ST[] ret = null;
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
     * MSH-14: "Continuation Pointer" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getContinuationPointer(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * MSH-14: "Continuation Pointer" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ST getMsh14_ContinuationPointer(int rep) { 
        ST ret = null;
        try {
            Type t = this.getField(14, rep);
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
     * Returns a count of the current number of repetitions of Continuation Pointer (MSH-14).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMsh14_ContinuationPointerReps() {
        ST[] ret = null;
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
     * MSH-14: "Continuation Pointer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertContinuationPointer(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(14, rep);
    }



    /**
     * Inserts a repetition of
     * MSH-14: "Continuation Pointer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST insertMsh14_ContinuationPointer(int rep) throws HL7Exception { 
        return (ST) super.insertRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * MSH-14: "Continuation Pointer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeContinuationPointer(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(14, rep);
    }


    /**
     * Removes a repetition of
     * MSH-14: "Continuation Pointer" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ST removeMsh14_ContinuationPointer(int rep) throws HL7Exception { 
        return (ST) super.removeRepetition(14, rep);
    }



    /**
     * Returns all repetitions of Accept Acknowledgment Type (MSH-15).
     */
    public ID[] getAcceptAcknowledgmentType() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(15);  
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
     * Returns a count of the current number of repetitions of Accept Acknowledgment Type (MSH-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getAcceptAcknowledgmentTypeReps() {
        ID[] ret = null;
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
     * MSH-15: "Accept Acknowledgment Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getAcceptAcknowledgmentType(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(15, rep);
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
     * MSH-15: "Accept Acknowledgment Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getMsh15_AcceptAcknowledgmentType(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(15, rep);
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
     * Returns a count of the current number of repetitions of Accept Acknowledgment Type (MSH-15).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMsh15_AcceptAcknowledgmentTypeReps() {
        ID[] ret = null;
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
     * MSH-15: "Accept Acknowledgment Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertAcceptAcknowledgmentType(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(15, rep);
    }



    /**
     * Inserts a repetition of
     * MSH-15: "Accept Acknowledgment Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertMsh15_AcceptAcknowledgmentType(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * MSH-15: "Accept Acknowledgment Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeAcceptAcknowledgmentType(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(15, rep);
    }


    /**
     * Removes a repetition of
     * MSH-15: "Accept Acknowledgment Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeMsh15_AcceptAcknowledgmentType(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(15, rep);
    }



    /**
     * Returns all repetitions of Application Acknowledgment Type (MSH-16).
     */
    public ID[] getApplicationAcknowledgmentType() {
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
     * Returns a count of the current number of repetitions of Application Acknowledgment Type (MSH-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getApplicationAcknowledgmentTypeReps() {
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
     * MSH-16: "Application Acknowledgment Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getApplicationAcknowledgmentType(int rep) { 
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
     * MSH-16: "Application Acknowledgment Type" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getMsh16_ApplicationAcknowledgmentType(int rep) { 
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
     * Returns a count of the current number of repetitions of Application Acknowledgment Type (MSH-16).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMsh16_ApplicationAcknowledgmentTypeReps() {
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
     * MSH-16: "Application Acknowledgment Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertApplicationAcknowledgmentType(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(16, rep);
    }



    /**
     * Inserts a repetition of
     * MSH-16: "Application Acknowledgment Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertMsh16_ApplicationAcknowledgmentType(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * MSH-16: "Application Acknowledgment Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeApplicationAcknowledgmentType(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(16, rep);
    }


    /**
     * Removes a repetition of
     * MSH-16: "Application Acknowledgment Type" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeMsh16_ApplicationAcknowledgmentType(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(16, rep);
    }




    /**
     * Returns
     * MSH-17: "Country Code" - creates it if necessary
     */
    public ID getCountryCode() { 
        ID ret = null;
        try {
            Type t = this.getField(17, 0);
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
     * MSH-17: "Country Code" - creates it if necessary
     */
    public ID getMsh17_CountryCode() { 
        ID ret = null;
        try {
            Type t = this.getField(17, 0);
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
     * Returns all repetitions of Character Set (MSH-18).
     */
    public ID[] getCharacterSet() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(18);  
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
     * Returns a count of the current number of repetitions of Character Set (MSH-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getCharacterSetReps() {
        ID[] ret = null;
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
     * MSH-18: "Character Set" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getCharacterSet(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(18, rep);
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
     * MSH-18: "Character Set" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getMsh18_CharacterSet(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(18, rep);
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
     * Returns a count of the current number of repetitions of Character Set (MSH-18).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMsh18_CharacterSetReps() {
        ID[] ret = null;
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
     * MSH-18: "Character Set" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertCharacterSet(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(18, rep);
    }



    /**
     * Inserts a repetition of
     * MSH-18: "Character Set" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertMsh18_CharacterSet(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * MSH-18: "Character Set" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeCharacterSet(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(18, rep);
    }


    /**
     * Removes a repetition of
     * MSH-18: "Character Set" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeMsh18_CharacterSet(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(18, rep);
    }




    /**
     * Returns
     * MSH-19: "Principal Language Of Message" - creates it if necessary
     */
    public CE getPrincipalLanguageOfMessage() { 
        CE ret = null;
        try {
            Type t = this.getField(19, 0);
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
     * MSH-19: "Principal Language Of Message" - creates it if necessary
     */
    public CE getMsh19_PrincipalLanguageOfMessage() { 
        CE ret = null;
        try {
            Type t = this.getField(19, 0);
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
     * MSH-20: "Alternate Character Set Handling Scheme" - creates it if necessary
     */
    public ID getAlternateCharacterSetHandlingScheme() { 
        ID ret = null;
        try {
            Type t = this.getField(20, 0);
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
     * MSH-20: "Alternate Character Set Handling Scheme" - creates it if necessary
     */
    public ID getMsh20_AlternateCharacterSetHandlingScheme() { 
        ID ret = null;
        try {
            Type t = this.getField(20, 0);
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
     * Returns all repetitions of Message Profile Identifier (MSH-21).
     */
    public EI[] getMessageProfileIdentifier() {
        EI[] ret = null;
        try {
            Type[] t = this.getField(21);  
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
     * Returns a count of the current number of repetitions of Message Profile Identifier (MSH-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMessageProfileIdentifierReps() {
        EI[] ret = null;
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
     * MSH-21: "Message Profile Identifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getMessageProfileIdentifier(int rep) { 
        EI ret = null;
        try {
            Type t = this.getField(21, rep);
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
     * MSH-21: "Message Profile Identifier" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public EI getMsh21_MessageProfileIdentifier(int rep) { 
        EI ret = null;
        try {
            Type t = this.getField(21, rep);
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
     * Returns a count of the current number of repetitions of Message Profile Identifier (MSH-21).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getMsh21_MessageProfileIdentifierReps() {
        EI[] ret = null;
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
     * MSH-21: "Message Profile Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertMessageProfileIdentifier(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(21, rep);
    }



    /**
     * Inserts a repetition of
     * MSH-21: "Message Profile Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI insertMsh21_MessageProfileIdentifier(int rep) throws HL7Exception { 
        return (EI) super.insertRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * MSH-21: "Message Profile Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeMessageProfileIdentifier(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(21, rep);
    }


    /**
     * Removes a repetition of
     * MSH-21: "Message Profile Identifier" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public EI removeMsh21_MessageProfileIdentifier(int rep) throws HL7Exception { 
        return (EI) super.removeRepetition(21, rep);
    }






    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new ST(getMessage());
          case 1: return new ST(getMessage());
          case 2: return new HD(getMessage());
          case 3: return new HD(getMessage());
          case 4: return new HD(getMessage());
          case 5: return new HD(getMessage());
          case 6: return new TS(getMessage());
          case 7: return new ST(getMessage());
          case 8: return new MSG(getMessage());
          case 9: return new ST(getMessage());
          case 10: return new PT(getMessage());
          case 11: return new VID(getMessage());
          case 12: return new NM(getMessage());
          case 13: return new ST(getMessage());
          case 14: return new ID(getMessage(), new Integer( 155 ));
          case 15: return new ID(getMessage(), new Integer( 155 ));
          case 16: return new ID(getMessage(), new Integer( 399 ));
          case 17: return new ID(getMessage(), new Integer( 211 ));
          case 18: return new CE(getMessage());
          case 19: return new ID(getMessage(), new Integer( 356 ));
          case 20: return new EI(getMessage());
          default: return null;
       }
   }


}


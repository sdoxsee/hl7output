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
 *<p>Represents an HL7 EVN message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>EVN-1: Event Type Code (ID) <b>optional repeating</b>
     * <li>EVN-2: Recorded Date/Time (TS) <b>optional </b>
     * <li>EVN-3: Date/Time Planned Event (TS) <b>optional repeating</b>
     * <li>EVN-4: Event Reason Code (IS) <b>optional repeating</b>
     * <li>EVN-5: Operator ID (XCN) <b>optional repeating</b>
     * <li>EVN-6: Event Occurred (TS) <b>optional repeating</b>
     * <li>EVN-7: Event Facility (HD) <b>optional </b>
 * </ul>
 */
public class EVN extends AbstractSegment {

    /** 
     * Creates a new EVN segment
     */
    public EVN(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(ID.class, false, 0, 3, new Object[]{ getMessage() }, "Event Type Code");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage(), new Integer(0) }, "Recorded Date/Time");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Date/Time Planned Event");
                                  this.add(IS.class, false, 0, 3, new Object[]{ getMessage() }, "Event Reason Code");
                                  this.add(XCN.class, false, 0, 2718, new Object[]{ getMessage(), new Integer(188) }, "Operator ID");
                                  this.add(TS.class, false, 0, 26, new Object[]{ getMessage(), new Integer(0) }, "Event Occurred");
                                  this.add(HD.class, false, 1, 241, new Object[]{ getMessage(), new Integer(0) }, "Event Facility");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating EVN - this is probably a bug in the source code generator.", e);
       }
    }


    /**
     * Returns all repetitions of Event Type Code (EVN-1).
     */
    public ID[] getEventTypeCode() {
        ID[] ret = null;
        try {
            Type[] t = this.getField(1);  
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
     * Returns a count of the current number of repetitions of Event Type Code (EVN-1).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEventTypeCodeReps() {
        ID[] ret = null;
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
     * EVN-1: "Event Type Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getEventTypeCode(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(1, rep);
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
     * EVN-1: "Event Type Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public ID getEvn1_EventTypeCode(int rep) { 
        ID ret = null;
        try {
            Type t = this.getField(1, rep);
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
     * Returns a count of the current number of repetitions of Event Type Code (EVN-1).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEvn1_EventTypeCodeReps() {
        ID[] ret = null;
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
     * EVN-1: "Event Type Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertEventTypeCode(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(1, rep);
    }



    /**
     * Inserts a repetition of
     * EVN-1: "Event Type Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID insertEvn1_EventTypeCode(int rep) throws HL7Exception { 
        return (ID) super.insertRepetition(1, rep);
    }


    /**
     * Removes a repetition of
     * EVN-1: "Event Type Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeEventTypeCode(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(1, rep);
    }


    /**
     * Removes a repetition of
     * EVN-1: "Event Type Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public ID removeEvn1_EventTypeCode(int rep) throws HL7Exception { 
        return (ID) super.removeRepetition(1, rep);
    }




    /**
     * Returns
     * EVN-2: "Recorded Date/Time" - creates it if necessary
     */
    public TS getRecordedDateTime() { 
        TS ret = null;
        try {
            Type t = this.getField(2, 0);
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
     * EVN-2: "Recorded Date/Time" - creates it if necessary
     */
    public TS getEvn2_RecordedDateTime() { 
        TS ret = null;
        try {
            Type t = this.getField(2, 0);
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
     * Returns all repetitions of Date/Time Planned Event (EVN-3).
     */
    public TS[] getDateTimePlannedEvent() {
        TS[] ret = null;
        try {
            Type[] t = this.getField(3);  
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
     * Returns a count of the current number of repetitions of Date/Time Planned Event (EVN-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getDateTimePlannedEventReps() {
        TS[] ret = null;
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
     * EVN-3: "Date/Time Planned Event" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getDateTimePlannedEvent(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(3, rep);
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
     * EVN-3: "Date/Time Planned Event" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getEvn3_DateTimePlannedEvent(int rep) { 
        TS ret = null;
        try {
            Type t = this.getField(3, rep);
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
     * Returns a count of the current number of repetitions of Date/Time Planned Event (EVN-3).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEvn3_DateTimePlannedEventReps() {
        TS[] ret = null;
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
     * EVN-3: "Date/Time Planned Event" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertDateTimePlannedEvent(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(3, rep);
    }



    /**
     * Inserts a repetition of
     * EVN-3: "Date/Time Planned Event" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertEvn3_DateTimePlannedEvent(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * EVN-3: "Date/Time Planned Event" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeDateTimePlannedEvent(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(3, rep);
    }


    /**
     * Removes a repetition of
     * EVN-3: "Date/Time Planned Event" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeEvn3_DateTimePlannedEvent(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(3, rep);
    }



    /**
     * Returns all repetitions of Event Reason Code (EVN-4).
     */
    public IS[] getEventReasonCode() {
        IS[] ret = null;
        try {
            Type[] t = this.getField(4);  
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
     * Returns a count of the current number of repetitions of Event Reason Code (EVN-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEventReasonCodeReps() {
        IS[] ret = null;
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
     * EVN-4: "Event Reason Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getEventReasonCode(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(4, rep);
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
     * EVN-4: "Event Reason Code" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public IS getEvn4_EventReasonCode(int rep) { 
        IS ret = null;
        try {
            Type t = this.getField(4, rep);
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
     * Returns a count of the current number of repetitions of Event Reason Code (EVN-4).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEvn4_EventReasonCodeReps() {
        IS[] ret = null;
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
     * EVN-4: "Event Reason Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertEventReasonCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(4, rep);
    }



    /**
     * Inserts a repetition of
     * EVN-4: "Event Reason Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS insertEvn4_EventReasonCode(int rep) throws HL7Exception { 
        return (IS) super.insertRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * EVN-4: "Event Reason Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeEventReasonCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(4, rep);
    }


    /**
     * Removes a repetition of
     * EVN-4: "Event Reason Code" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public IS removeEvn4_EventReasonCode(int rep) throws HL7Exception { 
        return (IS) super.removeRepetition(4, rep);
    }



    /**
     * Returns all repetitions of Operator ID (EVN-5).
     */
    public XCN[] getOperatorID() {
        XCN[] ret = null;
        try {
            Type[] t = this.getField(5);  
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
     * Returns a count of the current number of repetitions of Operator ID (EVN-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getOperatorIDReps() {
        XCN[] ret = null;
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
     * EVN-5: "Operator ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getOperatorID(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(5, rep);
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
     * EVN-5: "Operator ID" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XCN getEvn5_OperatorID(int rep) { 
        XCN ret = null;
        try {
            Type t = this.getField(5, rep);
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
     * Returns a count of the current number of repetitions of Operator ID (EVN-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEvn5_OperatorIDReps() {
        XCN[] ret = null;
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
     * EVN-5: "Operator ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertOperatorID(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(5, rep);
    }



    /**
     * Inserts a repetition of
     * EVN-5: "Operator ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN insertEvn5_OperatorID(int rep) throws HL7Exception { 
        return (XCN) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * EVN-5: "Operator ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeOperatorID(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * EVN-5: "Operator ID" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XCN removeEvn5_OperatorID(int rep) throws HL7Exception { 
        return (XCN) super.removeRepetition(5, rep);
    }



    /**
     * Returns all repetitions of Event Occurred (EVN-6).
     */
    public TS[] getEventOccurred() {
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
     * Returns a count of the current number of repetitions of Event Occurred (EVN-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEventOccurredReps() {
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
     * EVN-6: "Event Occurred" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getEventOccurred(int rep) { 
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
     * EVN-6: "Event Occurred" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TS getEvn6_EventOccurred(int rep) { 
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
     * Returns a count of the current number of repetitions of Event Occurred (EVN-6).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEvn6_EventOccurredReps() {
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
     * EVN-6: "Event Occurred" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertEventOccurred(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(6, rep);
    }



    /**
     * Inserts a repetition of
     * EVN-6: "Event Occurred" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS insertEvn6_EventOccurred(int rep) throws HL7Exception { 
        return (TS) super.insertRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * EVN-6: "Event Occurred" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeEventOccurred(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(6, rep);
    }


    /**
     * Removes a repetition of
     * EVN-6: "Event Occurred" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TS removeEvn6_EventOccurred(int rep) throws HL7Exception { 
        return (TS) super.removeRepetition(6, rep);
    }




    /**
     * Returns
     * EVN-7: "Event Facility" - creates it if necessary
     */
    public HD getEventFacility() { 
        HD ret = null;
        try {
            Type t = this.getField(7, 0);
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
     * EVN-7: "Event Facility" - creates it if necessary
     */
    public HD getEvn7_EventFacility() { 
        HD ret = null;
        try {
            Type t = this.getField(7, 0);
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





    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new ID(getMessage(), new Integer( 3 ));
          case 1: return new TS(getMessage());
          case 2: return new TS(getMessage());
          case 3: return new IS(getMessage(), new Integer( 62 ));
          case 4: return new XCN(getMessage());
          case 5: return new TS(getMessage());
          case 6: return new HD(getMessage());
          default: return null;
       }
   }


}


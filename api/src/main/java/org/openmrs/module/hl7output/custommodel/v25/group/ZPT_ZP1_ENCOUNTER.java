/*
 * This class is an auto-generated source file for a HAPI
 * HL7 v2.x standard structure class.
 *
 * For more information, visit: http://hl7api.sourceforge.net/
 */

package org.openmrs.module.hl7output.custommodel.v25.group;

//import org.openmrs.module.hl7output.custommodel.v25.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractGroup;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.Structure;
import ca.uhn.hl7v2.model.v25.segment.PV1;
import ca.uhn.hl7v2.model.v25.segment.RXD;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>Represents a ZPT_ZP1_ENCOUNTER group structure (ENCOUNTER).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                 * <li>1: PV1 () <b> </b></li>
                 * <li>2: ZPT_ZP1_OBSERVATION (OBSERVATION) <b>optional repeating</b></li>
                 * <li>3: ZPT_ZP1_ORDER (ORDER) <b>optional repeating</b></li>
                 * <li>4: RXD () <b>optional repeating</b></li>
 * </ul>
 */
public class ZPT_ZP1_ENCOUNTER extends AbstractGroup {

    /** 
     * Creates a new ZPT_ZP1_ENCOUNTER group
     */
    public ZPT_ZP1_ENCOUNTER(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(PV1.class, true, false);
                          this.add(ZPT_ZP1_OBSERVATION.class, false, true);
                          this.add(ZPT_ZP1_ORDER.class, false, true);
                          this.add(RXD.class, false, true);
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating ZPT_ZP1_ENCOUNTER - this is probably a bug in the source code generator.", e);
       }
    }

    /** 
     * Returns "2.5"
     */
    public String getVersion() {
       return "2.5";
    }



    /**
     * Returns
     * PV1 () - creates it if necessary
     */
    public PV1 getPV1() { 
       PV1 ret = null;
       try {
          ret = (PV1)this.get("PV1");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }




    /**
     * Returns
     * the first repetition of 
     * OBSERVATION (OBSERVATION) - creates it if necessary
     */
    public ZPT_ZP1_OBSERVATION getOBSERVATION() { 
       ZPT_ZP1_OBSERVATION ret = null;
       try {
          ret = (ZPT_ZP1_OBSERVATION)this.get("OBSERVATION");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }


    /**
     * Returns a specific repetition of
     * OBSERVATION (OBSERVATION) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public ZPT_ZP1_OBSERVATION getOBSERVATION(int rep) { 
       ZPT_ZP1_OBSERVATION ret = null;
       try {
          ret = (ZPT_ZP1_OBSERVATION)this.get("OBSERVATION", rep);
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }

    /** 
     * Returns the number of existing repetitions of OBSERVATION 
     */ 
    public int getOBSERVATIONReps() { 
        int reps = -1; 
        try { 
            reps = this.getAll("OBSERVATION").length; 
        } catch (HL7Exception e) { 
            String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
            HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
            throw new RuntimeException(message);
        } 
        return reps; 
    } 

    /**
     * Inserts a specific repetition of OBSERVATION (OBSERVATION)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertOBSERVATION(ZPT_ZP1_OBSERVATION structure, int rep) throws HL7Exception { 
       super.insertRepetition("OBSERVATION", structure, rep);
    }


    /**
     * Inserts a specific repetition of OBSERVATION (OBSERVATION)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public ZPT_ZP1_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
       return (ZPT_ZP1_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
    }


    /**
     * Removes a specific repetition of OBSERVATION (OBSERVATION)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public ZPT_ZP1_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
       return (ZPT_ZP1_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * ORDER (ORDER) - creates it if necessary
     */
    public ZPT_ZP1_ORDER getORDER() { 
       ZPT_ZP1_ORDER ret = null;
       try {
          ret = (ZPT_ZP1_ORDER)this.get("ORDER");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }


    /**
     * Returns a specific repetition of
     * ORDER (ORDER) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public ZPT_ZP1_ORDER getORDER(int rep) { 
       ZPT_ZP1_ORDER ret = null;
       try {
          ret = (ZPT_ZP1_ORDER)this.get("ORDER", rep);
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }

    /** 
     * Returns the number of existing repetitions of ORDER 
     */ 
    public int getORDERReps() { 
        int reps = -1; 
        try { 
            reps = this.getAll("ORDER").length; 
        } catch (HL7Exception e) { 
            String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
            HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
            throw new RuntimeException(message);
        } 
        return reps; 
    } 

    /**
     * Inserts a specific repetition of ORDER (ORDER)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertORDER(ZPT_ZP1_ORDER structure, int rep) throws HL7Exception { 
       super.insertRepetition("ORDER", structure, rep);
    }


    /**
     * Inserts a specific repetition of ORDER (ORDER)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public ZPT_ZP1_ORDER insertORDER(int rep) throws HL7Exception { 
       return (ZPT_ZP1_ORDER)super.insertRepetition("ORDER", rep);
    }


    /**
     * Removes a specific repetition of ORDER (ORDER)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public ZPT_ZP1_ORDER removeORDER(int rep) throws HL7Exception { 
       return (ZPT_ZP1_ORDER)super.removeRepetition("ORDER", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * RXD () - creates it if necessary
     */
    public RXD getRXD() { 
       RXD ret = null;
       try {
          ret = (RXD)this.get("RXD");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }


    /**
     * Returns a specific repetition of
     * RXD () - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public RXD getRXD(int rep) { 
       RXD ret = null;
       try {
          ret = (RXD)this.get("RXD", rep);
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }

    /** 
     * Returns the number of existing repetitions of RXD 
     */ 
    public int getRXDReps() { 
        int reps = -1; 
        try { 
            reps = this.getAll("RXD").length; 
        } catch (HL7Exception e) { 
            String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
            HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
            throw new RuntimeException(message);
        } 
        return reps; 
    } 

    /**
     * Inserts a specific repetition of RXD ()
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertRXD(RXD structure, int rep) throws HL7Exception { 
       super.insertRepetition("RXD", structure, rep);
    }


    /**
     * Inserts a specific repetition of RXD ()
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public RXD insertRXD(int rep) throws HL7Exception { 
       return (RXD)super.insertRepetition("RXD", rep);
    }


    /**
     * Removes a specific repetition of RXD ()
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public RXD removeRXD(int rep) throws HL7Exception { 
       return (RXD)super.removeRepetition("RXD", rep);
    }



}


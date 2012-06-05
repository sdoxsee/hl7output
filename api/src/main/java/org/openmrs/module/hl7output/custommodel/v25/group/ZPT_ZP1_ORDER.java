/*
 * This class is an auto-generated source file for a HAPI
 * HL7 v2.x standard structure class.
 *
 * For more information, visit: http://hl7api.sourceforge.net/
 */

package org.openmrs.module.hl7output.custommodel.v25.group;

import org.openmrs.module.hl7output.custommodel.v25.segment.*;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.AbstractGroup;
import ca.uhn.hl7v2.model.GenericSegment;

/**
 * <p>Represents a ZPT_ZP1_ORDER group structure (ORDER).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                 * <li>1: ORC () <b> </b></li>
                 * <li>2: TQ1 () <b> </b></li>
                 * <li>3: RXO () <b> </b></li>
                 * <li>4: OBX () <b>optional repeating</b></li>
 * </ul>
 */
public class ZPT_ZP1_ORDER extends AbstractGroup {

    /** 
     * Creates a new ZPT_ZP1_ORDER group
     */
    public ZPT_ZP1_ORDER(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(ORC.class, true, false);
                          this.add(TQ1.class, true, false);
                          this.add(RXO.class, true, false);
                          this.add(OBX.class, false, true);
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating ZPT_ZP1_ORDER - this is probably a bug in the source code generator.", e);
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
     * ORC () - creates it if necessary
     */
    public ORC getORC() { 
       ORC ret = null;
       try {
          ret = (ORC)this.get("ORC");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }




    /**
     * Returns
     * TQ1 () - creates it if necessary
     */
    public TQ1 getTQ1() { 
       TQ1 ret = null;
       try {
          ret = (TQ1)this.get("TQ1");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }




    /**
     * Returns
     * RXO () - creates it if necessary
     */
    public RXO getRXO() { 
       RXO ret = null;
       try {
          ret = (RXO)this.get("RXO");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }




    /**
     * Returns
     * the first repetition of 
     * OBX () - creates it if necessary
     */
    public OBX getOBX() { 
       OBX ret = null;
       try {
          ret = (OBX)this.get("OBX");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }


    /**
     * Returns a specific repetition of
     * OBX () - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public OBX getOBX(int rep) { 
       OBX ret = null;
       try {
          ret = (OBX)this.get("OBX", rep);
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }

    /** 
     * Returns the number of existing repetitions of OBX 
     */ 
    public int getOBXReps() { 
        int reps = -1; 
        try { 
            reps = this.getAll("OBX").length; 
        } catch (HL7Exception e) { 
            String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
            HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
            throw new RuntimeException(message);
        } 
        return reps; 
    } 

    /**
     * Inserts a specific repetition of OBX ()
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertOBX(OBX structure, int rep) throws HL7Exception { 
       super.insertRepetition("OBX", structure, rep);
    }


    /**
     * Inserts a specific repetition of OBX ()
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public OBX insertOBX(int rep) throws HL7Exception { 
       return (OBX)super.insertRepetition("OBX", rep);
    }


    /**
     * Removes a specific repetition of OBX ()
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public OBX removeOBX(int rep) throws HL7Exception { 
       return (OBX)super.removeRepetition("OBX", rep);
    }



}


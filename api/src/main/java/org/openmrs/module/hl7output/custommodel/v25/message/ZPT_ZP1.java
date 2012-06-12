/*
 * This class is an auto-generated source file for a HAPI
 * HL7 v2.x standard structure class.
 *
 * For more information, visit: http://hl7api.sourceforge.net/
 */

package org.openmrs.module.hl7output.custommodel.v25.message;

import org.openmrs.module.hl7output.custommodel.v25.group.ZPT_ZP1_ENCOUNTER;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.v25.segment.EVN;
import ca.uhn.hl7v2.model.v25.segment.MSH;
import ca.uhn.hl7v2.model.v25.segment.NK1;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.model.v25.segment.SFT;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.log.HapiLogFactory;

/**
 * <p>Represents a ZPT_ZP1 message structure (see chapter ). This structure contains the 
 * following elements: </p>
 * <ul>
                 * <li>1: MSH () <b> </b></li>
                 * <li>2: SFT () <b>optional </b></li>
                 * <li>3: EVN () <b> </b></li>
                 * <li>4: PID () <b> </b></li>
                 * <li>5: NK1 () <b> </b></li>
                 * <li>6: ZPT_ZP1_ENCOUNTER (ENCOUNTER) <b> repeating</b></li>
 * </ul>
 */
public class ZPT_ZP1 extends AbstractMessage  {

    /**
     * Creates a new ZPT_ZP1 message with DefaultModelClassFactory. 
     */ 
    public ZPT_ZP1() { 
       this(new DefaultModelClassFactory());
    }

    /** 
     * Creates a new ZPT_ZP1 message with custom ModelClassFactory.
     */
    public ZPT_ZP1(ModelClassFactory factory) {
       super(factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(MSH.class, true, false);
                          this.add(SFT.class, false, false);
                          this.add(EVN.class, true, false);
                          this.add(PID.class, true, false);
                          this.add(NK1.class, true, false);
                          this.add(ZPT_ZP1_ENCOUNTER.class, true, true);
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating ZPT_ZP1 - this is probably a bug in the source code generator.", e);
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
     * MSH () - creates it if necessary
     */
    public MSH getMSH() { 
       MSH ret = null;
       try {
          ret = (MSH)this.get("MSH");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }




    /**
     * Returns
     * SFT () - creates it if necessary
     */
    public SFT getSFT() { 
       SFT ret = null;
       try {
          ret = (SFT)this.get("SFT");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }




    /**
     * Returns
     * EVN () - creates it if necessary
     */
    public EVN getEVN() { 
       EVN ret = null;
       try {
          ret = (EVN)this.get("EVN");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }




    /**
     * Returns
     * PID () - creates it if necessary
     */
    public PID getPID() { 
       PID ret = null;
       try {
          ret = (PID)this.get("PID");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }




    /**
     * Returns
     * NK1 () - creates it if necessary
     */
    public NK1 getNK1() { 
       NK1 ret = null;
       try {
          ret = (NK1)this.get("NK1");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }




    /**
     * Returns
     * the first repetition of 
     * ENCOUNTER (ENCOUNTER) - creates it if necessary
     */
    public ZPT_ZP1_ENCOUNTER getENCOUNTER() { 
       ZPT_ZP1_ENCOUNTER ret = null;
       try {
          ret = (ZPT_ZP1_ENCOUNTER)this.get("ENCOUNTER");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }


    /**
     * Returns a specific repetition of
     * ENCOUNTER (ENCOUNTER) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public ZPT_ZP1_ENCOUNTER getENCOUNTER(int rep) { 
       ZPT_ZP1_ENCOUNTER ret = null;
       try {
          ret = (ZPT_ZP1_ENCOUNTER)this.get("ENCOUNTER", rep);
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
          throw new RuntimeException(e);
       }
       return ret;
    }

    /** 
     * Returns the number of existing repetitions of ENCOUNTER 
     */ 
    public int getENCOUNTERReps() { 
        int reps = -1; 
        try { 
            reps = this.getAll("ENCOUNTER").length; 
        } catch (HL7Exception e) { 
            String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
            HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
            throw new RuntimeException(message);
        } 
        return reps; 
    } 

    /**
     * Inserts a specific repetition of ENCOUNTER (ENCOUNTER)
     * @see AbstractGroup\#insertRepetition(Structure, int) 
     */
    public void insertENCOUNTER(ZPT_ZP1_ENCOUNTER structure, int rep) throws HL7Exception { 
       super.insertRepetition( "ENCOUNTER", structure, rep);
    }


    /**
     * Inserts a specific repetition of ENCOUNTER (ENCOUNTER)
     * @see AbstractGroup\#insertRepetition(Structure, int) 
     */
    public ZPT_ZP1_ENCOUNTER insertENCOUNTER(int rep) throws HL7Exception { 
       return (ZPT_ZP1_ENCOUNTER)super.insertRepetition("ENCOUNTER", rep);
    }


    /**
     * Removes a specific repetition of ENCOUNTER (ENCOUNTER)
     * @see AbstractGroup\#removeRepetition(String, int) 
     */
    public ZPT_ZP1_ENCOUNTER removeENCOUNTER(int rep) throws HL7Exception { 
       return (ZPT_ZP1_ENCOUNTER)super.removeRepetition("ENCOUNTER", rep);
    }



}


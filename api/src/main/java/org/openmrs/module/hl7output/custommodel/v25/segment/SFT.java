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
 *<p>Represents an HL7 SFT message segment (). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>SFT-1: Software Vendor Organization (XON) <b>optional </b>
     * <li>SFT-2: Software Certified Version or Release Number (ST) <b>optional </b>
     * <li>SFT-3: Software Product Name (ST) <b>optional </b>
     * <li>SFT-4: Software Binary ID (ST) <b>optional </b>
     * <li>SFT-5: Software Product Information (TX) <b>optional repeating</b>
     * <li>SFT-6: Software Install Date (TS) <b>optional </b>
 * </ul>
 */
public class SFT extends AbstractSegment {

    /** 
     * Creates a new SFT segment
     */
    public SFT(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(XON.class, false, 1, 567, new Object[]{ getMessage(), new Integer(0) }, "Software Vendor Organization");
                                  this.add(ST.class, false, 1, 15, new Object[]{ getMessage(), new Integer(0) }, "Software Certified Version or Release Number");
                                  this.add(ST.class, false, 1, 20, new Object[]{ getMessage(), new Integer(0) }, "Software Product Name");
                                  this.add(ST.class, false, 1, 20, new Object[]{ getMessage(), new Integer(0) }, "Software Binary ID");
                                  this.add(TX.class, false, 0, 1024, new Object[]{ getMessage(), new Integer(0) }, "Software Product Information");
                                  this.add(TS.class, false, 1, 26, new Object[]{ getMessage(), new Integer(0) }, "Software Install Date");
       } catch(HL7Exception e) {
          HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating SFT - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * SFT-1: "Software Vendor Organization" - creates it if necessary
     */
    public XON getSoftwareVendorOrganization() { 
        XON ret = null;
        try {
            Type t = this.getField(1, 0);
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
     * Returns
     * SFT-1: "Software Vendor Organization" - creates it if necessary
     */
    public XON getSft1_SoftwareVendorOrganization() { 
        XON ret = null;
        try {
            Type t = this.getField(1, 0);
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
     * Returns
     * SFT-2: "Software Certified Version or Release Number" - creates it if necessary
     */
    public ST getSoftwareCertifiedVersionOrReleaseNumber() { 
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
     * SFT-2: "Software Certified Version or Release Number" - creates it if necessary
     */
    public ST getSft2_SoftwareCertifiedVersionOrReleaseNumber() { 
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
     * SFT-3: "Software Product Name" - creates it if necessary
     */
    public ST getSoftwareProductName() { 
        ST ret = null;
        try {
            Type t = this.getField(3, 0);
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
     * SFT-3: "Software Product Name" - creates it if necessary
     */
    public ST getSft3_SoftwareProductName() { 
        ST ret = null;
        try {
            Type t = this.getField(3, 0);
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
     * SFT-4: "Software Binary ID" - creates it if necessary
     */
    public ST getSoftwareBinaryID() { 
        ST ret = null;
        try {
            Type t = this.getField(4, 0);
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
     * SFT-4: "Software Binary ID" - creates it if necessary
     */
    public ST getSft4_SoftwareBinaryID() { 
        ST ret = null;
        try {
            Type t = this.getField(4, 0);
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
     * Returns all repetitions of Software Product Information (SFT-5).
     */
    public TX[] getSoftwareProductInformation() {
        TX[] ret = null;
        try {
            Type[] t = this.getField(5);  
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
     * Returns a count of the current number of repetitions of Software Product Information (SFT-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSoftwareProductInformationReps() {
        TX[] ret = null;
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
     * SFT-5: "Software Product Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TX getSoftwareProductInformation(int rep) { 
        TX ret = null;
        try {
            Type t = this.getField(5, rep);
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
     * SFT-5: "Software Product Information" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public TX getSft5_SoftwareProductInformation(int rep) { 
        TX ret = null;
        try {
            Type t = this.getField(5, rep);
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
     * Returns a count of the current number of repetitions of Software Product Information (SFT-5).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getSft5_SoftwareProductInformationReps() {
        TX[] ret = null;
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
     * SFT-5: "Software Product Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TX insertSoftwareProductInformation(int rep) throws HL7Exception { 
        return (TX) super.insertRepetition(5, rep);
    }



    /**
     * Inserts a repetition of
     * SFT-5: "Software Product Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TX insertSft5_SoftwareProductInformation(int rep) throws HL7Exception { 
        return (TX) super.insertRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * SFT-5: "Software Product Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TX removeSoftwareProductInformation(int rep) throws HL7Exception { 
        return (TX) super.removeRepetition(5, rep);
    }


    /**
     * Removes a repetition of
     * SFT-5: "Software Product Information" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public TX removeSft5_SoftwareProductInformation(int rep) throws HL7Exception { 
        return (TX) super.removeRepetition(5, rep);
    }




    /**
     * Returns
     * SFT-6: "Software Install Date" - creates it if necessary
     */
    public TS getSoftwareInstallDate() { 
        TS ret = null;
        try {
            Type t = this.getField(6, 0);
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
     * SFT-6: "Software Install Date" - creates it if necessary
     */
    public TS getSft6_SoftwareInstallDate() { 
        TS ret = null;
        try {
            Type t = this.getField(6, 0);
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





    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new XON(getMessage());
          case 1: return new ST(getMessage());
          case 2: return new ST(getMessage());
          case 3: return new ST(getMessage());
          case 4: return new TX(getMessage());
          case 5: return new TS(getMessage());
          default: return null;
       }
   }


}


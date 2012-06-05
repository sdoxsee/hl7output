package org.openmrs.module.model;

import java.util.Date;


public class PostEncounterLog {
	
	private Integer postRequestId;
	
	private String enterpriseId;
	
	private String hl7data;
	
	private boolean valid;

	private String errorMessage;
	
	private Date dateCreated;
	
	private Integer userId;

	public Integer getPostRequestId() {
    	return postRequestId;
    }

	
    public void setPostRequestId(Integer createRequestId) {
    	this.postRequestId = createRequestId;
    }

	
    public String getEnterpriseId() {
    	return enterpriseId;
    }

	
    public void setEnterpriseId(String enterpriseId) {
    	this.enterpriseId = enterpriseId;
    }

	
    public String getHl7data() {
    	return hl7data;
    }

	
    public void setHl7data(String hl7data) {
    	this.hl7data = hl7data;
    }

    public boolean isValid() {
    	return valid;
    }
	
    public void setValid(boolean valid) {
    	this.valid = valid;
    }
    
    public String getErrorMessage() {
    	return errorMessage;
    }

	
    public void setErrorMessage(String errorMessage) {
    	this.errorMessage = errorMessage;
    }

	
    public Date getDateCreated() {
    	return dateCreated;
    }

	
    public void setDateCreated(Date dateCreated) {
    	this.dateCreated = dateCreated;
    }
    
    public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}

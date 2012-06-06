package org.openmrs.module.hl7output.model;

import java.util.Date;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class GetEncounterLog {
	
	private Integer getRequestId;
	
	private String enterpriseId;
	
	private String encounterUniqueId;
	
	private Date dateStart;
	
	private Date dateEnd;
	
	private Date logTime;
	
	private String result;
	
	private SortedSet<MatchingEncounters> matchingEncounters;
	
	
    public Integer getGetRequestId() {
    	return getRequestId;
    }

	
    public void setGetRequestId(Integer postRequestId) {
    	this.getRequestId = postRequestId;
    }

	
    public String getEnterpriseId() {
    	return enterpriseId;
    }

	
    public void setEnterpriseId(String enterpriseId) {
    	this.enterpriseId = enterpriseId;
    }

	
    public String getEncounterUniqueId() {
    	return encounterUniqueId;
    }

	
    public void setEncounterUniqueId(String encounterUniqueId) {
    	this.encounterUniqueId = encounterUniqueId;
    }

	
    public Date getDateStart() {
    	return dateStart;
    }

	
    public void setDateStart(Date dateStart) {
    	this.dateStart = dateStart;
    }

	
    public Date getDateEnd() {
    	return dateEnd;
    }

	
    public void setDateEnd(Date dateEnd) {
    	this.dateEnd = dateEnd;
    }
    
    public Date getLogTime() {
    	return logTime;
    }

	
    public void setLogTime(Date logTime) {
    	this.logTime = logTime;
    }
    
    public String getResult() {
    	return result;
    }

    public void setResult(String result) {
    	this.result = result;
    }
    
    public Set<MatchingEncounters> getMatchingEncounters() {
		if (matchingEncounters == null)
			matchingEncounters = new TreeSet<MatchingEncounters>();
        return matchingEncounters;
    }
    
	
	public void setMatchingEncounters(Set<MatchingEncounters> matchingEncounters) {
		if (this.matchingEncounters == null) {
			this.matchingEncounters = (SortedSet<MatchingEncounters>) matchingEncounters;
		} else {
			this.matchingEncounters.retainAll(matchingEncounters);
			this.matchingEncounters.addAll(matchingEncounters);
		}
	}
	
}

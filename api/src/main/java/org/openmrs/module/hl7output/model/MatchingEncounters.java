package org.openmrs.module.hl7output.model;


public class MatchingEncounters implements Comparable<MatchingEncounters> {
	private Integer matchingEncountersId;
	private Integer encounterId;
	private GetEncounterLog getEncounterLog;

	public Integer getMatchingEncountersId() {
    	return matchingEncountersId;
    }

	
    public void setMatchingEncountersId(Integer matchingEncountersId) {
    	this.matchingEncountersId = matchingEncountersId;
    }

	
    public Integer getEncounterId() {
    	return encounterId;
    }
	
    public void setEncounterId(Integer encounterId) {
    	this.encounterId = encounterId;
    }	  
    
    public GetEncounterLog getGetEncounterLog() {
    	return getEncounterLog;
    }

    public void setGetEncounterLog(GetEncounterLog getEncounterLog) {
    	this.getEncounterLog = getEncounterLog;
    }
    

	public int compareTo(MatchingEncounters o) {
		return encounterId.compareTo(o.getEncounterId());
	}
	
}

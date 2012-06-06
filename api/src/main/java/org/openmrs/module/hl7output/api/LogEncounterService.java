package org.openmrs.module.hl7output.api;

import org.openmrs.module.hl7output.model.GetEncounterLog;
import org.openmrs.module.hl7output.model.PostEncounterLog;

public interface LogEncounterService {
	public void saveGetEncounterLog(GetEncounterLog getEncounterLog);
	public void savePostEncounterLog(PostEncounterLog postEncounterLog);
}

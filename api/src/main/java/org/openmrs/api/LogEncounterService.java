package org.openmrs.api;

import org.openmrs.module.model.GetEncounterLog;
import org.openmrs.module.model.PostEncounterLog;

public interface LogEncounterService {
	public void saveGetEncounterLog(GetEncounterLog getEncounterLog);
	public void savePostEncounterLog(PostEncounterLog postEncounterLog);
}

package org.openmrs.module.hl7output.api.db;

import org.openmrs.module.hl7output.model.GetEncounterLog;
import org.openmrs.module.hl7output.model.PostEncounterLog;


public interface LogEncounterDAO {
	public void saveGetEncounterLog(GetEncounterLog getEncounterLog);
	public void savePostEncounterLog(PostEncounterLog postEncounterLog);
}

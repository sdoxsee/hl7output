package org.openmrs.hibernate;

import org.openmrs.module.model.GetEncounterLog;
import org.openmrs.module.model.PostEncounterLog;


public interface LogEncounterDAO {
	public void saveGetEncounterLog(GetEncounterLog getEncounterLog);
	public void savePostEncounterLog(PostEncounterLog postEncounterLog);
}

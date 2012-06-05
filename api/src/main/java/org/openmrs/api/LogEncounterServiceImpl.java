package org.openmrs.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.hibernate.LogEncounterDAO;
import org.openmrs.module.model.GetEncounterLog;
import org.openmrs.module.model.PostEncounterLog;


public class LogEncounterServiceImpl implements LogEncounterService{
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private LogEncounterDAO logEncounterDAO;
	
	private SessionFactory sessionFactory;
	
	public LogEncounterServiceImpl(){
		super();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void setLogEncounterDAO(LogEncounterDAO logEncounterDAO) {
		this.logEncounterDAO = logEncounterDAO;
	}
	
	public LogEncounterDAO getLogEncounterDAO() {
		return logEncounterDAO;
	}
	
	public void saveGetEncounterLog(GetEncounterLog getEncounterLog) {
		logEncounterDAO.saveGetEncounterLog(getEncounterLog);
    }
	
	public void savePostEncounterLog(PostEncounterLog postEncounterLog) {
		logEncounterDAO.savePostEncounterLog(postEncounterLog);
    }
}

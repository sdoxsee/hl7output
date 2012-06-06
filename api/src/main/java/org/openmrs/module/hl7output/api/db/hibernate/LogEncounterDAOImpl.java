package org.openmrs.module.hl7output.api.db.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.module.hl7output.api.db.LogEncounterDAO;
import org.openmrs.module.hl7output.model.GetEncounterLog;
import org.openmrs.module.hl7output.model.PostEncounterLog;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class LogEncounterDAOImpl implements LogEncounterDAO {
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public LogEncounterDAOImpl() {
		super();
	}
	
	public void saveGetEncounterLog(GetEncounterLog getEncounterLog) {
		sessionFactory.getCurrentSession().saveOrUpdate(getEncounterLog);
    }
	
	public void savePostEncounterLog(PostEncounterLog postEncounterLog) {
		sessionFactory.getCurrentSession().saveOrUpdate(postEncounterLog);
    }
	
}

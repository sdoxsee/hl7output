package org.openmrs.hibernate;

import org.hibernate.SessionFactory;
import org.openmrs.module.model.GetEncounterLog;
import org.openmrs.module.model.PostEncounterLog;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class LogEncounterDAOImpl implements LogEncounterDAO{

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

package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Databasechangeloglock.
 * @see com.example.demo.order.model.Databasechangeloglock
 * @author Hibernate Tools
 */
@Stateless
public class DatabasechangeloglockHome {

	private static final Log log = LogFactory.getLog(DatabasechangeloglockHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Databasechangeloglock transientInstance) {
		log.debug("persisting Databasechangeloglock instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Databasechangeloglock persistentInstance) {
		log.debug("removing Databasechangeloglock instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Databasechangeloglock merge(Databasechangeloglock detachedInstance) {
		log.debug("merging Databasechangeloglock instance");
		try {
			Databasechangeloglock result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Databasechangeloglock findById(int id) {
		log.debug("getting Databasechangeloglock instance with id: " + id);
		try {
			Databasechangeloglock instance = entityManager.find(Databasechangeloglock.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

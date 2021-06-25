package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Revinfo.
 * @see com.example.demo.order.model.Revinfo
 * @author Hibernate Tools
 */
@Stateless
public class RevinfoHome {

	private static final Log log = LogFactory.getLog(RevinfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Revinfo transientInstance) {
		log.debug("persisting Revinfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Revinfo persistentInstance) {
		log.debug("removing Revinfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Revinfo merge(Revinfo detachedInstance) {
		log.debug("merging Revinfo instance");
		try {
			Revinfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Revinfo findById(Integer id) {
		log.debug("getting Revinfo instance with id: " + id);
		try {
			Revinfo instance = entityManager.find(Revinfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

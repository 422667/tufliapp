package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFollowupTask.
 * @see com.example.demo.order.model.TblFollowupTask
 * @author Hibernate Tools
 */
@Stateless
public class TblFollowupTaskHome {

	private static final Log log = LogFactory.getLog(TblFollowupTaskHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFollowupTask transientInstance) {
		log.debug("persisting TblFollowupTask instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFollowupTask persistentInstance) {
		log.debug("removing TblFollowupTask instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFollowupTask merge(TblFollowupTask detachedInstance) {
		log.debug("merging TblFollowupTask instance");
		try {
			TblFollowupTask result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFollowupTask findById(Long id) {
		log.debug("getting TblFollowupTask instance with id: " + id);
		try {
			TblFollowupTask instance = entityManager.find(TblFollowupTask.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

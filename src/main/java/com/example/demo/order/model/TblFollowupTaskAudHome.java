package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFollowupTaskAud.
 * @see com.example.demo.order.model.TblFollowupTaskAud
 * @author Hibernate Tools
 */
@Stateless
public class TblFollowupTaskAudHome {

	private static final Log log = LogFactory.getLog(TblFollowupTaskAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFollowupTaskAud transientInstance) {
		log.debug("persisting TblFollowupTaskAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFollowupTaskAud persistentInstance) {
		log.debug("removing TblFollowupTaskAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFollowupTaskAud merge(TblFollowupTaskAud detachedInstance) {
		log.debug("merging TblFollowupTaskAud instance");
		try {
			TblFollowupTaskAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFollowupTaskAud findById(TblFollowupTaskAudId id) {
		log.debug("getting TblFollowupTaskAud instance with id: " + id);
		try {
			TblFollowupTaskAud instance = entityManager.find(TblFollowupTaskAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

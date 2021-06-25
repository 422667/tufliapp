package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFulfillOrderFeedbackAud.
 * @see com.example.demo.order.model.TblFulfillOrderFeedbackAud
 * @author Hibernate Tools
 */
@Stateless
public class TblFulfillOrderFeedbackAudHome {

	private static final Log log = LogFactory.getLog(TblFulfillOrderFeedbackAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFulfillOrderFeedbackAud transientInstance) {
		log.debug("persisting TblFulfillOrderFeedbackAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFulfillOrderFeedbackAud persistentInstance) {
		log.debug("removing TblFulfillOrderFeedbackAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFulfillOrderFeedbackAud merge(TblFulfillOrderFeedbackAud detachedInstance) {
		log.debug("merging TblFulfillOrderFeedbackAud instance");
		try {
			TblFulfillOrderFeedbackAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFulfillOrderFeedbackAud findById(TblFulfillOrderFeedbackAudId id) {
		log.debug("getting TblFulfillOrderFeedbackAud instance with id: " + id);
		try {
			TblFulfillOrderFeedbackAud instance = entityManager.find(TblFulfillOrderFeedbackAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

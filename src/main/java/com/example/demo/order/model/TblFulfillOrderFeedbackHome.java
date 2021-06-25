package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFulfillOrderFeedback.
 * @see com.example.demo.order.model.TblFulfillOrderFeedback
 * @author Hibernate Tools
 */
@Stateless
public class TblFulfillOrderFeedbackHome {

	private static final Log log = LogFactory.getLog(TblFulfillOrderFeedbackHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFulfillOrderFeedback transientInstance) {
		log.debug("persisting TblFulfillOrderFeedback instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFulfillOrderFeedback persistentInstance) {
		log.debug("removing TblFulfillOrderFeedback instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFulfillOrderFeedback merge(TblFulfillOrderFeedback detachedInstance) {
		log.debug("merging TblFulfillOrderFeedback instance");
		try {
			TblFulfillOrderFeedback result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFulfillOrderFeedback findById(long id) {
		log.debug("getting TblFulfillOrderFeedback instance with id: " + id);
		try {
			TblFulfillOrderFeedback instance = entityManager.find(TblFulfillOrderFeedback.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

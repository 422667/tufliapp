package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemTerm.
 * @see com.example.demo.order.model.TblOrderItemTerm
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemTermHome {

	private static final Log log = LogFactory.getLog(TblOrderItemTermHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemTerm transientInstance) {
		log.debug("persisting TblOrderItemTerm instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemTerm persistentInstance) {
		log.debug("removing TblOrderItemTerm instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemTerm merge(TblOrderItemTerm detachedInstance) {
		log.debug("merging TblOrderItemTerm instance");
		try {
			TblOrderItemTerm result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemTerm findById(long id) {
		log.debug("getting TblOrderItemTerm instance with id: " + id);
		try {
			TblOrderItemTerm instance = entityManager.find(TblOrderItemTerm.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

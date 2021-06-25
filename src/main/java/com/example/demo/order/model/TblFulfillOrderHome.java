package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFulfillOrder.
 * @see com.example.demo.order.model.TblFulfillOrder
 * @author Hibernate Tools
 */
@Stateless
public class TblFulfillOrderHome {

	private static final Log log = LogFactory.getLog(TblFulfillOrderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFulfillOrder transientInstance) {
		log.debug("persisting TblFulfillOrder instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFulfillOrder persistentInstance) {
		log.debug("removing TblFulfillOrder instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFulfillOrder merge(TblFulfillOrder detachedInstance) {
		log.debug("merging TblFulfillOrder instance");
		try {
			TblFulfillOrder result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFulfillOrder findById(long id) {
		log.debug("getting TblFulfillOrder instance with id: " + id);
		try {
			TblFulfillOrder instance = entityManager.find(TblFulfillOrder.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrder.
 * @see com.example.demo.order.model.TblOrder
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderHome {

	private static final Log log = LogFactory.getLog(TblOrderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrder transientInstance) {
		log.debug("persisting TblOrder instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrder persistentInstance) {
		log.debug("removing TblOrder instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrder merge(TblOrder detachedInstance) {
		log.debug("merging TblOrder instance");
		try {
			TblOrder result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrder findById(long id) {
		log.debug("getting TblOrder instance with id: " + id);
		try {
			TblOrder instance = entityManager.find(TblOrder.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

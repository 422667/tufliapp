package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFulfillOrderProp.
 * @see com.example.demo.order.model.TblFulfillOrderProp
 * @author Hibernate Tools
 */
@Stateless
public class TblFulfillOrderPropHome {

	private static final Log log = LogFactory.getLog(TblFulfillOrderPropHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFulfillOrderProp transientInstance) {
		log.debug("persisting TblFulfillOrderProp instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFulfillOrderProp persistentInstance) {
		log.debug("removing TblFulfillOrderProp instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFulfillOrderProp merge(TblFulfillOrderProp detachedInstance) {
		log.debug("merging TblFulfillOrderProp instance");
		try {
			TblFulfillOrderProp result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFulfillOrderProp findById(long id) {
		log.debug("getting TblFulfillOrderProp instance with id: " + id);
		try {
			TblFulfillOrderProp instance = entityManager.find(TblFulfillOrderProp.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

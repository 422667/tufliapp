package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemProp.
 * @see com.example.demo.order.model.TblOrderItemProp
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemPropHome {

	private static final Log log = LogFactory.getLog(TblOrderItemPropHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemProp transientInstance) {
		log.debug("persisting TblOrderItemProp instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemProp persistentInstance) {
		log.debug("removing TblOrderItemProp instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemProp merge(TblOrderItemProp detachedInstance) {
		log.debug("merging TblOrderItemProp instance");
		try {
			TblOrderItemProp result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemProp findById(long id) {
		log.debug("getting TblOrderItemProp instance with id: " + id);
		try {
			TblOrderItemProp instance = entityManager.find(TblOrderItemProp.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

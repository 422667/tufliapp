package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemPrice.
 * @see com.example.demo.order.model.TblOrderItemPrice
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemPriceHome {

	private static final Log log = LogFactory.getLog(TblOrderItemPriceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemPrice transientInstance) {
		log.debug("persisting TblOrderItemPrice instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemPrice persistentInstance) {
		log.debug("removing TblOrderItemPrice instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemPrice merge(TblOrderItemPrice detachedInstance) {
		log.debug("merging TblOrderItemPrice instance");
		try {
			TblOrderItemPrice result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemPrice findById(long id) {
		log.debug("getting TblOrderItemPrice instance with id: " + id);
		try {
			TblOrderItemPrice instance = entityManager.find(TblOrderItemPrice.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

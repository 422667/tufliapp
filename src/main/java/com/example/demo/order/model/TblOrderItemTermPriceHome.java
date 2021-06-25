package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemTermPrice.
 * @see com.example.demo.order.model.TblOrderItemTermPrice
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemTermPriceHome {

	private static final Log log = LogFactory.getLog(TblOrderItemTermPriceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemTermPrice transientInstance) {
		log.debug("persisting TblOrderItemTermPrice instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemTermPrice persistentInstance) {
		log.debug("removing TblOrderItemTermPrice instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemTermPrice merge(TblOrderItemTermPrice detachedInstance) {
		log.debug("merging TblOrderItemTermPrice instance");
		try {
			TblOrderItemTermPrice result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemTermPrice findById(long id) {
		log.debug("getting TblOrderItemTermPrice instance with id: " + id);
		try {
			TblOrderItemTermPrice instance = entityManager.find(TblOrderItemTermPrice.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

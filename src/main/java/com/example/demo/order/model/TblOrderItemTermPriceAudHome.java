package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemTermPriceAud.
 * @see com.example.demo.order.model.TblOrderItemTermPriceAud
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemTermPriceAudHome {

	private static final Log log = LogFactory.getLog(TblOrderItemTermPriceAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemTermPriceAud transientInstance) {
		log.debug("persisting TblOrderItemTermPriceAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemTermPriceAud persistentInstance) {
		log.debug("removing TblOrderItemTermPriceAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemTermPriceAud merge(TblOrderItemTermPriceAud detachedInstance) {
		log.debug("merging TblOrderItemTermPriceAud instance");
		try {
			TblOrderItemTermPriceAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemTermPriceAud findById(TblOrderItemTermPriceAudId id) {
		log.debug("getting TblOrderItemTermPriceAud instance with id: " + id);
		try {
			TblOrderItemTermPriceAud instance = entityManager.find(TblOrderItemTermPriceAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

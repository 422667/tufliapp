package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemAud.
 * @see com.example.demo.order.model.TblOrderItemAud
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemAudHome {

	private static final Log log = LogFactory.getLog(TblOrderItemAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemAud transientInstance) {
		log.debug("persisting TblOrderItemAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemAud persistentInstance) {
		log.debug("removing TblOrderItemAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemAud merge(TblOrderItemAud detachedInstance) {
		log.debug("merging TblOrderItemAud instance");
		try {
			TblOrderItemAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemAud findById(TblOrderItemAudId id) {
		log.debug("getting TblOrderItemAud instance with id: " + id);
		try {
			TblOrderItemAud instance = entityManager.find(TblOrderItemAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemTermAud.
 * @see com.example.demo.order.model.TblOrderItemTermAud
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemTermAudHome {

	private static final Log log = LogFactory.getLog(TblOrderItemTermAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemTermAud transientInstance) {
		log.debug("persisting TblOrderItemTermAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemTermAud persistentInstance) {
		log.debug("removing TblOrderItemTermAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemTermAud merge(TblOrderItemTermAud detachedInstance) {
		log.debug("merging TblOrderItemTermAud instance");
		try {
			TblOrderItemTermAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemTermAud findById(TblOrderItemTermAudId id) {
		log.debug("getting TblOrderItemTermAud instance with id: " + id);
		try {
			TblOrderItemTermAud instance = entityManager.find(TblOrderItemTermAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

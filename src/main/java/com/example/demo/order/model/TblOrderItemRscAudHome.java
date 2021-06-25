package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemRscAud.
 * @see com.example.demo.order.model.TblOrderItemRscAud
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemRscAudHome {

	private static final Log log = LogFactory.getLog(TblOrderItemRscAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemRscAud transientInstance) {
		log.debug("persisting TblOrderItemRscAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemRscAud persistentInstance) {
		log.debug("removing TblOrderItemRscAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemRscAud merge(TblOrderItemRscAud detachedInstance) {
		log.debug("merging TblOrderItemRscAud instance");
		try {
			TblOrderItemRscAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemRscAud findById(TblOrderItemRscAudId id) {
		log.debug("getting TblOrderItemRscAud instance with id: " + id);
		try {
			TblOrderItemRscAud instance = entityManager.find(TblOrderItemRscAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

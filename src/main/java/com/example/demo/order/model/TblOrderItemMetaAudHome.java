package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemMetaAud.
 * @see com.example.demo.order.model.TblOrderItemMetaAud
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemMetaAudHome {

	private static final Log log = LogFactory.getLog(TblOrderItemMetaAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemMetaAud transientInstance) {
		log.debug("persisting TblOrderItemMetaAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemMetaAud persistentInstance) {
		log.debug("removing TblOrderItemMetaAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemMetaAud merge(TblOrderItemMetaAud detachedInstance) {
		log.debug("merging TblOrderItemMetaAud instance");
		try {
			TblOrderItemMetaAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemMetaAud findById(TblOrderItemMetaAudId id) {
		log.debug("getting TblOrderItemMetaAud instance with id: " + id);
		try {
			TblOrderItemMetaAud instance = entityManager.find(TblOrderItemMetaAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

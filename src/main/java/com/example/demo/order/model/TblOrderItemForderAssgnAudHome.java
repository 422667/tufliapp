package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemForderAssgnAud.
 * @see com.example.demo.order.model.TblOrderItemForderAssgnAud
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemForderAssgnAudHome {

	private static final Log log = LogFactory.getLog(TblOrderItemForderAssgnAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemForderAssgnAud transientInstance) {
		log.debug("persisting TblOrderItemForderAssgnAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemForderAssgnAud persistentInstance) {
		log.debug("removing TblOrderItemForderAssgnAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemForderAssgnAud merge(TblOrderItemForderAssgnAud detachedInstance) {
		log.debug("merging TblOrderItemForderAssgnAud instance");
		try {
			TblOrderItemForderAssgnAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemForderAssgnAud findById(TblOrderItemForderAssgnAudId id) {
		log.debug("getting TblOrderItemForderAssgnAud instance with id: " + id);
		try {
			TblOrderItemForderAssgnAud instance = entityManager.find(TblOrderItemForderAssgnAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

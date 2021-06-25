package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemPropAud.
 * @see com.example.demo.order.model.TblOrderItemPropAud
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemPropAudHome {

	private static final Log log = LogFactory.getLog(TblOrderItemPropAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemPropAud transientInstance) {
		log.debug("persisting TblOrderItemPropAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemPropAud persistentInstance) {
		log.debug("removing TblOrderItemPropAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemPropAud merge(TblOrderItemPropAud detachedInstance) {
		log.debug("merging TblOrderItemPropAud instance");
		try {
			TblOrderItemPropAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemPropAud findById(TblOrderItemPropAudId id) {
		log.debug("getting TblOrderItemPropAud instance with id: " + id);
		try {
			TblOrderItemPropAud instance = entityManager.find(TblOrderItemPropAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

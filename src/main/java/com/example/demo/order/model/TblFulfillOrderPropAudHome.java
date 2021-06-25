package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFulfillOrderPropAud.
 * @see com.example.demo.order.model.TblFulfillOrderPropAud
 * @author Hibernate Tools
 */
@Stateless
public class TblFulfillOrderPropAudHome {

	private static final Log log = LogFactory.getLog(TblFulfillOrderPropAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFulfillOrderPropAud transientInstance) {
		log.debug("persisting TblFulfillOrderPropAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFulfillOrderPropAud persistentInstance) {
		log.debug("removing TblFulfillOrderPropAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFulfillOrderPropAud merge(TblFulfillOrderPropAud detachedInstance) {
		log.debug("merging TblFulfillOrderPropAud instance");
		try {
			TblFulfillOrderPropAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFulfillOrderPropAud findById(TblFulfillOrderPropAudId id) {
		log.debug("getting TblFulfillOrderPropAud instance with id: " + id);
		try {
			TblFulfillOrderPropAud instance = entityManager.find(TblFulfillOrderPropAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

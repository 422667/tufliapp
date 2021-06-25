package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFulfillOrderAud.
 * @see com.example.demo.order.model.TblFulfillOrderAud
 * @author Hibernate Tools
 */
@Stateless
public class TblFulfillOrderAudHome {

	private static final Log log = LogFactory.getLog(TblFulfillOrderAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFulfillOrderAud transientInstance) {
		log.debug("persisting TblFulfillOrderAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFulfillOrderAud persistentInstance) {
		log.debug("removing TblFulfillOrderAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFulfillOrderAud merge(TblFulfillOrderAud detachedInstance) {
		log.debug("merging TblFulfillOrderAud instance");
		try {
			TblFulfillOrderAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFulfillOrderAud findById(TblFulfillOrderAudId id) {
		log.debug("getting TblFulfillOrderAud instance with id: " + id);
		try {
			TblFulfillOrderAud instance = entityManager.find(TblFulfillOrderAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

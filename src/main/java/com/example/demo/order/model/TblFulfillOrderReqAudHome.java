package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFulfillOrderReqAud.
 * @see com.example.demo.order.model.TblFulfillOrderReqAud
 * @author Hibernate Tools
 */
@Stateless
public class TblFulfillOrderReqAudHome {

	private static final Log log = LogFactory.getLog(TblFulfillOrderReqAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFulfillOrderReqAud transientInstance) {
		log.debug("persisting TblFulfillOrderReqAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFulfillOrderReqAud persistentInstance) {
		log.debug("removing TblFulfillOrderReqAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFulfillOrderReqAud merge(TblFulfillOrderReqAud detachedInstance) {
		log.debug("merging TblFulfillOrderReqAud instance");
		try {
			TblFulfillOrderReqAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFulfillOrderReqAud findById(TblFulfillOrderReqAudId id) {
		log.debug("getting TblFulfillOrderReqAud instance with id: " + id);
		try {
			TblFulfillOrderReqAud instance = entityManager.find(TblFulfillOrderReqAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

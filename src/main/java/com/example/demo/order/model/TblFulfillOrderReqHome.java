package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblFulfillOrderReq.
 * @see com.example.demo.order.model.TblFulfillOrderReq
 * @author Hibernate Tools
 */
@Stateless
public class TblFulfillOrderReqHome {

	private static final Log log = LogFactory.getLog(TblFulfillOrderReqHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblFulfillOrderReq transientInstance) {
		log.debug("persisting TblFulfillOrderReq instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblFulfillOrderReq persistentInstance) {
		log.debug("removing TblFulfillOrderReq instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblFulfillOrderReq merge(TblFulfillOrderReq detachedInstance) {
		log.debug("merging TblFulfillOrderReq instance");
		try {
			TblFulfillOrderReq result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblFulfillOrderReq findById(long id) {
		log.debug("getting TblFulfillOrderReq instance with id: " + id);
		try {
			TblFulfillOrderReq instance = entityManager.find(TblFulfillOrderReq.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

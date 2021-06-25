package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblChangeReq.
 * @see com.example.demo.order.model.TblChangeReq
 * @author Hibernate Tools
 */
@Stateless
public class TblChangeReqHome {

	private static final Log log = LogFactory.getLog(TblChangeReqHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblChangeReq transientInstance) {
		log.debug("persisting TblChangeReq instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblChangeReq persistentInstance) {
		log.debug("removing TblChangeReq instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblChangeReq merge(TblChangeReq detachedInstance) {
		log.debug("merging TblChangeReq instance");
		try {
			TblChangeReq result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblChangeReq findById(long id) {
		log.debug("getting TblChangeReq instance with id: " + id);
		try {
			TblChangeReq instance = entityManager.find(TblChangeReq.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

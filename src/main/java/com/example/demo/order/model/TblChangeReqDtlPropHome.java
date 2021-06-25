package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblChangeReqDtlProp.
 * @see com.example.demo.order.model.TblChangeReqDtlProp
 * @author Hibernate Tools
 */
@Stateless
public class TblChangeReqDtlPropHome {

	private static final Log log = LogFactory.getLog(TblChangeReqDtlPropHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblChangeReqDtlProp transientInstance) {
		log.debug("persisting TblChangeReqDtlProp instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblChangeReqDtlProp persistentInstance) {
		log.debug("removing TblChangeReqDtlProp instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblChangeReqDtlProp merge(TblChangeReqDtlProp detachedInstance) {
		log.debug("merging TblChangeReqDtlProp instance");
		try {
			TblChangeReqDtlProp result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblChangeReqDtlProp findById(long id) {
		log.debug("getting TblChangeReqDtlProp instance with id: " + id);
		try {
			TblChangeReqDtlProp instance = entityManager.find(TblChangeReqDtlProp.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblChangeReqDtl.
 * @see com.example.demo.order.model.TblChangeReqDtl
 * @author Hibernate Tools
 */
@Stateless
public class TblChangeReqDtlHome {

	private static final Log log = LogFactory.getLog(TblChangeReqDtlHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblChangeReqDtl transientInstance) {
		log.debug("persisting TblChangeReqDtl instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblChangeReqDtl persistentInstance) {
		log.debug("removing TblChangeReqDtl instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblChangeReqDtl merge(TblChangeReqDtl detachedInstance) {
		log.debug("merging TblChangeReqDtl instance");
		try {
			TblChangeReqDtl result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblChangeReqDtl findById(long id) {
		log.debug("getting TblChangeReqDtl instance with id: " + id);
		try {
			TblChangeReqDtl instance = entityManager.find(TblChangeReqDtl.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

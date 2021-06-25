package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblChangeReqDtlRsc.
 * @see com.example.demo.order.model.TblChangeReqDtlRsc
 * @author Hibernate Tools
 */
@Stateless
public class TblChangeReqDtlRscHome {

	private static final Log log = LogFactory.getLog(TblChangeReqDtlRscHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblChangeReqDtlRsc transientInstance) {
		log.debug("persisting TblChangeReqDtlRsc instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblChangeReqDtlRsc persistentInstance) {
		log.debug("removing TblChangeReqDtlRsc instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblChangeReqDtlRsc merge(TblChangeReqDtlRsc detachedInstance) {
		log.debug("merging TblChangeReqDtlRsc instance");
		try {
			TblChangeReqDtlRsc result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblChangeReqDtlRsc findById(long id) {
		log.debug("getting TblChangeReqDtlRsc instance with id: " + id);
		try {
			TblChangeReqDtlRsc instance = entityManager.find(TblChangeReqDtlRsc.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

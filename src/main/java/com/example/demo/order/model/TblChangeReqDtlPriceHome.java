package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblChangeReqDtlPrice.
 * @see com.example.demo.order.model.TblChangeReqDtlPrice
 * @author Hibernate Tools
 */
@Stateless
public class TblChangeReqDtlPriceHome {

	private static final Log log = LogFactory.getLog(TblChangeReqDtlPriceHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblChangeReqDtlPrice transientInstance) {
		log.debug("persisting TblChangeReqDtlPrice instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblChangeReqDtlPrice persistentInstance) {
		log.debug("removing TblChangeReqDtlPrice instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblChangeReqDtlPrice merge(TblChangeReqDtlPrice detachedInstance) {
		log.debug("merging TblChangeReqDtlPrice instance");
		try {
			TblChangeReqDtlPrice result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblChangeReqDtlPrice findById(long id) {
		log.debug("getting TblChangeReqDtlPrice instance with id: " + id);
		try {
			TblChangeReqDtlPrice instance = entityManager.find(TblChangeReqDtlPrice.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

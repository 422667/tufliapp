package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblRscHist.
 * @see com.example.demo.order.model.TblRscHist
 * @author Hibernate Tools
 */
@Stateless
public class TblRscHistHome {

	private static final Log log = LogFactory.getLog(TblRscHistHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblRscHist transientInstance) {
		log.debug("persisting TblRscHist instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblRscHist persistentInstance) {
		log.debug("removing TblRscHist instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblRscHist merge(TblRscHist detachedInstance) {
		log.debug("merging TblRscHist instance");
		try {
			TblRscHist result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblRscHist findById(long id) {
		log.debug("getting TblRscHist instance with id: " + id);
		try {
			TblRscHist instance = entityManager.find(TblRscHist.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

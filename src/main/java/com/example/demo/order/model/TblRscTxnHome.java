package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblRscTxn.
 * @see com.example.demo.order.model.TblRscTxn
 * @author Hibernate Tools
 */
@Stateless
public class TblRscTxnHome {

	private static final Log log = LogFactory.getLog(TblRscTxnHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblRscTxn transientInstance) {
		log.debug("persisting TblRscTxn instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblRscTxn persistentInstance) {
		log.debug("removing TblRscTxn instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblRscTxn merge(TblRscTxn detachedInstance) {
		log.debug("merging TblRscTxn instance");
		try {
			TblRscTxn result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblRscTxn findById(long id) {
		log.debug("getting TblRscTxn instance with id: " + id);
		try {
			TblRscTxn instance = entityManager.find(TblRscTxn.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

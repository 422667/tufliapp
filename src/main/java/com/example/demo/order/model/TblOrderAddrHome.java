package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderAddr.
 * @see com.example.demo.order.model.TblOrderAddr
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderAddrHome {

	private static final Log log = LogFactory.getLog(TblOrderAddrHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderAddr transientInstance) {
		log.debug("persisting TblOrderAddr instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderAddr persistentInstance) {
		log.debug("removing TblOrderAddr instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderAddr merge(TblOrderAddr detachedInstance) {
		log.debug("merging TblOrderAddr instance");
		try {
			TblOrderAddr result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderAddr findById(long id) {
		log.debug("getting TblOrderAddr instance with id: " + id);
		try {
			TblOrderAddr instance = entityManager.find(TblOrderAddr.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

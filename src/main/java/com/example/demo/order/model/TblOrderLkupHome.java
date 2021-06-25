package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderLkup.
 * @see com.example.demo.order.model.TblOrderLkup
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderLkupHome {

	private static final Log log = LogFactory.getLog(TblOrderLkupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderLkup transientInstance) {
		log.debug("persisting TblOrderLkup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderLkup persistentInstance) {
		log.debug("removing TblOrderLkup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderLkup merge(TblOrderLkup detachedInstance) {
		log.debug("merging TblOrderLkup instance");
		try {
			TblOrderLkup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderLkup findById(Long id) {
		log.debug("getting TblOrderLkup instance with id: " + id);
		try {
			TblOrderLkup instance = entityManager.find(TblOrderLkup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

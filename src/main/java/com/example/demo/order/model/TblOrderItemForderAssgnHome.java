package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemForderAssgn.
 * @see com.example.demo.order.model.TblOrderItemForderAssgn
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemForderAssgnHome {

	private static final Log log = LogFactory.getLog(TblOrderItemForderAssgnHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemForderAssgn transientInstance) {
		log.debug("persisting TblOrderItemForderAssgn instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemForderAssgn persistentInstance) {
		log.debug("removing TblOrderItemForderAssgn instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemForderAssgn merge(TblOrderItemForderAssgn detachedInstance) {
		log.debug("merging TblOrderItemForderAssgn instance");
		try {
			TblOrderItemForderAssgn result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemForderAssgn findById(long id) {
		log.debug("getting TblOrderItemForderAssgn instance with id: " + id);
		try {
			TblOrderItemForderAssgn instance = entityManager.find(TblOrderItemForderAssgn.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

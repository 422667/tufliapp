package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderItemRsc.
 * @see com.example.demo.order.model.TblOrderItemRsc
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderItemRscHome {

	private static final Log log = LogFactory.getLog(TblOrderItemRscHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderItemRsc transientInstance) {
		log.debug("persisting TblOrderItemRsc instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderItemRsc persistentInstance) {
		log.debug("removing TblOrderItemRsc instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderItemRsc merge(TblOrderItemRsc detachedInstance) {
		log.debug("merging TblOrderItemRsc instance");
		try {
			TblOrderItemRsc result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderItemRsc findById(long id) {
		log.debug("getting TblOrderItemRsc instance with id: " + id);
		try {
			TblOrderItemRsc instance = entityManager.find(TblOrderItemRsc.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

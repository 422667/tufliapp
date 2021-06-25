package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderMeta.
 * @see com.example.demo.order.model.TblOrderMeta
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderMetaHome {

	private static final Log log = LogFactory.getLog(TblOrderMetaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderMeta transientInstance) {
		log.debug("persisting TblOrderMeta instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderMeta persistentInstance) {
		log.debug("removing TblOrderMeta instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderMeta merge(TblOrderMeta detachedInstance) {
		log.debug("merging TblOrderMeta instance");
		try {
			TblOrderMeta result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderMeta findById(long id) {
		log.debug("getting TblOrderMeta instance with id: " + id);
		try {
			TblOrderMeta instance = entityManager.find(TblOrderMeta.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

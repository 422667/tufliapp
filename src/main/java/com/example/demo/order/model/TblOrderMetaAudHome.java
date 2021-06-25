package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblOrderMetaAud.
 * @see com.example.demo.order.model.TblOrderMetaAud
 * @author Hibernate Tools
 */
@Stateless
public class TblOrderMetaAudHome {

	private static final Log log = LogFactory.getLog(TblOrderMetaAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblOrderMetaAud transientInstance) {
		log.debug("persisting TblOrderMetaAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblOrderMetaAud persistentInstance) {
		log.debug("removing TblOrderMetaAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblOrderMetaAud merge(TblOrderMetaAud detachedInstance) {
		log.debug("merging TblOrderMetaAud instance");
		try {
			TblOrderMetaAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblOrderMetaAud findById(TblOrderMetaAudId id) {
		log.debug("getting TblOrderMetaAud instance with id: " + id);
		try {
			TblOrderMetaAud instance = entityManager.find(TblOrderMetaAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

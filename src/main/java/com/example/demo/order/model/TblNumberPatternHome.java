package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblNumberPattern.
 * @see com.example.demo.order.model.TblNumberPattern
 * @author Hibernate Tools
 */
@Stateless
public class TblNumberPatternHome {

	private static final Log log = LogFactory.getLog(TblNumberPatternHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblNumberPattern transientInstance) {
		log.debug("persisting TblNumberPattern instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblNumberPattern persistentInstance) {
		log.debug("removing TblNumberPattern instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblNumberPattern merge(TblNumberPattern detachedInstance) {
		log.debug("merging TblNumberPattern instance");
		try {
			TblNumberPattern result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblNumberPattern findById(Long id) {
		log.debug("getting TblNumberPattern instance with id: " + id);
		try {
			TblNumberPattern instance = entityManager.find(TblNumberPattern.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

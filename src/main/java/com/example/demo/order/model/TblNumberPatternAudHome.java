package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TblNumberPatternAud.
 * @see com.example.demo.order.model.TblNumberPatternAud
 * @author Hibernate Tools
 */
@Stateless
public class TblNumberPatternAudHome {

	private static final Log log = LogFactory.getLog(TblNumberPatternAudHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TblNumberPatternAud transientInstance) {
		log.debug("persisting TblNumberPatternAud instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TblNumberPatternAud persistentInstance) {
		log.debug("removing TblNumberPatternAud instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TblNumberPatternAud merge(TblNumberPatternAud detachedInstance) {
		log.debug("merging TblNumberPatternAud instance");
		try {
			TblNumberPatternAud result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TblNumberPatternAud findById(TblNumberPatternAudId id) {
		log.debug("getting TblNumberPatternAud instance with id: " + id);
		try {
			TblNumberPatternAud instance = entityManager.find(TblNumberPatternAud.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

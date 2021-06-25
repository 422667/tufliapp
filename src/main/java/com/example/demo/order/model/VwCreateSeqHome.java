package com.example.demo.order.model;
// Generated 1 Mar, 2021 1:11:44 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class VwCreateSeq.
 * @see com.example.demo.order.model.VwCreateSeq
 * @author Hibernate Tools
 */
@Stateless
public class VwCreateSeqHome {

	private static final Log log = LogFactory.getLog(VwCreateSeqHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(VwCreateSeq transientInstance) {
		log.debug("persisting VwCreateSeq instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(VwCreateSeq persistentInstance) {
		log.debug("removing VwCreateSeq instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public VwCreateSeq merge(VwCreateSeq detachedInstance) {
		log.debug("merging VwCreateSeq instance");
		try {
			VwCreateSeq result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public VwCreateSeq findById(String id) {
		log.debug("getting VwCreateSeq instance with id: " + id);
		try {
			VwCreateSeq instance = entityManager.find(VwCreateSeq.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

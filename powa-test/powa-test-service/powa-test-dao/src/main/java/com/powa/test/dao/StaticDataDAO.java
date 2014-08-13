package com.powa.test.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.powa.test.dao.model.Country;

@Stateless
public class StaticDataDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Country> getAllCountries() {
		TypedQuery<Country> q = entityManager.createNamedQuery("getAllCountries", Country.class);
		return q.getResultList();
	}

}

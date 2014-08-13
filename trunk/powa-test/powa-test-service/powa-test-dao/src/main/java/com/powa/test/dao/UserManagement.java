package com.powa.test.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.powa.test.dao.model.UserProfile;

@Stateless
public class UserManagement {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public UserManagement() {
	}
	
	UserManagement(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public UserProfile getUserProfile(Long userID) {
		return entityManager.find(UserProfile.class, userID);
	}
}

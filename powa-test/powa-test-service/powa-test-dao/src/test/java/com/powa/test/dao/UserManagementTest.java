package com.powa.test.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.BeforeClass;
import org.junit.Test;

import com.powa.test.dao.model.UserProfile;

public class UserManagementTest {
	
	private static EntityManager entityManager;
	
	@BeforeClass
	public static final void setup() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("powa.test.test");
		entityManager = emf.createEntityManager();
	}

	@Test
	public void test() {
		entityManager.find(UserProfile.class, 1L);
	}

}

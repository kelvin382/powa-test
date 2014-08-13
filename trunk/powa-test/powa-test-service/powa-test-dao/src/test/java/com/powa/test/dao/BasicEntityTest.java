package com.powa.test.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.BeforeClass;
import org.junit.Test;

import com.powa.test.dao.model.Address;
import com.powa.test.dao.model.Country;
import com.powa.test.dao.model.CreditCard;
import com.powa.test.dao.model.UserProfile;

public class BasicEntityTest {
	
	private static EntityManager entityManager;
	
	@BeforeClass
	public static final void setup() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("powa.test.test");
		entityManager = emf.createEntityManager();
	}

	@Test
	public void test() {
		entityManager.find(UserProfile.class, 1L);
		entityManager.find(Address.class, 1L);
		entityManager.find(CreditCard.class, "4111111111111111");
		entityManager.find(Country.class, "HK");
	}

}

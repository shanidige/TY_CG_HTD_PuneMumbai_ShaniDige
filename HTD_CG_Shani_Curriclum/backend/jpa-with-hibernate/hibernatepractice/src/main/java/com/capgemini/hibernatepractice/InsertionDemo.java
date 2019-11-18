package com.capgemini.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernatepractice.dto.Shows;

public class InsertionDemo {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		Shows s = new Shows();
		s.setId(5);
		s.setName("mix melody");
		s.setTrp(60);

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(s);
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();

	}

}

package com.capgemini.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.hibernatepractice.dto.Shows;

public class Detach {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Shows data = entityManager.find(Shows.class, 2);
			System.out.println(data.getId());
			System.out.println(entityManager.contains(data));
			entityManager.detach(data);
			System.out.println(entityManager.contains(data));
			Shows Shows1 = (entityManager.merge(data));
			Shows1.setName("big boss");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}

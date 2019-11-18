package com.capgemini.jpawithhibernat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.japwithhibernat.dto.movie;

public class Detach {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			movie data = entityManager.find(movie.class, 2);
			System.out.println(data.getId());
			System.out.println(entityManager.contains(data));
			entityManager.detach(data);
			System.out.println(entityManager.contains(data));
			movie movie1 = (entityManager.merge(data));
			movie1.setMname("kai po che");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}

}

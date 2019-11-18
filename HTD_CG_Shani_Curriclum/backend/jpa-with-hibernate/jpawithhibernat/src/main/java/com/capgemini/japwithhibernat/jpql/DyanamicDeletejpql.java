package com.capgemini.japwithhibernat.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DyanamicDeletejpql {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "delete from movie where id=:mid";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("mid", 3);
		int result = query.executeUpdate();
		transaction.commit();
		System.out.println("result is " + result);

		entityManager.close();
	}

}

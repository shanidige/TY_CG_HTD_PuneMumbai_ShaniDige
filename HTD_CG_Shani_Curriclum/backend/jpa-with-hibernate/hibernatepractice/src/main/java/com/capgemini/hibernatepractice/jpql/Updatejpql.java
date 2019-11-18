package com.capgemini.hibernatepractice.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.capgemini.hibernatepractice.dto.Shows;
public class Updatejpql {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		String jpql="update Shows set id=5 where id=2";
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query=entityManager.createQuery(jpql);
		int result=query.executeUpdate();
		System.out.println("result is "+result);
		transaction.commit();
	entityManager.close();
	}

}

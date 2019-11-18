package com.capgemini.hibernatepractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.hibernatepractice.dto.Shows;


public class RetrieveDemo {

	public static void main(String[] args) {
		
		Shows s = new Shows();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Shows data=entityManager.find(Shows.class, 5);
		System.out.println("id is "+data.getId());
		System.out.println("name is "+data.getName());
		System.out.println("trp is"+data.getTrp());

	}

}

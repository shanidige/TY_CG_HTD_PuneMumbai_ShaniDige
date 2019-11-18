package com.capgemini.jpawithhibernat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgeminni.one_to_one_association.Person;
import com.capgeminni.one_to_one_association.VoterCard;

public class Test_one_to_one {

	public static void main(String[] args) {
		Person p = new Person();
		p.setPid(10);
		p.setName("shani");
		VoterCard vc = new VoterCard();
		vc.setVoter_id(12345);
		vc.setAdress("mumbai");
		p.setVoterCard(vc);

		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			// entityManager.persist(p);
			VoterCard carddetails = entityManager.find(VoterCard.class, 12345);
			carddetails.getVoter_id();
			carddetails.getAdress();
			carddetails.getPerson().getPid();
			carddetails.getPerson().getName();

			System.out.println("saved");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();

	}

}

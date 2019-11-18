package com.capgemini.jpawithhibernat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.capgenimini.japawithhibernat.one_to_many.Pencil;
import com.capgenimini.japawithhibernat.one_to_many.PencilBox;

public class Testone_to_many {

	public static void main(String[] args) {
		
		PencilBox pencilBox = new PencilBox();
		pencilBox.setBoxid(3);
		pencilBox.setName("camlin");

		Pencil pencil = new Pencil();
		pencil.setPid(13);
		pencil.setClour("black");
		pencil.setPencilbox(pencilBox);

		Pencil pencil2 = new Pencil();
		pencil2.setPid(23);
		pencil2.setClour("red");
		pencil2.setPencilbox(pencilBox);

		
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil2);
			System.out.println("record inserted");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			
		}
		entityManager.close();
	}

}

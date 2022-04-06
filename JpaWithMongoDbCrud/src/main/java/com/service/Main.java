package com.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     EntityManagerFactory emf=Persistence.createEntityManagerFactory("test");
     EntityManager manager=emf.createEntityManager();
     EntityTransaction tx=manager.getTransaction();
     Student obj=new Student();
     obj.setId(1);
     obj.setName("saisatya");
     obj.setMarks(100);
     tx.begin();
     manager.persist(obj);
     tx.commit();
     System.out.println("record inserted successfully");
	}

}

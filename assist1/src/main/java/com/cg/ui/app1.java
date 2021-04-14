package com.cg.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.entity.Author;
import com.cg.util.util;

public class app1 {
	public static final Scanner obj = new Scanner(System.in);

	public static void main(String args[]) {

		EntityManager em = util.getConnection().createEntityManager();

		Author a1 = new Author("Ram", "Ravi", "aggarwal", "9876543211");
		Author a2 = new Author("sham", "chandan", "goel", "9982332444");
		Author a3 = new Author("simar", "psy", "sethi", "9322324344");
		Author a4 = new Author("rohit", "ram", "chopra", "9322324234");
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		txn.commit();

	}
}

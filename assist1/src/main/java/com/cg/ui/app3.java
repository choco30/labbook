package com.cg.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.entity.Author;
import com.cg.util.util;

public class app3 {
	public static final Scanner obj = new Scanner(System.in);

	public static void main(String args[]) {
		EntityManager em = util.getConnection().createEntityManager();
		System.out.print("enter the author id you want to delete");
		Long a = obj.nextLong();
		Author auth = em.find(Author.class, a);
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			em.remove(auth);
			txn.commit();
		} catch (Exception e) {
			e.getMessage();
		}
	}
}

package com.cg.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cg.entity.Author;
import com.cg.util.util;

public class app2 {
	public static final Scanner obj = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = util.getConnection().createEntityManager();
		System.out.println("enter the record you want to find");
		Long aLong = obj.nextLong();
		Author author = em.find(Author.class, aLong);
		System.out.print(author);
	}

}

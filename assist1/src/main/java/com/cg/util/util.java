package com.cg.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class util {
	public static final EntityManagerFactory getConnection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("oracle-assist1");
		return emf;
	}
}

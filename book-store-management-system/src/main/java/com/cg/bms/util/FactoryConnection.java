package com.cg.bms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {
public static Connection getConnection()throws SQLException {
	return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
}
}

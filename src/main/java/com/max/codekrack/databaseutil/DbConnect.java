package com.max.codekrack.databaseutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

		private static String serverName = "cst341.ciup2ftf67sz.us-east-2.rds.amazonaws.com";
	    private static String mydatabase = "/test";
	    private static String url = "jdbc:mysql://" + serverName ;
	    private static String user = "cst341";
		private static String pass = "cst341!!";
	    
	    public static Connection connection;
		
		static {
			try {
				connection = DriverManager.getConnection(url, user, pass);
				System.err.println("Connected");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println("Did not connect!");
				e.printStackTrace();
			}
		}
}

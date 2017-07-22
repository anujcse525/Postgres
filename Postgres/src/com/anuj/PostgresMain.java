package com.anuj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Git from Eclipse");
		
		Connection c = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/learndb",
	            "postgres", "post");
	         TableOperations.createTable(c);
	         //TableOperations.insertData(c);
	         TableOperations.showData(c);
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      finally {
	    	  try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	      System.out.println("Opened database successfully");
	}

}

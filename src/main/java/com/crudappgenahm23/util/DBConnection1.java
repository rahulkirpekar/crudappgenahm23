package com.crudappgenahm23.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection1
{
 
 private static final String URLNAME = "jdbc:mysql://localhost:3306/ocjp";
 private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
 private static final String USERNAME = "root";	
 private static final String PASSWORD = "root";
	
 public static void getConnection() 
 {
	 try 
	 {
		Class.forName(DRIVERCLASS);

		Connection conn = DriverManager.getConnection(URLNAME,USERNAME,PASSWORD);
		
		if(conn != null) 
		{
			System.out.println("DB Connetion Succesful1 !");
		}
		else 
		{
			System.out.println("DB Connetion Not Succesful1 !");
		}
	 } 
	 catch (Exception e) 
	 {
		e.printStackTrace();
	 }
	 
 }
 
 
 
 
 public static void main(String[] args) 
 {
	DBConnection1.getConnection();
 }
}

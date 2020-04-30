package com.LearnJDBC;

import java.sql.*;


public class JDBCDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Load and register the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		/*Loading class `com.mysql.jdbc.Driver'. This is deprecated. 
		The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI
		 and manual loading of the driver class is generally unnecessary.*/
		
		String url="jdbc:mysql://127.0.0.1:3306/employees_database";
		
		//Establish connection object
		Connection conn = DriverManager.getConnection(url,"root","Education1");
		
		//Create a statement object to send to database
		Statement statement = conn.createStatement();
		
		//Execute the statement
		
		 ResultSet resultSet=statement.executeQuery("select * from employees_tbl");
		 
		 //process the result set
		 
		 while(resultSet.next()) {
			 
			 System.out.println(resultSet.getInt(1));
			 
		 }
		
		
		
	}

}

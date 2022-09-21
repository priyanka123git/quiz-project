package com.velocity.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentData {
	public static void main(String[] args) throws
	ClassNotFoundException, SQLException {
	try {
	String sql = "insert into student(id,Firstname,Lastname,Score)"
	+ "values(1,'ram','Pawar',)";
	// load the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	// establish the connection 
	Connection con =
	DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "Aditya@123");
	// create the sql statement
	Statement statement = con.createStatement();
	// submit the sql statement to database..
	//statement.executeUpdate(sql);
	statement.execute(sql);
	System.out.println("Insertion successfully...");
	// close the resources. 
	con.close(); 
	statement.close();
	} catch (Exception e) {
	System.out.println(e);

	}
	}
}

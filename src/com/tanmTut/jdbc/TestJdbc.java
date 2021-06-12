package com.tanmTut.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/?user=hbstudent?useSSL=false";
		String jdbcUrl2 = "jdbc:mysql://127.0.0.1:3306/?user=hb_student_tracker?useSSL=false";
		String user="hbstudent";
		String pass="hbstudent";
		try {
			System.out.println();
Connection conn = DriverManager.getConnection(jdbcUrl,user, pass);
System.out.println("conncted");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

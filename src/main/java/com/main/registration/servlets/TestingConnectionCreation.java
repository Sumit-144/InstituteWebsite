package com.main.registration.servlets;

import java.sql.Connection;

public class TestingConnectionCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = TestConn.createConnection();
		if (connection!=null) {
			System.out.println("connection created...");
		}else System.out.println("not");

	}

}

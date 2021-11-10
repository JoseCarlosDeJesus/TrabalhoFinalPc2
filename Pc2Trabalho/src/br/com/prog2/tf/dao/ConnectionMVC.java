package br.com.prog2.tf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMVC {
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc?useSSl=false", "root", "ifb");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}

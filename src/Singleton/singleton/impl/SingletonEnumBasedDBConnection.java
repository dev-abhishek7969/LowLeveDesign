package Singleton.singleton.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum SingletonEnumBasedDBConnection {

	INSTANCE;

	private Connection connection;

	SingletonEnumBasedDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		return connection;
	}

	public static void main(String[] args) throws SQLException {
		Connection conn = SingletonEnumBasedDBConnection.INSTANCE.getConnection();
		System.out.println("DB Connection: " + conn);
	}
}

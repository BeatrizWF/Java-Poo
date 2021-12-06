package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection con = null;
	private String user = "root";
	private String pass = "123#4Ever";

	public void close() {
		if (con != null) {
			try {
				System.out.println("Closing database connection to sampleDB");
				con.close();
			} catch (SQLException e) {
				System.out.printf("Falha ao fechar a conexão, %s", e);
				System.out.println();
			}
			con = null;
		}
	}

	public Connection getConnection() throws SQLException {
		if (con == null) {
			System.out.println("Conectando com BD");
			con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-J3VM4A85:1433;instanceName=SQLEXPRESSDB;databaseName=BD", user, pass);
			con.createStatement().execute("use todolist"); 
		}
		return con;
	}
}

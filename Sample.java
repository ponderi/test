package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample {
	public static void main(String[] args) {
		Connection conn = null;

		try {
			String url="jdbc:mysql://localhost/test?useSSL=false";
			String user="root";
			String password="12345";
			conn = DriverManager.getConnection(url, user, password);

			Statement stmt = conn.createStatement();
		}catch (SQLException e){
			System.out.println("SQLException:" + e.getMessage());
		}
	}

}

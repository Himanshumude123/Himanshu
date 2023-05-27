package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Showroom {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom", "root", "test");

			Statement stmnt = con.createStatement();

			ResultSet result = stmnt.executeQuery("select * from customer");

			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
						+ result.getString(4) + " " + result.getString(5) + " " + result.getString(6));
				System.out.println();
			}

			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

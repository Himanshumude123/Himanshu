package jdbc.newConnection;

import java.sql.*;

public class Connection1 {

	static Connection con;
	public static final String url = "jdbc:mysql://localhost:3306/showroom";
	public static final String user = "root";
	public static final String password = "test";

	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		con = DriverManager.getConnection(url, user, password);

		return con;
	}
}

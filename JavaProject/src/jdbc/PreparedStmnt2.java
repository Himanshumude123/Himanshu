package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStmnt2 {

	Connection con = null;
	PreparedStatement ps = null;
	Scanner sc = new Scanner(System.in);

	PreparedStmnt2() throws ClassNotFoundException, SQLException {
		con = DefaultConnections.getConnection();
	}

	void insert() throws SQLException {
		ps = con.prepareStatement("insert into product values(?,?)");
		System.out.println("Enter product id");
		int p_id = sc.nextInt();
		System.out.println("Enter product name");
		String p_name = sc.next();
		ps.setInt(1, p_id);
		ps.setString(2, p_name);
		int s = ps.executeUpdate();
		System.out.println(s + " row inserted");
	}

	void show() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from product");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
		}
	}

	void search() throws SQLException {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from product");
		
		System.out.println("Enter the product id you want to search");
		int pro_id = sc.nextInt();
		int flag = 0;
		while (rs.next()) {
			int id = rs.getInt(1);
			if (id == pro_id) {
				flag = 1;
				break;

			}

		}
		if (flag == 1) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));

		} else
			System.out.println("sorry given id not available");
	}

	public static void main(String[] args) {
		PreparedStmnt2 ps;
		try {
			ps = new PreparedStmnt2();
			// ps.insert();
			// ps.show();
			ps.search();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}

package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStmnt {

	Connection con;
	PreparedStatement ps;

	Scanner sc = new Scanner(System.in);

	PreparedStmnt() throws ClassNotFoundException, SQLException {

		con = DefaultConnections.getConnection();
	}

	void insert() throws SQLException {

		ps = con.prepareStatement("insert into customer values (?,?,?,?,?,?) ");

		System.out.println("Enter the Customer id : ");
		int Cust_id = sc.nextInt();

		System.out.println("Enter the First Name Of Customer : ");
		String first_name = sc.next();

		System.out.println("Enter the Last Name of Customer : ");
		String last_name = sc.next();

		System.out.println("Enter the Mobile Number : ");
		String mobile_number = sc.next();

		System.out.println("Enter the Gender of Customer : ");
		String gender = sc.next();

		System.out.println("Enter the Email of Customer : ");
		String email = sc.next();

		ps.setInt(1, Cust_id);
		ps.setString(2, first_name);
		ps.setString(3, last_name);
		ps.setString(4, mobile_number);
		ps.setString(5, gender);
		ps.setString(6, email);

		int row = ps.executeUpdate();
		System.out.println(row + " rows Affected...!");

	}

	void show() throws SQLException {
		Statement stmnt = con.createStatement();
		ResultSet result = stmnt.executeQuery("Select * from customer");

		while (result.next()) {

			System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
					+ result.getString(4) + " " + result.getString(5) + " " + result.getString(6));
		}

	}

	void update() throws SQLException {

		ps = con.prepareStatement("update customer set first_name = ? where cust_id = ?");

		System.out.println("Enter the First Name : ");
		String first_name = sc.next();

		System.out.println("Enter the customer id you want to update : ");
		int cust_id = sc.nextInt();

		ps.setString(1, first_name);
		ps.setInt(2, cust_id);

		int row = ps.executeUpdate();
		System.out.println(row + " Rows Affected...!");

	}

	void delete() throws SQLException {

		ps = con.prepareStatement("delete from customer where cust_id = ? ");

		System.out.println("Enter the Customer Id You want to delete ");
		int cust_id = sc.nextInt();

		ps.setInt(1, cust_id);
		int row = ps.executeUpdate();
		System.out.println(row + " Rows Affected...!");

	}

	public static void main(String[] args) {

		PreparedStmnt p;

		try {
			p = new PreparedStmnt();

			System.out.println("---Insert---");
			p.insert();
			System.out.println("---Retrive---");
			p.show();
			System.out.println("---Update---");
			p.update();
			System.out.println("---Delete---");
			p.delete();
			System.out.println("-----END-------");

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}

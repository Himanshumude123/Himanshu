package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatements {

	Connection con;
	CallableStatement cs;

	Scanner sc = new Scanner(System.in);

	CallableStatements() throws ClassNotFoundException, SQLException {
		con = DefaultConnections.getConnection();
	}

	void callProcedure() throws SQLException {

		cs = con.prepareCall("{call procedure_1()}");

		boolean b = cs.execute();

		if (b == true) {

			ResultSet res = cs.getResultSet();

			while (res.next()) {

				System.out.println(res.getInt(1) + " " + res.getString(3) + " " + res.getString(4) + " "
						+ res.getString(5) + " " + res.getString(6));
			}

			boolean b1 = cs.getMoreResults();

			System.out.println("----------");

			if (b1 == true) {
				ResultSet res1 = cs.getResultSet();

				while (res1.next()) {

					System.out.println(
							res1.getInt(1) + " " + res1.getString(2) + " " + res1.getString(3) + " " + res1.getInt(4));
				}
			}
		}
	}

	public static void main(String[] args) {

		try {
			CallableStatements stmnt = new CallableStatements();
			stmnt.callProcedure();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

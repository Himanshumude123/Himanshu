package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetTypes {

	Connection con;
	Statement stmnt;

	ResultSetTypes() throws ClassNotFoundException, SQLException {
		con = DefaultConnections.getConnection();
		stmnt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

	}

	void showFirst() throws SQLException {

		ResultSet res = stmnt.executeQuery("select * from model");
		res.first();

		System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3) + " " + res.getInt(4));

	}

	void showLast() throws SQLException {

		ResultSet res = stmnt.executeQuery("Select * from model");
		res.last();

		System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3) + " " + res.getInt(4));

	}

	void backword() throws SQLException {

		ResultSet res = stmnt.executeQuery("Select * from model");
		res.afterLast();

		while (res.previous()) {
			System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3) + " " + res.getInt(4));
		}
	}

	void showMid() throws SQLException {

		ResultSet res = stmnt.executeQuery("Select * from model");
		res.absolute(3);

		System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3) + " " + res.getInt(4));

	}

	void update(int id) throws SQLException {

		ResultSet rs = stmnt.executeQuery("Select * from model");

		rs.beforeFirst();

		while (rs.next()) {

			int m_id = rs.getInt(1);

			if (m_id == id) {
				rs.updateInt(4, 450000);
				rs.updateRow();

			}

		}
		System.out.println("Update Successfully...!");
	}

	void delete(int id) throws SQLException {

		ResultSet rs = stmnt.executeQuery("Select * from model");
		rs.beforeFirst();

		while (rs.next()) {

			int m_id = rs.getInt(1);

			if (m_id == id) {
				rs.deleteRow();
			}
		}

		System.out.println("Row Delete Successfully...!");
	}

	void insert() throws SQLException {

		ResultSet rs = stmnt.executeQuery("Select * from model");

		rs.moveToInsertRow();
		rs.updateInt(1, 105);
		rs.updateString(2, "bullet");
		rs.updateString(3, "RoyalEnfield");
		rs.updateInt(4, 160000);

		rs.insertRow();

		System.out.println("Insert Successfully...!");
	}

	public static void main(String[] args) {
		ResultSetTypes rest;
		try {
			rest = new ResultSetTypes();

			System.out.println(" ----First Record----");
			rest.showFirst();

			System.out.println("\n ----Last Record----");
			rest.showLast();

			System.out.println("\n ----Backword----");
			rest.backword();

			System.out.println("\n ----Middle----");
			rest.showMid();

			System.out.println("\n ----Update----");
			rest.update(103);

			System.out.println("\n ----Delete----");
			rest.delete(102);

			System.out.println("\n ----Insert----");
			rest.insert();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

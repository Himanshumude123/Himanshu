package jdbc.newConnection;

import java.sql.*;

public class CrudOperations {

	Connection con = null;
	Statement stmnt;

	CrudOperations() throws ClassNotFoundException, SQLException {

		con = Connection1.getConnection();
	}

	public void insert() throws SQLException {

		stmnt = con.createStatement();
		int a = stmnt.executeUpdate("insert into customer values(5,'pinky','Sherawat','87987878','female','pinky@gmail.com')");
		System.out.println(a + " row inserted");
	}  

	void retrive() throws SQLException {
		stmnt = con.createStatement();
		ResultSet rs = stmnt.executeQuery("select * from customer");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
					+ " " + rs.getString(5));
		}
	}

	void update() throws SQLException {
		stmnt = con.createStatement();
		int a = stmnt.executeUpdate("update customer set mobile_number='9898989810' where cust_id=2");
		System.out.println(a + " row updated");
	}

	void delete() throws SQLException {
		stmnt = con.createStatement();
		int a = stmnt.executeUpdate("delete from customer where cust_id=5");
		System.out.println(a + " row deleted");

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CrudOperations cd = new CrudOperations();
		// cd.insert();
		cd.retrive();
		cd.update();
		cd.delete();
	}
}

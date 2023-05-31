package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBatch {

	Connection con;
	Statement stmnt;

	public AddBatch() throws ClassNotFoundException, SQLException {

		con = DefaultConnections.getConnection();
	}

	void add() throws SQLException {

		stmnt = con.createStatement();

		stmnt.addBatch("insert into product values (7, 'Cover' )");
		stmnt.addBatch("update product set product_name = 'Remote' where product_id = 6");
		stmnt.addBatch("delete from product where product_id = 3");

		int[] batch = stmnt.executeBatch();

		for (int i = 0; i < batch.length; i++) {
			System.out.println(batch[i] + " Rows Affected...!");
		}
	}

	public static void main(String[] args) {

		try {
			AddBatch a = new AddBatch();
			a.add();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

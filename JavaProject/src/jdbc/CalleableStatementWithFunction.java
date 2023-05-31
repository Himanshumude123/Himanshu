package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CalleableStatementWithFunction {

	Connection con = null;

	CalleableStatementWithFunction() throws ClassNotFoundException, SQLException {
		con = DefaultConnections.getConnection();
	}

	void show_data(int amount) throws ClassNotFoundException, SQLException {

		String sql = "{?=call discount(?)}";
		CallableStatement cs = con.prepareCall(sql);
		cs.registerOutParameter(1, Types.INTEGER);
		cs.setInt(2, amount);

		cs.execute();

		int temp = cs.getInt(1);
		System.out.println(temp);
	}

	void show_data2(String first, String second) throws ClassNotFoundException, SQLException {

		String sql = "{?=call Merging(?,?)}";
		CallableStatement cs = con.prepareCall(sql);
		cs.registerOutParameter(1, Types.VARCHAR);
		cs.setString(2, first);
		cs.setString(3, second);

		cs.execute();

		String temp = cs.getString(1);
		System.out.println(temp);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CalleableStatementWithFunction cs = new CalleableStatementWithFunction();
		cs.show_data(2900);
		cs.show_data2("pooja", "sharma");

	}

}

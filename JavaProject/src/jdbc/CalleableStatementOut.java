package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CalleableStatementOut {

	Connection con;
	CallableStatement cs;

	CalleableStatementOut() throws ClassNotFoundException, SQLException {

		con = DefaultConnections.getConnection();
	}

	void showDate(int m_id) throws SQLException {
		String sql = "{call procedure_4(?,?)}";
		CallableStatement cs = con.prepareCall(sql);
		cs.setInt(1, m_id);
		cs.registerOutParameter(2, Types.INTEGER);

		boolean b = cs.execute();
		if (b == false)
			System.out.println(cs.getInt(2));
	}

	public static void main(String[] args) {

		CalleableStatementOut cs;

		try {
			cs = new CalleableStatementOut();
			cs.showDate(104);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

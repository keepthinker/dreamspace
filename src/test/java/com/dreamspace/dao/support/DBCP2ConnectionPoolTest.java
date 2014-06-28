package com.dreamspace.dao.support;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import junit.framework.TestCase;

public class DBCP2ConnectionPoolTest extends TestCase {

	public void testGetConnection() {
		Connection con=DatabaseHelper.getConnectionFromDBCP2();
		Statement st=null;
		ResultSet rs = null;
		assertNotNull(con);
		if(con==null)
			return;
		String sql="select * from user";
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(2));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DatabaseUtils.close(rs, st, con);
		}
	}

	public void testPrintDataSourceStates() {
	}

}

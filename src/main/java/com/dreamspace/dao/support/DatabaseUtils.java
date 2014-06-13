package com.dreamspace.dao.support;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseUtils {
	/**
	 * close resultSet, preparedStatement, connection
	 * @param con
	 * @param ps
	 * @param rs
	 */
	public static void close(ResultSet rs,PreparedStatement ps,Connection con){
		try { if (rs != null) rs.close(); } catch(Exception e) { e.printStackTrace();}
		try { if (ps != null) ps.close(); } catch(Exception e) { e.printStackTrace(); }
		try { if (con != null) con.close(); } catch(Exception e) { e.printStackTrace(); }
	}
	public static void close(ResultSet rs,Statement st,Connection con){
		try { if (rs != null) rs.close(); } catch(Exception e) { e.printStackTrace();}
		try { if (st != null) st.close(); } catch(Exception e) { e.printStackTrace(); }
		try { if (con != null) con.close(); } catch(Exception e) { e.printStackTrace(); }
	}
}

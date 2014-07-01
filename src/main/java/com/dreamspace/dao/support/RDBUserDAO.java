package com.dreamspace.dao.support;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dreamspace.bean.RegisterInfo;
import com.dreamspace.bean.User;
import com.dreamspace.dao.UserDAO;

class RDBUserDAO implements UserDAO{

	public boolean addRegisterInfo(RegisterInfo info) {
		// TODO Auto-generated method stub
		Connection con=DatabaseHelper.getConnectionFromDBCP2();
		PreparedStatement ps=null;
		String sql="insert into user(user_name,password)"
				+ " values(?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,info.getNickname());
			ps.setString(2, info.getPassword());
			return ps.executeUpdate()==1;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			DatabaseUtils.close(null, ps, con);
		}
	}	
	public boolean addUser(User u){
		return false;
	}
	public int getUserIdByUserName(String username) {
		Connection con=DatabaseHelper.getConnectionFromDBCP2();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select id from user where user_name=? limit 1";

		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, username);
			rs=ps.executeQuery();
			rs.next();
			return rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DatabaseUtils.close(rs, ps, con);
		}
		return -1;
	}

}

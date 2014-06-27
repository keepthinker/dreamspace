package com.dreamspace.dao.support;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import com.dreamspace.util.ConfigurationInfoUtil;

class DBCP2ConnectionPool implements DBConnectionPool{
	private final String protocol = ConfigurationInfoUtil.getDBPropertyByKey("protocol");
	private final String account = ConfigurationInfoUtil.getDBPropertyByKey("account");
	private final String password = ConfigurationInfoUtil.getDBPropertyByKey("password");
	private final String dbName = ConfigurationInfoUtil.getDBPropertyByKey("dbName");
	private final String driverName=ConfigurationInfoUtil.getDBPropertyByKey("driverName");
	private final String dbUrl = protocol + "//127.0.0.1:3306/"+dbName+"?useUnicode=true&characterEncoding=utf8";
	private  DataSource dataSource;
	public Connection getConnection(){
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public DBCP2ConnectionPool(){
		dataSource = setupDataSource(dbUrl);
	}
	private DataSource setupDataSource(String connectURI) {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driverName);
		ds.setUsername(account);
		ds.setPassword(password);
		ds.setUrl(connectURI);
		return ds;
	}
	public void printDataSourceStates() {
		BasicDataSource bds = (BasicDataSource) dataSource;
		System.out.println("NumActive: " + bds.getNumActive());
		System.out.println("NumIdle: " + bds.getNumIdle());
	}
	public boolean shutdownDataSource(){
		BasicDataSource bds = (BasicDataSource) dataSource;
		try {
			bds.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public String getConnectionPoolState() {
		BasicDataSource bds = (BasicDataSource) dataSource;
		String str="NumActive: " + bds.getNumActive()
				+"\n"+"NumIdle: " + bds.getNumIdle();
		return str;
	}

}

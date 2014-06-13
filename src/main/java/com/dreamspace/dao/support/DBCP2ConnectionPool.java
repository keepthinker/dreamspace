package com.dreamspace.dao.support;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

class DBCP2ConnectionPool implements DBConnectionPool{
	private final String protocol = "jdbc:mysql:";
	private final String accountDB = "root";
	private final String passwordDB = "123456";
	private final String dbName = "crm_pro";
	private final String driverName="com.mysql.jdbc.Driver";
	private final String dbUrl = protocol + "//127.0.0.1:3306/"+dbName+"?useUnicode=true&characterEncoding=utf8";
	private  DataSource dataSource;//application scope sharing
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
	public DataSource setupDataSource(String connectURI) {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driverName);
		ds.setUsername(accountDB);
		ds.setPassword(passwordDB);
		ds.setUrl(connectURI);
		return ds;
	}
	public void printDataSourceStates() {
		BasicDataSource bds = (BasicDataSource) dataSource;
		System.out.println("NumActive: " + bds.getNumActive());
		System.out.println("NumIdle: " + bds.getNumIdle());
	}
	public void shutdownDataSource() throws SQLException {
		BasicDataSource bds = (BasicDataSource) dataSource;
		bds.close();
	}
	public String getConnectionPoolState() {
		BasicDataSource bds = (BasicDataSource) dataSource;
		String str="NumActive: " + bds.getNumActive()
				+"\n"+"NumIdle: " + bds.getNumIdle();
		return str;
	}

}

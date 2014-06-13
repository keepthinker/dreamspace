package com.dreamspace.dao.support;

import java.sql.Connection;
/**
 * 数据库辅助类，提供数据库连接池的方法
 * @author keepthinker
 *
 */
public class DatabaseHelper {
	private  DBConnectionPool dbcp2ConnectionPool;
	public Connection getConnectionFromDBCP2() {
		if(dbcp2ConnectionPool!=null){
			return dbcp2ConnectionPool.getConnection();
		}else{
			dbcp2ConnectionPool=new DBCP2ConnectionPool();
			return dbcp2ConnectionPool.getConnection();
		}
	}
	public String getConnectionPoolState(){
		String state = "没有初始化connection pool";
		if(dbcp2ConnectionPool!=null){
			state=dbcp2ConnectionPool.getConnectionPoolState();
		}
		return state;
	}
}
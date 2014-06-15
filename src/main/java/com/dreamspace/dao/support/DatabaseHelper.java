package com.dreamspace.dao.support;

import java.sql.Connection;
/**
 * 数据库辅助类，提供数据库连接池的方法
 * @author keepthinker
 *
 */
public class DatabaseHelper {
	private static DBConnectionPool dbcp2ConnectionPool;
	public static Connection getConnectionFromDBCP2() {
		if(dbcp2ConnectionPool!=null){
			return dbcp2ConnectionPool.getConnection();
		}else{
			dbcp2ConnectionPool=new DBCP2ConnectionPool();
			return dbcp2ConnectionPool.getConnection();
		}
	}
	public static String getConnectionPoolState(){
		String state = "没有初始化connection pool";
		if(dbcp2ConnectionPool!=null){
			state=dbcp2ConnectionPool.getConnectionPoolState();
		}
		return state;
	}
	public static void closeConnectionPool(){
		if(dbcp2ConnectionPool.shutdownDataSource()==false){
			dbcp2ConnectionPool=null;
		}
	}
}
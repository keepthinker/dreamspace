package com.dreamspace.dao.support;

import java.sql.Connection;

public interface DBConnectionPool {
	/**从数据库连接池中获取一个connection<br/>
	 * 获取失败返回null
	 * @return
	 */
	public Connection getConnection();
	/**
	 * 返回数据库连接池的状态信息
	 */
	public String getConnectionPoolState();
}

package com.dreamspace.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.dreamspace.dao.support.DatabaseHelper;
/**
 * 当项目启动关闭时运行运行
 * @author keepthinker
 *
 */
public class WebProjectStartupAndShutdown implements ServletContextListener{

	//当项目即项目开启前运行以下函数
	public void contextInitialized(ServletContextEvent sce) {
		
	}
	//当项目即项目关闭前运行以下函数
	//执行数据库连接池关闭等等其他事情
	public void contextDestroyed(ServletContextEvent sce) {
		DatabaseHelper.closeConnectionPool();
	}

}

package com.dreamspace.util;

import java.io.IOException;
import java.util.Properties;

public class ConfigurationInfoUtil{
	private static Properties propertyForDB;
	private static Properties propertyForGeneral;
	static{
		propertyForGeneral=new Properties();
		try {
			propertyForGeneral.load(ClassUtils.getClassLoader().getResourceAsStream(PathValues.GENERAL_CFG_PATH));
		} catch (IOException e) {
			e.printStackTrace();
		}
		propertyForDB=new Properties();
		try {
			String path="mysql";
			if(propertyForGeneral.getProperty("database").equals("mysql")==true){
				path=PathValues.MySQL_CFG_Path;
			}
			else{
				//其他数据库
			}
			propertyForDB.load(ClassUtils.getClassLoader().getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 从config.properties 文件中获取配置信息
	 */
	public static String getGeneralPropertyByKey(String key){
		return propertyForGeneral.getProperty(key);
	};
	/**
	 * 从外部文件中获取数据库配置信息
	 * 由外部config.properties中database定义是什么数据库
	 * @param key
	 * @return
	 */
	public static String getDBPropertyByKey(String key){
		return  propertyForDB.getProperty(key);
	}

}
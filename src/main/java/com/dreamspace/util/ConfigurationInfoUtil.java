package com.dreamspace.util;

import java.io.IOException;
import java.util.Properties;

public class ConfigurationInfoUtil{
	private static Properties propertyForDB;
	private static Properties propertyForGeneral;
	static{
		/*propertyForGeneral=new Properties();
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
				鍏朵粬鏁版嵁搴�			}
			propertyForDB.load(ClassUtils.getClassLoader().getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
	/**
	 * 浠巆onfig.properties 鏂囦欢涓幏鍙栭厤缃俊鎭�	 */
	public static String getGeneralPropertyByKey(String key){
		return propertyForGeneral.getProperty(key);
	};
	/**
	 * 浠庡閮ㄦ枃浠朵腑鑾峰彇鏁版嵁搴撻厤缃俊鎭�	 * 鐢卞閮╟onfig.properties涓璬atabase瀹氫箟鏄粈涔堟暟鎹簱
	 * @param key
	 * @return
	 */
	public static String getDBPropertyByKey(String key){
		return  propertyForDB.getProperty(key);
	}

}

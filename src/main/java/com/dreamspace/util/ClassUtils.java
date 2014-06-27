package com.dreamspace.util;

public class ClassUtils {
	/**
	 * 获取类加载器，如果clazz为null，则返回默认当前线程类加载器
	 * @param clazz
	 * @return
	 */
	public static ClassLoader getClassLoader(Class<?> clazz){
		if(clazz==null){
			return Thread.currentThread().getContextClassLoader();
		}else{
			return clazz.getClassLoader();
		}
	}
	/**
	 * 返回默认当前线程类加载器
	 * @return
	 */
	public static ClassLoader getClassLoader(){
		return Thread.currentThread().getContextClassLoader();
	}
}

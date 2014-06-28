package com.dreamspace.dao.support;

public class Test {
	public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

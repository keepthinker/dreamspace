package com.dreamspace.bean;

public class RegisterInfo {
	private String nickname;
	private String password;
	
	public RegisterInfo(String nickname, String password) {
		super();
		this.nickname = nickname;
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

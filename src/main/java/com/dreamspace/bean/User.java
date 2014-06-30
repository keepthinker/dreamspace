package com.dreamspace.bean;

public class User {
	private int userId;
	private String nickname;
	private String profile;
	private String headPic;
	public User(){
	}
	public User(String nickname){
		this.nickname=nickname;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getHeadPic() {
		return headPic;
	}
	public void setHeadPic(String headPic) {
		this.headPic = headPic;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", nickname=" + nickname
				+ ", profile=" + profile + ", headPic=" + headPic + "]";
	}
	
}

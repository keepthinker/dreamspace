package com.dreamspace.bean;

import java.util.Date;


public class Comment {
	private int id;
	private String commentator;
	private String aimedPerson;
	private String content;
	private Date createdTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommentator() {
		return commentator;
	}
	public void setCommentator(String commentator) {
		this.commentator = commentator;
	}
	public String getAimedPerson() {
		return aimedPerson;
	}
	public void setAimedPerson(String aimedPerson) {
		this.aimedPerson = aimedPerson;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	} 
}

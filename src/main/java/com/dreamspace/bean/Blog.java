package com.dreamspace.bean;

import java.util.Date;


public class Blog {
	private int id;
	private User author;
	private String title;
	private String content;
	private Date createdTime;
	private Date modifiedTime;
	private int commentSum;
	public void setId(int id){
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public int getCommentSum() {
		return commentSum;
	}
	public void setCommentSum(int commentSum) {
		this.commentSum = commentSum;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", author=" + author + ", title=" + title
				+ ", content(partial)=" + (content.length()<50?content:content.substring(0, 50)) + ", createdTime=" + createdTime
				+ ", modifiedTime=" + modifiedTime + ", commentSum="
				+ commentSum + "]";
	}

}

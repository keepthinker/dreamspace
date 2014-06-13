package com.dreamspace.dao;

import java.util.List;

import com.dreamspace.bean.Comment;
import com.dreamspace.bean.User;

public interface CommentDAO {
	List<Comment> getCommentByBlogId(int blogId);
	boolean addUser(User user);
}

package com.dreamspace.dao.support;

import com.dreamspace.dao.BlogDAO;
import com.dreamspace.dao.CommentDAO;
import com.dreamspace.dao.UserDAO;

abstract class DAOFactory {
	public abstract BlogDAO createBlogDAO();
	public abstract CommentDAO createCommentDAO();
	public abstract UserDAO createUserDAO();
}

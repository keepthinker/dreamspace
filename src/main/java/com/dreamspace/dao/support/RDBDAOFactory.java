package com.dreamspace.dao.support;

import com.dreamspace.dao.BlogDAO;
import com.dreamspace.dao.CommentDAO;
import com.dreamspace.dao.UserDAO;

public class RDBDAOFactory extends DAOFactory{

	@Override
	public BlogDAO createBlogDAO() {
		// TODO Auto-generated method stub
		return new RDBBlogDAO();
	}

	@Override
	public CommentDAO createCommentDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDAO createUserDAO() {
		return new RDBUserDAO();
		
	}
	
}

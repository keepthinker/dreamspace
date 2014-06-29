package com.dreamspace.dao.support;

import com.dreamspace.dao.BlogDAO;
import com.dreamspace.dao.CommentDAO;
import com.dreamspace.dao.UserDAO;

public class DAOFactoryHelper {
	private static DAOFactory daoFactory=new RDBDAOFactory();
	private static UserDAO userDAO;
	private static BlogDAO blogDAO;
	private static CommentDAO commentDAO;
	public static UserDAO getUserDAO(){
		if(userDAO!=null){
			return userDAO;
		}
		userDAO=daoFactory.createUserDAO();
		return userDAO;
	}
	public static BlogDAO getBlogDAO(){
		if(blogDAO!=null){
			return blogDAO;
		}
		blogDAO=daoFactory.createBlogDAO();
		return blogDAO;
	}
	public static CommentDAO getCommentDAO(){
		if(commentDAO!=null){
			return commentDAO;
		}
		commentDAO=daoFactory.createCommentDAO();
		return commentDAO;
	}
}

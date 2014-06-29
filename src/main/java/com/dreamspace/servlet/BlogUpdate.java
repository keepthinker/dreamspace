package com.dreamspace.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

public class BlogUpdate extends HttpServlet{

	Logger logger=Logger.getLogger(BlogUpdate.class);
	private static final long serialVersionUID = 596555007331575913L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.info("enter BlogUpdate Servlet");
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		logger.info("title : "+title+" content : "+content);
		
		Subject currentUser=SecurityUtils.getSubject();
		String userName=(String)currentUser.getPrincipal();
		logger.info("userName : "+userName);
		
	}


}

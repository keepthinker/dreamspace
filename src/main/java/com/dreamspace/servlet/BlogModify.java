package com.dreamspace.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.dreamspace.bean.Blog;
import com.dreamspace.bean.User;

public class BlogModify  extends HttpServlet{

	private static final long serialVersionUID = -5608099620193936852L;
	Logger logger=Logger.getLogger(BlogModify.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.info("enter BlogModify Servlet");
		req.setAttribute("updateType", "blog_modify");
		getServletContext().getRequestDispatcher("/WEB-INF/blog_edit.jsp").forward(req, resp);
	}

}

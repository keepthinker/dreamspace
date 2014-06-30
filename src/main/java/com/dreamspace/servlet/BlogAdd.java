package com.dreamspace.servlet;

import java.io.IOException;
import java.util.Calendar;
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
/**
 * 通过blogAdd跳转到blog_edit.jsp 并且request中传updateType=blog_add
 * @author keepthinker
 *
 */
public class BlogAdd extends HttpServlet{

	Logger logger=Logger.getLogger(BlogAdd.class);
	private static final long serialVersionUID = 596555007331575913L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.info("enter BlogAdd Servlet");
		req.setAttribute("updateType", "blog_add");
		req.setAttribute("user", ServletUtils.getUserFromShiroSession());
		getServletContext().getRequestDispatcher("/WEB-INF/blog_edit.jsp").forward(req, resp);
		
	}
}

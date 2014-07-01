package com.dreamspace.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.dreamspace.bean.Blog;
import com.dreamspace.dao.support.DAOFactoryHelper;
/**
 * blog_id
 */
public class SingleBlogDisplay extends HttpServlet{
	Logger logger=Logger.getLogger(SingleBlogDisplay.class);
	private static final long serialVersionUID = -2717471153821162251L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String blogId=req.getParameter("blog_id");
		logger.debug("blog_id : "+ blogId);
		Blog blog=DAOFactoryHelper.getBlogDAO().getBlogByBlogId(Integer.valueOf(blogId));
		logger.debug("blog : "+blog);
		req.setAttribute("blog", blog);
		getServletContext().getRequestDispatcher("/WEB-INF/single_blog_display.jsp");
	}

}

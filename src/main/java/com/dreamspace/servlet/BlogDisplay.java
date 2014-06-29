package com.dreamspace.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.dreamspace.bean.Blog;
import com.dreamspace.dao.support.DAOFactoryHelper;
/**
 * 	pageSize : 20 default<br/>
 * corresponding jsp--blog_displaying.jsp<br/>
 */
public class BlogDisplay extends HttpServlet{
	Logger logger=Logger.getLogger(BlogDisplay.class);
	private static final long serialVersionUID = 4696736527892907523L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Subject currentUser= SecurityUtils.getSubject();
		Object userId=currentUser.getSession().getAttribute("userId");
		if(userId==null){
			userId=DAOFactoryHelper.getUserDAO().
					getUserIdByUsername((String)currentUser.getPrincipal());
			Session session = currentUser.getSession();
			session.setAttribute( "userId", userId);
		}
		logger.info("username : "+currentUser.getPrincipal());
		List<Blog> blogList=DAOFactoryHelper.getBlogDAO().getSimpleBlogListByUserId((Integer)userId);
		logger.info("blogList : "+blogList);
		
		simplifyBlogList(blogList);
		req.setAttribute("blogList", blogList);
		req.setAttribute("userName", currentUser.getPrincipal());
		getServletContext().getRequestDispatcher("/WEB-INF/blog_display.jsp").forward(req, resp);
	}
	private void simplifyBlogList(List<Blog> blogList){
		for(Blog blog:blogList){
			blog.setContent(blog.getContent().substring(0, 220)+"...");
		}
	}
	

}
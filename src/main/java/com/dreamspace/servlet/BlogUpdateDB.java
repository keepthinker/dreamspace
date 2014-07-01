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
import com.dreamspace.dao.BlogDAO;
import com.dreamspace.dao.support.DAOFactoryHelper;

/**
 * 根据参数parameter中update_type来判断更新类型,并且更新数据库<br/>
 * update_type:1.blog_add    2.blog_modify   3.blog_delete
 * @author keepthinker
 */
public class BlogUpdateDB extends HttpServlet{

	Logger logger=Logger.getLogger(BlogUpdateDB.class);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String updateType= req.getParameter("update_type");
		logger.debug("updateType : "+updateType);
		if(updateType.equals("blog_add")){
			addBlogToDatabase(req);
		}else if(updateType.equals("blog_modify")){
			
		}else if(updateType.equals("blog_delete")){
			
		}
		resp.sendRedirect("blog_display");
	}
	public void addBlogToDatabase(HttpServletRequest req){
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		logger.debug("title : "+title+" content : "+content);
		User user = ServletUtils.getUserFromShiroSession();
		Blog blog=new Blog();
		blog.setAuthor(user);
		blog.setContent(content);
		blog.setTitle(title);
		blog.setModifiedTime(new Date());
		logger.debug("insert blog to db : "+blog);
		BlogDAO blogDAO=DAOFactoryHelper.getBlogDAO();
		blogDAO.addBlog(blog);
	}

}

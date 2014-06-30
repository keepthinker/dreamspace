package com.dreamspace.dao.support;

import java.util.Date;

import junit.framework.TestCase;

import com.dreamspace.bean.Blog;
import com.dreamspace.bean.User;
import com.dreamspace.dao.BlogDAO;

public class RDBBlogDAOTest extends TestCase {
	
	public void testGetSimpleBlogListByUserId() {
		
	}	

	public void testGetBlogContentByBlogId() {
		
	}

	public void testAddBlog() {
		BlogDAO blogDAO=DAOFactoryHelper.getBlogDAO();
		Blog blog=new Blog();
		User user =new User();
		user.setUserId(2);
		blog.setAuthor(user);
		blog.setTitle("标题");
		blog.setContent("内容");
		blog.setModifiedTime(new Date());
		assertTrue(blogDAO.addBlog(blog));
	}

	public void testUpdateBlogContent() {
	}

	public void testUpdateBlogTitle() {
	}

}

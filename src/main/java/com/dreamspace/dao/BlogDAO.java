package com.dreamspace.dao;

import java.util.List;

import com.dreamspace.bean.Blog;
/**
 * 对blog表进行操作的DAO
 * @author keepthinker
 *
 */
public interface BlogDAO {
	/**
	 * 获取除了Content即博客文章内容的所有信息
	 * @param id
	 * @return
	 */
	List<Blog> getSimpleBlogByUserId(int id);
	/**
	 * 只获取博客文章的内容
	 * @param id
	 * @return
	 */
	String getBlogContentByBlogId(int id);
	boolean addBlog(Blog blog);
	/**
	 * 修改指定blogId的博客内容
	 * 一修改则得更新修改时间
	 * @param content
	 * @param blogId
	 * @return
	 */
	boolean updateBlogContent(String content,int blogId);
	/**
	 * 修改制定blogId的博客标题
	 * 一修改则得更新修改时间
	 * @param title
	 * @param blogId
	 * @return
	 */
	boolean updateBlogTitle(String title,int blogId);
}

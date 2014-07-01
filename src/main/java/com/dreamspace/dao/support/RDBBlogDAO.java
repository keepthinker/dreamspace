package com.dreamspace.dao.support;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dreamspace.bean.Blog;
import com.dreamspace.bean.User;
import com.dreamspace.dao.BlogDAO;


class RDBBlogDAO implements BlogDAO{

	public List<Blog> getSimpleBlogListByUserId(int id) {
		Connection con=DatabaseHelper.getConnectionFromDBCP2();
		String sql=" select blog.id,title,content,created_time,modified_time,"
				+ "comment_sum,user_name from blog,user "
				+ "where blog.user_id=? and blog.user_id=user.id;";
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Blog> blogList=new ArrayList<Blog>();
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			Blog blog;
			while(rs.next()){
				blog=new Blog();
				blog.setId(rs.getInt("id")); 
				blog.setTitle(rs.getString("title"));
				blog.setContent(rs.getString("content"));
				blog.setCreatedTime(rs.getDate("created_time"));
				blog.setModifiedTime(rs.getDate("modified_time"));
				blog.setCommentSum(rs.getInt("comment_sum"));
				blog.setAuthor(new User(rs.getString("user_name")));
				blogList.add(0,blog);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DatabaseUtils.close(rs, ps, con);
		}
		return blogList;
	}

	public String getBlogContentByBlogId(int id) {
		return null;
	}

	public boolean addBlog(Blog blog) {
		Connection con=DatabaseHelper.getConnectionFromDBCP2();
		String sql="insert into blog(user_id,title,content,modified_time) values(?,?,?,?)";
		PreparedStatement ps=null;
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, blog.getAuthor().getUserId());
			ps.setString(2, blog.getTitle());
			ps.setString(3,blog.getContent());
			ps.setDate(4,new Date(blog.getModifiedTime().getTime()));
			return ps.executeUpdate()==1;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			DatabaseUtils.close(null, ps, con);
		}
	}

	public boolean updateBlogContent(String content, int blogId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateBlogTitle(String title, int blogId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Blog getBlogByBlogId(int id) {
		Connection con=DatabaseHelper.getConnectionFromDBCP2();
		String sql=" select blog.id title,content,created_time,modified_time,"
				+ "comment_sum,user_name from blog,user "
				+ "where blog.id=? and blog.user_id=user.id limit 1;";
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			rs=ps.executeQuery();
			Blog blog;
			rs.next();
			blog=new Blog();
			blog.setId(rs.getInt("id")); 
			blog.setTitle(rs.getString("title"));
			blog.setContent(rs.getString("content"));
			blog.setCreatedTime(rs.getDate("created_time"));
			blog.setModifiedTime(rs.getDate("modified_time"));
			blog.setCommentSum(rs.getInt("comment_sum"));
			blog.setAuthor(new User(rs.getString("user_name")));
			return blog;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally{
			DatabaseUtils.close(rs, ps, con);
		}
	}

}

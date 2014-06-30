package com.dreamspace.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.dreamspace.bean.User;
import com.dreamspace.dao.support.DAOFactoryHelper;
/**
 * http protocol<br/>
 * input parammeter:<br/>
 * 		name<br/>
 * 		password<br/>
 *
 */
public class Login extends HttpServlet{
	Logger logger=Logger.getLogger(Login.class);
	private static final long serialVersionUID = 7306799783479041245L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//		String name=req.getParameter("name");
		//		String password=req.getParameter("password");
		logger.info("enter login servlet");
		Subject currentUser = SecurityUtils.getSubject();
		String userName=(String)currentUser.getPrincipal();
		int userId=DAOFactoryHelper.getUserDAO().
				getUserIdByUserName(userName);
		Session session = currentUser.getSession();
		User user=new User();
		user.setUserId(userId);
		user.setNickname(userName);
		session.setAttribute( "user", user);
		String redirectUrl="http://localhost:8080/dreamspace/blog_display";
		resp.sendRedirect(redirectUrl);
	}

}

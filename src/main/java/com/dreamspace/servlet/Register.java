package com.dreamspace.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.dreamspace.bean.RegisterInfo;
import com.dreamspace.dao.support.DAOFactoryHelper;

/**
 * http protocol<br/>
 * input parameter:<br/>
 * 		name<br/>
 * 		password<br/>
 * 		profile<br/>
 */
public class Register extends HttpServlet{
	Logger logger=Logger.getLogger(Register.class);
	private static final long serialVersionUID = 3661589953313097009L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("enter Register servlet");
		String userName=req.getParameter("user_name");
		String password=req.getParameter("password");
		DAOFactoryHelper.getUserDAO().addRegisterInfo(new RegisterInfo(userName,password));
		String redirectUrl="http://localhost:8080/dreamspace/blog_display";
		resp.sendRedirect(redirectUrl);
		
	}

}
package com.dreamspace.servlet;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.dreamspace.bean.User;
import com.dreamspace.dao.support.DAOFactoryHelper;

/**
 * static method for servlet
 * @author keepthinker
 *
 */
public class ServletUtils {
	/**
	 * 从Shiro的session中获取user,如果不存在则从数据库中获取并且把user存到Shiro的session中
	 * @return
	 */
	public static User getUserFromShiroSession(){
		Subject currentUser= SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		Object user=session.getAttribute("user");
		if(user==null){
			int userId=DAOFactoryHelper.getUserDAO().
					getUserIdByUserName((String)currentUser.getPrincipal());
			user=new User();
			((User)user).setUserId(userId);
			((User)user).setNickname((String)currentUser.getPrincipal());
			session.setAttribute( "user", user);
		}
		return (User) user;
	}
}

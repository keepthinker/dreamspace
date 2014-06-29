package com.dreamspace.dao.support;

import com.dreamspace.dao.UserDAO;

import junit.framework.TestCase;

public class RDBUserDAOTest extends TestCase {

	public void testAddRegisterInfo() {
	}

	public void testAddUser() {
	}

	public void testGetUserIdByUsername() {
		UserDAO userDao=DAOFactoryHelper.getUserDAO();
		int id=userDao.getUserIdByUsername("keepthinker");
		System.out.println(id);
	}

}

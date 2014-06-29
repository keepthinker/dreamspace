package com.dreamspace.dao;

import com.dreamspace.bean.RegisterInfo;
import com.dreamspace.bean.User;

public interface UserDAO {
	/**
	 * 往user表添加RegisterInfo内容
	 * @return
	 */
	public boolean addRegisterInfo(RegisterInfo info);
	public boolean addUser(User u);
	/**
	 * 如果数据库中没发现想要的数据的话返回-1
	 * @param username
	 * @return
	 */
	public int getUserIdByUsername(String username);
}

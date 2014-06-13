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
	
}

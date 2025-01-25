package com.crudappgenahm23.dao;

import com.crudappgenahm23.bean.UserBean;

public class UserDao 
{

	public UserBean getUserByName(String userName) 
	{
		UserBean userBean = null;
		String selectByName = "SELECT * from user WHERE emailId = ?"; 
		
		return userBean;
	}
	

}

package com.pojo.dao;

import com.pojo.model.Admin;

public interface AdminDao {
	/*
	 *��ӹ���Ա 
	 */
	public void add (Admin admin);
	/*
	 *����Ա ��½
	 */
	public Admin adminlogin (String login_name , String password);
}

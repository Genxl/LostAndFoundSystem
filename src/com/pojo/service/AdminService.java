package com.pojo.service;

import com.pojo.model.Admin;

public interface AdminService {	
	/*
	 *��ӹ���Ա 
	 */
	public void add (Admin admin);
	/*
	 *����Ա ��½
	 */
	public Admin adminlogin (String login_name , String password);
	
}

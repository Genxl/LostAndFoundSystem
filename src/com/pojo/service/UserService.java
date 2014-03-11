package com.pojo.service;

import com.pojo.comom.Pagination;
import com.pojo.model.User;

public interface UserService {
	/*
	 * ����û�
	 */
	public void add(User user);
	
	/*
	 * ��ѯ�Ƿ�����ͬ�û�
	 */
	public User isOk(String StuId , String loginId);
	
	/*
	 * ��ҳ��ѯ
	 */
	public Pagination queryForPage(int pageSize, int currentPage);
	
	/*
     * ��������id�õ�Userʵ��
     */
    public User getById(Integer id);
    
    /*
     * ����idɾ��Userʵ��
     */
    public void deleteById(User user);
    
    /*
     * ����id��������
     */
    public void saveOrupdate(User user);
    /*
     * �޸���Ϣ�Ƿ������ͬ��loginId��ѧ��
     */
    public int EditisOK(String StuId , String loginId , Integer id);
	/*
	 * �û���½
	 */
	public User userlogin(String loginId , String password);
}

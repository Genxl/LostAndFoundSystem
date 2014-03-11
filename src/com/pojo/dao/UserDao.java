package com.pojo.dao;

import java.util.List;

import com.pojo.model.User;

public interface UserDao {

	/*
	 *����û� 
	 */
	public void add (User user);
	/*
	 * �����Ƿ�����ͬ�û�
	 */
	public User isOK(String StuId , String loginId);
	/*
	 * �ܼ�¼����
	 */
    public int getCount(String hql);
	/*
	 * ��ҳ��ѯ
	 */
    public List<User> queryForPage(String hql,int offset,int length);
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
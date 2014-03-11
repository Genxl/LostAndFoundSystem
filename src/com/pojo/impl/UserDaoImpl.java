package com.pojo.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pojo.dao.UserDao;
import com.pojo.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	/*
	 * ����û�
	 * @see com.pojo.dao.UserDao#add(com.pojo.register.User)
	 */
	public void add(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
	}
	
	/*
	 * �Ƿ�����ͬ��ѧ�ź͵�½�˺�
	 * @see com.pojo.dao.UserDao#isOK(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public User isOK(final String StuId, final String loginId) {
		// TODO Auto-generated method stub
		User user = null;
		//ʹ��HibernateCallback �ص��ӿڣ�������Ĳ�����ʽ
		List<User> list = (List<User>)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from User where stuId='"+StuId+"' or loginId='"+loginId+"'");
				return query.list();
			}			
		});
		if(list!=null&&list.size()>0){
			user = list.get(0);			
		}
		System.out.println(user);
		return user;
	}
	/*
	 * ��½
	 * @see com.pojo.dao.UserDao#userlogin(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public User userlogin(final String loginId, final String password) {
		// TODO Auto-generated method stub
		User user = null;
		//ʹ��HibernateCallback �ص��ӿڣ�������Ĳ�����ʽ
		List<User> list = (List<User>)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				Query query = session.createQuery("from User where loginId='"+loginId+"' and password='"+password+"'");
				return query.list();
			}			
		});
		if(list!=null&&list.size()>0){
			user = list.get(0);			
		}
		return user;
	}
	/*
	 * ��ҳ��ѯ
	 * @see com.pojo.dao.UserDao#queryForPage(java.lang.String, int, int)
	 */
	@SuppressWarnings("unchecked")
	public List<User> queryForPage(final String hql, final int offset, final int length) {
		// TODO Auto-generated method stub
		List<User> list = (List<User>)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException{
			   Query query = session.createQuery(hql);
	           query.setFirstResult(offset);
	           query.setMaxResults(length);
	        return query.list();
	    }
			});
		return list;
	}

	public int getCount(final String hql) {
		// TODO Auto-generated method stub
		Integer list = (Integer)getHibernateTemplate().execute(new HibernateCallback(){
    		public Object doInHibernate(Session session) throws HibernateException, SQLException{
    		   Query q = session.createQuery(hql);
        return Integer.parseInt(q.list().get(0).toString());
    }
    	});
    	return list;
	}
	/*
	 * ����id���Userʵ��
	 * @see com.pojo.dao.UserDao#getById(java.lang.Integer)
	 */
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return (User) getHibernateTemplate().get(User.class, id);
	}
	/*
	 * ��������
	 * @see com.pojo.dao.UserDao#saveOrupdate(com.pojo.register.User)
	 */
	public void saveOrupdate(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(user);
	}
	/*
     * �޸���Ϣ�Ƿ������ͬ��loginId��ѧ��
     */
	public int EditisOK(final String StuId, final String loginId, final Integer id) {
		// TODO Auto-generated method stub
		//ʹ��HibernateCallback �ص��ӿڣ�������Ĳ�����ʽ
		Integer list = (Integer)getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// TODO Auto-generated method stub
				String hql = "select count(*) from User where id != '"+id+"' and (stuId='"+StuId+"' or loginId='"+loginId+"')";
				Query query = session.createQuery(hql);
				return Integer.parseInt(query.list().get(0).toString());
			}			
		});
		return list;
	}

	public void deleteById(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(user);
	}

}

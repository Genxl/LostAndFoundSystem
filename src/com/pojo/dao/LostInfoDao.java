package com.pojo.dao;

import java.util.List;

import com.pojo.model.LostInfo;

public interface LostInfoDao {
	/*
	 * ���Ѱ����Ϣ
	 */
	public void addLostInfo(LostInfo Linfo);
	/*
	 * �ܼ�¼����
	 */
    public int getCount(String hql);
	/*
	 * ��ҳ��ѯ����Ѱ����Ϣ
	 */
	public List<LostInfo> queryForPage(String hql,int offset,int length);
	/*
     * ��������id�õ�LostInfoʵ��
     */
    public LostInfo getById(Integer id);
}

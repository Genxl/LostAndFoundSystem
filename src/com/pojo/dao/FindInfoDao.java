package com.pojo.dao;

import java.util.List;

import com.pojo.model.FindInfo;

public interface FindInfoDao {
	/*
	 * ���������Ϣ
	 */
	public void addFindInfo(FindInfo Finfo);
	/*
	 * �ܼ�¼����
	 */
    public int getCount(String hql);
	/*
	 * ��ҳ��ѯ����������Ϣ
	 */
	public List<FindInfo> queryForPage(String hql,int offset,int length);
	/*
     * ��������id�õ�FindInfoʵ��
     */
    public FindInfo getById(Integer id);
    /*
    * ��������idɾ�� FindInfoʵ��
    */
   public void deleteFinfo(FindInfo Finfo);
}

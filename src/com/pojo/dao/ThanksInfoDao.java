package com.pojo.dao;

import java.util.List;

import com.pojo.model.ThanksInfo;

public interface ThanksInfoDao {
	/*
	 * �����л����
	 */
	public void saveThanksInfo(ThanksInfo Tinfo);
	/*
	 * ��ѯ���еĸ�л����
	 */
	public List<ThanksInfo> QueryAllInfo(String hql);
}

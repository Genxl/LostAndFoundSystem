package com.pojo.dao;

import java.util.List;

import com.pojo.model.FindInfo;
import com.pojo.model.LeiFengBang;
import com.pojo.model.LostInfo;

public interface TopByDescDao {
	/*
	 * ������ʱ���ѯǰ10��������Ϣ
	 */
	public List<FindInfo> queryFinfoForTime(String hql,int offset,int length);
	
	public List<LostInfo> queryLinfoForTime(String hql,int offset,int length);
	
	public List<LeiFengBang> queryKindlenessForCount(String hql,int offset,int length);
}

package com.pojo.dao;

import java.util.List;

import com.pojo.model.Itemtype;

public interface ItemTypeDao {
	
	/*
	 * �����Ʒ����
	 */
	public void addItemType (Itemtype itype);
	
	/*������Ʒ����*/
	public List<Itemtype> findallItype();
}

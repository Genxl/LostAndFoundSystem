package com.pojo.service;

import java.util.List;

import com.pojo.model.Itemtype;

public interface ItemTypeService {
	
	/*
	 * �����Ʒ����
	 */
	public void addItemType (Itemtype itype);
	
	/*
	 * ������Ʒ����
	 */
	public List<Itemtype> findallItype();
}

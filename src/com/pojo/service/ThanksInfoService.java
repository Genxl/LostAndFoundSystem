package com.pojo.service;

import com.pojo.comom.SelectThanksInfoDesc;
import com.pojo.model.ThanksInfo;

public interface ThanksInfoService {
	/*
	 * �����л����
	 */
	public void saveThanksInfo(ThanksInfo Tinfo);
	/*
	 * ��ѯ���еĸ�л����
	 */
	public SelectThanksInfoDesc QueryByDesc();
}

package com.pojo.service;

import com.pojo.comom.SelectFinfoTopDesc;
import com.pojo.comom.SelectLfbangTopDesc;
import com.pojo.comom.SelectLinfoTopDesc;

public interface TopByDescService {
	
	/*
	 * ���ݷ���ʱ���ѯǰ10��������Ϣ
	 */
	public SelectFinfoTopDesc queryFinfoForTime();
	
	public SelectLinfoTopDesc queryLinfoForTime();
	
	public SelectLfbangTopDesc queryLinfoForCount();
}

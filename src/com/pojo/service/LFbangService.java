package com.pojo.service;

import com.pojo.model.LeiFengBang;

public interface LFbangService {
	/*
	 *������
	 */
	public void add (LeiFengBang lfbang);
	/*
	 * �����׷���Ƿ��д���
	 */
	public LeiFengBang isExist(String kindleness);
	/*
     * ����Ʊ��
     */
    public void update(LeiFengBang lfbang);
}

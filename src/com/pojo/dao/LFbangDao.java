package com.pojo.dao;

import com.pojo.model.LeiFengBang;;

public interface LFbangDao {
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

package com.pojo.dao;

import com.pojo.model.Vote;;

public interface VoteDao {
	/*
	 *����ͶƱ�û�
	 */
	public void add (Vote vote);
	/*
	 *�����Ƿ�����ͬip
	 */
	public Vote FindIp (String ip);
}

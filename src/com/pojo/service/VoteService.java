package com.pojo.service;

import com.pojo.model.Vote;

public interface VoteService {
	/*
	 *����ͶƱ�û�
	 */
	public void add (Vote vote);
	/*
	 *�����Ƿ�����ͬip
	 */
	public Vote FindIp (String ip);
}

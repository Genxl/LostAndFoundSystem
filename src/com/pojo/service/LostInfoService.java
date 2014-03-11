package com.pojo.service;

import com.pojo.comom.Pagination;
import com.pojo.model.LostInfo;

public interface LostInfoService {
	/*
	 * ���������Ϣ
	 */
	public void addLostInfo(LostInfo Linfo);
	/*
	 * ��ҳ��ѯ����Ѱ����Ϣ
	 */
	public Pagination queryForPage(int pageSize, int currentPage);
	/*
	 * ������Ʒ���ͷ�ҳ��ѯѰ����Ϣ
	 */
	public Pagination queryByTypeForPage(String type_name,int pageSize, int currentPage);
	/*
     * ��������id�õ�LostInfoʵ��
     */
    public LostInfo getById(Integer id);
}

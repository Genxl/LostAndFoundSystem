package com.pojo.service;

import com.pojo.comom.Pagination;
import com.pojo.model.FindInfo;

public interface FindInfoService {
	/*
	 * ���������Ϣ
	 */
	public void addFindInfo(FindInfo Finfo);
	/*
	 * ��ҳ��ѯ����������Ϣ
	 */
	public Pagination queryForPage(int pageSize, int page);
	/*
	 * ������Ʒ���ͷ�ҳ��ѯ������Ϣ
	 */
	public Pagination queryByTypeForPage(String type_name,int pageSize, int page);
	/*
	 * ������Ʒ���Ʒ�ҳģ����ѯ������Ϣ
	 */
	public Pagination queryByNameForPage(String find_name,int pageSize, int page);
	/*
	 * ����ʰ���ص��ҳģ����ѯ������Ϣ
	 */
	public Pagination queryByPlaceForPage(String find_place,int pageSize, int page);
	/*
	 * ������Ʒ���ͺ����Ʒ�ҳ��ѯ������Ϣ
	 */
	public Pagination queryByTypeAndNameForPage(String type_name,String find_name,int pageSize, int page);
	/*
	 * ������Ʒ���ͺ�ʰ���ص��ҳ��ѯ������Ϣ
	 */
	public Pagination queryByTypeAndPlaceForPage(String type_name,String find_place,int pageSize, int page);
	/*
	 * ������Ʒ���ƺ�ʰ���ص��ҳ��ѯ������Ϣ
	 */
	public Pagination queryByNameAndPlaceForPage(String find_name,String find_place,int pageSize, int page);
	/*
	 * ������Ʒ���ͺ���Ʒ�����Լ�ʰ���ص��ҳ��ѯ������Ϣ
	 */
	public Pagination queryByTypeNamePlaceForPage(String type_name,String find_name,String find_place,int pageSize, int page);
	/*
     * ��������id�õ�FindInfoʵ��
     */
    public FindInfo getById(Integer id);
    /*
     * ��������idɾ��FindInfoʵ��
     */
    public void deleteFinfo(FindInfo Finfo);
}

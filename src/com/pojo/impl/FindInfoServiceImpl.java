package com.pojo.impl;

import java.util.List;

import com.pojo.comom.Pagination;
import com.pojo.dao.FindInfoDao;
import com.pojo.model.FindInfo;
import com.pojo.service.FindInfoService;

public class FindInfoServiceImpl implements FindInfoService {
	
	private FindInfoDao findinfoDao;
	
	public FindInfoDao getFindinfoDao() {
		return findinfoDao;
	}

	public void setFindinfoDao(FindInfoDao findinfoDao) {
		this.findinfoDao = findinfoDao;
	}

	public void addFindInfo(FindInfo Finfo) {
		// TODO Auto-generated method stub
		findinfoDao.addFindInfo(Finfo);
	}

	public FindInfo getById(Integer id) {
		// TODO Auto-generated method stub
		return findinfoDao.getById(id);
	}

	public Pagination queryForPage(int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from FindInfo";
        int count = findinfoDao.getCount(hql); // �ܼ�¼��
        int totalPage = Pagination.countTotalPage(pageSize, count); // ��ҳ��
        int offset = Pagination.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
        int length = pageSize; // ÿҳ��¼��
        int currentPage = Pagination.countCurrentPage(page);
        List<FindInfo> list = findinfoDao.queryForPage("from FindInfo", offset, length); // �÷�ҳ�ļ�¼
        // �ѷ�ҳ��Ϣ���浽Bean��
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setCurrentPage(currentPage);
        pagination.setAllRow(count);
        pagination.setTotalPage(totalPage);
        pagination.setList(list);
        pagination.init();
        return pagination;
	}

	public Pagination queryByTypeForPage(String typeName, int pageSize,
			int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from FindInfo where find_type ='"+typeName+"'";
        int count = findinfoDao.getCount(hql); // �ܼ�¼��
        int totalPage = Pagination.countTotalPage(pageSize, count); // ��ҳ��
        int offset = Pagination.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
        int length = pageSize; // ÿҳ��¼��
        int currentPage = Pagination.countCurrentPage(page);
        List<FindInfo> list = findinfoDao.queryForPage("from FindInfo where find_type ='"+typeName+"'", offset, length); // �÷�ҳ�ļ�¼
        // �ѷ�ҳ��Ϣ���浽Bean��
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setCurrentPage(currentPage);
        pagination.setAllRow(count);
        pagination.setTotalPage(totalPage);
        pagination.setList(list);
        pagination.init();
        return pagination;
	}

	public Pagination queryByNameForPage(String findName, int pageSize,
			int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from FindInfo where find_name like '%"+findName+"%'";
        int count = findinfoDao.getCount(hql); // �ܼ�¼��
        int totalPage = Pagination.countTotalPage(pageSize, count); // ��ҳ��
        int offset = Pagination.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
        int length = pageSize; // ÿҳ��¼��
        int currentPage = Pagination.countCurrentPage(page);
        List<FindInfo> list = findinfoDao.queryForPage("from FindInfo where find_name like '%"+findName+"%'", offset, length); // �÷�ҳ�ļ�¼
        // �ѷ�ҳ��Ϣ���浽Bean��
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setCurrentPage(currentPage);
        pagination.setAllRow(count);
        pagination.setTotalPage(totalPage);
        pagination.setList(list);
        pagination.init();
        return pagination;
	}

	public Pagination queryByPlaceForPage(String findPlace, int pageSize,
			int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from FindInfo where find_place like '%"+findPlace+"%'";
        int count = findinfoDao.getCount(hql); // �ܼ�¼��
        int totalPage = Pagination.countTotalPage(pageSize, count); // ��ҳ��
        int offset = Pagination.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
        int length = pageSize; // ÿҳ��¼��
        int currentPage = Pagination.countCurrentPage(page);
        List<FindInfo> list = findinfoDao.queryForPage("from FindInfo where find_place like '%"+findPlace+"%'", offset, length); // �÷�ҳ�ļ�¼
        // �ѷ�ҳ��Ϣ���浽Bean��
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setCurrentPage(currentPage);
        pagination.setAllRow(count);
        pagination.setTotalPage(totalPage);
        pagination.setList(list);
        pagination.init();
        return pagination;
	}

	public Pagination queryByTypeAndNameForPage(String typeName,
			String findName, int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from FindInfo where find_type = '"+typeName+"' and find_name like '%"+findName+"%'";
        int count = findinfoDao.getCount(hql); // �ܼ�¼��
        int totalPage = Pagination.countTotalPage(pageSize, count); // ��ҳ��
        int offset = Pagination.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
        int length = pageSize; // ÿҳ��¼��
        int currentPage = Pagination.countCurrentPage(page);
        List<FindInfo> list = findinfoDao.queryForPage("from FindInfo where find_type = '"+typeName+"' and find_name like '%"+findName+"%'", offset, length); // �÷�ҳ�ļ�¼
        // �ѷ�ҳ��Ϣ���浽Bean��
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setCurrentPage(currentPage);
        pagination.setAllRow(count);
        pagination.setTotalPage(totalPage);
        pagination.setList(list);
        pagination.init();
        return pagination;
	}
	
	public Pagination queryByTypeAndPlaceForPage(String typeName,
			String findPlace, int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from FindInfo where find_type = '"+typeName+"' and find_place like '%"+findPlace+"%'";
        int count = findinfoDao.getCount(hql); // �ܼ�¼��
        int totalPage = Pagination.countTotalPage(pageSize, count); // ��ҳ��
        int offset = Pagination.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
        int length = pageSize; // ÿҳ��¼��
        int currentPage = Pagination.countCurrentPage(page);
        List<FindInfo> list = findinfoDao.queryForPage("from FindInfo where find_type = '"+typeName+"' and find_place like '%"+findPlace+"%'", offset, length); // �÷�ҳ�ļ�¼
        // �ѷ�ҳ��Ϣ���浽Bean��
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setCurrentPage(currentPage);
        pagination.setAllRow(count);
        pagination.setTotalPage(totalPage);
        pagination.setList(list);
        pagination.init();
        return pagination;
	}

	public Pagination queryByNameAndPlaceForPage(String findName,
			String findPlace, int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from FindInfo where find_name like '%"+findName+"%' and find_place like '%"+findPlace+"%'";
        int count = findinfoDao.getCount(hql); // �ܼ�¼��
        int totalPage = Pagination.countTotalPage(pageSize, count); // ��ҳ��
        int offset = Pagination.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
        int length = pageSize; // ÿҳ��¼��
        int currentPage = Pagination.countCurrentPage(page);
        List<FindInfo> list = findinfoDao.queryForPage("from FindInfo where find_name like '%"+findName+"%' and find_place like '%"+findPlace+"%'", offset, length); // �÷�ҳ�ļ�¼
        // �ѷ�ҳ��Ϣ���浽Bean��
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setCurrentPage(currentPage);
        pagination.setAllRow(count);
        pagination.setTotalPage(totalPage);
        pagination.setList(list);
        pagination.init();
        return pagination;
	}
	
	public Pagination queryByTypeNamePlaceForPage(String typeName,
			String findName, String findPlace, int pageSize, int page) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from FindInfo where find_type = '"+typeName+"' and find_name like '%"+findName+"%' and find_place like '%"+findPlace+"%'";
        int count = findinfoDao.getCount(hql); // �ܼ�¼��
        int totalPage = Pagination.countTotalPage(pageSize, count); // ��ҳ��
        int offset = Pagination.countOffset(pageSize, page); // ��ǰҳ��ʼ��¼
        int length = pageSize; // ÿҳ��¼��
        int currentPage = Pagination.countCurrentPage(page);
        List<FindInfo> list = findinfoDao.queryForPage("from FindInfo where find_type = '"+typeName+"' and find_name like '%"+findName+"%' and find_place like '%"+findPlace+"%'", offset, length); // �÷�ҳ�ļ�¼
        // �ѷ�ҳ��Ϣ���浽Bean��
        Pagination pagination = new Pagination();
        pagination.setPageSize(pageSize);
        pagination.setCurrentPage(currentPage);
        pagination.setAllRow(count);
        pagination.setTotalPage(totalPage);
        pagination.setList(list);
        pagination.init();
        return pagination;
	}
	
	public void deleteFinfo(FindInfo Finfo) {
		// TODO Auto-generated method stub
		findinfoDao.deleteFinfo(Finfo);
	}

}

package com.pojo.comom;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*һ������������������Ĺ�����*/


//�����ַ�ת���ಢʵ��Filter�ӿ�
public class SetCharacterEncodingFilter implements Filter{

	/*
	 * ����һ��Ĭ��ֵ��String���͵�encoding����
	 * ���ڽ�ͨ��Request������ַ������ʹ��뵽�˹�������
	 * */
	protected String encoding = null;
	/*
	 * ����һ���˹����������Ϲ������
	 * �����ֵΪ�գ�˵�����������û�б�ʵ����
	 * */
	protected FilterConfig filterConfig = null;
	/*
	 * ����һ��Boolean�͵ı���������˵���ͻ��˵��ַ������Ƿ񱻺���
	 * */
	protected boolean ignore = true;
	
	public void destroy() {
		// TODO Auto-generated method stub
		this.encoding = null;
		this.filterConfig = null;
	}
	
	/*
	 * ʵ��doFilter��������
	 * ѡ�񲢽����õ��ַ��������ʹ��
	 * ˵��������������
	 * 
	 * 
	 * @param request ��Ҫ�����servlet����
	 * */

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		if (ignore || (arg0.getCharacterEncoding() == null)) {
			//������ӿͻ��˵ı��뷽ʽ���������request����õ���
			//���뷽ʽΪnull,�����뷽ʽ ���ó���Ҫת���ķ�ʽ
			String encoding = selectEncoding(arg0);
			if (encoding != null) {//���encoding��Ϊnull�����˱��뷽ʽ���ó�request�ı��뷽ʽ
				arg0.setCharacterEncoding(encoding);
			}
			
			arg2.doFilter(arg0, arg1);//ͨ�����ƴ��ݸ���һ��������
		}
	}
	
	/*
	 * ѡ���ʵ����ַ����뱻ʹ�ã����ڵ�ǰrequest���еĹ�������ʼ����ֵ
	 * ���û�����ñ��뷽ʽ����null
	 * ��Ĭ�ϲ���������ִ�з��ص�ֵ�����������ô˹������ĳ�ʼ�����뷽ʽ
	 * */
	
	private String selectEncoding(ServletRequest arg0) {
		// TODO Auto-generated method stub
		return (this.encoding);
	}

	/*
	 * ʵ��init������������ʼ���˹�����
	 * */
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = arg0;
		this.encoding = arg0.getInitParameter("encoding");
		String value = arg0.getInitParameter("ignore");
		if(value == null)
			this.ignore = true;
		else if (value.equalsIgnoreCase("true")) {
			this.ignore = true;
		}
		else if (value.equalsIgnoreCase("yes")) {
			this.ignore = true;
		}
		else {
			this.ignore = false;
		}	
	}

}

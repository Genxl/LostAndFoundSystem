package com.pojo.action;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({ "unused", "serial" })
public class BaseAction extends ActionSupport{
	//��������
	private String action = "index";
	//��ȡaction����ֵ
	public String getAction() {
		return action;
	}
	//����action����ֵ
	public void setAction(String action) {
		this.action = action;
	}
	//����execute����
	public String execute(){
		try{
			return this.executeMethod(this.getAction());
		}catch (Exception e){
			e.printStackTrace();
			return INPUT;
		}
	}
	//����UI�������,��̬���÷���
	@SuppressWarnings("unchecked")
	private String executeMethod(String method) throws Exception {
		// TODO Auto-generated method stub
		Class [] c = null;
		Method m =this.getClass().getMethod(method, c);
		Object [] o = null;
		String result = (String)m.invoke(this, o);
		return result;
	}
}

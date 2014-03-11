package com.pojo.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pojo.model.LeiFengBang;
import com.pojo.service.LFbangService;

@SuppressWarnings("serial")
public class LFBang extends ActionSupport {
	
	private String uid;
	private String username;
	private String contact_name;
	private LFbangService lfbangService;
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContact_name() {
		return contact_name;
	}

	public void setContact_name(String contactName) {
		contact_name = contactName;
	}
	
	public LFbangService getLfbangService() {
		return lfbangService;
	}

	public void setLfbangService(LFbangService lfbangService) {
		this.lfbangService = lfbangService;
	}

	public String votekindleness(){
		System.out.println("�����ˣ�"+contact_name);
		System.out.println("ͶƱ���û���id��"+uid);
		System.out.println(username);
		LeiFengBang lfbang = new LeiFengBang();
		LeiFengBang lfbexistornot = new LeiFengBang();
		lfbexistornot = lfbangService.isExist(contact_name);
		if(lfbexistornot==null){
			ActionContext.getContext().put("username", username);
			ActionContext.getContext().put("uid", uid);
			lfbang.setKindleness(contact_name);
			lfbang.setVotednum(1);
			lfbangService.add(lfbang);
			return SUCCESS;
		}
		Integer id = lfbexistornot.getId();
		String kindleness = lfbexistornot.getKindleness();
		Integer votedNum = lfbexistornot.getVotednum();
		votedNum++;
		System.out.println("�׷��"+id);
		System.out.println("�׷��"+kindleness);
		System.out.println("�׷��"+votedNum);
		lfbang.setId(id);
		lfbang.setKindleness(kindleness);
		lfbang.setVotednum(votedNum);
		ActionContext.getContext().put("username", username);
		ActionContext.getContext().put("uid", uid);
		lfbangService.update(lfbang);
		return SUCCESS;
	}
}

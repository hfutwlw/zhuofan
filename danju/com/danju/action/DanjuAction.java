package com.danju.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.danju.service.inter.DanjuManage;
import com.opensymphony.xwork2.ActionSupport;

public class DanjuAction extends ActionSupport{

	private static final long serialVersionUID = 88394041588346546L;
	@Autowired
	private DanjuManage danjuManage;
	
	public String execute(){
		danjuManage.save();
	}

}

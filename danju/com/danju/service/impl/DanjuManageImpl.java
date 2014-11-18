package com.danju.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.danju.dao.DanjuDao;
import com.danju.domain.Danju;
import com.danju.service.inter.DanjuManage;
import com.service.impl.BaseServiceImpl;
@Component
public class DanjuManageImpl extends BaseServiceImpl<Danju> implements DanjuManage {	
	private DanjuDao danjudao;

	public DanjuDao getDanjudao() {
		return danjudao;
	}
	@Autowired
	public void setDanjudao(DanjuDao danjudao) {
		super.baseDao = danjudao;
		this.danjudao = danjudao;
	}
	@Override
	public List<Danju> findbyName(String name) throws Exception {
		System.out.println(danjudao.findAll());
		return null;
	}
	
}

package com.danju.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.danju.dao.DanjuFileDao;
import com.danju.domain.DanjuFile;
import com.danju.service.inter.DanjuFileManage;
import com.service.impl.BaseServiceImpl;
@Component
public class DanjuFileMangerImpl extends BaseServiceImpl<DanjuFile> implements
		DanjuFileManage {
	private DanjuFileDao danJuFileDao;

	public DanjuFileDao getDanJuFileDao() {
		return danJuFileDao;
	}
	@Autowired
	public void setDanJuFileDao(DanjuFileDao danJuFileDao) {
		super.baseDao = danJuFileDao;
		this.danJuFileDao = danJuFileDao;
	}
	
	
}

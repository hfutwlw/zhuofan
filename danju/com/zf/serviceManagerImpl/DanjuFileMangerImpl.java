package com.zf.serviceManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zf.dao.DanjuFileDao;
import com.zf.domain.DanjuFile;
import com.zf.serviceManager.DanjuFileManage;
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

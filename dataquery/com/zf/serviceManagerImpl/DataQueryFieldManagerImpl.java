package com.zf.serviceManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zf.dao.DataQueryFieldDao;
import com.zf.domain.DataQueryField;
import com.zf.serviceManager.DataQueryFieldManager;
@Component
public class DataQueryFieldManagerImpl extends BaseServiceImpl<DataQueryField> implements DataQueryFieldManager{
	private DataQueryFieldDao dataQueryFieldDao;

	public DataQueryFieldDao getDataQueryFieldDao() {
		return dataQueryFieldDao;
	}
	@Autowired
	public void setDataQueryFieldDao(DataQueryFieldDao dataQueryFieldDao) {
		super.baseDao = dataQueryFieldDao;
		this.dataQueryFieldDao = dataQueryFieldDao;
	}
	
}

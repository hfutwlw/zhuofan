package com.dataquery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dataquery.dao.DataQueryFieldDao;
import com.dataquery.domain.DataQueryField;
import com.dataquery.service.inter.DataQueryFieldManager;
import com.service.impl.BaseServiceImpl;
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

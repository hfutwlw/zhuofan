package com.dataquery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dataquery.dao.DataQueryDao;
import com.dataquery.domain.DataQuery;
import com.dataquery.service.inter.DataQueryManager;
import com.msg.DatabaseManageMsg;
import com.service.impl.BaseServiceImpl;
@Component
public class DataQueryManagerImpl extends BaseServiceImpl<DataQuery> implements DataQueryManager{
	private DataQueryDao dataQueryDao;
	
	public DataQueryDao getDataQueryDao() {
		return dataQueryDao;
	}
	@Autowired
	public void setDataQueryDao(DataQueryDao dataQueryDao) {
		super.baseDao = dataQueryDao;
		this.dataQueryDao = dataQueryDao;
	}

	@Override
	public DatabaseManageMsg addDataQuery(DataQuery dataQuery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseManageMsg updateDataQuery(DataQuery dataQuery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DatabaseManageMsg deleteDataQueryByDataQueryName(String dataQueryName) {
		// TODO Auto-generated method stub
		return null;
	}

}

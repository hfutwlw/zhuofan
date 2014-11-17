package com.zf.serviceManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.msg.DatabaseManageMsg;
import com.zf.dao.DataQueryDao;
import com.zf.domain.DataQuery;
import com.zf.serviceManager.DataQueryManager;
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

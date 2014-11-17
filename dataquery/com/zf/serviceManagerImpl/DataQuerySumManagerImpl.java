package com.zf.serviceManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zf.dao.DataQuerySumDao;
import com.zf.domain.DataQuerySum;
import com.zf.serviceManager.DataQuerySumManager;
@Component
public class DataQuerySumManagerImpl extends BaseServiceImpl<DataQuerySum> implements DataQuerySumManager{
	private DataQuerySumDao dataQuerySum;

	public DataQuerySumDao getDataQuerySum() {
		return dataQuerySum;
	}
	@Autowired
	public void setDataQuerySum(DataQuerySumDao dataQuerySum) {
		super.baseDao = dataQuerySum;
		this.dataQuerySum = dataQuerySum;
	}
	
}

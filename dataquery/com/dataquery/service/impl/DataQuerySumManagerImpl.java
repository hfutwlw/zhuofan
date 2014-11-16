package com.dataquery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dataquery.dao.DataQuerySumDao;
import com.dataquery.domain.DataQuerySum;
import com.dataquery.service.inter.DataQuerySumManager;
import com.service.impl.BaseServiceImpl;
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

package com.dataquery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dataquery.dao.DataQueryItemDao;
import com.dataquery.domain.DataQueryItem;
import com.dataquery.service.inter.DataQueryItemManager;
import com.service.impl.BaseServiceImpl;
@Component
public class DataQueryItemManagerImpl extends BaseServiceImpl<DataQueryItem> implements DataQueryItemManager{
		private DataQueryItemDao dataQueryItemDao;

		public DataQueryItemDao getDataQueryItemDao() {
			return dataQueryItemDao;
		}
		@Autowired
		public void setDataQueryItemDao(DataQueryItemDao dataQueryItemDao) {
			super.baseDao = dataQueryItemDao;
			this.dataQueryItemDao = dataQueryItemDao;
		}
		
}

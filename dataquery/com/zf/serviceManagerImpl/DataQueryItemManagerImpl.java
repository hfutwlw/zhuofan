package com.zf.serviceManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zf.dao.DataQueryItemDao;
import com.zf.domain.DataQueryItem;
import com.zf.serviceManager.DataQueryItemManager;
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

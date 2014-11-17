package com.zf.serviceManager;

import java.util.List;

import com.zf.domain.Danju;

public interface DanjuManage extends BaseService<Danju>{
	
	public List<Danju> findbyName(String name) throws Exception;
}

package com.danju.service.inter;

import java.util.List;

import com.danju.domain.Danju;
import com.service.inter.BaseService;

public interface DanjuManage extends BaseService<Danju>{
	
	public List<Danju> findbyName(String name) throws Exception;
}

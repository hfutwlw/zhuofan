package com.dataquery.service.inter;

import com.service.inter.BaseService;
import com.dataquery.domain.DataQuery;
import com.msg.DatabaseManageMsg;


/**
 * 数据提取方案服务类
 * 提供数据提取方案的增删改查
 * @author linpeng123l
 *
 */
public interface DataQueryManager extends BaseService<DataQuery>{
	
	/**
	 * 添加一个数据提取方案，并且分别保存他的三个子类表
	 * @param dataQuery 数据提取方案对象
	 * @return 是否成功 失败时的信息等
	 */
	public DatabaseManageMsg addDataQuery(DataQuery dataQuery);
	
	/**
	 * 更新一个数据提取方案，并且分别更新他的三个子类表
	 * @param dataQuery 数据提取方案对象
	 * @return 是否成功 失败时的信息等
	 */
	public DatabaseManageMsg updateDataQuery(DataQuery dataQuery);
	
	/**
	 * 根据数据提取方案名称删除一个数据提取方案
	 * @param dataQueryName 数据提取方案名称
	 * @return 是否成功 失败时的信息等
	 */
	public DatabaseManageMsg deleteDataQueryByDataQueryName(String dataQueryName);
}

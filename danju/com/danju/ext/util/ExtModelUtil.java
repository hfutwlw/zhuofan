package com.danju.ext.util;

import com.danju.ext.domain.ExtConfigObjectValue;

public interface ExtModelUtil{

	/**
	 * 创建一个ExtGridObjectModel
	 * @param name 字段名
	 * @param text 中文名
	 * @param type 字段类型
	 * @param hidden 是否隐藏
	 * @param width 宽度
	 * @param dataQueryName 数据提取方案名
	 * @param field 区域
	 * @return ExtConfigObjectValue
	 */
	public ExtConfigObjectValue createExtConfigObjectValue(String name, String text, String type,
			boolean hidden, int width, String dataQueryName, String field);
	
}

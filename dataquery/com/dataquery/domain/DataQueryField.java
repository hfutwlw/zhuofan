package com.dataquery.domain;

import com.domain.BaseEntity;
import com.excel.ExportDomainExcelInter;

public class DataQueryField extends BaseEntity implements ExportDomainExcelInter{
	private String name;
     private String chineseName;
     private String hql;
     private String type;
     private String dataQueryName;	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	public String getHql() {
		return hql;
	}
	public void setHql(String hql) {
		this.hql = hql;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDataQueryName() {
		return dataQueryName;
	}
	public void setDataQueryName(String dataQueryName) {
		this.dataQueryName = dataQueryName;
	}
	@Override
	public String[] excelTitle() {
		return new String[]{"字段名","字段中文名"};
	}
	@Override
	public String[] excelData() {
		return new String[]{name,chineseName};
	}
}

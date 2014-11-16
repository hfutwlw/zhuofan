package com.dataquery.domain;

import com.domain.BaseEntity;
import com.excel.ExportDomainExcelInter;

public class DataQuerySum extends BaseEntity implements ExportDomainExcelInter{
	
	private String dataQueryName;
	private String dataQueryChineseName;
	private Integer pageSize;
	private String retval;
	private String hql;
	private Integer width;
	private Integer height;
	private boolean fast;	
	public String getDataQueryName() {
		return dataQueryName;
	}
	public void setDataQueryName(String dataQueryName) {
		this.dataQueryName = dataQueryName;
	}
	public String getDataQueryChineseName() {
		return dataQueryChineseName;
	}
	public void setDataQueryChineseName(String dataQueryChineseName) {
		this.dataQueryChineseName = dataQueryChineseName;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getRetval() {
		return retval;
	}
	public void setRetval(String retval) {
		this.retval = retval;
	}
	public String getHql() {
		return hql;
	}
	public void setHql(String hql) {
		this.hql = hql;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public boolean isFast() {
		return fast;
	}
	public void setFast(boolean fast) {
		this.fast = fast;
	}
	@Override
	public String[] excelTitle() {
		return new String[]{"单据名称","单据中文名"};
	}
	@Override
	public String[] excelData() {
		return new String[]{dataQueryName,dataQueryChineseName};
	}
}

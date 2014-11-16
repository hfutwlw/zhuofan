package com.dataquery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.domain.BaseEntity;
import com.excel.ExportDomainExcelInter;
@Entity
@Table(name="DATA_QUERY_SUM")
public class DataQuerySum extends BaseEntity implements ExportDomainExcelInter{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9070556447335444215L;
	@Column(name="DATA_QUERY_NAME",length=100)
	private String dataQueryName;
	@Column(name="DATA_QUERY_CH_NAME",length=100)
	private String dataQueryChName;
	@Column(name="PAGE_SIZE",length=100)
	private int pageSize;
	@Column(name="RETURN_VALUE",length=100)
	private String retval;
	@Column(name="HQL",length=300)
	private String hql;
	@Column(name="WIDTH",length=100)
	private int width;
	@Column(name="HEIGHT",length=100)
	private int height;
	@Column(name="FAST",length=2)
	private boolean fast;	
	public String getDataQueryName() {
		return dataQueryName;
	}
	public void setDataQueryName(String dataQueryName) {
		this.dataQueryName = dataQueryName;
	}
	
	public String getDataQueryChName() {
		return dataQueryChName;
	}
	public void setDataQueryChName(String dataQueryChName) {
		this.dataQueryChName = dataQueryChName;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
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
		return new String[]{dataQueryName,dataQueryChName};
	}
}

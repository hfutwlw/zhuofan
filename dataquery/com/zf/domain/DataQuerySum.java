package com.zf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.excel.ExportDomainExcelInter;
@Entity
@Table(name="DATA_QUERY_SUM")
public class DataQuerySum extends BaseEntity implements ExportDomainExcelInter{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9070556447335444215L;
	
	private String dataQueryName;
	
	private String dataQueryChName;
	
	private int pageSize;
	
	private String retval;
	
	private String hql;
	
	private int width;
	
	private int height;
	
	private boolean fast;	
	
	//create table DATA_QUERY_SUM (id varchar2(50 char) not null unique, ADD_DATA_TIME varchar2(50 char), ADD_DATA_USERID varchar2(100 char), DATA_STATUS number(10,0), DATA_QUERY_CH_NAME varchar2(100 char), DATA_QUERY_NAME varchar2(100 char), FAST boolean, HEIGHT number(10,0), HQL varchar2(300 char), PAGE_SIZE number(10,0), RETURN_VALUE varchar2(100 char), WIDTH number(10,0), primary key (id))
	@Column(name="DATA_QUERY_NAME",length=100)
	public String getDataQueryName() {
		return dataQueryName;
	}
	@Column(name="DATA_QUERY_CH_NAME",length=100)
	public String getDataQueryChName() {
		return dataQueryChName;
	}
	@Column(name="PAGE_SIZE",length=100)
	public int getPageSize() {
		return pageSize;
	}
	@Column(name="RETURN_VALUE",length=100)
	public String getRetval() {
		return retval;
	}
	@Column(name="HQL",length=300)
	public String getHql() {
		return hql;
	}
	@Column(name="WIDTH",length=100)
	public int getWidth() {
		return width;
	}
	@Column(name="HEIGHT",length=100)
	public int getHeight() {
		return height;
	}
	@Column(name="FAST",length=1)
	public boolean isFast() {
		return fast;
	}
	public void setDataQueryName(String dataQueryName) {
		this.dataQueryName = dataQueryName;
	}
	public void setDataQueryChName(String dataQueryChName) {
		this.dataQueryChName = dataQueryChName;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public void setRetval(String retval) {
		this.retval = retval;
	}
	public void setHql(String hql) {
		this.hql = hql;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
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

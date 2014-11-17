package com.dataquery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.domain.BaseEntity;
import com.excel.ExportDomainExcelInter;
@Entity
@Table(name="DATA_QUERY_FIELD")
public class DataQueryField extends BaseEntity implements ExportDomainExcelInter{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2271078587822589157L;
	
	private String name;
	
     private String chName;
	
     private String hql;
	
     private String type;
	
     private String dataQueryName;	
	
	@Column(name="NAME_",length=100)
	public String getName() {
		return name;
	}
	@Column(name="CH_NAME",length=100)
	public String getChName() {
		return chName;
	}
	@Column(name="HQL",length=300)
	public String getHql() {
		return hql;
	}
	@Column(name="TYPE_",length=100)
	public String getType() {
		return type;
	}
	@Column(name="DATA_QUERY_NAME",length=100)
	public String getDataQueryName() {
		return dataQueryName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setChName(String chName) {
		this.chName = chName;
	}
	public void setHql(String hql) {
		this.hql = hql;
	}
	public void setType(String type) {
		this.type = type;
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
		return new String[]{name,chName};
	}
}

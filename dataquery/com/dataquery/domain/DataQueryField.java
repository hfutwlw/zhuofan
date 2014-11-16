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
	@Column(name="_NAME",length=100)
	private String name;
	@Column(name="CH_NAME",length=100)
     private String chName;
	@Column(name="HQL",length=300)
     private String hql;
	@Column(name="_TYPE",length=100)
     private String type;
	@Column(name="DATA_QUERY_NAME",length=100)
     private String dataQueryName;	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getChName() {
		return chName;
	}
	public void setChName(String chName) {
		this.chName = chName;
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
		return new String[]{name,chName};
	}
}

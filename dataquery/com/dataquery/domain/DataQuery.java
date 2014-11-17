package com.dataquery.domain;

import java.util.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.domain.BaseEntity;
import com.excel.ExportDomainExcelInter;
@Entity
@Table(name="DATA_QUERY")
public class DataQuery extends BaseEntity implements ExportDomainExcelInter{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7743554536478767777L;
	
	private String dataQueryName;
	
	private String dataQueryChName;
	
	private String xml;	
	
	private String extraInfo;
	
	private String createPeopleName;
	
	private String modifyPeopleName;
	
	private Date createTime;
	
	private Date modifyTime;
	
	@Column(name="DATA_QUERY_NAME",length=100)
	public String getDataQueryName() {
		return dataQueryName;
	}
	@Column(name="DATA_QUERY_CH_NAME",length=100)
	public String getDataQueryChName() {
		return dataQueryChName;
	}
	@Column(name="XML",length=10000)
	public String getXml() {
		return xml;
	}
	@Column(name="EXTRA_INFO",length=100)
	public String getExtraInfo() {
		return extraInfo;
	}
	@Column(name="CREATE_PEOPLE_NAME",length=100)
	public String getCreatePeopleName() {
		return createPeopleName;
	}
	@Column(name="MODIFY_PEOPLE_NAME",length=100)
	public String getModifyPeopleName() {
		return modifyPeopleName;
	}
	@Column(name="CREATE_TIME",length=100)
	public Date getCreateTime() {
		return createTime;
	}
	@Column(name="MODIFY_TIME",length=100)
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setDataQueryName(String dataQueryName) {
		this.dataQueryName = dataQueryName;
	}
	public void setDataQueryChName(String dataQueryChName) {
		this.dataQueryChName = dataQueryChName;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}
	public void setCreatePeopleName(String createPeopleName) {
		this.createPeopleName = createPeopleName;
	}
	public void setModifyPeopleName(String modifyPeopleName) {
		this.modifyPeopleName = modifyPeopleName;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	@Override
	public String[] excelTitle() {
		return new String[]{"数据提取方案名","数据提取方案中文名"};
	}
	@Override
	public String[] excelData() {
		return new String[]{dataQueryName,dataQueryChName};
	}
	
}

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
	@Column(name="DATA_QUERY_NAME",length=100)
	private String dataQueryName;
	@Column(name="DATA_QUERY_CH_NAME",length=100)
	private String dataQueryChName;
	@Column(name="XML",length=10000)
	private String xml;
	public String getDataQueryChName() {
		return dataQueryChName;
	}
	public void setDataQueryChName(String dataQueryChName) {
		this.dataQueryChName = dataQueryChName;
	}
	@Column(name="EXTRA_INFO",length=100)
	private String extraInfo;
	@Column(name="CREATE_PEOPLE_NAME",length=100)
	private String createPeopleName;
	@Column(name="MODIFY_PEOPLE_NAME",length=100)
	private String modifyPeopleName;
	@Column(name="CREATE_TIME",length=100)
	private Date createTime;
	@Column(name="MODIFY_TIME",length=100)
	private Date modifyTime;
	
	public String getDataQueryName() {
		return dataQueryName;
	}
	public void setDataQueryName(String dataQueryName) {
		this.dataQueryName = dataQueryName;
	}
	
	public String getXml() {
		return xml;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}
	public String getExtraInfo() {
		return extraInfo;
	}
	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}
	public String getCreatePeopleName() {
		return createPeopleName;
	}
	public void setCreatePeopleName(String createPeopleName) {
		this.createPeopleName = createPeopleName;
	}
	public String getModifyPeopleName() {
		return modifyPeopleName;
	}
	public void setModifyPeopleName(String modifyPeopleName) {
		this.modifyPeopleName = modifyPeopleName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifyTime() {
		return modifyTime;
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

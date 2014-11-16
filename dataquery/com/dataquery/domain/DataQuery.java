package com.dataquery.domain;

import java.util.Date;

import com.domain.BaseEntity;
import com.excel.ExportDomainExcelInter;
 
public class DataQuery extends BaseEntity implements ExportDomainExcelInter{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7743554536478767777L;
	private String dataQueryName;
	private String dataQueryChineseName;
	private String xml;
	private String extraInfo;
	private String createPeopleName;
	private String modifyPeopleName;
	private Date createTime;
	private Date modifyTime;
	
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
		return new String[]{dataQueryName,dataQueryChineseName};
	}
	
}

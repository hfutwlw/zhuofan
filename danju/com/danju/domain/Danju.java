package com.danju.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.domain.BaseEntity;
import com.excel.ExportDomainExcelInter;


/**
 * Danju entity. @author MyEclipse Persistence Tools
 */
@Table(name="DANJU")
@Entity
public class Danju extends BaseEntity implements java.io.Serializable,ExportDomainExcelInter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 316061454543547257L;
	// Fields

	
	private String danjuName;
	
	private String danjuChName;
	
	private String type;
	
	private String createPeople;
	
	private String createDate;
	
	private String modifyPeople;
	
	private String modifyDate;
	
	private String info;
	
	private String xml;
	
	private String struts2;

	

	@Column(name="DANJU_NAME",length=100)
	public String getDanjuName() {
		return danjuName;
	}
	@Column(name="DANJU_CH_NAME",length=100)
	public String getDanjuChName() {
		return danjuChName;
	}
	@Column(name="TYPE_",length=100)
	public String getType() {
		return type;
	}
	@Column(name="CREATE_PEOPLE",length=100)
	public String getCreatePeople() {
		return createPeople;
	}
	@Column(name="CREATE_DATE",length=100)
	public String getCreateDate() {
		return createDate;
	}
	@Column(name="MODIFY_NAME",length=100)
	public String getModifyPeople() {
		return modifyPeople;
	}
	@Column(name="MODIFY_DATE",length=100)
	public String getModifyDate() {
		return modifyDate;
	}
	@Column(name="INFO",length=100)
	public String getInfo() {
		return info;
	}
	@Column(name="XML",length=10000)
	public String getXml() {
		return xml;
	}
	@Column(name="STRUTS2",length=8000)
	public String getStruts2() {
		return struts2;
	}

	public void setDanjuName(String danjuName) {
		this.danjuName = danjuName;
	}

	public void setDanjuChName(String danjuChName) {
		this.danjuChName = danjuChName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCreatePeople(String createPeople) {
		this.createPeople = createPeople;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public void setModifyPeople(String modifyPeople) {
		this.modifyPeople = modifyPeople;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	public void setStruts2(String struts2) {
		this.struts2 = struts2;
	}

	public String[] excelData() {
		return new String[]{danjuName,danjuChName,type,createPeople,"",modifyPeople,"",info,xml,struts2};
	}

	public String[] excelTitle() {
		return new String[]{"单据名","单据中文名","单据类型","单据创建人","单据创建日期","单据修改人","单据修改日期","但据说明","单据xml文件","单据struts2文件"};
	}

}
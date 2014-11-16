package com.danju.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.excel.ExportDomainExcelInter;


/**
 * Danju entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DANJU")
public class Danju implements java.io.Serializable,ExportDomainExcelInter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 316061454543547257L;
	// Fields

	@Column(name="DANJU_NAME",length=100)
	private String danjuName;
	@Column(name="DANJU_CH_NAME",length=100)
	private String danjuChName;
	@Column(name="_TYPE",length=100)
	private String type;
	@Column(name="CREATE_PEOPLE",length=100)
	private String createPeople;
	@Column(name="CREATE_DATE",length=100)
	private String createDate;
	@Column(name="MODIFY_NAME",length=100)
	private String modifyPeople;
	@Column(name="MODIFY_DATE",length=100)
	private String modifyDate;
	@Column(name="INFO",length=100)
	private String info;
	@Column(name="XML",length=10000)
	private String xml;
	@Column(name="STRUTS2",length=9000)
	private String struts2;

	// Constructors

	/** default constructor */
	public Danju() {
	}

	
	// Property accessors

	

	public String getDanjuName() {
		return this.danjuName;
	}

	public String getDanjuChName() {
		return danjuChName;
	}


	public void setDanjuChName(String danjuChName) {
		this.danjuChName = danjuChName;
	}


	public String getCreateDate() {
		return createDate;
	}


	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}


	public String getModifyPeople() {
		return modifyPeople;
	}


	public void setModifyPeople(String modifyPeople) {
		this.modifyPeople = modifyPeople;
	}


	public String getModifyDate() {
		return modifyDate;
	}


	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}


	public void setDanjuName(String danjuName) {
		this.danjuName = danjuName;
	}

	

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreatePeople() {
		return this.createPeople;
	}

	public void setCreatePeople(String createPeople) {
		this.createPeople = createPeople;
	}

	
	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getXml() {
		return this.xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	public String getStruts2() {
		return this.struts2;
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
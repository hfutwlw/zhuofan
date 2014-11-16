package com.danju.domain;

import java.sql.Timestamp;


/**
 * Danju entity. @author MyEclipse Persistence Tools
 */

public class Danju implements java.io.Serializable {

	// Fields

	private Integer id;
	private String danjuName;
	private String danjuChineseName;
	private String type;
	private String createPeople;
	private Timestamp createDate;
	private String modifiePeople;
	private Timestamp modifieDate;
	private String info;
	private String xml;
	private String struts2;

	// Constructors

	/** default constructor */
	public Danju() {
	}

	/** full constructor */
	public Danju(String danjuName, String danjuChineseName, String type,
			String createPeople, Timestamp createDate, String modifiePeople,
			Timestamp modifieDate, String info, String xml, String struts2) {
		this.danjuName = danjuName;
		this.danjuChineseName = danjuChineseName;
		this.type = type;
		this.createPeople = createPeople;
		this.createDate = createDate;
		this.modifiePeople = modifiePeople;
		this.modifieDate = modifieDate;
		this.info = info;
		this.xml = xml;
		this.struts2 = struts2;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDanjuName() {
		return this.danjuName;
	}

	public void setDanjuName(String danjuName) {
		this.danjuName = danjuName;
	}

	public String getDanjuChineseName() {
		return this.danjuChineseName;
	}

	public void setDanjuChineseName(String danjuChineseName) {
		this.danjuChineseName = danjuChineseName;
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

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getModifiePeople() {
		return this.modifiePeople;
	}

	public void setModifiePeople(String modifiePeople) {
		this.modifiePeople = modifiePeople;
	}

	public Timestamp getModifieDate() {
		return this.modifieDate;
	}

	public void setModifieDate(Timestamp modifieDate) {
		this.modifieDate = modifieDate;
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
		return new String[]{danjuName,danjuChineseName,type,createPeople,"",modifiePeople,"",info,xml,struts2};
	}

	public static String[] excelTitle() {
		return new String[]{"单据名","单据中文名","单据类型","单据创建人","单据创建日期","单据修改人","单据修改日期","但据说明","单据xml文件","单据struts2文件"};
	}

}
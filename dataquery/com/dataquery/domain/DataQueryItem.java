package com.dataquery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.domain.BaseEntity;
import com.excel.ExportDomainExcelInter;
@Entity
@Table(name="DATA_QUERY_ITEM")
public class DataQueryItem extends BaseEntity implements ExportDomainExcelInter{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5007185376244571748L;
	@Column(name="_TYPE",length=100)
	private String type;
	@Column(name="_NAME",length=100)
	private String name;
	@Column(name="CH_NAME",length=100)
	private String chName;
	@Column(name="_HIDDEN",length=2)
	private boolean hidden;
	@Column(name="WIDTH",length=10)
	private int width;
	@Column(name="COLOR",length=100)
	private String color;
	@Column(name="RENDERER",length=200)
	private String renderer;
	@Column(name="DATA_QUERY_NAME",length=100)
	private String dataQueryName;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	public void setWidth(int width) {
		this.width = width;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRenderer() {
		return renderer;
	}
	public void setRenderer(String renderer) {
		this.renderer = renderer;
	}
	public String getDataQueryName() {
		return dataQueryName;
	}
	public void setDataQueryName(String dataQueryName) {
		this.dataQueryName = dataQueryName;
	}
	@Override
	public String[] excelTitle() {
		return new String[]{"名称","中文名"};
	}
	@Override
	public String[] excelData() {
		return new String[]{name,chName};
	}
}

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
	
	private String type;
	
	private String name;
	
	private String chName;
	
	private boolean hidden;
	
	private int width;
	
	private String color;
	
	private String renderer;
	
	private String dataQueryName;
	
	@Column(name="TYPE_",length=100)
	public String getType() {
		return type;
	}
	@Column(name="NAME_",length=100)
	public String getName() {
		return name;
	}
	@Column(name="CH_NAME",length=100)
	public String getChName() {
		return chName;
	}
	@Column(name="HIDDEN_",length=1)
	public boolean isHidden() {
		return hidden;
	}
	@Column(name="WIDTH",length=10)
	public int getWidth() {
		return width;
	}
	@Column(name="COLOR",length=100)
	public String getColor() {
		return color;
	}
	@Column(name="RENDERER",length=200)
	public String getRenderer() {
		return renderer;
	}
	@Column(name="DATA_QUERY_NAME",length=100)
	public String getDataQueryName() {
		return dataQueryName;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setChName(String chName) {
		this.chName = chName;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setRenderer(String renderer) {
		this.renderer = renderer;
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

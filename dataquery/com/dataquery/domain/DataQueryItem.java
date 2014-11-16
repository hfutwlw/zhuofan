package com.dataquery.domain;

import com.domain.BaseEntity;
import com.excel.ExportDomainExcelInter;

public class DataQueryItem extends BaseEntity implements ExportDomainExcelInter{
	
	private String type;
	private String name;
	private String chineseName;
	private boolean hidden;
	private Integer width;
	private String color;
	private String renderer;
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
	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
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
		return new String[]{name,chineseName};
	}
}

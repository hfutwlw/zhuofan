package com.danju.ext.domain;

public class ExtGridObjectModel {
	private String name;
	private String text;
	private String type;
	private boolean hidden;
	private int width = -1;
	private String dataQueryName;
	private String field;
	public ExtGridObjectModel(String name, String text, String type,
			boolean hidden, int width, String dataQueryName, String field) {
		super();
		this.name = name;
		this.text = text;
		this.type = type;
		this.hidden = hidden;
		this.width = width;
		this.dataQueryName = dataQueryName;
		this.field = field;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getDataQueryName() {
		return dataQueryName;
	}
	public void setDataQueryName(String dataQueryName) {
		this.dataQueryName = dataQueryName;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public ExtConfigObjectValue toExtConfigObjectValue(){
		ExtConfigObjectValue value = new ExtConfigObjectValue();
		value.addExtConfig(new ExtConfig("name", name));
		value.addExtConfig(new ExtConfig("text", text));
		if(type!=null){
			value.addExtConfig(new ExtConfig("type", type));
		}
		value.addExtConfig(new ExtConfig("hidden", hidden));
		value.addExtConfig(new ExtConfig("width", width==-1?200:width));
		if(field!=null){
			value.addExtConfig(new ExtConfig("field", field));
			if(dataQueryName!=null){
				value.addExtConfig(new ExtConfig("dataQueryName", dataQueryName));
			}
		}
		return value;
	}
}

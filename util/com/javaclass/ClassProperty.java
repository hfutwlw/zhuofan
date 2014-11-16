package com.javaclass;

import com.util.MyStringBuffer;


public class ClassProperty {

	private String type;   //属性类型
	private String accessType;  //访问权限
 	private String name;   //属性名称
	private String note;  //属性注释
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		MyStringBuffer returnStr = new MyStringBuffer("");
		returnStr.appendLn((note!=null?"//"+note:""));
		returnStr.appendLn(accessType + " "+type + " "+name+";");
		return returnStr.toString();
	}

	
}
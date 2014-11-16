package com.javaclass;

public class ClassParameter {
	
	private String type;   //参数类型
	private String name;   //参数名称
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
	@Override
	public String toString() {
		return type+" "+name;
	}
	

}

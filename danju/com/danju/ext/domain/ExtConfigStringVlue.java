package com.danju.ext.domain;

public class ExtConfigStringVlue extends ExtConfigValue{

	private Object value;

	public ExtConfigStringVlue() {
		super();
	}

	public ExtConfigStringVlue(Object value) {
		super();
		this.value = value;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		if(value instanceof String){
			return "\""+value+"\"";
		}else{
			return value+"";
		}
	}
}

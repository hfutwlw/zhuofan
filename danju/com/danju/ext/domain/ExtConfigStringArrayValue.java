package com.danju.ext.domain;

import java.util.ArrayList;
import java.util.List;

import com.string.util.MyStringBuffer;

public class ExtConfigStringArrayValue extends ExtConfigValue{
	
	private List<String> values;

	public ExtConfigStringArrayValue() {
		super();
	}

	public ExtConfigStringArrayValue(List<String> values) {
		super();
		this.values = values;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}
	
	public void addValue(String value){
		if(values==null){
			values = new ArrayList<String>();
		}
		values.add(value);
	}

	@Override
	public String toString() {
		MyStringBuffer myStringBuffer = new MyStringBuffer("[");
		for(int i=0;i<values.size();i++){
			String value = values.get(i);
			myStringBuffer.append("\""+value+"\"");
			if(i<values.size()-1){
				myStringBuffer.append(",");
			}else{
				myStringBuffer.append("]");
			}
		}
		return myStringBuffer.toString();
	}

}

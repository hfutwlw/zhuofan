package com.danju.ext.domain;

import java.util.ArrayList;
import java.util.List;

import com.string.util.MyStringBuffer;

public class ExtConfigObjectArrayValue extends ExtConfigValue{
	private List<ExtConfigObjectValue> extObjects;
	public ExtConfigObjectArrayValue() {
	}
	
	public ExtConfigObjectArrayValue(List<ExtConfigObjectValue> extObjects) {
		this.extObjects = extObjects;
	}

	public List<ExtConfigObjectValue> getExtObjects() {
		return extObjects;
	}

	public void setExtObjects(List<ExtConfigObjectValue> extObjects) {
		this.extObjects = extObjects;
	}
	
	public void addExtObjectValue(ExtConfigObjectValue objectValue){
		if(extObjects==null){
			extObjects = new ArrayList<ExtConfigObjectValue>();
		}
		extObjects.add(objectValue);
	}

	@Override
	public String toString() {
		MyStringBuffer myStringBuffer = new MyStringBuffer("");
		myStringBuffer.append("[");
		for(int i=0;i<extObjects.size();i++){
			ExtConfigObjectValue extObject = extObjects.get(i);
			myStringBuffer.append(extObject.toString());
			if(i<extObjects.size()-1){
				myStringBuffer.append(",");
			}
		}
		myStringBuffer.append("]");
		return myStringBuffer.toString();
	}
}

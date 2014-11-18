package com.danju.ext.domain;

import java.util.ArrayList;
import java.util.List;

import com.string.util.MyStringBuffer;

public class ExtConfigObjectValue extends ExtConfigValue{

	private List<ExtConfig> extConfigs;

	public ExtConfigObjectValue() {
	}

	public ExtConfigObjectValue(List<ExtConfig> extConfigs) {
		this.extConfigs = extConfigs;
	}

	public List<ExtConfig> getExtConfigs() {
		return extConfigs;
	}

	public void setExtConfigs(List<ExtConfig> extConfigs) {
		this.extConfigs = extConfigs;
	}

	public void addExtConfig(ExtConfig config){
		if(extConfigs == null){
			extConfigs = new ArrayList<ExtConfig>();
		}
		extConfigs.add(config);
	}

	@Override
	public String toString() {
		MyStringBuffer myStringBuffer = new MyStringBuffer("");
		myStringBuffer.appendLn("{");
		for(int i=0;i<extConfigs.size();i++){
			ExtConfig extConfig = extConfigs.get(i);
			if(i<extConfigs.size()-1){
				myStringBuffer.appendLn(extConfig.toString());
			}else{
				myStringBuffer.appendLn(extConfig.toStringWithNoSign());
			}
		}
		myStringBuffer.append("}");
		return myStringBuffer.toString();
	}
}

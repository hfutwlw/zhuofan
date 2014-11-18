package com.danju.ext.domain;

import java.util.ArrayList;
import java.util.List;

import com.string.util.MyStringBuffer;

public class EXTClass {

	private String className;
	private List<ExtConfig> extConfigs;
	private List<ExtFunction> extFunctions;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<ExtConfig> getExtConfigs() {
		return extConfigs;
	}
	public void setExtConfigs(List<ExtConfig> extConfigs) {
		this.extConfigs = extConfigs;
	}
	public List<ExtFunction> getExtFunctions() {
		return extFunctions;
	}
	public void setExtFunctions(List<ExtFunction> extFunctions) {
		this.extFunctions = extFunctions;
	}
	public void addExtConfig(ExtConfig extConfig){
		if(extConfigs==null){
			extConfigs = new ArrayList<ExtConfig>();
		}
		extConfigs.add(extConfig);
	}
	public void addExtFunction(ExtFunction extFunction){
		if(extFunctions==null){
			extFunctions = new ArrayList<ExtFunction>();
		}
		System.out.println(extFunctions);
		extFunctions.add(extFunction);
	}
	@Override
	public String toString() {
		MyStringBuffer stringBuffer = new MyStringBuffer("Ext.define(\""+className+"\",{\r\n");
		if(extConfigs!=null){
			for(int i=0;i<extConfigs.size();i++){
				if(i==extConfigs.size()-1&&(extFunctions==null||extFunctions.size()==0)){
					stringBuffer.appendLn(extConfigs.get(i).toStringWithNoSign());
				}else{
					stringBuffer.appendLn(extConfigs.get(i));
				}
			}
		}
		if(extFunctions!=null){
			for(int i=0;i<extFunctions.size();i++){
				stringBuffer.append(extFunctions.get(i));
				if(i<extFunctions.size()-1){
					stringBuffer.appendLn(",");
				}
			}
		}
		stringBuffer.append("});");
		return stringBuffer.toString();
	}

}

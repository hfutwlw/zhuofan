package com.danju.ext.domain;

import java.util.ArrayList;
import java.util.List;

import com.string.util.MyStringBuffer;

public class ExtFunction {
	private String functionName;
	private String content;
	private List<String> parameters;
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<String> getParameters() {
		return parameters;
	}
	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}
	public void addParameter(String parameter){
		if(parameters==null){
			parameters = new ArrayList<String>();
		}
		parameters.add(parameter);
	}
	/**
	 * 向函数内容中添加内容,并换行
	 * @param appendContent 要添加的内容
	 */
	public void appendLnContent(String appendContent){
		if(content==null){
			content = "";
		}
		content = content + appendContent+"\r\n";
	}
	/**
	 * 向函数内容中添加内容
	 * @param appendContent 要添加的内容
	 */
	public void appendContent(String appendContent){
		content = content + appendContent;
	}
	@Override
	public String toString() {
		MyStringBuffer buffer = new MyStringBuffer(functionName+" : function(");
		if(parameters!=null){
			for(int i=0;i<parameters.size();i++){
				buffer.append(parameters.get(i));
				if(i<parameters.size()-1){
					buffer.append(",");
				}
			}
		}
		buffer.appendLn("){");
		buffer.appendLn(content).append("}");
		return buffer.toString();
	}
}
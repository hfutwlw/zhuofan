package com.javaclass;

import java.util.ArrayList;
import java.util.List;

import com.string.util.MyStringBuffer;


public class ClassFunction {

	private String name;   //函数名
	private String accessType;  //函数访问权限
	private String returnType;  //函数返回值
	private List<ClassParameter> parameters;   //函数参数集合
	private String content;   //函数类容 
	private String note;   //函数的注释
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccessType() {
		return accessType;
	}
	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public List<ClassParameter> getParameters() {
		return parameters;
	}
	public void setParameters(List<ClassParameter> parameters) {
		this.parameters = parameters;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * 向parameters中添加一个parameter,如果parameters==null,则新建
	 * @param parameter
	 */
	public void addParameter(ClassParameter parameter){
		if(this.parameters==null){
			this.parameters = new ArrayList<ClassParameter>();
		}
		this.parameters.add(parameter);
	}
	/**
	 * 向parameters中添加一个parameter集合,如果parameters==null,则新建
	 * @param lpParameters
	 */
	public void addParameters(List<ClassParameter> lpParameters){
		if(this.parameters==null){
			this.parameters = new ArrayList<ClassParameter>();
		}
		this.parameters.addAll(lpParameters);
	}
	@Override
	public String toString() {
		MyStringBuffer returnStr = new MyStringBuffer("");
		returnStr.appendLn(note!=null?"//"+note:"");
		returnStr.append(accessType+" "+returnType+" "+name+"(");
		StringBuffer pat = new StringBuffer("");
		if(parameters!=null){
			for(int i=0;i<parameters.size();i++){
				pat.append(parameters.get(i).getType()+" "+parameters.get(i).getName());
				if(i!=parameters.size()-1){
					pat.append(",");
				}
			}
		}
		returnStr.appendLn(pat+"){").appendLn(content).appendLn("}");
		return returnStr.toString();
	}

}


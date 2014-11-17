package com.javaclass;

import java.util.ArrayList;
import java.util.List;

import com.string.util.MyStringBuffer;


public class JavaClass {

	private String className;
	private String packageName;
	private List<ClassProperty> properties;
	private List<ClassFunction> functions;
	private List<String> importPackageNames;

	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public List<ClassProperty> getProperties() {
		return properties;
	}
	public void setProperties(List<ClassProperty> properties) {
		this.properties = properties;
	}
	public List<ClassFunction> getFunctions() {
		return functions;
	}
	public void setFunctions(List<ClassFunction> functions) {
		this.functions = functions;
	}
	public List<String> getImportPackageNames() {
		return importPackageNames;
	}
	public void setImportPackageNames(List<String> importPackageNames) {
		this.importPackageNames = importPackageNames;
	}
	/**
	 * 向properties集合中添加一个property,如果properties==null则创建
	 * @param property
	 */
	public void addProperty(ClassProperty property){
		if (this.properties==null) {
			this.properties = new ArrayList<ClassProperty>();
		}
		this.properties.add(property);
	}
	/**
	 * 向properties集合中添加一个lpProperties,如果properties==null则创建
	 * @param lpProperties
	 */
	public void addProperties(List<ClassProperty> lpProperties){
		if (this.properties==null) {
			this.properties = new ArrayList<ClassProperty>();
		}
		this.properties.addAll(lpProperties);
	}

	/**
	 * 向functions集合中添加一个function,如果functions==null则创建
	 * @param function
	 */
	public void addFunction(ClassFunction function){
		if(this.functions==null){
			this.functions = new ArrayList<ClassFunction>();
		}
		this.functions.add(function);
	}
	/**
	 * 向functions集合中添加一个function集合,如果functions==null则创建
	 * @param function
	 */
	public void addFunctions(List<ClassFunction> lpFunctions){
		if(this.functions==null){
			this.functions = new ArrayList<ClassFunction>();
		}
		this.functions.addAll(lpFunctions);
	}
	/**
	 * 向importPackageNames集合中添加一个importPackageName,如果importPackageNames==null则创建
	 * @param importPackageName
	 */
	public void addImportPackageName(String importPackageName){
		if(this.importPackageNames==null){
			this.importPackageNames = new ArrayList<String>();
		}
		this.importPackageNames.add(importPackageName);
	}
	/**
	 * 向importPackageNames集合中添加一个importPackageName集合,如果importPackageNames==null则创建
	 * @param importPackageNames
	 */
	public void addImportPackageNames(List<String> importPackageNames){
		if(this.importPackageNames==null){
			this.importPackageNames = new ArrayList<String>();
		}
		this.importPackageNames.addAll(importPackageNames);
	}

	@Override
	public String toString() {
		MyStringBuffer returnStr = new MyStringBuffer("");
		returnStr.appendLn("package "+packageName+";").appendLn("");
		returnStr.appendLn("");
		if(importPackageNames!=null){
			for(String packageN : importPackageNames){
				returnStr.appendLn("import "+packageN+";");
			}
		}
		returnStr.appendLn("");
		returnStr.appendLn("public class "+className+"{").appendLn("");
		if(properties!=null){
			for(ClassProperty property : properties){
				returnStr.appendLn(property.toString());
			}
		}
		returnStr.appendLn("");
		if(functions!=null){
			for(ClassFunction function : functions){
				returnStr.appendLn(function.toString()).appendLn("");
			}
		}
		returnStr.appendLn("}");
		return returnStr.toString();
	}

	
}



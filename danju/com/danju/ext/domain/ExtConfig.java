package com.danju.ext.domain;

public class ExtConfig {
	
	private String config;
	private ExtConfigValue configValue;

	public ExtConfig() {
		super();
	}

	public ExtConfig(String config, ExtConfigValue configValue) {
		super();
		this.config = config;
		this.configValue = configValue;
	}
	
	/**
	 * 当构造函数传入字符类型的值时,默认就是字符类型的配置选项
	 * @param config 配置属性
	 * @param configValue 配置值
	 */
	public ExtConfig(String config, Object configValue) {
		super();
		this.config = config;
		this.configValue = new ExtConfigStringVlue(configValue);
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public ExtConfigValue getConfigValue() {
		return configValue;
	}

	public void setConfigValue(ExtConfigValue configValue) {
		this.configValue = configValue;
	}

	@Override
	public String toString() {
		return config + " : "+configValue.toString()+",";
	}
	
	public String toStringWithNoSign() {
		return config + " : "+configValue.toString();
	}
	
}

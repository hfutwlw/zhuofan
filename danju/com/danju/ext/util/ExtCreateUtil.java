package com.danju.ext.util;

import java.util.Arrays;
import java.util.List;

import com.danju.ext.domain.ExtConfig;
import com.danju.ext.domain.ExtConfigObjectArrayValue;
import com.danju.ext.domain.ExtConfigObjectValue;
import com.danju.ext.domain.ExtConfigValue;
import com.danju.ext.domain.ExtGridObjectModel;
import com.string.util.MyStringBuffer;

public class ExtCreateUtil implements ExtConfigUtil,ExtModelUtil{

	public ExtConfig config(String config,Object configValue){
		ExtConfig extConfig = new ExtConfig(config, configValue);
		return extConfig;
	}
	public ExtConfig config(String config,ExtConfigValue configValue){
		ExtConfig extConfig = new ExtConfig(config, configValue);
		return extConfig;
	}
	public ExtConfig configObject(String config,ExtConfig... extConfigs){
		ExtConfigObjectValue configObjectValue = new ExtConfigObjectValue(Arrays.asList(extConfigs));
		ExtConfig extConfig = new ExtConfig(config, configObjectValue);
		return extConfig;
	}
	public String defineWithPackageAndClassName(String packageName,String className){
		return "Ext.define(\""+packageName+"."+className+"\",{";
	}
	public ExtConfig idConfig(String id){
		return config("id", id);
	}
	public ExtConfig extendConfig(String component){
		return config("extend", component);
	}
	public ExtConfig aliasConfig(String aliasName){
		return config("alias", aliasName);
	}
	public String usesConfig(List<String> uses){
		MyStringBuffer myStringBuffer = new MyStringBuffer("uses : [");

		for(int i=0;i<uses.size();i++){
			String use = uses.get(i);
			myStringBuffer.append("\""+use+"\"");
			if(i!=uses.size()-1){
				myStringBuffer.append(",");
			}else{
				myStringBuffer.append("],");
			}
		}
		return myStringBuffer.toString();
	}
	public ExtConfig controllerConfig(String controller){
		return config("controller", controller);
	}
	public ExtConfig viewModelConfig(ExtConfigObjectValue viewModel){
		return config("viewModel", viewModel);
	}
	public ExtConfig viewModelConfig(String viewModel){
		return config("viewModel", viewModel);
	}
	public ExtConfig titleConfig(String title){
		return config("title", title);
	}
	public ExtConfig defaultsConfig(Object defaults){
		return config("defaults", defaults);
	}
	public ExtConfig widthConfig(String width){
		return config("width", width);
	}
	public ExtConfig layoutConfig(String layout){
		return config("layout", layout);
	}
	public ExtConfig xtypeConfig(String xtype){
		return config("xtype", xtype);
	}
	public ExtConfig flexConfig(int flex){
		return config("flex", flex);
	}
	public ExtConfig regionConfig(String region){
		return config("region", region);
	}
	@Override
	public ExtConfigObjectValue createExtConfigObjectValue(String name,
			String text, String type, boolean hidden, int width,
			String dataQueryName, String field) {
		ExtGridObjectModel extGridObjectModel = new ExtGridObjectModel(name, text, type, hidden, width, dataQueryName, field);
		return extGridObjectModel.toExtConfigObjectValue();
	}
	@Override
	public ExtConfig singletonConfig(boolean singleton) {
		return config("singleton", singleton);
	}
	@Override
	public ExtConfig alternateClassNameConfig(String alternateClassName) {
		return config("alternateClassName", alternateClassName);
	}
	@Override
	public ExtConfig styleConfig(String style){
		return config("style", style);
	}
	@Override
	public ExtConfig textConfig(String text){
		return config("text", text);
	}
	@Override
	public ExtConfig glyphConfig(int glyph){
		return config("glyph", glyph);
	}
	@Override
	public ExtConfig itemsConfig(ExtConfigObjectArrayValue items) {
		return config("items", items);
	}
	@Override
	public ExtConfig typeConfig(String type) {
		return config("type", type);
	}

	@Override
	public ExtConfig selTypeConfig(String selType){
		return config("selType", selType);
	}
	@Override
	public ExtConfig ptypeConfig(String ptype) {
		return config("ptype", ptype);
	}
	@Override
	public ExtConfig clicksToEditConfig(int clicksToEdit) {
		return config("clicksToEdit", clicksToEdit);
	}
	@Override
	public ExtConfig pluginsConfig(ExtConfigObjectArrayValue plugins) {
		return config("plugins", plugins);
	}
	@Override
	public ExtConfig itemIdConfig(String itemId) {
		return config("itemId", itemId);
	}
	@Override
	public ExtConfig disabledConfig(boolean disabled) {
		return config("disabled", disabled);
	}
	@Override
	public ExtConfig handlerConfig(String handler) {
		return config("handler", handler);
	}
	@Override
	public ExtConfig tbarConfig(ExtConfigObjectArrayValue tbar) {
		return config("tbar", tbar);
	}
	@Override
	public ExtConfig referenceConfig(String reference) {
		return config("reference", reference);
	}
	@Override
	public ExtConfig heightConfig(String height){
		return config("height", height);
	}
	@Override
	public ExtConfig columnWidthConfig(float columnWidth){
		return config("columnWidth", columnWidth);
	}

	@Override
	public ExtConfig labelWidthConfig(int labelWidth){
		return config("labelWidth", labelWidth);
	}

	@Override
	public ExtConfig labelAlignConfig(String labelAlign){
		return config("labelAlign", labelAlign);
	}
	@Override
	public ExtConfig formatConfig(String format){
		return config("format", format);
	}
	@Override
	public ExtConfig fieldLabelConfig(String fieldLabel){
		return config("fieldLabel", fieldLabel);
	}
	@Override
	public ExtConfig valueFieldConfig(String valueField){
		return config("valueField", valueField);
	}
	@Override
	public ExtConfig displayFieldConfig(String displayField){
		return config("displayField", displayField);
	}
	@Override
	public ExtConfig editableConfig(boolean editable){
		return config("editable", editable);
	}
	@Override
	public ExtConfig queryModeConfig(String queryMode){
		return config("queryMode", queryMode);
	}
	@Override
	public ExtConfig emptyTextConfig(String emptyText){
		return config("emptyText", emptyText);
	}
	@Override
	public ExtConfig storeConfig(ExtConfigObjectValue store){
		return config("store", store);
	}
	@Override
	public ExtConfig fieldsConfig(String fields){
		return config("fields", fields);
	}
	@Override
	public ExtConfig dataConfig(ExtConfigObjectArrayValue data){
		return config("data", data);
	}
	@Override
	public ExtConfig dockedItemsConfig(ExtConfigObjectArrayValue dockedItems){
		return config("dockedItems", dockedItems);
	}
	@Override
	public ExtConfig dockConfig(String dock){
		return config("dock", dock);
	}
	@Override
	public ExtConfig minWidthConfig(int minWidth){
		return config("minWidth", minWidth);
	}
	@Override
	public ExtConfig nameConfig(String name){
		return config("name", name);
	}


}

package com.danju.ext.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.danju.ext.domain.EXTClass;
import com.danju.ext.domain.ExtConfig;
import com.danju.ext.domain.ExtConfigObjectArrayValue;
import com.danju.ext.domain.ExtConfigObjectValue;
import com.danju.ext.domain.ExtConfigStringArrayValue;
import com.danju.ext.domain.ExtFunction;
import com.danju.xml.model.Dj;
import com.danju.xml.model.Dj.Detailinfos.Detailinfo.Dcol;
import com.danju.xml.model.Dj.Masterinfo.Mcol;
import com.io.util.FileWriteUtil;
import com.string.util.StringUtil;

public class ExtCreateDanju extends ExtCreateUtil{

	private Dj dj;
	public ExtCreateDanju(Dj dj) {
		super();
		this.dj = dj;
	}
	public Dj getDj() {
		return dj;
	}
	public void setDj(Dj dj) {
		this.dj = dj;
	}


	/**
	 * 根据传入的单据对象返回一个单据js的主文件
	 * @param dj
	 * @return
	 */
	public EXTClass getDanju(){
		String packageName = "app.view."+dj.getName();
		String className = StringUtil.firstCharToUpper(dj.getName());
		EXTClass extClass = new EXTClass();
		extClass.setClassName(packageName+"."+className);

		List<ExtConfig> extConfigs = new ArrayList<ExtConfig>();
		extConfigs.add(idConfig(className+"Panel"));
		extConfigs.add(extendConfig(COM_PANEL));
		extConfigs.add(aliasConfig(className+"Panel"));

		ExtConfigStringArrayValue usesValue = new ExtConfigStringArrayValue();
		usesValue.addValue(packageName+".region."+className+"North");
		usesValue.addValue(packageName+".region."+className+"Form");
		usesValue.addValue(packageName+".region."+className+"Grid");
		usesValue.addValue(packageName+"."+className+"Controller");
		usesValue.addValue(packageName+"."+className+"Model");
		extConfigs.add(config("uses", usesValue));

		extConfigs.add(controllerConfig(dj.getName()));
		extConfigs.add(viewModelConfig(dj.getName()));
		extConfigs.add(titleConfig(dj.getCname()));

		ExtConfigObjectValue defaultsValue = new ExtConfigObjectValue();
		defaultsValue.addExtConfig(widthConfig("100%"));
		extConfigs.add(config("defaults", defaultsValue));
		extConfigs.add(layoutConfig("vbox"));

		ExtConfigObjectArrayValue items = new ExtConfigObjectArrayValue();
		ExtConfigObjectValue title = new ExtConfigObjectValue();
		title.addExtConfig(xtypeConfig("panel"));
		title.addExtConfig(flexConfig(1));
		title.addExtConfig(titleConfig("头部"));
		items.addExtObjectValue(title);
		ExtConfigObjectArrayValue mainItems = new ExtConfigObjectArrayValue();
		ExtConfigObjectValue mainNorth = new ExtConfigObjectValue();
		mainNorth.addExtConfig(xtypeConfig(dj.getName()+"FormPanel"));
		mainNorth.addExtConfig(regionConfig("north"));
		mainNorth.addExtConfig(regionConfig("north"));
		ExtConfigObjectValue mainCenter = new ExtConfigObjectValue();
		mainCenter.addExtConfig(xtypeConfig(dj.getName()+"GridPanel"));
		mainCenter.addExtConfig(regionConfig("center"));
		mainItems.addExtObjectValue(mainNorth);
		mainItems.addExtObjectValue(mainCenter);
		ExtConfigObjectValue main = new ExtConfigObjectValue();
		main.addExtConfig(xtypeConfig(dj.getName()+"NorthToolbar"));
		main.addExtConfig(flexConfig(9));
		main.addExtConfig(layoutConfig("border"));
		main.addExtConfig(new ExtConfig("items", mainItems));
		items.addExtObjectValue(main);
		extConfigs.add(config("items", items));

		extClass.setExtConfigs(extConfigs);
		return extClass;
	}


	public EXTClass getDanjuController(){
		String packageName = "app.view."+dj.getName();
		String className = StringUtil.firstCharToUpper(dj.getName());
		EXTClass extClass = new EXTClass();
		List<ExtConfig> extConfigs = new ArrayList<ExtConfig>();
		extClass.setClassName(packageName+"."+className+"Controller");
		extClass.addExtConfig(extendConfig("Ext.app.ViewController"));
		extClass.addExtConfig(aliasConfig("controller."+dj.getName()));

		ExtFunction funSaveDanju = new ExtFunction();
		funSaveDanju.setFunctionName("savaDanju");
		funSaveDanju.addParameter("button");
		funSaveDanju.appendLnContent("var form = this.lookupReference(\""+className+"FormPanel\").getForm();");
		List<Mcol> mcols = dj.getMasterinfo().getMcol();
		for(int i=0;i<mcols.size();i++){
			Mcol mcol = mcols.get(i);
			if(mcol.isRequired()!=null&&mcol.isRequired()){
				if(i==0){
					funSaveDanju.appendLnContent("if (form.findField(\""+mcol.getName()+"\").getValue() == \"\") {");
				}else{
					funSaveDanju.appendLnContent("else if (form.findField(\""+mcol.getName()+"\").getValue() == \"\") {");
				}
				funSaveDanju.appendLnContent("Ext.Msg.alert(\"提示\", \""+mcol.getCname()+"不能为空\");");
				funSaveDanju.appendContent("}");
			}
		}
		funSaveDanju.appendLnContent("else {");
		funSaveDanju.appendLnContent("var fields = form.getFields();");
		funSaveDanju.appendLnContent("for (var i = 0; i < fields.getCount(); i++) {");
		funSaveDanju.appendLnContent("var field = fields.get(i);");
		funSaveDanju.appendLnContent("field.setDisabled(true);");
		funSaveDanju.appendLnContent("}");
		funSaveDanju.appendLnContent("button.setDisabled(true);");
		funSaveDanju.appendLnContent("var data = Danju1GetRecordUtil.getOneEmptyRecord(this.getView().getViewModel());");
		funSaveDanju.appendLnContent("var gridPanel = this.lookupReference(\""+className+"GridPanel\");");
		funSaveDanju.appendLnContent("gridPanel.getStore().insert(0,data);");
		funSaveDanju.appendLnContent("gridPanel.queryById(\"addOneEmptyRecord\").setDisabled(false);");
		funSaveDanju.appendContent("}");
		extClass.addExtFunction(funSaveDanju);

		ExtFunction funAddEmptyRecord = new ExtFunction();
		funAddEmptyRecord.setFunctionName("btnAddOneEmptyRecordClick");
		funAddEmptyRecord.appendLnContent("var gridStore = this.lookupReference(\""+dj.getName()+"GridPanel\").getStore();");
		funAddEmptyRecord.appendLnContent("if (gridStore.getCount() - gridStore.getUpdatedRecords().length >= 0) {");
		funAddEmptyRecord.appendLnContent("var data = Danju1GetRecordUtil.getOneEmptyRecord(this.getView().getViewModel());");
		funAddEmptyRecord.appendLnContent("gridStore.insert(gridStore.getCount(), data);");			
		funAddEmptyRecord.appendLnContent("}else {");
		funAddEmptyRecord.appendLnContent("Ext.Msg.alert(\"提示\",\"您当前还有未保存数据,请您先保存数据\");");
		funAddEmptyRecord.appendContent("}");
		extClass.addExtFunction(funAddEmptyRecord);
		return extClass;
	}

	public EXTClass getDanjuModel(){
		String packageName = "app.view."+dj.getName();
		String className = StringUtil.firstCharToUpper(dj.getName());
		EXTClass extClass = new EXTClass();
		extClass.setClassName(packageName+"."+className+"Model");
		extClass.addExtConfig(extendConfig("Ext.app.ViewModel"));
		extClass.addExtConfig(aliasConfig("viewmodel."+dj.getName()));

		ExtConfigObjectArrayValue danju = new ExtConfigObjectArrayValue();
		List<Dcol> dcols = dj.getDetailinfos().getDetailinfo().get(0).getDcol();
		for(Dcol dcol : dcols){
			ExtConfigObjectValue extConfigObjectValue = createExtConfigObjectValue(dj.getName()+"."+dcol.getName()
					, dcol.getCname(), dcol.getType(), false, 200, dcol.getDqname(), dcol.getType());
			danju.addExtObjectValue(extConfigObjectValue);
		}
		extClass.addExtConfig(config("danju", danju));
		return extClass;
	}
	
	public EXTClass getExtGetRecordUtil(){
		String packageName = "app.view."+dj.getName()+".util";
		String className = StringUtil.firstCharToUpper(dj.getName());
		EXTClass extClass = new EXTClass();
		extClass.setClassName(packageName+"."+className+"GetRecordUtil");
		extClass.addExtConfig(singletonConfig(true));
		extClass.addExtConfig(alternateClassNameConfig(className+"GetRecordUtil"));
		
		ExtFunction funGetOneEmptyRecord = new ExtFunction();
		funGetOneEmptyRecord.setFunctionName("getOneEmptyRecord");
		funGetOneEmptyRecord.addParameter("danju");
		funGetOneEmptyRecord.appendLnContent("var data ={};");
		funGetOneEmptyRecord.appendLnContent("for(var i in danju){");
		funGetOneEmptyRecord.appendLnContent("eval(\"data['\"+danju[i].name+\"']=''\");");
		funGetOneEmptyRecord.appendLnContent("}");
		funGetOneEmptyRecord.appendContent("return data;");
		extClass.addExtFunction(funGetOneEmptyRecord);
		return extClass;
	}
	
	public EXTClass getRegionNorth(){
		String packageName = "app.view."+dj.getName()+".region";
		String className = StringUtil.firstCharToUpper(dj.getName());
		EXTClass extClass = new EXTClass();
		extClass.setClassName(packageName+"."+className+"North");
		extClass.addExtConfig(extendConfig("Ext.toolbar.Toolbar"));
		extClass.addExtConfig(aliasConfig("widget."+dj.getName()+"NorthToolbar"));
		
		ExtConfigObjectValue defaultsConfigValue = new ExtConfigObjectValue();
		defaultsConfigValue.addExtConfig(xtypeConfig("buttontransparent"));
		extClass.addExtConfig(defaultsConfig(defaultsConfigValue)); 
		extClass.addExtConfig(styleConfig("background-color : #F5F5F5"));
		ExtConfigObjectArrayValue items = new ExtConfigObjectArrayValue();
		ExtConfigObjectValue item1 = new ExtConfigObjectValue();
		item1.addExtConfig(textConfig("保存单据"));
		item1.addExtConfig(glyphConfig(0xf0c7));
		items.addExtObjectValue(item1);
		extClass.addExtConfig(itemsConfig(items));
		return extClass;
	}
	
	public EXTClass getRegionGrid(){
		String packageName = "app.view."+dj.getName();
		String className = StringUtil.firstCharToUpper(dj.getName());
		EXTClass extClass = new EXTClass();
		extClass.setClassName(packageName+".region."+className+"Grid");
		extClass.addExtConfig(extendConfig("Ext.grid.Panel"));
		extClass.addExtConfig(aliasConfig("widget."+dj.getName()+"GridPanel"));
		
		ExtConfigObjectValue viewModelConfig = new ExtConfigObjectValue();
		viewModelConfig.addExtConfig(typeConfig(dj.getName()));
		extClass.addExtConfig(viewModelConfig(viewModelConfig));
		
		extClass.addExtConfig(selTypeConfig("rowmodel"));
		extClass.addExtConfig(regionConfig(dj.getName()+"GridPanel"));
		
		ExtConfigObjectArrayValue pluginsConfig = new ExtConfigObjectArrayValue();
		ExtConfigObjectValue pluginsConfigChild1 = new ExtConfigObjectValue();
		pluginsConfigChild1.addExtConfig(ptypeConfig("rowediting"));
		pluginsConfigChild1.addExtConfig(clicksToEditConfig(2)); 
		pluginsConfig.addExtObjectValue(pluginsConfigChild1);
		extClass.addExtConfig(pluginsConfig(pluginsConfig));
		
		ExtConfigObjectArrayValue tbar = new ExtConfigObjectArrayValue();
		ExtConfigObjectValue tbar1 = new ExtConfigObjectValue();
		tbar1.addExtConfig(textConfig("添加"));
		tbar1.addExtConfig(itemIdConfig("addOneEmptyRecord"));
		tbar1.addExtConfig(disabledConfig(true));
		tbar1.addExtConfig(handlerConfig("btnAddOneEmptyRecordClick"));
		tbar.addExtObjectValue(tbar1);
		extClass.addExtConfig(tbarConfig(tbar));
		
		ExtFunction initComponentFun = new ExtFunction();
		initComponentFun.setFunctionName("initComponent");
		initComponentFun.appendLnContent("this.columns = CommonColumnsUtil.getColumns(this.getViewModel().danju);");
		initComponentFun.appendLnContent("this.store = CommonStoreUtil.getStore(this.getViewModel().danju);");
		initComponentFun.appendContent("this.callParent(arguments);");
		extClass.addExtFunction(initComponentFun);
		return extClass;
	}
	
	public EXTClass getRegionForm(){
		String packageName = "app.view."+dj.getName();
		String className = StringUtil.firstCharToUpper(dj.getName());
		EXTClass extClass = new EXTClass();
		extClass.setClassName(packageName+".region."+className+"Form");
		extClass.addExtConfig(extendConfig("Ext.form.Panel"));
		extClass.addExtConfig(aliasConfig("widget."+dj.getName()+"FormPanel"));
		extClass.addExtConfig(referenceConfig(dj.getName()+"FormPanel"));
		
		ExtConfigObjectArrayValue items = new ExtConfigObjectArrayValue();
		ExtConfigObjectValue itemChild1 = new ExtConfigObjectValue();
		itemChild1.addExtConfig(xtypeConfig("fieldset"));
		itemChild1.addExtConfig(widthConfig("100%"));
		itemChild1.addExtConfig(heightConfig("100%"));
		itemChild1.addExtConfig(layoutConfig("column"));
		itemChild1.addExtConfig(titleConfig("<font style='color:blue'>汇总信息</font>"));
		itemChild1.addExtConfig(styleConfig("margin:10px;padding:10px 5px 10px 5px"));
		
		ExtConfigObjectValue defaults = new ExtConfigObjectValue();
		defaults.addExtConfig(xtypeConfig("textfield"));
		defaults.addExtConfig(columnWidthConfig((float)0.3));
		defaults.addExtConfig(labelWidthConfig(85));
		defaults.addExtConfig(labelAlignConfig("right"));
		defaults.addExtConfig(styleConfig("margin:5px 5px 5px 5px"));
		defaults.addExtConfig(formatConfig("Y-m-d"));
		itemChild1.addExtConfig(defaultsConfig(defaults));
		
		ExtConfigObjectArrayValue itemChild1Child1 = new ExtConfigObjectArrayValue();
		List<Mcol> mcols = dj.getMasterinfo().getMcol();
		for(Mcol mcol : mcols){
			ExtConfigObjectValue configObjectValue = new ExtConfigObjectValue();
			configObjectValue.addExtConfig(fieldLabelConfig(mcol.getCname()));
			configObjectValue.addExtConfig(xtypeConfig("textfield"));
			configObjectValue.addExtConfig(nameConfig(mcol.getName()));
			itemChild1Child1.addExtObjectValue(configObjectValue);
		}
		itemChild1.addExtConfig(itemsConfig(itemChild1Child1));
		items.addExtObjectValue(itemChild1);
		extClass.addExtConfig(itemsConfig(items));
		
		ExtConfigObjectArrayValue dockedItems = new ExtConfigObjectArrayValue();
		ExtConfigObjectValue dockedItemsChild1 = new ExtConfigObjectValue();
		dockedItemsChild1.addExtConfig(xtypeConfig("toolbar"));
		dockedItemsChild1.addExtConfig(dockConfig("bottom"));
		dockedItemsChild1.addExtConfig(styleConfig("background-color : #ffffff"));
		ExtConfigObjectArrayValue dockedItemsChild1Child = new ExtConfigObjectArrayValue();
		ExtConfigObjectValue btnConfig = new ExtConfigObjectValue();
		btnConfig.addExtConfig(textConfig("确定"));
		btnConfig.addExtConfig(minWidthConfig(80));
		btnConfig.addExtConfig(handlerConfig("saveDanju"));
		dockedItemsChild1Child.addExtObjectValue(btnConfig);
		dockedItemsChild1.addExtConfig(itemsConfig(dockedItemsChild1Child));
		dockedItems.addExtObjectValue(dockedItemsChild1);
		extClass.addExtConfig(dockedItemsConfig(dockedItems));
		return extClass;
	}
	
	public void writeFile(){
		File outFile = new File("C:\\Users\\linpeng123l\\Desktop\\Javascript_extjs学习\\project\\WebRoot\\app\\app\\view");
		String className = StringUtil.firstCharToUpper(dj.getName());
		FileWriteUtil.writeTextToFile(this.getDanju().toString(),outFile.getAbsolutePath()+"\\"+dj.getName()+"\\"+className+".js");
		FileWriteUtil.writeTextToFile(this.getDanjuController().toString(),outFile.getAbsolutePath()+"\\"+dj.getName()+"\\"+className+"Controller.js");
		FileWriteUtil.writeTextToFile(this.getDanjuModel().toString(),outFile.getAbsolutePath()+"\\"+dj.getName()+"\\"+className+"Model.js");
		FileWriteUtil.writeTextToFile(this.getExtGetRecordUtil().toString(),outFile.getAbsolutePath()+"\\"+dj.getName()+"\\util\\"+className+"GetRecordUtil.js");
		FileWriteUtil.writeTextToFile(this.getRegionForm().toString(),outFile.getAbsolutePath()+"\\"+dj.getName()+"\\region\\"+className+"Form.js");
		FileWriteUtil.writeTextToFile(this.getRegionGrid().toString(),outFile.getAbsolutePath()+"\\"+dj.getName()+"\\region\\"+className+"Grid.js");
		FileWriteUtil.writeTextToFile(this.getRegionNorth().toString(),outFile.getAbsolutePath()+"\\"+dj.getName()+"\\region\\"+className+"North.js");
	}
}
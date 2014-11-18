package com.danju.ext.util;

import java.util.List;

import com.danju.ext.domain.ExtConfig;
import com.danju.ext.domain.ExtConfigObjectArrayValue;
import com.danju.ext.domain.ExtConfigObjectValue;
import com.danju.ext.domain.ExtConfigValue;

public interface ExtConfigUtil {

	//panel组件类名
	public final static String COM_PANEL = "Ext.panel.Panel";
	//panel组件类名加上引号
	public final static String COM_PANEL_WITH_SIGN = "\"Ext.panel.Panel\"";
	//继承自panel组件的字符串
	public final static String EXTEND_COM_PANEL = "extend : "+COM_PANEL_WITH_SIGN;


	/**
	 * 得到一个 Config对象
	 * @param config 配置选项
	 * @param configValue 配置值
	 * @return  config : configValue,
	 */
	public ExtConfig config(String config,Object configValue);
	/**
	 * 得到一个 Config对象
	 * @param config 配置选项
	 * @param configValue 配置值
	 * @return  config : configValue,
	 */
	public ExtConfig config(String config,ExtConfigValue configValue);
	/**
	 * 得到一个 Config对象
	 * @param config 配置选项
	 * @param configValue 配置值
	 * @return  config : configValue,
	 */
	public ExtConfig configObject(String config,ExtConfig... extConfigs);


	/**
	 * 得到一个Ext.define(app.view.main.Main,{的字符串
	 * @param packageName 包名
	 * @param className 类名
	 * @return Ext.define(app.view.main.Main,{
	 */
	public String defineWithPackageAndClassName(String packageName,String className);

	/**
	 * 得到一个 Config对象
	 * 主要包含逗号
	 * @param id 传入id
	 * @return id : ...,
	 */
	public ExtConfig idConfig(String id);

	/**
	 * 得到一个 Config对象
	 * @param component 组件名称
	 * @return extend : "Ext.panel.Panel",
	 */
	public ExtConfig extendConfig(String component);

	/**
	 * 得到一个 Config对象
	 * @param aliasName 别名
	 * @return alias : "Danju1Panel",
	 */
	public ExtConfig aliasConfig(String aliasName);

	/**
	 * 得到一个uses : ["app.view.MianController","app.view.Main"],类型的字符串
	 * @param uses 使用到的类的路径
	 * @return uses : ["app.view.MianController","app.view.Main"],
	 */
	public String usesConfig(List<String> uses);

	/**
	 * 得到一个 Config对象
	 * @param controller 控制器字符串
	 * @return controller : "Danju1",
	 */
	public ExtConfig controllerConfig(String controller);
	/**
	 * 得到一个 Config对象
	 * @param viewModel 模型
	 * @return viewModel : {type:viewmodel},
	 */
	public ExtConfig viewModelConfig(ExtConfigObjectValue viewModel);
	/**
	 * 得到一个 Config对象
	 * @param viewModel 模型
	 * @return viewModel : {type:viewmodel},
	 */
	public ExtConfig viewModelConfig(String viewModel);

	/**
	 * 得到一个 Config对象
	 * @param title 标题
	 * @return title : "单据",
	 */
	public ExtConfig titleConfig(String title);

	/**
	 * 得到一个 Config对象
	 * @param defaults 默认配置向
	 * @return
	 */
	public ExtConfig defaultsConfig(Object defaults);

	/**
	 * Config对象
	 * @param width 宽度
	 * @return width : "100%",
	 */
	public ExtConfig widthConfig(String width);
	/**
	 * Config对象
	 * @param layout 布局
	 * @return layout : "fit",
	 */
	public ExtConfig layoutConfig(String layout);

	/**
	 * Config对象
	 * @param xtype 控件类型
	 * @return xtype : "panel",
	 */
	public ExtConfig xtypeConfig(String xtype);
	/**
	 * Config对象
	 * @param flex 比例
	 * @return flex : 1,
	 */
	public ExtConfig flexConfig(int flex);

	/**
	 * Config对象
	 * @param region 区域
	 * @return region : "north",
	 */
	public ExtConfig regionConfig(String region);

	/**
	 * Config对象
	 * @param singleton 单例
	 * @return singleton : "true",
	 */
	public ExtConfig singletonConfig(boolean singleton);

	/**
	 * Config对象
	 * @param alternateClassName 别名
	 * @return alternateClassName : "DanjuColomnUtil",
	 */
	public ExtConfig alternateClassNameConfig(String alternateClassName);

	/**
	 * Config对象
	 * @param stype 样式
	 * @return stype : "color=#00f00f",
	 */
	public ExtConfig styleConfig(String style);
	/**
	 * Config对象
	 * @param text 中文名
	 * @return text : "姓名",
	 */
	public ExtConfig textConfig(String text);

	/**
	 * Config对象
	 * @param glyph 样式图
	 * @return glyph : "#0x66",
	 */
	public ExtConfig glyphConfig(int glyph);

	/**
	 * Config对象
	 * @param item 子组件
	 * @return item : "[{}]",
	 */
	public ExtConfig itemsConfig(ExtConfigObjectArrayValue items);
	/**
	 * Config对象
	 * @param type 类型
	 * @return type : "button",
	 */
	public ExtConfig typeConfig(String type);
	/**
	 * Config对象
	 * @param selType 编辑类型
	 * @return selType : "rowmodel",
	 */
	public ExtConfig selTypeConfig(String selType);
	/**
	 * Config对象
	 * @param ptype 组件类型
	 * @return ptype : "rowediting",
	 */
	public ExtConfig ptypeConfig(String ptype);
	/**
	 * Config对象
	 * @param clicksToEdit 可编辑响应
	 * @return clicksToEdit : "2",
	 */
	public ExtConfig clicksToEditConfig(int clicksToEdit);
	/**
	 * Config对象
	 * @param plugins 组件
	 * @return plugins : "[{}]",
	 */
	public ExtConfig pluginsConfig(ExtConfigObjectArrayValue plugins);
	/**
	 * Config对象
	 * @param itemId 子id
	 * @return itemId : "aa",
	 */
	public ExtConfig itemIdConfig(String itemId);

	/**
	 * Config对象
	 * @param disabled 可用?
	 * @return disabled : "true",
	 */
	public ExtConfig disabledConfig(boolean disabled);
	/**
	 * Config对象
	 * @param handler 响应函数
	 * @return handler : "function(){}",
	 */
	public ExtConfig handlerConfig(String handler);

	/**
	 * Config对象
	 * @param tbar 顶部按钮
	 * @return tbar : "[{}]",
	 */
	public ExtConfig tbarConfig(ExtConfigObjectArrayValue tbar);

	/**
	 * Config对象
	 * @param reference 引用
	 * @return reference : "[{}]",
	 */
	public ExtConfig referenceConfig(String reference);
	/**
	 * Config对象
	 * @param height 高度
	 * @return height : "100%",
	 */
	public ExtConfig heightConfig(String height);
	/**
	 * Config对象
	 * @param columnWidth 列宽
	 * @return columnWidth : "60",
	 */
	public ExtConfig columnWidthConfig(float columnWidth);
	/**
	 * Config对象
	 * @param labelWidth 标识宽
	 * @return labelWidth : "60",
	 */
	public ExtConfig labelWidthConfig(int labelWidth);

	/**
	 * Config对象
	 * @param labelAlign 列头对齐方式
	 * @return labelAlign : "right",
	 */
	public ExtConfig labelAlignConfig(String labelAlign);

	/**
	 * Config对象
	 * @param format 格式化方式
	 * @return format : "Y-m-d",
	 */
	public ExtConfig formatConfig(String format);
	/**
	 * Config对象
	 * @param fieldLabel 名称
	 * @return fieldLabel : "姓名",
	 */
	public ExtConfig fieldLabelConfig(String fieldLabel);
	/**
	 * Config对象
	 * @param valueField 值域
	 * @return valueField : "name",
	 */
	public ExtConfig valueFieldConfig(String valueField);
	/**
	 * Config对象
	 * @param displayField 显示域
	 * @return displayField : "name",
	 */
	public ExtConfig displayFieldConfig(String displayField);
	/**
	 * Config对象
	 * @param editable 可编辑
	 * @return editable : "true",
	 */
	public ExtConfig editableConfig(boolean editable);
	/**
	 * Config对象
	 * @param queryMode 查询方式
	 * @return queryMode : "local",
	 */
	public ExtConfig queryModeConfig(String queryMode);
	/**
	 * Config对象
	 * @param emptyText 空提示
	 * @return emptyText : "你好",
	 */
	public ExtConfig emptyTextConfig(String emptyText);
	/**
	 * Config对象
	 * @param store 数据源
	 * @return store : "store",
	 */
	public ExtConfig storeConfig(ExtConfigObjectValue store);
	/**
	 * Config对象
	 * @param fields 显示
	 * @return fields : "name",
	 */
	public ExtConfig fieldsConfig(String fields);
	/**
	 * Config对象
	 * @param data 数据
	 * @return data : "[]",
	 */
	public ExtConfig dataConfig(ExtConfigObjectArrayValue data);
	/**
	 * Config对象
	 * @param dockedItems 按钮组
	 * @return dockedItems : "[]",
	 */
	public ExtConfig dockedItemsConfig(ExtConfigObjectArrayValue dockedItems);
	/**
	 * Config对象
	 * @param dock 位置
	 * @return dock : "buttom",
	 */
	public ExtConfig dockConfig(String dock);
	/**
	 * Config对象
	 * @param minWidth 最小宽度
	 * @return minWidth : "200",
	 */
	public ExtConfig minWidthConfig(int minWidth);
	/**
	 * Config对象
	 * @param name 单据名
	 * @return name : "name",
	 */
	public ExtConfig nameConfig(String name);
}


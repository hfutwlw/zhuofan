Ext.define("ZhuoFan.view.dataquerymanage.DataQueryManage",{
	extend : "Ext.panel.Panel",
	alias : "widget.dataquerymanagepanel",
	treeid : "DataQueryManage",
	alternateClassName : "DataQueryManage",
	layout : "border",
	
	title : "单据提取方案",
	closable : true,
	
	items : [{
		xtype : "panel",
		region : "north",
		height : "10%"
	},{
		xtype : "panel",
		region : "center",
	}]
});
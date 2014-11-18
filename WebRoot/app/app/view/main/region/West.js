Ext.define("ZhuoFan.view.main.region.West",{
	extend : "Ext.panel.Panel",
	alias : "widget.mainwest",
	
	uses : ['ZhuoFan.view.main.menu.MainTree'],
	title : "卓凡软件企业平台",
	glyph : 0xf0c9,
	
	layout : {
		type : "accordion",
		animate : true
	},
	collapsible : true,
	split : true,
	
	items : [{
		width : 200,
		xtype : "maintree"
	}]
});
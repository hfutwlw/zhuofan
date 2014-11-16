Ext.define("app.view.main.region.South",{
	extend : "Ext.toolbar.Toolbar",
	alias : "widget.mainsouth",
	
	defaults : {
		xtype : "buttontransparent"
	},
	style : "background-color : #e5e4db",
	
	items : [{
		text : "单位:安徽康源医药",
		glyph : 0xf19c
	},{
		text : "用户:张三",
		glyph : 0xf007
	},"->","->",{
		text : "安徽卓凡科技",
		glyph : 0xf0f7
	},{
		text : "15656002198",
		glyph : 0xf095
	},{
		text : "ahzhuofantec@163.com",
		glyph : 0xf003
	},{
		text : "@版权所有：安徽卓凡科技有限公司"
	}]
});
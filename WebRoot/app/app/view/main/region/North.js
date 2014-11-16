Ext.define("app.view.main.region.North",{
	extend : "Ext.toolbar.Toolbar",
	alias : "widget.mainnorth",


	controller : "main",
	
	defaults : {
		xtype : 'buttontransparent'
	},
	
	style : 'background-color : #cde6c7',

	items : [{
		xtype : "label",
		html : "<font style='color:blue;font-size:20px'>卓凡软件企业平台 </font>" +
				"<font style='color:grey'>Ver 2.0 Build 0801</font>"
	},"->",{
		text : "首页",
		glyph : 0xf015
	},{
		text : "帮助",
		glyph : 0xf059
	},{
		text : "关于",
		glyph : 0xf06a,
		handler : "about"
	},{
		text : "设置",
		glyph : 0xf013
	},"->",{
		text : "注销",
		glyph : 0xf011
	},{
		text : "修改密码",
		glyph : 0xf044,
		handler : "showChangePasswordWin"
	}]
});
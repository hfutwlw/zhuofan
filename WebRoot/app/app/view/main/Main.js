/**
 * 主界面类
 */
Ext.define('ZhuoFan.view.main.Main', {
			extend : 'Ext.container.Container',

			xtype : 'app-main',

			uses : ["ZhuoFan.view.main.region.West", "ZhuoFan.view.main.region.North",
					"ZhuoFan.view.main.region.South",
					"ZhuoFan.component.ButtonTransparent"],

			controller : 'main',
			viewModel : {
				type : 'main'
			},

			layout : {
				type : 'border'
			},

			items : [{
						xtype : 'mainwest',    //西边树菜单
						region : 'west',
						width : 250
					}, {
						xtype : 'mainsouth',    
						region : 'south',
						width : 250
					}, {
						xtype : "mainnorth",
						region : "north",
						height : 40
					}, {
						region : 'center',
						xtype : 'tabpanel',
						id : "maincenter",
						items : [{
									title : 'Tab 1',
									html : '<h2>卓凡平台</h2>'
								}]
					}],

			initComponent : function() {
				Ext.setGlyphFontFamily('FontAwesome'); // 设置图标字体文件，只有设置了以后才能用glyph属性
				this.callParent(arguments);
			}
		});

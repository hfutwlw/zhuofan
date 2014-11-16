Ext.define("app.view.main.menu.MainTree",{
	extend : "Ext.tree.Panel",

	controller : "main",
	title : "系统菜单",
	alias : "widget.maintree",
	style : 'background-color : #cde6c7',
	rootVisible : false,
	lines : false,
	titleCollapse : true,
	initComponent : function(){
		this.store = Ext.create("Ext.data.TreeStore",{
			root : {
				children : [{
					text : "数据库管理",
					glyph : 0xf02d,
					children : [{
						text : "逻辑物理转换",
						children : [{
							text : "反向生成",
							id : "TableInfoReversalPanel",
							leaf : true
						}]
					},{
						text : "数据库结构",
						children : [{
							text : "子系统表管理",
							leaf : true
						},{
							text : "数据库表管理",
							leaf : true
						},{
							text : "数据库字段管理",
							leaf : true
						},{
							text : "索引管理",
							leaf : true
						},{
							text : "索引信息管理",
							leaf : true
						},{
							text : "外键管理",
							leaf : true
						}]
					},{
						text : "参数设置",
						children : [{
							text : "字段默认值管理",
							leaf : true
						}]
					}]
				},{
					text : "开发工具",
					children : [{
						text : "数据提取方案工具",
						children : [{
							text : "数据提取方案定义",
							id : "DataQueryPanel",
							leaf : true						
						},{
							text : "拷贝数据提取方案",
							leaf : true
						}]
					},{
						text : "单据工具",
						children : [{
							text : "单据方案定义",
							id : "DanjuPanel",
							leaf : true
						},{
							text : "拷贝单据方案",
							id : "Danju1Panel",
							leaf : true
						}]
					},{
						text : "查询报表打印工具",
						children : [{
							text : "查询报表定义",
							leaf : true
						},{
							text : "拷贝查询报表",
							leaf : true
						}]
					},{
						text : "流程工具",
						children : [{
							text : "流程定义",
							leaf : true
						},{
							text : "流程表单代码定义",
							leaf : true
						},{
							text : "拷贝流程定义",
							leaf : true
						},{
							text : "拷贝流程表单",
							leaf : true
						}]
					}]
				},{
					text : "代码管理",
					children : [{
						text : "代码编译下载",
						children : [{
							text : "代码编译下载",
							leaf : true
						}]
					},{
						text : "代码管理",
						children : [{
							text : "代码文件管理",
							leaf : true
						}]
					}]
				},{
					text : "服务器管理",
					children : [{
						text : "服务器注册",
						leaf : true
					},{
						text : "数据同步管理",
						leaf : true
					},{
						text : "服务器部分更新",
						leaf : true
					},{
						text : "服务器注册监控",
						leaf : true
					}]
				},{
					text : "内部交流",
					children : [{
						text : "大厅",
						leaf : true
					},{
						text : "论坛",
						leaf : true
					},{
						text : "知识库",
						leaf : true
					}] 
				},{
					text : "系统管理员",
					children : [{
						text : "子系统管理",
						leaf : true
					}]
				}]
			}
		});
		this.callParent(arguments);
	},
	
	listeners : {
		itemClick : "treeClick"
	}
});
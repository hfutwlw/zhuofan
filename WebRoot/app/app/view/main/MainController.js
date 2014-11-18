/**
 * 控制器
 */
Ext.define('ZhuoFan.view.main.MainController', {
	extend : 'Ext.app.ViewController',

	requires : ['Ext.MessageBox', "ZhuoFan.view.main.window.ChangePasswordWin","ZhuoFan.view.dataquerymanage.DataQueryManage"],

	alias : 'controller.main',
	// 关于
	about : function() {
		Ext.Msg.show({
			title : "关于",
			msg : "<font style='color:#666666;font-size:14px'>我们是一支在互联网和医药领域非常优秀的团队！我们有梦有理想，我们积极乐观，脚踏实地，充满激情！如果你也和我们一样，那么欢迎你加入我们的团队！我们会为你提供在全新的互联网医药行业里开启个人事业的机会， 富有竞争力的薪酬待遇轻松惬意的工作氛围和充满活力的团队文化，完善的培训体系和更多的晋升机会，请发送您的简历至hr@test.com，标题请注明所申请职位。</font>",
			width : 300,
			buttons : Ext.Msg.OK,
			buttonText : {
				ok : "确定"
			}
		});
	},

	// 显示修改密码弹出框
	showChangePasswordWin : function() {
		var win = new ZhuoFan.view.main.window.ChangePasswordWin();
		win.show();
	},

	// 树监听
	treeClick : function(view, record) {
		if (record.data.leaf) {
			console.info(this.getView().down("tabpanel"))
			var maincenter = this.getView().down("tabpanel");
			var panel = Ext.ComponentQuery.query("panel[treeid="+(record.data.id)+"]");
			if (!panel||panel.length==0) {
				var panel = Ext.create(record.data.id);
    			maincenter.setActiveTab(maincenter.add(panel));
			}else{
			    maincenter.setActiveTab(panel[0]);
			}
		}
	},

});

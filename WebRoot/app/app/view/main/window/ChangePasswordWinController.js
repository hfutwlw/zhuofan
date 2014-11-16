/**
 * 控制器
 */
Ext.define('app.view.main.MainController', {
	extend : 'Ext.app.ViewController',

	alias : 'controller.changePasswordWin',
	
	//修改密码响应函数
	btnChangePasswordClick : function(button) {
		var formPanel = this.getView().down("form");
		// 两种获取表单值的方法：form.getValues()["password"]
		// form.getForm().findField("password").getValue()
		if (formPanel.getValues()["newPassword"] != formPanel.getForm()
				.findField("newPassword2").getValue()) {
			Ext.Msg.alert("信息", "您两次输入的新密码不一致，请重新输入");
		} else {
			formPanel.getForm().submit({
						success : function(form, action) {
							Ext.Msg.alert("成功", action.result.msg);
							formPanel.up("mainchangepasswordwin").close();
						},
						failure : function(form, action) {
							Ext.Msg.alert("失败", action.result.msg);
						}
					})
		}
	},

	// 键盘事件
	keyPressed : function(field, e) {
		if (e.getKey() == e.ENTER) {
			this.btnChangePasswordClick();
		}
	},

	//关闭窗口事件
	btnCloseChangePasswordWinClick : function() {
		this.getView().close();
	}
});

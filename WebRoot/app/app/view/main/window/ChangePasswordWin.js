Ext.define("ZhuoFan.view.main.window.ChangePasswordWin",{
	extend : "Ext.window.Window",
	alias : "widget.mainchangepasswordwin",
	controller : "main",
	width : 330,
	title : "修改密码",
	buttonAlign : "center",
	controller : "changePasswordWin",

	items : [{
		xtype : "form",
		bodyPadding: 5,
		url : "changePassword.action",
		id : "changePasswordForm",
		defaults : {
			xtype : "textfield",
			allowBlank: false,
			inputType : "password"
		},
		items : [{
			fieldLabel : "原密码",
			name : "password",
			blankText : "您必须输入原密码"
		},{
			fieldLabel : "新密码",
			name : "newPassword",
			blankText : "您必须输入新密码"
		},{
			fieldLabel : "确认新密码",
			name : "newPassword2",
			blankText : "您必须确认新密码",
			listeners : {
				specialkey : "keyPressed"
			}
		}]
	}],
	buttons : [{
		text : "确定",
		handler : "btnChangePasswordClick"
	},{
		text : "取消",
		handler : "btnCloseChangePasswordWinClick"
	}]
})
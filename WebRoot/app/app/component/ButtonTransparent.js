/**
 * 显示时候按钮透明
 * 鼠标移上去取消透明
 */
Ext.define("ZhuoFan.component.ButtonTransparent",{
	extend : "Ext.button.Button",
	alias : "widget.buttontransparent",

	initComponent : function(){
		if(!this.listeners){
			this.listeners = [];
		}

		
		this.listeners = {
				mouseout : function(button){
					this.setTransparent(document.getElementById(this.id));
				},
				mouseover : function(button){
					var b = document.getElementById(this.id);
					b.style.backgroundImage = "";
					b.style.backgroundColor = "";
					b.style.border = "";
				},

				afterrender : function(){
					this.setTransparent(document.getElementById(this.id));
				}
		};
		this.callParent(arguments);
	},

	setTransparent : function(b){
		b.style.backgroundImage = "inherit";
		b.style.backgroundColor = "inherit";
		b.style.borderColor = "transparent";
	}


})
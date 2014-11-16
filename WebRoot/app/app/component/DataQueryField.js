Ext.define("app.component.DataQueryField", {
			extend : "Ext.form.field.Text",
			alias : 'widget.dataQueryField',
			alternateClassName : "DataQueryField",
			dataQueryName : "",
			transferHqls : "",
			names : "",

			triggers : {
				picker : {
					cls : Ext.baseCSSPrefix + 'form-search-trigger',
					handler : 'onTriggerClick',
					scope : 'this'
				}
			},

			listeners : {
				specialkey : function(field, e) {
					if (e.getKey() == e.ENTER) {
						this.onTriggerClick();
					}
				}
			},
			
			initComponent : function(){
				this.callParent(arguments)
			},

			onTriggerClick : function() {
				if(this.dataQueryName){
				    var win = new DataQueryWin(this.dataQueryName,this,this.names,this.transferHqls);
				    win.show();
				}else{
					Ext.Msg.alert("提示","请输入数据提取方案名");
				}
			},

			keyClick : function(e) {
				if (e.getKey() == e.ENTER) {
					onTriggerClick();
				}
			}

		})
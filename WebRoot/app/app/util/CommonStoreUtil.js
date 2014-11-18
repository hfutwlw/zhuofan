Ext.define("ZhuoFan.util.CommonStoreUtil",{
	
	singleton : true,
	alternateClassName : "CommonStoreUtil",
	
	getStore : function(datas,url){
		var fields = this.getFields(datas);
		var store = Ext.create("Ext.data.Store",{
			pageSize: 20,
			fields : fields,
			proxy : {
				actionMethods: {read: 'post' },
				type : "ajax",
				url : url,
				reader : {
					type : 'json',
					totalProperty : "totalProperty",
					rootProperty : 'root'
				}
			}
		});
		return store;
	},

	getFields : function(datas){
		var fields = [];
		for(var i in data){
			var data = datas[i];
			var field = {
					name : data.name,
					type : data.type,
					mapping : data.name
			};
			fields.push(field);
		}
		return fields;
	}
});
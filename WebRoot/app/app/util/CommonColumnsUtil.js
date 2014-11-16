Ext.define("app.util.CommonColumnsUtil",{
	//单例模式，可直接使用类名调用
	singleton : true,
	//类别名可直接使用ColumnsUtil调用方法
	alternateClassName : "CommonColumnsUtil",
	getColumns : function(datas){
		var columns = [{
			xtype : "rownumberer",
			text : "序号",
			width : 50
		}];
		for(var i in datas){
			var data = datas[i];
			var column = {
					text : data.text,
					dataIndex : data.name,
					header : data.text,
					hidden : data.hidden,
					field : data.field,
					renderer : data.renderer,
					columnLines : true
			};
			if(data.width){
				column.width = data.width;
			}
			columns.push(column);
		}
		return columns;
	}
});
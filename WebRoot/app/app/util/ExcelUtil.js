Ext.define("app.util.ExcelUtil",{
	singleton : true,
	alternateClassName : "ExcelUtil",

	writeExcel : function(names,datas){
		var xls;
		try{
			xls = new ActiveXObject("Excel.Application");
		}catch(e){
			Ext.Msg.alert("提示",e.name  +   " :  "   +  e.message+"要打印该表格，您必须先安装excel软件,同时浏览器须启用ActiveX控件")
		}
			var xlBook = xls.Workbooks.Add;
			var xlsheet = xlBook.Worksheets(1);

			for(var j in names){
				xlsheet.Cells(2,j).Value = names[j];
			}
			for(var i in datas){
				var data = datas[i];
				for(var j in data){
					xlsheet.Cells(i,j).Value = data[j];
				}
			}
			xls.UserControl = true;  //很重要,不能省略,不然会出问题 意思是excel交由用户控制
			xls=null;
			xlBook=null;
			xlsheet=null;

		
	}
});
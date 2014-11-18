Ext.define("ZhuoFan.net.MyRequest",{
	singleton : true,
	alternateClassName : "MyRequest",
	
	//有弹出框提醒
	request : function(url,params,successFun,failFun,scope){
		success = function(response){
			var msg = JSON.parse(response.responseText)['msg'];
			Ext.Msg.alert("成功", msg);
			if(successFun){
				successFun.call(scope,response);
			}
		}

		fail = function(response) {
			var msg = JSON.parse(response.responseText)["msg"];
			Ext.Msg.alert("错误", msg);
			if(failFun){
				failFun.call(scope,response);
			}
		}
		this.requestWithNoAlterMsg(url,params,success,fail ,scope);
	},
	
	//有失败提示的弹出框请求
	requestWithFailMsg : function(url,params,successFun,failFun,scope){
		fail = function(response) {
			var msg = JSON.parse(response.responseText)["msg"];
			Ext.Msg.alert("错误", msg);
			if(failFun){
				failFun.call(scope,response);
			}
		};
		this.requestWithNoAlterMsg(url,params,successFun,fail,scope);
	},
	
	//没有弹出框的请求
	requestWithNoAlterMsg : function(url,params,successFun,failFun,scope){
		Ext.Ajax.request({
			method : 'post',
			type : 'json',
			url : url,
			scope : scope,
			params : params,
			success : function(response){
				switch(JSON.parse(response.responseText)["success"]){
				case true:
					if(successFun){
						successFun.call(scope,response);
					}
					break;
				case false:
					if(failFun){
						failFun.call(scope,response);
					}
					break;
				}
			},
			failure : function(response) {
				Ext.Msg.alert("提示","网络不通请稍后再试");
			}
		});
	},
	//没有返回是否请求成功的请求
	requestNoAsyncWithNoSuccess : function(url,params,callBack,scope){
		Ext.Ajax.request({
			method : 'post',
			type : 'json',
			url : url,
			scope : scope,
			async: false,  
			params : params,
			success : function(response){
				callBack.call(scope,response);
			},
			failure : function(response) {
				Ext.Msg.alert("提示","网络不通请稍后再试");
			}
		});
	}
})
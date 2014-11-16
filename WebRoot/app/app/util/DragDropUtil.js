Ext.define("app.util.DragDropUtil",{
	singleton : true,
	alternateClassName : "DragDropUtil",
	
	/**
	 * 为按钮创建一个拖拽响应函数,即拖拽到该按钮上相当于点击该按钮
	 * @param {} button 按钮
	 * @param {} ddGroup 分组
	 */
	createDragDropByButtonAndDdGroup : function(button,ddGroup){
		button.dropZone = new Ext.dd.DropZone(button.getEl(), {  
			ddGroup : ddGroup ,  
			getTargetFromEvent : function(e) {  
				return e.getTarget('');  
			}, 
			onNodeDrop : function(target, dd, e, data) {   //用户松开
				button.fireEvent('click', button); // 执行修改按钮的click事件  
			}  
		});  
	}
})
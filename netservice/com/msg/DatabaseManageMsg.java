package com.msg;

/**
 * 数据库增删改操作的返回消息
 * @author linpeng123l
 *
 */
public class DatabaseManageMsg {
	/** 是否操作成功 */
	private boolean success;
	/** 操作失败时附加的消息 */ 
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
}

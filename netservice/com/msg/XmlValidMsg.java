package com.msg;

/**
 * xml数据格式验证的消息
 * @author linpeng123l
 *
 */
public class XmlValidMsg {
	/** 是否验证通过 */
	private boolean valid;
	/** 验证不通过时附加的消息 */
	private String msg;
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}

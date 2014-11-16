package com.domainreturn;
/**
 * action返回前台EXTJS 数据模型 domain
 * @author linpeng123l
 *
 * @param <T>
 */
public class DomainReturn<T> {
	private T t;

	public DomainReturn(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

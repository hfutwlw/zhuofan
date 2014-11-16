package com.util;

import java.util.List;
import java.util.ResourceBundle;

public class PageInfo<T> {

	@SuppressWarnings("unused")
	private int start = 0;		//起始记录
	private int page = 1;	//当前页，默认为第一页
	private int count = 0;//总记录数
	private int pagesize = 20;//页面大小，默认20条记录
	private List<T> result;//结果集
	private String order = "desc";//排序方式,默认升序
	private String orderBy = "addDataTime";//排序字段
	@SuppressWarnings("unused")
	private boolean hasNextPage;	//判断有无下一页
	private int pageCount;		//总页数
	@SuppressWarnings("unused")
	private boolean hasPrePage; //判断有无前一页
	@SuppressWarnings("unused")
	private int nextPage;		//下一页
	@SuppressWarnings("unused")
	private int prePage;		//上一页
	
	
	public boolean isHasPrePage() {
		return page > 1 ? true : false;
	}
	public int getNextPage() {
		return this.isHasNextPage()? page+1 : page;
	}
	public int getPrePage() {
		return this.isHasPrePage() ? page-1 : page;
	}
	public boolean isHasNextPage() {
		return page < pageCount ? true : false;
	}
	public int getPageCount() {
		return count == 0 ? pageCount : (count % pagesize == 0 ? count / pagesize : count / pagesize + 1);
	}
	public int getPage() {
		return page;
	}
	public int getCount() {
		return count;
	}
	public int getPagesize() {
		String pz = ResourceBundle.getBundle("pageConfig").getString("genaral_list_pagesize");
		if(!"".equals(pz) && null != pz){
			pagesize = Integer.parseInt(pz);
		}
		return pagesize;
	}
	
	public int getStart() {
		return (page-1)*pagesize;
	}
	public List<T> getResult() {
		return result;
	}
	public String getOrder() {
		return order;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	
	
}

package com.excel;
/**
 * 提供两个方法返回某个DOMAIN类对应的导出EXCEL的数据
 * @author linpeng123l
 *
 */
public interface ExportDomainExcelInter {

	/**
	 * 返回要导出EXCEL的数据的标题
	 * @return
	 */
	public String[] excelTitle();

	/**
	 * 返回导出的数据
	 * @return
	 */
	public String[] excelData();
}

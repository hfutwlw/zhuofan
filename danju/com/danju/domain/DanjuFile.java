package com.danju.domain;

import java.util.Date;
/**
 * 最终根据用户传入的xml解析生成的项目文件
 * @author linpeng123l
 *
 */
public class DanjuFile {
	private String fileName;
	private String fileType;
	/** 文件后缀 */
	private String fileSuffix;
	private String filePath;
	private Date generateTime;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileSuffix() {
		return fileSuffix;
	}
	public void setFileSuffix(String fileSuffix) {
		this.fileSuffix = fileSuffix;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Date getGenerateTime() {
		return generateTime;
	}
	public void setGenerateTime(Date generateTime) {
		this.generateTime = generateTime;
	}
	
}

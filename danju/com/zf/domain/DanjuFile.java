package com.zf.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 最终根据用户传入的xml解析生成的项目文件
 * @author linpeng123l
 *
 */
@Entity
@Table(name="DANJU_FILE")
public class DanjuFile extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3653233540076155448L;
	
	private String fileName;
	
	private String fileType;
	/** 文件后缀 */
	
	private String fileSuffix;
	
	private String filePath;
	
	private Date generateTime;
	
	@Column(name="FILE_NAME",length=100)
	public String getFileName() {
		return fileName;
	}
	@Column(name="FILE_TYPE",length=100)
	public String getFileType() {
		return fileType;
	}
	@Column(name="FILE_SUFFIX",length=100)
	public String getFileSuffix() {
		return fileSuffix;
	}
	@Column(name="FILE_PATH",length=100)
	public String getFilePath() {
		return filePath;
	}
	@Column(name="GENERATE_TIME",length=100)
	public Date getGenerateTime() {
		return generateTime;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public void setFileSuffix(String fileSuffix) {
		this.fileSuffix = fileSuffix;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public void setGenerateTime(Date generateTime) {
		this.generateTime = generateTime;
	}
	
	
	
}

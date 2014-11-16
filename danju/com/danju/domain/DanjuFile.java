package com.danju.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.domain.BaseEntity;
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
	@Column(name="FILE_NAME",length=100)
	private String fileName;
	@Column(name="FILE_TYPE",length=100)
	private String fileType;
	/** 文件后缀 */
	@Column(name="FILE_SUFFIX",length=100)
	private String fileSuffix;
	@Column(name="FILE_PATH",length=100)
	private String filePath;
	@Column(name="GENERATE_TIME",length=100)
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

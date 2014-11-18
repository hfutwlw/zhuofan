package com.zf.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.hibernate.annotations.GenericGenerator;

/**
 * 公共模型层
 * @author linpeng123l
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1509547907416881792L;
	private String id;
	private String addDataTime;
	private String addDataUserId;
	private int dataStatus = 1;
	@GenericGenerator(name = "generator", strategy = "uuid")
	@Id
	@Column(name = "id", nullable = false, length = 50)
	public String getId() {
		if("".equals(id) || null == id)
			id = UUID.randomUUID().toString();
		return id;
	}
	@Column(name="ADD_DATA_TIME",length=50)
	public String getAddDataTime() {
		if(null == addDataTime || "".equals(addDataTime)){
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			this.addDataTime = sdf.format(date);
		}
		return this.addDataTime;
	}
	@Column(name="ADD_DATA_USERID",length=100)
	public String getAddDataUserId() {
		return addDataUserId;
	}
	@Column(name="DATA_STATUS",length=2)
	public int getDataStatus() {
		return dataStatus;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAddDataTime(String addDataTime) {
		this.addDataTime = addDataTime;
	}
	public void setAddDataUserId(String addDataUserId) {
		this.addDataUserId = addDataUserId;
	}
	public void setDataStatus(int dataStatus) {
		this.dataStatus = dataStatus;
	}}

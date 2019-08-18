package com.henu.party.bean;

import java.util.Date;

public class FileUpload {
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 文件名
	 */
	private String fileName;
	/**
	 * 上传人
	 */
	private String upLoader;
	/**
	 * 上传时间
	 */
	private Date upLoadDate;
	/**
	 * 下载次数
	 */
	private int downLoad;
	/**
	 * 文件类别
	 */
	private String fileType;
	/**
	 * 存储路径
	 */
	private String storPath;
	/**
	 * 备注
	 */
	private String remark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getUpLoader() {
		return upLoader;
	}
	public void setUpLoader(String upLoader) {
		this.upLoader = upLoader;
	}
	public Date getUpLoadDate() {
		return upLoadDate;
	}
	public void setUpLoadDate(Date upLoadDate) {
		this.upLoadDate = upLoadDate;
	}
	public int getDownLoad() {
		return downLoad;
	}
	public void setDownLoad(int downLoad) {
		this.downLoad = downLoad;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getStorPath() {
		return storPath;
	}
	public void setStorPath(String storPath) {
		this.storPath = storPath;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public FileUpload(int id, String fileName, String upLoader, Date upLoadDate, int downLoad, String fileType,
			String storPath, String remark) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.upLoader = upLoader;
		this.upLoadDate = upLoadDate;
		this.downLoad = downLoad;
		this.fileType = fileType;
		this.storPath = storPath;
		this.remark = remark;
	}
	public FileUpload() {
		super();
	}
	@Override
	public String toString() {
		return "FileUpload [id=" + id + ", fileName=" + fileName + ", upLoader=" + upLoader + ", upLoadDate="
				+ upLoadDate + ", downLoad=" + downLoad + ", fileType=" + fileType + ", storPath=" + storPath
				+ ", remark=" + remark + "]";
	}
	
	
}

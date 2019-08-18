package com.henu.party.bean;

import java.io.Serializable;

public class ImgResult implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6223869650789947832L;
	/** 错误码. */
    private Integer errno;
    /** 具体的内容. */
    private String [] data;
	public Integer getErrno() {
		return errno;
	}
	public void setErrno(Integer errno) {
		this.errno = errno;
	}
	public String[] getData() {
		return data;
	}
	public void setData(String[] data) {
		this.data = data;
	}
	public ImgResult(Integer errno, String[] data) {
		super();
		this.errno = errno;
		this.data = data;
	}
	public ImgResult() {
		super();
	}
    
}
package com.henu.party.bean;

import java.util.List;

public class PageBean<T> {
	private int pc;//当前页码  jsp传来
	private int ps;//每页展示的记录数 自己定义
	private int all;//数据库的总记录数 数据库查询
	private int tp;//最大页数tp
	private String url;//页码<a>标签路径
	private List<T> beanlist;//当前页需要的数据
	
	/**
	 * 获取最大页数tp:总记录数all除以页面记录数ps，取整数，有余数则页码加一
	 * @return
	 */
	public int getTp(){
		tp=all/ps;
		return all%ps==0? tp:tp+1;
	}

	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public int getPc(){
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public int getAll() {
		return all;
	}
	public void setAll(int all) {
		this.all = all;
	}
	public List<T> getBeanlist() {
		return beanlist;
	}
	public void setBeanlist(List<T> beanlist) {
		this.beanlist = beanlist;
	}
	
}

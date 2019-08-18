package com.henu.party.bean;

public class JobStation {
	private String num;
	private String userName;
	private String startDate;
	private String endDate;
	private String post;
	private String firstLineSituation;
	private String mainPost;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getFirstLineSituation() {
		return firstLineSituation;
	}

	public void setFirstLineSituation(String firstLineSituation) {
		this.firstLineSituation = firstLineSituation;
	}

	public String getMainPost() {
		return mainPost;
	}

	public void setMainPost(String mainPost) {
		this.mainPost = mainPost;
	}

	public JobStation(String num, String userName, String startDate, String endDate, String post,
			String firstLineSituation, String mainPost) {
		super();
		this.num = num;
		this.userName = userName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.post = post;
		this.firstLineSituation = firstLineSituation;
		this.mainPost = mainPost;
	}

	public JobStation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "JobStation [num=" + num + ", userName=" + userName + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", post=" + post + ", firstLineSituation=" + firstLineSituation + ", mainPost=" + mainPost + "]";
	}
	
}

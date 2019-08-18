package com.henu.party.bean;

public class TechDuty {
	private String num;
	private String userName;
	private String techTitle;
	private String getTime;
	private String techPosition;
	private String startTime;
	private String endTime;
	private String mainDuty;

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

	public String getTechTitle() {
		return techTitle;
	}

	public void setTechTitle(String techTitle) {
		this.techTitle = techTitle;
	}

	public String getGetTime() {
		return getTime;
	}

	public void setGetTime(String getTime) {
		this.getTime = getTime;
	}

	public String getTechPosition() {
		return techPosition;
	}

	public void setTechPosition(String techPosition) {
		this.techPosition = techPosition;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMainDuty() {
		return mainDuty;
	}

	public void setMainDuty(String mainDuty) {
		this.mainDuty = mainDuty;
	}

	public TechDuty(String num, String userName, String techTitle, String getTime, String techPosition,
			String startTime, String endTime, String mainDuty) {
		super();
		this.num = num;
		this.userName = userName;
		this.techTitle = techTitle;
		this.getTime = getTime;
		this.techPosition = techPosition;
		this.startTime = startTime;
		this.endTime = endTime;
		this.mainDuty = mainDuty;
	}

	public TechDuty() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TechDuty [num=" + num + ", userName=" + userName + ", techTitle=" + techTitle + ", getTime=" + getTime
				+ ", techPosition=" + techPosition + ", startTime=" + startTime + ", endTime=" + endTime + ", mainDuty="
				+ mainDuty + "]";
	}

}

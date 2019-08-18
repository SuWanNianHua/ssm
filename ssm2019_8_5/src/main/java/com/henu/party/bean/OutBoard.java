package com.henu.party.bean;

import java.io.Serializable;

public class OutBoard implements Serializable {
	private String userName;
	private String goCountry;
	private String goAbroadDate;
	private String goAbroadAccount;
	private String touchCondition;
	private String repatriateCondition;
	private String repatriateDate;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGoCountry() {
		return goCountry;
	}

	public void setGoCountry(String goCountry) {
		this.goCountry = goCountry;
	}

	public String getGoAbroadDate() {
		return goAbroadDate;
	}

	public void setGoAbroadDate(String goAbroadDate) {
		this.goAbroadDate = goAbroadDate;
	}

	public String getGoAbroadAccount() {
		return goAbroadAccount;
	}

	public void setGoAbroadAccount(String goAbroadAccount) {
		this.goAbroadAccount = goAbroadAccount;
	}

	public String getTouchCondition() {
		return touchCondition;
	}

	public void setTouchCondition(String touchCondition) {
		this.touchCondition = touchCondition;
	}

	public String getRepatriateCondition() {
		return repatriateCondition;
	}

	public void setRepatriateCondition(String repatriateCondition) {
		this.repatriateCondition = repatriateCondition;
	}

	public String getRepatriateDate() {
		return repatriateDate;
	}

	public void setRepatriateDate(String repatriateDate) {
		this.repatriateDate = repatriateDate;
	}

	public OutBoard(String userName, String goCountry, String goAbroadDate, String goAbroadAccount,
			String touchCondition, String repatriateCondition, String repatriateDate) {
		super();
		this.userName = userName;
		this.goCountry = goCountry;
		this.goAbroadDate = goAbroadDate;
		this.goAbroadAccount = goAbroadAccount;
		this.touchCondition = touchCondition;
		this.repatriateCondition = repatriateCondition;
		this.repatriateDate = repatriateDate;
	}

	public OutBoard() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OutBoard [userName=" + userName + ", goCountry=" + goCountry + ", goAbroadDate=" + goAbroadDate
				+ ", goAbroadAccount=" + goAbroadAccount + ", touchCondition=" + touchCondition
				+ ", repatriateCondition=" + repatriateCondition + ", repatriateDate=" + repatriateDate + "]";
	}

}

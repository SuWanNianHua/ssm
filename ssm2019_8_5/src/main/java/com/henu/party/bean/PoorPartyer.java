package com.henu.party.bean;

import java.io.Serializable;

public class PoorPartyer implements Serializable {
	private String userName;
	private String poorPartstyle;
	private String healthCondition;
	private String poorPartSubsidy;
	private String otherSubsidy;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPoorPartstyle() {
		return poorPartstyle;
	}

	public void setPoorPartstyle(String poorPartstyle) {
		this.poorPartstyle = poorPartstyle;
	}

	public String getHealthCondition() {
		return healthCondition;
	}

	public void setHealthCondition(String healthCondition) {
		this.healthCondition = healthCondition;
	}

	public String getPoorPartSubsidy() {
		return poorPartSubsidy;
	}

	public void setPoorPartSubsidy(String poorPartSubsidy) {
		this.poorPartSubsidy = poorPartSubsidy;
	}

	public String getOtherSubsidy() {
		return otherSubsidy;
	}

	public void setOtherSubsidy(String otherSubsidy) {
		this.otherSubsidy = otherSubsidy;
	}

	public PoorPartyer(String userName, String poorPartstyle, String healthCondition, String poorPartSubsidy,
			String otherSubsidy) {
		super();
		this.userName = userName;
		this.poorPartstyle = poorPartstyle;
		this.healthCondition = healthCondition;
		this.poorPartSubsidy = poorPartSubsidy;
		this.otherSubsidy = otherSubsidy;
	}

	public PoorPartyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PoorPartyer [userName=" + userName + ", poorPartstyle=" + poorPartstyle + ", healthCondition="
				+ healthCondition + ", poorPartSubsidy=" + poorPartSubsidy + ", otherSubsidy=" + otherSubsidy + "]";
	}

}

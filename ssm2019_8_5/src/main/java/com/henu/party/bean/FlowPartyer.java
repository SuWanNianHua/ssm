package com.henu.party.bean;

import java.io.Serializable;

public class FlowPartyer implements Serializable {
	private String userName;
	private String flowStyle;
	private String flowAccount;
	private String activityId;
	private String flowUnit;
	private String flowDate;
	private String outOfContacts;
	private String outOfcontactway;
	private String inFlowContacts;
	private String inContactway;
	private String touchCondition;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFlowStyle() {
		return flowStyle;
	}

	public void setFlowStyle(String flowStyle) {
		this.flowStyle = flowStyle;
	}

	public String getFlowAccount() {
		return flowAccount;
	}

	public void setFlowAccount(String flowAccount) {
		this.flowAccount = flowAccount;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getFlowUnit() {
		return flowUnit;
	}

	public void setFlowUnit(String flowUnit) {
		this.flowUnit = flowUnit;
	}

	public String getFlowDate() {
		return flowDate;
	}

	public void setFlowDate(String flowDate) {
		this.flowDate = flowDate;
	}

	public String getOutOfContacts() {
		return outOfContacts;
	}

	public void setOutOfContacts(String outOfContacts) {
		this.outOfContacts = outOfContacts;
	}

	public String getOutOfcontactway() {
		return outOfcontactway;
	}

	public void setOutOfcontactway(String outOfcontactway) {
		this.outOfcontactway = outOfcontactway;
	}

	public String getInFlowContacts() {
		return inFlowContacts;
	}

	public void setInFlowContacts(String inFlowContacts) {
		this.inFlowContacts = inFlowContacts;
	}

	public String getInContactway() {
		return inContactway;
	}

	public void setInContactway(String inContactway) {
		this.inContactway = inContactway;
	}

	public String getTouchCondition() {
		return touchCondition;
	}

	public void setTouchCondition(String touchCondition) {
		this.touchCondition = touchCondition;
	}

	public FlowPartyer(String userName, String flowStyle, String flowAccount, String activityId, String flowUnit,
			String flowDate, String outOfContacts, String outOfcontactway, String inFlowContacts, String inContactway,
			String touchCondition) {
		super();
		this.userName = userName;
		this.flowStyle = flowStyle;
		this.flowAccount = flowAccount;
		this.activityId = activityId;
		this.flowUnit = flowUnit;
		this.flowDate = flowDate;
		this.outOfContacts = outOfContacts;
		this.outOfcontactway = outOfcontactway;
		this.inFlowContacts = inFlowContacts;
		this.inContactway = inContactway;
		this.touchCondition = touchCondition;
	}

	public FlowPartyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FlowPartyer [userName=" + userName + ", flowStyle=" + flowStyle + ", flowAccount=" + flowAccount
				+ ", activityId=" + activityId + ", flowUnit=" + flowUnit + ", flowDate=" + flowDate
				+ ", outOfContacts=" + outOfContacts + ", outOfcontactway=" + outOfcontactway + ", inFlowContacts="
				+ inFlowContacts + ", inContactway=" + inContactway + ", touchCondition=" + touchCondition + "]";
	}

}

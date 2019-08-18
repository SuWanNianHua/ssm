package com.henu.party.bean;

public class RewardPunish {
	private String num;
	private String userName;
	private String name;
	private String explanation;
	private String reason;
	private String appAuthority;
	private String appAuthLevel;
	private String ratiTime;
	private String revoTime;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAppAuthority() {
		return appAuthority;
	}

	public void setAppAuthority(String appAuthority) {
		this.appAuthority = appAuthority;
	}

	public String getAppAuthLevel() {
		return appAuthLevel;
	}

	public void setAppAuthLevel(String appAuthLevel) {
		this.appAuthLevel = appAuthLevel;
	}

	public String getRatiTime() {
		return ratiTime;
	}

	public void setRatiTime(String ratiTime) {
		this.ratiTime = ratiTime;
	}

	public String getRevoTime() {
		return revoTime;
	}

	public void setRevoTime(String revoTime) {
		this.revoTime = revoTime;
	}

	public RewardPunish(String num, String userName, String name, String explanation, String reason,
			String appAuthority, String appAuthLevel, String ratiTime, String revoTime) {
		super();
		this.num = num;
		this.userName = userName;
		this.name = name;
		this.explanation = explanation;
		this.reason = reason;
		this.appAuthority = appAuthority;
		this.appAuthLevel = appAuthLevel;
		this.ratiTime = ratiTime;
		this.revoTime = revoTime;
	}

	public RewardPunish() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RewardPunish [num=" + num + ", userName=" + userName + ", name=" + name + ", explanation=" + explanation
				+ ", reason=" + reason + ", appAuthority=" + appAuthority + ", appAuthLevel=" + appAuthLevel
				+ ", ratiTime=" + ratiTime + ", revoTime=" + revoTime + "]";
	}

}

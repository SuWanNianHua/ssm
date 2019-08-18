package com.henu.party.bean;

public class RewardPunishParty {
	private String num;
	private String partyId;
	private String name;
	private String explanation;
	private String reason;
	private String appAuthority;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
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

	public RewardPunishParty(String partyId, String name, String explanation, String reason, String appAuthority) {
		super();
		this.partyId = partyId;
		this.name = name;
		this.explanation = explanation;
		this.reason = reason;
		this.appAuthority = appAuthority;
	}

	public RewardPunishParty(String num, String partyId, String name, String explanation, String reason,
			String appAuthority) {
		super();
		this.num = num;
		this.partyId = partyId;
		this.name = name;
		this.explanation = explanation;
		this.reason = reason;
		this.appAuthority = appAuthority;
	}

	public RewardPunishParty() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RewardPunishParty [num=" + num + ", partyId=" + partyId + ", name=" + name + ", explanation="
				+ explanation + ", reason=" + reason + ", appAuthority=" + appAuthority + "]";
	}

}

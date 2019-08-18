package com.henu.party.bean;

public class PartyBranchMember {
	private String num;
	private String partyId;
	private String memberName;
	private String partyBelong;
	private String dutyName;
	private String dutyDescription;
	private String dutyLevel;
	private String startDate;
	private String endDate;
	private String isMember;

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

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPartyBelong() {
		return partyBelong;
	}

	public void setPartyBelong(String partyBelong) {
		this.partyBelong = partyBelong;
	}

	public String getDutyName() {
		return dutyName;
	}

	public void setDutyName(String dutyName) {
		this.dutyName = dutyName;
	}

	public String getDutyDescription() {
		return dutyDescription;
	}

	public void setDutyDescription(String dutyDescription) {
		this.dutyDescription = dutyDescription;
	}

	public String getDutyLevel() {
		return dutyLevel;
	}

	public void setDutyLevel(String dutyLevel) {
		this.dutyLevel = dutyLevel;
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

	public String getIsMember() {
		return isMember;
	}

	public void setIsMember(String isMember) {
		this.isMember = isMember;
	}

	public PartyBranchMember(String partyId, String memberName, String partyBelong, String dutyName,
			String dutyDescription, String dutyLevel, String startDate, String endDate, String isMember) {
		super();
		this.partyId = partyId;
		this.memberName = memberName;
		this.partyBelong = partyBelong;
		this.dutyName = dutyName;
		this.dutyDescription = dutyDescription;
		this.dutyLevel = dutyLevel;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isMember = isMember;
	}

	public PartyBranchMember(String num, String partyId, String memberName, String partyBelong, String dutyName,
			String dutyDescription, String dutyLevel, String startDate, String endDate, String isMember) {
		super();
		this.num = num;
		this.partyId = partyId;
		this.memberName = memberName;
		this.partyBelong = partyBelong;
		this.dutyName = dutyName;
		this.dutyDescription = dutyDescription;
		this.dutyLevel = dutyLevel;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isMember = isMember;
	}

	public PartyBranchMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PartyBranchMember [num=" + num + ", partyId=" + partyId + ", memberName=" + memberName
				+ ", partyBelong=" + partyBelong + ", dutyName=" + dutyName + ", dutyDescription=" + dutyDescription
				+ ", dutyLevel=" + dutyLevel + ", startDate=" + startDate + ", endDate=" + endDate + ", isMember="
				+ isMember + "]";
	}

}

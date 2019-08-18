package com.henu.party.bean;

public class PartyBranch {
	private String num;
	private String userName;
	private String password;
	private String partyId;
	private String partyName;
	private String partyType;
	private String partyAddress;
	private String leaderDate;
	private String endDate;
	private String selectType;
	private Integer supposeNum;
	private Integer arriveNum;
	private String createDate;
	private String startMeetDate;
	private String endMeetDate;
	private String address;
	private String zipcode;
	private String phone;
	private String faxNum;
	private String remark;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyType() {
		return partyType;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public String getPartyAddress() {
		return partyAddress;
	}

	public void setPartyAddress(String partyAddress) {
		this.partyAddress = partyAddress;
	}

	public String getLeaderDate() {
		return leaderDate;
	}

	public void setLeaderDate(String leaderDate) {
		this.leaderDate = leaderDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getSelectType() {
		return selectType;
	}

	public void setSelectType(String selectType) {
		this.selectType = selectType;
	}

	public Integer getSupposeNum() {
		return supposeNum;
	}

	public void setSupposeNum(Integer supposeNum) {
		this.supposeNum = supposeNum;
	}

	public Integer getArriveNum() {
		return arriveNum;
	}

	public void setArriveNum(Integer arriveNum) {
		this.arriveNum = arriveNum;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getStartMeetDate() {
		return startMeetDate;
	}

	public void setStartMeetDate(String startMeetDate) {
		this.startMeetDate = startMeetDate;
	}

	public String getEndMeetDate() {
		return endMeetDate;
	}

	public void setEndMeetDate(String endMeetDate) {
		this.endMeetDate = endMeetDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFaxNum() {
		return faxNum;
	}

	public void setFaxNum(String faxNum) {
		this.faxNum = faxNum;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "PartyBranch [num=" + num + ", userName=" + userName + ", password=" + password + ", partyId=" + partyId
				+ ", partyName=" + partyName + ", partyType=" + partyType + ", partyAddress=" + partyAddress
				+ ", leaderDate=" + leaderDate + ", endDate=" + endDate + ", selectType=" + selectType + ", supposeNum="
				+ supposeNum + ", arriveNum=" + arriveNum + ", createDate=" + createDate + ", startMeetDate="
				+ startMeetDate + ", endMeetDate=" + endMeetDate + ", address=" + address + ", zipcode=" + zipcode
				+ ", phone=" + phone + ", faxNum=" + faxNum + ", remark=" + remark + "]";
	}

	public PartyBranch() {
		super();
	}

	public PartyBranch(String userName, String password, String partyId, String partyName, String partyType,
			String partyAddress, String leaderDate, String endDate, String selectType, Integer supposeNum,
			Integer arriveNum, String createDate, String startMeetDate, String endMeetDate, String address,
			String zipcode, String phone, String faxNum, String remark) {
		super();
		this.userName = userName;
		this.password = password;
		this.partyId = partyId;
		this.partyName = partyName;
		this.partyType = partyType;
		this.partyAddress = partyAddress;
		this.leaderDate = leaderDate;
		this.endDate = endDate;
		this.selectType = selectType;
		this.supposeNum = supposeNum;
		this.arriveNum = arriveNum;
		this.createDate = createDate;
		this.startMeetDate = startMeetDate;
		this.endMeetDate = endMeetDate;
		this.address = address;
		this.zipcode = zipcode;
		this.phone = phone;
		this.faxNum = faxNum;
		this.remark = remark;
	}

	public PartyBranch(String num, String userName, String password, String partyId, String partyName, String partyType,
			String partyAddress, String leaderDate, String endDate, String selectType, Integer supposeNum,
			Integer arriveNum, String createDate, String startMeetDate, String endMeetDate, String address,
			String zipcode, String phone, String faxNum, String remark) {
		super();
		this.num = num;
		this.userName = userName;
		this.password = password;
		this.partyId = partyId;
		this.partyName = partyName;
		this.partyType = partyType;
		this.partyAddress = partyAddress;
		this.leaderDate = leaderDate;
		this.endDate = endDate;
		this.selectType = selectType;
		this.supposeNum = supposeNum;
		this.arriveNum = arriveNum;
		this.createDate = createDate;
		this.startMeetDate = startMeetDate;
		this.endMeetDate = endMeetDate;
		this.address = address;
		this.zipcode = zipcode;
		this.phone = phone;
		this.faxNum = faxNum;
		this.remark = remark;
	}

}

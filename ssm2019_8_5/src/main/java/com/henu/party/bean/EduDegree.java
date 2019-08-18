package com.henu.party.bean;

public class EduDegree {
	private String num;
	private String userName;
	private String eduSector;
	private String edu;
	private String enDate;
	private String gradDate;
	private String acaDegree;
	private String dcDate;
	private String graduate;

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

	public String getEduSector() {
		return eduSector;
	}

	public void setEduSector(String eduSector) {
		this.eduSector = eduSector;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}

	public String getEnDate() {
		return enDate;
	}

	public void setEnDate(String enDate) {
		this.enDate = enDate;
	}

	public String getGradDate() {
		return gradDate;
	}

	public void setGradDate(String gradDate) {
		this.gradDate = gradDate;
	}

	public String getAcaDegree() {
		return acaDegree;
	}

	public void setAcaDegree(String acaDegree) {
		this.acaDegree = acaDegree;
	}

	public String getDcDate() {
		return dcDate;
	}

	public void setDcDate(String dcDate) {
		this.dcDate = dcDate;
	}

	public String getGraduate() {
		return graduate;
	}

	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}

	public EduDegree(String num, String userName, String eduSector, String edu, String enDate, String gradDate,
			String acaDegree, String dcDate, String graduate) {
		super();
		this.num = num;
		this.userName = userName;
		this.eduSector = eduSector;
		this.edu = edu;
		this.enDate = enDate;
		this.gradDate = gradDate;
		this.acaDegree = acaDegree;
		this.dcDate = dcDate;
		this.graduate = graduate;
	}

	public EduDegree() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EduDegree [num=" + num + ", userName=" + userName + ", eduSector=" + eduSector + ", edu=" + edu
				+ ", enDate=" + enDate + ", gradDate=" + gradDate + ", acaDegree=" + acaDegree + ", dcDate=" + dcDate
				+ ", graduate=" + graduate + "]";
	}

}

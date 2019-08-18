package com.henu.party.bean;

import java.io.Serializable;

public class Study implements Serializable {

	//id、userName、studySection、studyTime、isStudy
	//id、用户名、学习章节名、学习时间、是否完成学习
	
	private Integer id;//考试编号
	private String userName;//用户名
	private String studySection;//学习章节名
	private String studyTime;//学习时间
	private Integer isStudy;//是否完成学习
	public Integer getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStudySection() {
		return studySection;
	}
	public void setStudySection(String studySection) {
		this.studySection = studySection;
	}
	public String getStudyTime() {
		return studyTime;
	}
	public void setStudyTime(String studyTime) {
		this.studyTime = studyTime;
	}
	public Integer getIsStudy() {
		return isStudy;
	}
	public void setIsStudy(Integer isStudy) {
		this.isStudy = isStudy;
	}
	public Study(String userName, String studySection, String studyTime,
			Integer isStudy) {
		super();
		this.userName = userName;
		this.studySection = studySection;
		this.studyTime = studyTime;
		this.isStudy = isStudy;
	}
	public Study() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Study [id=" + id + ", userName=" + userName + ", studySection="
				+ studySection + ", studyTime=" + studyTime + ", isStudy="
				+ isStudy + "]";
	}
}

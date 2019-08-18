package com.henu.party.bean;

import java.io.Serializable;

public class Test implements Serializable {

	//id、userName、studySection、grade、isStudy、examId
	//编号、用户名、学习章节名、实际测试结果、是否通过测试、考试编号
	private Integer tid;//编号
	private String userName;//用户名
	private String studySection;//学习章节名
	private Integer grade;//实际测试结果
	private Integer isStudy;//是否通过测试
	private Integer examId;//考试编号
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
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
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getIsStudy() {
		return isStudy;
	}
	public void setIsStudy(Integer isStudy) {
		this.isStudy = isStudy;
	}
	public Integer getExamId() {
		return examId;
	}
	public void setExamId(Integer examId) {
		this.examId = examId;
	}
	@Override
	public String toString() {
		return "Test [tid=" + tid + ", userName=" + userName
				+ ", studySection=" + studySection + ", grade=" + grade
				+ ", isStudy=" + isStudy + ", examId=" + examId + "]";
	}
	public Test(String userName, String studySection, Integer grade,
			Integer isStudy, Integer examId) {
		super();
		this.userName = userName;
		this.studySection = studySection;
		this.grade = grade;
		this.isStudy = isStudy;
		this.examId = examId;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

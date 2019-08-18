package com.henu.party.bean;

import java.io.Serializable;
import java.util.List;

public class Exam implements Serializable {
	//examId、examName、examList、create、test
	//考试编号、考试名称、考试题目集、创建时间、党课测试表
	private Integer examId;//考试编号
	private String examName;//考试名称
	private String examList;//考试题目集
	private String create;//创建时间
	private String test;//党课测试表
	private String name;
	private String examcontent;
	private String examfinal;
	private String exampass;

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamList() {
		return examList;
	}

	public void setExamList(String examList) {
		this.examList = examList;
	}

	public String getCreate() {
		return create;
	}

	public void setCreate(String create) {
		this.create = create;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExamcontent() {
		return examcontent;
	}

	public void setExamcontent(String examcontent) {
		this.examcontent = examcontent;
	}

	public String getExamfinal() {
		return examfinal;
	}

	public void setExamfinal(String examfinal) {
		this.examfinal = examfinal;
	}

	public String getExampass() {
		return exampass;
	}

	public void setExampass(String exampass) {
		this.exampass = exampass;
	}

	public Exam(Integer examId, String examName, String examList, String create, String test, String name, String examcontent, String examfinal, String exampass) {
		this.examId = examId;
		this.examName = examName;
		this.examList = examList;
		this.create = create;
		this.test = test;
		this.name = name;
		this.examcontent = examcontent;
		this.examfinal = examfinal;
		this.exampass = exampass;
	}

	public Exam() {
	}

	@Override
	public String toString() {
		return "Exam{" +
				"examId=" + examId +
				", examName='" + examName + '\'' +
				", examList='" + examList + '\'' +
				", create='" + create + '\'' +
				", test='" + test + '\'' +
				", name='" + name + '\'' +
				", examcontent='" + examcontent + '\'' +
				", examfinal='" + examfinal + '\'' +
				", exampass='" + exampass + '\'' +
				'}';
	}
}

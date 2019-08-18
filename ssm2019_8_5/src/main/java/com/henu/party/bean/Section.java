package com.henu.party.bean;

import java.io.Serializable;
import java.util.List;

public class Section implements Serializable {

	//studySetion、video、sectionTime、grade
	//学习章节名、视频路径、本章总时间、本章总分数
	private String studySetion;//学习章节名
	private String video;//视频路径
	private String sectionTime;//本章总时间
	private int grade;//本章总分数

	public String getStudySetion() {
		return studySetion;
	}

	public void setStudySetion(String studySetion) {
		this.studySetion = studySetion;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getSectionTime() {
		return sectionTime;
	}

	public void setSectionTime(String sectionTime) {
		this.sectionTime = sectionTime;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Section() {
	}

	public Section(String studySetion, String video, String sectionTime, int grade) {
		this.studySetion = studySetion;
		this.video = video;
		this.sectionTime = sectionTime;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Section{" +
				"studySetion='" + studySetion + '\'' +
				", video='" + video + '\'' +
				", sectionTime='" + sectionTime + '\'' +
				", grade=" + grade +
				'}';
	}
}

package com.henu.party.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.Exam;



public interface ExamMapper {

	/**
	 * 查找所有测试结果
	 * @return
	 */
	public List<Exam> selectexam();

	/**
	 * 通过姓名查找
	 * @param name
	 * @return
	 */
	public List<Exam> selectbyname(String name);
}

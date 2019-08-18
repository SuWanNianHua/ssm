package com.henu.party.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.Section;



public interface SectionMapper {
	/***
	 * 查询
	 * @return
	 */
	public List<Section> selectSection();


	/**
	 * 通过章节名查询
	 * @param studySetion
	 * @return
	 */
	public List<Section> selectbyname(String studySetion);

	/**
	 * 插入
	 * @param section
	 */
	public void insertsection(Section section);

	/**
	 * 修改
	 * @param section
	 */
	public void updatesection(Section section);

	/**
	 * 删除
	 * @param studySetion
	 */
	public void delsection(String studySetion);


}

package com.henu.party.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.Study;



public interface StudyMapper {

	/**
	 * 插入Study数据
	 * @param Study
	 */
	public void insertStudy(Study study);
	
	/**
	 * 根据id号查询
	 * @param id
	 * @return Study
	 */
	public Study selectByIdStudy(Integer id);
	
	/**
	 * 查询全部
	 * @return Study集合
	 */
	public List<Study> selectAllStudy();
	
	/**
	 * 模糊查找
	 * @return Study集合
	 */
	public List<Study> selectLike(String Keywords);
	
	/**
	 * 批量删除
	 * @param ids 指定传入的id集合
	 */
	public void batchDeleteByIdStudy(@Param("ids")String[] ids);
	
	public List<Study> searchRowStudy(@Param("num1")int num1,@Param("num2")int num2);
	
	public int numberStudy();
}

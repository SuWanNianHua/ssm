package com.henu.party.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.Test;



public interface TestMapper {

	/**
	 * 插入Test数据
	 * @param test
	 */
	public void insertTest(Test test);
	
	/**
	 * 根据id号查询
	 * @param id
	 * @return Test
	 */
	public Test selectByIdTest(Integer id);
	 /**
		 * 根据examId号查询
		 * @param id
		 * @return Test
		 */
		public Test selectByIdExamId(Integer examId);
	/**
	 * 查询全部
	 * @return Test集合
	 */
	public List<Test> selectAllTest();
	
	/**
	 * 批量删除
	 * @param ids 指定传入的id集合
	 */
	public void batchDeleteByIdTest(@Param("ids")String[] ids);
	
	public List<Test> searchRowTest(@Param("num1")int num1,@Param("num2")int num2);
	
	public int numberTest();
}

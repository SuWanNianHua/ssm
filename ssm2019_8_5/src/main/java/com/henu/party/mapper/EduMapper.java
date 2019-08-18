package com.henu.party.mapper;

import java.util.List;

import com.henu.party.bean.EduDetail;
import com.henu.party.bean.ThemaicEdu;



public interface EduMapper {
	/*
	 * 查找全部专题
	 */
	public List<ThemaicEdu> selectAllThemes(int start,int ps) throws Exception;
	/*
	 * 查找专题文章
	 */
	public List<EduDetail> selectThemeDetails()throws Exception;
	
	/*
	 * 插入一条专题
	 */
	public void insertTheme(ThemaicEdu themaicEdu) throws Exception;
	
	/*
	 * 插入专题文章
	 */
	public void insertThemeDetail(EduDetail eduDetail) throws Exception;
	
	/*
	 * 删除勾选专题
	 */
	public void deleteThemes(String[] eduIds) throws Exception;
	
	/*
	 * 删除专题文章
	 */
	public void deleteThemeDetails(String[] detailIds) throws Exception;
	
    /*
	 * 查询专题总记录条数
	 */
	public int findAllCount()throws Exception;
}
 
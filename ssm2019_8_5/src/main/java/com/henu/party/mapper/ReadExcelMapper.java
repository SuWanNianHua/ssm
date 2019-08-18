package com.henu.party.mapper;

import java.util.List;

import com.henu.party.bean.UserInfo;



/**
 * 定义mapper接口，等价于dao层
 * 
 * @author small black
 *
 */
public interface ReadExcelMapper {
	/*
	 * 批量导入正式党员信息
	 */
	public void batchImportPartyMem1(List<UserInfo> userInfoList) throws Exception;
	
	/*
	 * 批量导入预备党员信息
	 */
	public void batchImportPartyMem2(List<UserInfo> userInfoList) throws Exception;
	
	/*
	 * 批量导入发展对象信息
	 */
	public void batchImportPartyMem3(List<UserInfo> userInfoList) throws Exception;
	
	/*
	 * 批量导入入党积极分子信息
	 */
	public void batchImportPartyMem4(List<UserInfo> userInfoList) throws Exception;
}

package com.henu.party.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.PartyBranch;
import com.henu.party.bean.PartyCompany;

public interface PartyBranchInfoService {
	/*
	 * 根据num修改党支部基本信息
	 */
	public boolean updatePartyBranchInfo(PartyBranch parBranch) ;
	/*
	 * 新增党组织关联单位
	 */
	public boolean insertParBranchCom(PartyCompany partyCom);
	
	/*
	 * 批量删除或删除指定党组织关联单位
	 */
	public boolean batchDeleteParCom(@Param("num")String num);
	
	/*
	 * 根据num修改党组织关联单位
	 */
	public boolean updateParCom(PartyCompany partyCom);
	/*
	 * 根据partyId得到党组织关联单位
	 */
	public List<PartyCompany> parCompanyByPartyId(String partyId);

	
}

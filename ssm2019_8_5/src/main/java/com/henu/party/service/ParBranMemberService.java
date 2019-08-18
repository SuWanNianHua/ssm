package com.henu.party.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.PartyBranchMember;

public interface ParBranMemberService {
	/*
	 * 根据partyId得到党组织班子成员信息
	 */
	public List<PartyBranchMember> parBranMemberByPartyId(String partyId);
	/*
	 * 新增党组织班子成员
	 */
	public boolean insertParBranchMem(PartyBranchMember partyBranchMem);
	/*
	 * 批量删除或删除指定党组织班子成员
	 */
	public boolean batchDeleteParMem(String num);
	
	/*
	 * 根据num修改党组织班子成员
	 */
	public boolean updateParBranchMem(PartyBranchMember partyBranchMem);
}

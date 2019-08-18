package com.henu.party.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.henu.party.bean.PartyBranchMember;
import com.henu.party.mapper.PartyBranchMapper;
import com.henu.party.service.ParBranMemberService;
@Service("partyBranchMemberService")
public class ParBranMemberServiceImpl implements ParBranMemberService{
	@Resource
	private PartyBranchMapper pBMapper;

	/*
	 * 根据partyId得到党组织班子成员信息
	 */
	public List<PartyBranchMember> parBranMemberByPartyId(String partyId) {
		if(partyId == null || partyId.trim().isEmpty()){
			throw new RuntimeException("partyId不存在");
		}
		
		return pBMapper.selectParBranMemberByPartyId(partyId);
	}

	/*
	 * 新增党组织班子成员
	 */
	public boolean insertParBranchMem(PartyBranchMember partyBranchMem) {
		if(partyBranchMem == null){
			throw new RuntimeException("partyBranchMem为空");
		}
		int res = pBMapper.insertParBranchMem(partyBranchMem);
		return res == 1;
	}

	/*
	 * 批量删除或删除指定党组织班子成员
	 */
	public boolean batchDeleteParMem(String num) {
		
		 
		return pBMapper.batchDeleteParMem(num);
	}

	/*
	 * 根据num修改党组织班子成员
	 */
	public boolean updateParBranchMem(PartyBranchMember partyBranchMem) {
		if(partyBranchMem == null){
			throw new RuntimeException("partyBranchMem为空");
		}
		int res = pBMapper.updateParBranchMem(partyBranchMem);
		return res == 1;
	}
	
	
}

package com.henu.party.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.henu.party.bean.PartyBranch;
import com.henu.party.bean.PartyCompany;
import com.henu.party.mapper.PartyBranchMapper;
import com.henu.party.service.PartyBranchInfoService;
@Service("partyBranchInfoService")
public class PartyBranchInfoServiceImpl implements PartyBranchInfoService{
	@Resource
	private PartyBranchMapper pBMapper;
	/*
	 * 根据num修改党支部基本信息
	 */
	public boolean updatePartyBranchInfo(PartyBranch parBranch)  {
		if(parBranch == null){
			throw new RuntimeException("parBranch 不存在");
		}
		int res = pBMapper.updatePartyBranchInfo(parBranch);
		return res == 1;
	}

	/*
	 * 新增党组织关联单位
	 */
	public boolean insertParBranchCom(PartyCompany partyCom) {
		if(partyCom == null){
			throw new RuntimeException("partyCom不存在");
		}
		int res = pBMapper.insertParBranchCom(partyCom);
		return res == 1;
	}

	/*
	 * 批量删除或删除指定党组织关联单位
	 */
	public boolean batchDeleteParCom(String num)  {
		
		
		return pBMapper.batchDeleteParCom(num);
	}
	/*
	 * 根据num修改党组织关联单位
	 */
	
	public boolean updateParCom(PartyCompany partyCom) {
		if(partyCom == null){
			throw new RuntimeException("partyCom不存在");
		}
		int res = pBMapper.updateParCom(partyCom);
		return res == 1;
	}

	
	public List<PartyCompany> parCompanyByPartyId(String partyId)  {
		if(partyId == null || partyId.trim().isEmpty()){
			throw new RuntimeException("partyId为空");
		}
		
		return pBMapper.selectParCompanyByPartyId(partyId);
	}

}

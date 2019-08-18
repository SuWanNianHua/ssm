package com.henu.party.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.henu.party.bean.RewardPunishParty;
import com.henu.party.mapper.PartyBranchMapper;
import com.henu.party.service.RePuPartyService;
@Service("rePupartyService")
public class RePupartyServiceImpl implements RePuPartyService{
	@Resource
	private PartyBranchMapper pBMapper;
	/*
	 * 根据partyId得到党组织奖惩信息
	 */
	public List<RewardPunishParty> rePuPartyByPartyId(String partyId) {
		if(partyId == null || partyId.trim().isEmpty()){
			throw new RuntimeException("partyId为空");
		}
		return pBMapper.selectRePuPartyByPartyId(partyId);
	}

	/*
	 * 新增党组织奖惩信息
	 */
	public boolean insertParBranchRwd(RewardPunishParty rewardPuPar) {
		if(rewardPuPar == null){
			throw new RuntimeException("rewardPuPar为空");
		}
		int res = pBMapper.insertParBranchRwd(rewardPuPar);
		return res == 1;
	}

	/*
	 * 批量删除或删除指定党组织奖惩信息
	 */
	public boolean batchDeleteParRepu(String num) {
		
		return pBMapper.batchDeleteParRepu(num);
	}

	/*
	 * 根据num修改党组织奖惩信息
	 */
	public boolean updateParRepu(RewardPunishParty rewardPuPar) {
		if(rewardPuPar == null){
			throw new RuntimeException("rewardPuPar为空");
		}
		int res = pBMapper.updateParRepu(rewardPuPar);
		return res == 1;
	}

}

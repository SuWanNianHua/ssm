package com.henu.party.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.RewardPunishParty;

public interface RePuPartyService {
	/*
	 * 根据partyId得到党组织奖惩信息
	 */
	public List<RewardPunishParty> rePuPartyByPartyId(String partyId);
	/*
	 * 新增党组织奖惩信息
	 */
	public boolean insertParBranchRwd(RewardPunishParty rewardPuPar);
	/*
	 * 批量删除或删除指定党组织奖惩信息
	 */
	public boolean batchDeleteParRepu(String num);
	
	/*
	 * 根据num修改党组织奖惩信息
	 */
	public boolean updateParRepu(RewardPunishParty rewardPuPar);
}

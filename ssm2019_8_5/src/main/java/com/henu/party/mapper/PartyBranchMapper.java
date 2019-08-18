package com.henu.party.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.PartyBranch;
import com.henu.party.bean.PartyBranchMember;
import com.henu.party.bean.PartyCompany;
import com.henu.party.bean.RewardPunishParty;



/**
 * 定义mapper接口，等价于dao层
 * 
 * @author small black
 *
 */

public interface PartyBranchMapper {

	/*
	 * 根据userName查询某一党支部所有信息
	 */
	public PartyBranch selectManagerByUsername(String username);

	/*
	 * 查询所有党支部信息并返回集合
	 */
	public List<PartyBranch> selectAllPartyBranch();

	/*
	 * 模糊查询某党支部信息并返回集合
	 */
	public List<PartyBranch> selectFuzzy(String name);

	/*
	 * 修改党支部管理员密码
	 */
	public int updateUserPwd(PartyBranch partyBranch);

	/*
	 * 根据partyName查询指定党支部信息
	 */
	public PartyBranch selectManagerByPartyName(@Param("userName")String userName);

	/*
	 * 批量删除党支部信息
	 */
	public boolean batchDeletePartyBranch(@Param("num")String num);
	
	/*
	 * 新增党支部信息
	 */
	public boolean insertOnePartyBranch(PartyBranch partyBranch);
	
	/*
	 * 根据partyId查询党组织班子成员信息
	 */
	public List<PartyBranchMember> selectParBranMemberByPartyId(String partyId);
	
	/*
	 * 根据partyId查询党组织奖惩信息
	 */
	public List<RewardPunishParty> selectRePuPartyByPartyId(String partyId);
	
	/*
	 * 根据partyId查询党组织关联单位
	 */
	public List<PartyCompany> selectParCompanyByPartyId(String partyId);

	/*
	 * 根据num修改党支部基本信息
	 */
	public int updatePartyBranchInfo(PartyBranch parBranch);
	
	/*
	 * 新增党组织班子成员
	 */
	public int insertParBranchMem(PartyBranchMember partyBranchMem);
	
	/*
	 * 批量删除或删除指定党组织班子成员
	 */
	public boolean batchDeleteParMem(@Param("num")String num);
	
	/*
	 * 根据num修改党组织班子成员
	 */
	public int updateParBranchMem(PartyBranchMember partyBranchMem);
	
	/*
	 * 新增党组织奖惩信息
	 */
	public int insertParBranchRwd(RewardPunishParty rewardPuPar);
	
	/*
	 * 批量删除或删除指定党组织奖惩信息
	 */
	public boolean batchDeleteParRepu(@Param("num")String num);
	
	/*
	 * 根据num修改党组织奖惩信息
	 */
	public int updateParRepu(RewardPunishParty rewardPuPar);
	
	/*
	 * 新增党组织关联单位
	 */
	public int insertParBranchCom(PartyCompany partyCom);
	
	/*
	 * 批量删除或删除指定党组织关联单位
	 */
	public boolean batchDeleteParCom(@Param("num")String num);
	
	/*
	 * 根据num修改党组织关联单位
	 */
	public int updateParCom(PartyCompany partyCom);
}

package com.henu.party.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henu.party.bean.PartyBranch;
import com.henu.party.bean.PartyBranchMember;
import com.henu.party.bean.PartyCompany;
import com.henu.party.bean.RewardPunishParty;
import com.henu.party.service.ParBranMemberService;
import com.henu.party.service.PartyBranchInfoService;
import com.henu.party.service.PartyBranchService;
import com.henu.party.service.RePuPartyService;
/**
 * 党支部前端控制器
 */
@RestController
@RequestMapping("/partybranchcontroller")
public class PartyBranchController {
	/**
	 * 用于党支部信息
	 */
	@Autowired
	private PartyBranchService pbS;
	/**
	 * 用于党组织班子成员信息
	 */
	@Autowired
	private ParBranMemberService pbmS;
	/*
	 * 用于党组织关联单位
	 */
	@Autowired
	private PartyBranchInfoService pbiS;
	/*
	 * 用于党支部奖惩
	 */
	@Autowired
	private RePuPartyService rppS;
	
	/*
	 * 根据userName得到某一党支部所有信息
	 */
	
	@RequestMapping("/partybranch/manager")
	public List<PartyBranch> ManagerByUsername(String username){
		return (List<PartyBranch>) pbS.ManagerByUsername(username);
	}
	/**
	 * 返回所有党支部信息
	 * @return
	 */
	@RequestMapping("/partybranch/allPartyBranch")
	public List AllPartyBranch(){
		return pbS.AllPartyBranch();
	}
	
	/**
	 * 模糊查询某党支部信息
	 * @param name
	 * @return
	 */
	@RequestMapping("/partybranch/allPartyBranch1")
	public List PartyBranchFuzzy(String name){
		return pbS.PartyBranchFuzzy(name);
	}
	/**
	 * 修改党支部管理员密码
	 * @param partyBranch
	 * @return
	 */
	@RequestMapping("/partybranch/updateUserPwd")
	public boolean updateUserPwd(PartyBranch partyBranch){
		return pbS.updateUserPwd(partyBranch);
	}
	
	/**
	 * 根据partyName得到指定党支部信息
	 * @param partyName
	 * @return
	 */
	@RequestMapping("/partybranch/managerByPartyName")
	public List<PartyBranch> ManagerByPartyName(String partyName){
		return (List<PartyBranch>) pbS.ManagerByPartyName(partyName);
	}
	
	/**
	 * 批量删除党支部信息
	 * @param p
	 * @return
	 */
	@RequestMapping("/partybranch/batchDeletePartyBranch")
	public boolean batchDeletePartyBranch(String num){
		return pbS.batchDeletePartyBranch(num);
	}
	/**
	 * 新增党支部信息
	 * @param partyBranch
	 * @return
	 */
	@RequestMapping("/partybranch/insertOnePartyBranch")
	public boolean insertOnePartyBranch(PartyBranch partyBranch){
		return pbS.insertOnePartyBranch(partyBranch);
	}
	
	/**
	 * 根据partyId得到党组织班子成员信息
	 * @param partyId
	 * @return
	 */
	@RequestMapping("/partybranch/parBranMemberByPartyId")
	public List<PartyBranchMember> parBranMemberByPartyId(String partyId){
		return pbmS.parBranMemberByPartyId(partyId);
	}
	
	/**
	 * 新增党组织班子成员
	 * @param partyBranchMem
	 * @return
	 */
	@RequestMapping("/partybranch/insertParBranchMem")
	public boolean insertParBranchMem(PartyBranchMember partyBranchMem){
		
		return pbmS.insertParBranchMem(partyBranchMem);
	}
	/**
	 * 批量删除或删除指定党组织班子成员
	 * @param p
	 * @return
	 */
	@RequestMapping("/partybranch/batchDeleteParMem")
	public boolean batchDeleteParMem(String num){
		return pbmS.batchDeleteParMem(num);
	}
	/**
	 * 根据num修改党组织班子成员
	 * @param partyBranchMem
	 * @return
	 */
	@RequestMapping("/partybranch/updateParBranchMem")
	public boolean updateParBranchMem(PartyBranchMember partyBranchMem){
		return pbmS.updateParBranchMem(partyBranchMem);
	}
	
	/**
	 * 根据num修改党支部基本信息
	 */
	@RequestMapping("/partybranch/updatePartyBranchInfo")
	public boolean updatePartyBranchInfo(PartyBranch parBranch){
		return pbiS.updatePartyBranchInfo(parBranch);
	}
	/**
	 * 新增党组织关联单位
	 * @param partyCom
	 * @return
	 */
	@RequestMapping("/partybranch/insertParBranchCom")
	public boolean insertParBranchCom(PartyCompany partyCom){
		return pbiS.insertParBranchCom(partyCom);
	}
	/**
	 * 批量删除或删除指定党组织关联单位
	 * @param p
	 * @return
	 */
	@RequestMapping("/partybranch/insertParBranchCom1")
	public boolean batchDeleteParCom(String num){
		
		
		return pbiS.batchDeleteParCom(num);
	}
	
	/**
	 * 根据num修改党组织关联单位
	 * @param partyCom
	 * @return
	 */
	@RequestMapping("/partybranch/updateParCom")
	public boolean updateParCom(PartyCompany partyCom){
		
		return pbiS.updateParCom(partyCom);
	}
	/**
	 * 根据partyId得到党组织关联单位
	 * @param partyId
	 * @return
	 */
	@RequestMapping("/partybranch/parCompanyByPartyId")
	public List<PartyCompany> parCompanyByPartyId(String partyId){
		return pbiS.parCompanyByPartyId(partyId);
	}
	
	/**
	 * 根据partyId得到党组织奖惩信息
	 * @param partyId
	 * @return
	 */
	@RequestMapping("/partybranch/rePuPartyByPartyId")
	public List<RewardPunishParty> rePuPartyByPartyId(String partyId){
		return rppS.rePuPartyByPartyId(partyId);
	}
	/**
	 * 新增党组织奖惩信息
	 * @param rewardPuPar
	 * @return
	 */
	@RequestMapping("/partybranch/insertParBranchRwd")
	public boolean insertParBranchRwd(RewardPunishParty rewardPuPar){
		
		
		return rppS.insertParBranchRwd(rewardPuPar);
	}
	/**
	 * 批量删除或删除指定党组织奖惩信息
	 * @param p
	 * @return
	 */
	@RequestMapping("/partybranch/batchDeleteParRepu")
	public boolean batchDeleteParRepu(String num){
		
		return rppS.batchDeleteParRepu(num);
	}
	/**
	 * 根据num修改党组织奖惩信息
	 * @param rewardPuPar
	 * @return
	 */
	@RequestMapping("/partybranch/updateParRepu")
	public boolean updateParRepu(RewardPunishParty rewardPuPar){
		
		
		return rppS.updateParRepu(rewardPuPar);
	}
	
	
	
	
	
}






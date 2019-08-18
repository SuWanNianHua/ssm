package com.henu.party.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.PartyBranch;

public interface PartyBranchService {
	//根据userName得到某一党支部所有信息
	public PartyBranch ManagerByUsername(@Param("userName")String username);
	/*
	 * 所有党支部信息的集合
	 */
	public List<PartyBranch> AllPartyBranch();

	/*
	 * 模糊查询某党支部信息并返回集合
	 */
	public List<PartyBranch> PartyBranchFuzzy(String name);

	/*
	 * 修改党支部管理员密码
	 */
	public boolean updateUserPwd(PartyBranch partyBranch);

	/*
	 * 根据partyName得到指定党支部信息
	 */
	public PartyBranch ManagerByPartyName(String partyName);

	/*
	 * 批量删除党支部信息
	 */
	public boolean batchDeletePartyBranch(@Param("num")String num);
	
	/*
	 * 新增党支部信息
	 */
	public boolean insertOnePartyBranch(PartyBranch partyBranch);
	
	
	
	
	

}

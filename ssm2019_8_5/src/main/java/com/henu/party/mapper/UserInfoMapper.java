package com.henu.party.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.henu.party.bean.DemoMeet;
import com.henu.party.bean.EduDegree;
import com.henu.party.bean.FlowPartyer;
import com.henu.party.bean.JobStation;
import com.henu.party.bean.OutBoard;
import com.henu.party.bean.PartyDuty;
import com.henu.party.bean.PoorPartyer;
import com.henu.party.bean.RewardPunish;
import com.henu.party.bean.TechDuty;
import com.henu.party.bean.UserInfo;



public interface UserInfoMapper {
	
	//查找所有用户信息(无条件)
	public List<UserInfo> selectAllUserInfo();
	//分页查找所有用户信息(有条件)
	public List<UserInfo> selectAllUserInfo_page(int start,int ps);
	
	//根据用户状态查找用户
	public List<UserInfo> selectMemberInfo(@Param("State")String value);
	//分页根据用户状态查找
	public List<UserInfo> selectMemberInfo_page(int partyState,int start,int ps);
	
	//根据党支部信息查找不同入党状态的用户
	public List<UserInfo> selectByPartyBranch(String partyBranch);

	//根据党支部信息查找不同入党状态的用户（分页）
	public List<UserInfo> selectByPartyBranch_page(String partyBranch,int partyState,int start,int ps);
	
	//根据姓名名查找
	public List<UserInfo> selectByUserName(String userName);
	//根据姓名查找（分页）
	public List<UserInfo> selectByUserName_page(String userName,int partyState,int start,int ps);
	
	//批量删除用户
	public void batchDeleteUser(@Param("nums")String[] nums);
	
	//修改用户入党状态
	public void updatePartyState(@Param("nums")String[] nums,int partyState);
	
	//新增用户
	public void insertUser(UserInfo user);
	
	//查找总记录数
	public int findAllCount();
	//查找不同身份记录数
	public int findMemCount(int partyState);
	//查找用户输入党支部中用户记录数
	public int findBranchCount(String partyState);
	//查找用户输入姓名记录数
	public int findNameCount(String name);
	
	//根据用户名（主键）查找
	public String selectOnlyUserName(String userName);
	//根据主键更新一个实例
	public void updateByUserName(UserInfo userInfo);

	public List<EduDegree> selectAllEduDegree();
	public List<DemoMeet> selectAllDemoMeet();
	public List<JobStation> selectAllJobStation();
	public List<PartyDuty> selectAllPartyDuty();
	public List<RewardPunish> selectAllRewardPunish();
	public List<TechDuty> selectAllTechDuty();
	public List<FlowPartyer> selectAllFlowPartyer();
	public List<PoorPartyer> selectAllPoorPartyer();
	public List<OutBoard> selectAllOutBoard();

	public void deleteByUserName(String userName);

	public UserInfo selectUserInfoByUsername(String Username);
	//根据学号查找出国信息
	public OutBoard selectOutboardByUserName(String userName);
	//根据学号查找党员流动信息
	public FlowPartyer selectFlowPartyerByUserName(String userName);
	//根据学号查找党员贫困信息
	public PoorPartyer selectPoorPartyerByUserName(String userName);
	//更新出国信息
	public void updateOutboard(OutBoard outBoard);
	//更新人员流动信息
	public void updateFlowPartyer(FlowPartyer flowPartyer);
	//更新贫困信息
	public void updatePoorPartyer(PoorPartyer poorPartyer);



}

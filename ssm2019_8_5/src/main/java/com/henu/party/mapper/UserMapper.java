package com.henu.party.mapper;

import java.util.List;

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



/**
 * 定义mapper接口，等价于dao层
 * 
 * @author small black
 *
 */

public interface UserMapper {

	/*
	 * 根据userName查询某一用户基本信息
	 */
	public UserInfo selectUserInfoByUsername(String username) throws Exception;

	/*
	 * 根据userName查询某一用户学历学位
	 */
	public List<EduDegree> selectEduDegreeByUserName(String username) throws Exception;
	
	/*
	 * 根据userName查询某一用户工作岗位
	 */
	public List<JobStation> selectJobStationByUserName(String username) throws Exception;
	
	/*
	 * 根据userName查询某一用户党政职务
	 */
	public List<PartyDuty> selectPartyDutyByUserName(String username) throws Exception;
	
	/*
	 * 根据userName查询某一用户技术职务
	 */
	public List<TechDuty> selectTechDutyByUserName(String username) throws Exception;
	
	/*
	 * 根据userName查询某一用户奖惩信息
	 */
	public List<RewardPunish> selectRewardPuByUserName(String username) throws Exception;
	
	/*
	 * 根据userName查询某一用户民主评议
	 */
	public List<DemoMeet> selectDemoMeetByUserName(String username) throws Exception;
	
	/*
	 * 根据userName查询某一用户流动党员
	 */
	public FlowPartyer selectFlowParByUserName(String username) throws Exception;
	
	/*
	 * 根据userName查询某一用户困难党员
	 */
	public PoorPartyer selectPoorParByUserName(String username) throws Exception;
	
	/*
	 * 根据userName查询某一用户出国出境
	 */
	public OutBoard selectOutBoardByUserName(String username) throws Exception;
}

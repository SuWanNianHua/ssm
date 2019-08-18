package com.henu.party.service;

import com.henu.party.bean.*;

import java.util.List;

public interface UserService {

    /**
     * 根据主键查询实例
     * @return
     */
    public UserInfo getAUserInfo(String userName);
    /**
     * 返回现在存在的所有的用户信息
     * @return 所有用户信息
     */
    public List<UserInfo> getAllUserInfo();

    /**
     * @param name 将要查询的用户姓名
     * @return 返回所查询的用户
     */
    public List<UserInfo> getUserInfo(String name);

    /**
     * @param partyState 代表入党状态的数字
     * @return 返回对应状态的所有用户信息
     */
    public List<UserInfo> getUserByPartyState(String partyState);

    /**
     * 通过党支部名称查询对应的用户
     * @param PartyBranchName 党支部名字
     * @return 返回所有查询到的用户信息
     */
    public List<UserInfo> getByPartyBranchName(String PartyBranchName);

    /**
     * 添加一个用户
     * @param userInfo 用户信息实例
     * @return 返回是否成功
     */
    public boolean insertUser(UserInfo userInfo);

    /**
     * 通过学号删除用户信息
     * @param userName 用户学号
     * @return 返回是否成功
     */
    public boolean delateUser(String userName,int state);

    public boolean updateUserInfo(UserInfo userInfo);

    /**
     * 返回出国状态
     * @param userName
     * @return
     */
    public OutBoard getOutboard(String userName);

    /**
     * 返回党员流动
     * @param userName
     * @return
     */
    public FlowPartyer getFlowPartyer(String userName);

    /**
     * 返回党员贫困信息
     * @param userName
     * @return
     */
    public PoorPartyer getPoorPartyer(String userName);

    public boolean updateOutboard(OutBoard outBoard);

    public boolean updateFlowPartyer(FlowPartyer flowPartyer);

    public boolean updatePoorPartyer(PoorPartyer poorPartyer);

    public List<TechDuty> selectTechDutyByUserName(String userName);

    public List<EduDegree> selectEduDegreeByUserName(String userName);

    public List<JobStation> selectJobStationByUserName(String userName);

    public List<RewardPunish> selectRewardPunishByUserName(String userName);

    public List<DemoMeet> selectDemoMeetByUserName(String userName);

    public List<PartyDuty> selectPartyDutyByUserName(String username);

    /**
     * 根据表中主键删除对应数据项
     * @param num 表中主键参数名
     */
    public void deleteTechDutyByNum(int num);

    /**
     * 根据表中主键删除对应数据项
     * @param num 表中主键参数名
     */
    public void deleteEduDegreeByNum(int num);

    /**
     根据表中主键删除对应数据项
     * @param num 表中主键参数名
     */
    public void deleteJobStationByNum(int num);

    /**
     根据表中主键删除对应数据项
     * @param num 表中主键参数名
     */
    public void deleteDemoMeetByNum(int num);

    /**
     根据表中主键删除对应数据项
     * @param num 表中主键参数名
     */
    public void deleteRewardPunishByNum(int num);

    /**
     根据表中主键删除对应数据项
     * @param num 表中主键参数名
     */
    public void deletePartyDutyByNum(int num);

    /**
     * 更新职务信息
     * @param techDuty 职务信息实体类
     */
    public void insertTechDuty(TechDuty techDuty);


    public void updateEduDegree(EduDegree eduDegree);

    public void updatePartyDuty(PartyDuty partyDuty);

    public void updateJobStation(JobStation jobStation);

    public void updateRewardPunish(RewardPunish rewardPunish);

    public void updateDemoMeet(DemoMeet demoMeet);

    /**
     * 向表中增加职务信息
     * @param techDuty 职务信息实体类
     */
    public void updateTechDuty(TechDuty techDuty);

    public void insertEduDegree(EduDegree eduDegree);

    public void insertPartyDuty(PartyDuty partyDuty);

    public void insertJobStation(JobStation jobStation);

    public void insertRewardPunish(RewardPunish rewardPunish);

    public void insertDemoMeet(DemoMeet demoMeet);


}

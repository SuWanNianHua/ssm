package com.henu.party.controller;

import com.henu.party.bean.*;
import com.henu.party.mapper.UserInfoMapper;
import com.henu.party.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 用户信息管理Controller
 * @Author: YangWuXin
 * @Date: 2018/11/9 16:01
 */
@RestController
public class UserInfoController {
    @Autowired
    UserService userService;
    @Autowired
    UserInfoMapper userInfoMapper;

    @RequestMapping("/User/UserInfo")
    public List<UserInfo> UserInfo(){
        return userService.getAllUserInfo();
    }

    /**
     * 根据当前入党状态查询对应人员
     * @param type
     * @return
     */
    @RequestMapping("/user/SelectByInfo")
    public List<UserInfo> SelectByInfo(String type){
        return userService.getUserByPartyState(type);
    }

    /**
     * 根据复选框查询条件 以及输入查询内容进行查询
     * @param searchStatus 输入框传回条件
     * @param selectName 查询项
     * @return
     */
    @RequestMapping("/user/search")
    public List<UserInfo> SearchInfo(String searchStatus,String selectName){
        System.out.println(searchStatus + " " + selectName);
        if(searchStatus.equals("0")){
            return userService.getByPartyBranchName(selectName);
        }else{
            return userService.getUserInfo(selectName);
        }
    }

    @RequestMapping("/user/detail")
    public UserInfo getUser(String userName){
        return userService.getAUserInfo(userName);
    }

    /**
     * 修改用户信息
     * @param userInfo 修改用户的实体
     * @return
     */
    @RequestMapping("/user/update")
    public boolean updateUserInfo(UserInfo userInfo){
        System.err.println(userInfo);
        userService.updateUserInfo(userInfo);
        return true;
    }

    /**
     * 修改用户党务身份
     * @param userInfo 修改用户的实体
     * @return
     */
    @RequestMapping("/user/updatePartyState")
    public boolean updateUserInfo(String username,String partyState){
        UserInfo ui = userInfoMapper.selectUserInfoByUsername(username);
        if(ui!=null){
            if(ui.getPartyState().equals(partyState)){
                if(partyState.equals("入党积极分子")){
                    ui.setPartyState("发展对象");
                }else if(partyState.equals("发展对象")){
                    ui.setPartyState("预备党员");
                }else if(partyState.equals("预备党员")){
                    ui.setPartyState("正式党员");
                }else if(partyState.equals("正式党员")){
                    ui.setPartyState("转出");
                }
            }

            userInfoMapper.updateByUserName(ui);
        }
        return true;
    }

    @RequestMapping("/user/addUserInfo")
    public boolean addUserInfo(UserInfo userInfo){
        System.out.println(userInfo);
        if(userInfo!=null){
            userInfoMapper.insertUser(userInfo);
            return true;
        }else{
            return false;
        }
    }

    /**
     * 删除用户信息
     * @param userInfo 删除用户的实体
     * @return
     */
    @RequestMapping("/user/delete")
    public boolean deleteUserInfo(String username){
        System.out.println(username);
        userInfoMapper.deleteByUserName(username);
        return true;
    }

    /**
     *根据id进行批量删除
     * @param list 选中用户的账号
     * @return
     */
    @RequestMapping("/user/deleteAll")
    public boolean deleteAllSelect(List list){

        return true;
    }

    /**
     * 批量更新现在入党状态
     * @param list 所有需要修改的id的集合
     * @return
     */
    @RequestMapping("/user/updateAll")
    public boolean updateSelectAll(List list){

        return true;
    }

    /**
     * 根据学号查找出国信息
     * @param userName
     * @return
     */
    @RequestMapping("/user/getOutBoard")
    public OutBoard getOutBoardMsg(String userName){

        return userService.getOutboard(userName);
    }

    /**
     * 根据学号查找党员流动信息
     * @param userName
     * @return
     */
    @RequestMapping("/user/getFlowPartyer")
    public FlowPartyer getFlowPartyerMsg(String userName){

        return userService.getFlowPartyer(userName);
    }

    /**
     * 根据学号查找党员贫困信息
     * @param userName
     * @return
     */
    @RequestMapping("/user/getPoorPartyer")
    public PoorPartyer getPoorPartyerMsg(String userName){

        return userService.getPoorPartyer(userName);
    }

    /**
     * 更新出国数据
     * @param outBoard 出国信息
     * @return
     */
    @RequestMapping("/user/updateOutBoard")
    public boolean updateOutBoard(OutBoard outBoard){

        return userService.updateOutboard(outBoard);
    }

    /**
     * 更新党员流动
     * @param flowPartyer 流动信息
     * @return
     */
    @RequestMapping("/user/updateFlowPartyer")
    public boolean updateFlowPartyer(FlowPartyer flowPartyer){

        return userService.updateFlowPartyer(flowPartyer);
    }

    /**
     * 更新贫穷信息
     * @param poorPartyer 贫穷信息
     * @return
     */
    @RequestMapping("/user/updatePoorPartyer")
    public boolean updatePoorPartyer(PoorPartyer poorPartyer){

        return userService.updatePoorPartyer(poorPartyer);
    }

    /**
     * 根据id查询技术信息
     * @param userName
     * @return
     */
    @RequestMapping("/user/getTechDuty")
    public List<TechDuty> getTechDuty(String userName){

        return userService.selectTechDutyByUserName(userName);
    }

    /**
     * 根据id查询教育信息
     * @param userName
     * @return
     */
    @RequestMapping("/user/getEduDegree")
    public List<EduDegree> getEduDegree(String userName){

        return userService.selectEduDegreeByUserName(userName);
    }

    /**
     * 根据id查询工作信息
     * @param userName
     * @return
     */
    @RequestMapping("/user/getJobStation")
    public List<JobStation> getJobStation(String userName){

        return userService.selectJobStationByUserName(userName);
    }

    /**
     * 根据id查询得奖信息
     * @param userName
     * @return
     */
    @RequestMapping("/user/getRewardPunish")
    public List<RewardPunish> getRewardPunish(String userName){

        return userService.selectRewardPunishByUserName(userName);
    }

    /**
     * 根据id查询评议信息
     * @param userName
     * @return
     */
    @RequestMapping("/user/getDemoMeet")
    public List<DemoMeet> getDemoMeet(String userName){

        return userService.selectDemoMeetByUserName(userName);
    }

    /**
     * 根据id查询任职信息
     * @param userName
     * @return
     */
    @RequestMapping("/user/getPartyDuty")
    public List<PartyDuty> getPartyDuty(String userName){

        return userService.selectPartyDutyByUserName(userName);
    }

    /**
     * 根据num删除技术信息
     * @param num
     */
    @RequestMapping("/user/deleteTechDuty")
    public void deleteTechDuty(int num){
        userService.deleteTechDutyByNum(num);
    }

    /**
     * 根据num删除教育信息
     * @param num
     */
    @RequestMapping("/user/deleteEduDegree")
    public void deleteEduDegree(@Param("num") Integer num){
        System.out.println(num);
        userService.deleteEduDegreeByNum(num);
    }

    /**
     * 根据num删除工作信息
     * @param num
     */
    @RequestMapping("/user/deleteJobStation")
    public void deleteJobStation(int num){
        userService.deleteJobStationByNum(num);
    }

    /**
     * 根据num删除得奖信息
     * @param num
     */
    @RequestMapping("/user/deleteRewardPunish")
    public void deleteRewardPunish(int num){
        userService.deleteRewardPunishByNum(num);
    }

    /**
     * 根据num删除评议信息
     * @param num
     */
    @RequestMapping("/user/deleteDemoMeet")
    public void deleteDemoMeet(int num){
        userService.deleteDemoMeetByNum(num);
    }

    /**
     * 根据num删除任职信息
     * @param num
     */
    @RequestMapping("/user/deletePartyDuty")
    public void deletePartyDuty(int num){
        userService.deletePartyDutyByNum(num);
    }

    /**
     * 插入技术信息
     * @param techDuty 技术信息实体
     */
    @RequestMapping("/user/updateTechDuty")
    public void updateTechDuty(TechDuty techDuty){
        userService.updateTechDuty(techDuty);
    }

    @RequestMapping("/user/updateEduDegree")
    public void updateEduDegree(EduDegree eduDegree){
        userService.updateEduDegree(eduDegree);
    }

    @RequestMapping("/user/updatePartyDuty")
    public void updatePartyDuty(PartyDuty partyDuty){
        userService.updatePartyDuty(partyDuty);
    }

    @RequestMapping("/user/updateJobStation")
    public void updateJobStation(JobStation JobStation){
        userService.updateJobStation(JobStation);
    }

    @RequestMapping("/user/updateRewardPunish")
    public void updateRewardPunish(RewardPunish rewardPunish){
        userService.updateRewardPunish(rewardPunish);
    }

    @RequestMapping("/user/updateDemoMeet")
    public void updateDemoMeet(DemoMeet demoMeet){
        userService.updateDemoMeet(demoMeet);
    }

    /**
     * 更新技术信息
     * @param techDuty 技术信息实体
     */
    @RequestMapping("/user/insertTechDuty")
    public void insertTechDuty(TechDuty techDuty){
        userService.insertTechDuty(techDuty);
    }
    @RequestMapping("/user/insertEduDegree")
    public void insertEduDegree(EduDegree eduDegree){
        userService.insertEduDegree(eduDegree);
    }

    @RequestMapping("/user/insertPartyDuty")
    public void insertPartyDuty(PartyDuty partyDuty){
        userService.insertPartyDuty(partyDuty);
    }

    @RequestMapping("/user/insertRewardPunish")
    public void insertRewardPunish(RewardPunish rewardPunish){
        userService.insertRewardPunish(rewardPunish);
    }

    @RequestMapping("/user/insertDemoMeet")
    public void insertDemoMeet(DemoMeet demoMeet){
        userService.insertDemoMeet(demoMeet);
    }

    @RequestMapping("/user/insertJobStation")
    public void insertJobStation(JobStation jobStation){
        userService.insertJobStation(jobStation);
    }

}

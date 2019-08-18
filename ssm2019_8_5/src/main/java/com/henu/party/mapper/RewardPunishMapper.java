package com.henu.party.mapper;

import com.henu.party.bean.RewardPunish;

import java.util.List;

/**
 * @Description:
 * @Author: YangWuXin
 * @Date: 2018/11/15 21:56
 */
public interface RewardPunishMapper {
    //增
    public void insert(RewardPunish rewardPunish);
    //删
    public void deleteByNum(int num);
    //查
    public List<RewardPunish> selectByUserName(String userName);
    //改
    public void update(RewardPunish rewardPunish);
}

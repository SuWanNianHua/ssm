package com.henu.party.mapper;

import com.henu.party.bean.PartyDuty;

import java.util.List;

/**
 * @Description:
 * @Author: YangWuXin
 * @Date: 2018/11/16 23:04
 */
public interface PartyDutyMapper {
    //增
    public void insert(PartyDuty partyDuty);
    //查
    public List<PartyDuty> selectByUserName(String userName);
    //改
    public void update(PartyDuty partyDuty);
    //删
    public void delete(int num);
}

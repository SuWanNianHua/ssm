package com.henu.party.mapper;

import com.henu.party.bean.DemoMeet;

import java.util.List;

/**
 * @Description:
 * @Author: YangWuXin
 * @Date: 2018/11/15 22:09
 */
public interface DemomeetMapper {
    //增
    public void insert(DemoMeet demoMeet);
    //删除
    public void deleteByNum(int num);
    //改
    public void update(DemoMeet demoMeet);
    //查
    public List<DemoMeet> selectByUserName(String userName);
}

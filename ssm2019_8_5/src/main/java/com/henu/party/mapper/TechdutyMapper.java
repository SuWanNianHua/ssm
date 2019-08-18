package com.henu.party.mapper;

import com.henu.party.bean.TechDuty;

import java.util.List;

/**
 * @Description:
 * @Author: YangWuXin
 * @Date: 2018/11/15 21:35
 */
public interface TechdutyMapper {
    //增
    public void insert(TechDuty techDuty);
    //改
    public void update(TechDuty techDuty);
    //查
    public List<TechDuty> selectByUserName(String username);
    //删
    public void deleteByNum(int num);
}

package com.henu.party.mapper;

import com.henu.party.bean.JobStation;

import java.util.List;

/**
 * @Description:
 * @Author: YangWuXin
 * @Date: 2018/11/15 21:14
 */
public interface JobStationMapper {
    //增
    public void insert(JobStation jobStation);
    //删
    public void  delectByNum(int num);
    //查
    public List<JobStation> selectByUserName(String UserNAme);
    //改
    public void update(JobStation jobStation);
}

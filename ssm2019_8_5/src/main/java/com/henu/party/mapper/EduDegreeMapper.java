package com.henu.party.mapper;

import com.henu.party.bean.EduDegree;

import java.util.List;

/**
 * @Description:
 * @Author: YangWuXin
 * @Date: 2018/11/15 20:59
 */
public interface EduDegreeMapper {
    //添加
    public void insert(EduDegree eduDegree);
    //查询
    public List<EduDegree> selectByUserName(String userName);
    //更新
    public void update(EduDegree eduDegree);
    //删除
    public void deleteByNum(int num);

}

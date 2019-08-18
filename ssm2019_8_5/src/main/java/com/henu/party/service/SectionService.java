package com.henu.party.service;

import com.henu.party.bean.Section;

import java.util.List;

public interface SectionService {
    /**
     * 查找
     * @return
     */
    public List<Section> selectallsection();

    /**
     * 通过章节名查询
     * @param name
     * @return
     */
    public List<Section> selectbyname(String name);

    /**
     * 插入
     * @param section
     */
    public void insertsection(Section section);

    /**
     * 修改
     * @param section
     */
    public void updatesection(Section section);

    /**
     * 删除
     * @param name
     */
    public void delsection(String name);
}

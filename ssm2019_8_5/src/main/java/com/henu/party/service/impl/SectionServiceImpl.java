package com.henu.party.service.impl;

import com.henu.party.bean.Section;
import com.henu.party.mapper.SectionMapper;
import com.henu.party.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SectionService")
public class SectionServiceImpl implements SectionService {
    @Autowired
    SectionMapper sectionMapper;

    @Override
    public List<Section> selectallsection() {
        return sectionMapper.selectSection();
    }

    @Override
    public List<Section> selectbyname(String name) {
        return sectionMapper.selectbyname(name);
    }

    @Override
    public void insertsection(Section section) {
        sectionMapper.insertsection(section);
    }

    @Override
    public void updatesection(Section section) {
        sectionMapper.updatesection(section);
    }

    @Override
    public void delsection(String name) {
        sectionMapper.delsection(name);
    }
}

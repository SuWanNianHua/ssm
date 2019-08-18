package com.henu.party.service.impl;

import com.henu.party.bean.Exam;
import com.henu.party.mapper.ExamMapper;
import com.henu.party.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ExamService")
public class ExamServiceImpl implements ExamService {

    @Autowired
    ExamMapper examMapper;

    @Override
    public List<Exam> selectAllexam() {
        return examMapper.selectexam();
    }

    @Override
    public List<Exam> selectbyname(String name) {
        return examMapper.selectbyname(name);
    }
}

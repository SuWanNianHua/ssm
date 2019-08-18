package com.henu.party.service;

import com.henu.party.bean.Exam;

import java.util.List;

public interface ExamService {
    public List<Exam> selectAllexam();
    public List<Exam> selectbyname(String name);
}

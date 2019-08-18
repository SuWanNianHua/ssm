package com.henu.party.controller;

import com.henu.party.bean.Exam;
import com.henu.party.service.ExamService;
import com.henu.party.service.ItemBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExamController {
    @Autowired
    private ExamService examService;

    @RequestMapping("/exam/selectall")
    public List<Exam> selectall(){
        return examService.selectAllexam();
    }
}

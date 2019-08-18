package com.henu.party.controller;

import com.henu.party.bean.Section;
import com.henu.party.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SectionController {
    @Autowired
    SectionService sectionService;

    @RequestMapping("/section/selectsection")
    public List<Section> selectsection(){
        return sectionService.selectallsection();
    }

    @RequestMapping("/section/insertsection")
    public void insertsection(Section section){
        sectionService.insertsection(section);
    }

    @RequestMapping("/section/updatesection")
    public void updatesection(Section section){
        sectionService.updatesection(section);
    }

    @RequestMapping("/section/delsection")
    public void delsection(String name){
        sectionService.delsection(name);
    }
}

package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.Goods;
import com.service.GoodsService;

@Controller
public class GoodsController {
	@Resource(name="goodsServiceImpl")
	GoodsService gs;
	
	@RequestMapping(value="insert")
	public String insert(Goods record) {
		gs.insert(record);
		return "forward:index.jsp";
	}
	
	@RequestMapping(value="selectAll")
	public String selectAll(HttpServletRequest request) {
		List<Goods> list= gs.selectAll();
		request.setAttribute("list", list);
		return "a";
	}
}

package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Goods;
import com.dao.GoodsMapper;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Resource(name="goodsMapper")
	GoodsMapper gm;
	@Override
	public int insert(Goods record) {
		
		return gm.insert(record);
	}
	
	@Override
	public List<Goods>  selectAll() {
		List<Goods> list =gm.selectAll();
		return list;
	}
	
	
	

}

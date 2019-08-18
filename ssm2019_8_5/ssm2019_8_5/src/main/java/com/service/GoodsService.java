package com.service;


import java.util.List;

import com.bean.Goods;

public interface GoodsService {
	int insert(Goods record);
	
	List<Goods> selectAll();
}

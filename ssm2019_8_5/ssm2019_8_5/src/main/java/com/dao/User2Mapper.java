package com.dao;

import java.util.List;

import com.bean.User2;

import tk.mybatis.mapper.common.Mapper;

public interface User2Mapper extends Mapper<User2>{
	List<User2> selectAllUser(User2 user2);
	
	
}
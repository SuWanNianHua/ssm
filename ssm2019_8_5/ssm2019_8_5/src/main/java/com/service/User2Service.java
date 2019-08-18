package com.service;

import java.util.List;

import com.bean.User2;

public interface User2Service {
	int insert(User2 record);
	User2 selectUserById(int id);
	
	int updateUser(User2 user2);
	
	List<User2> selectAllUser(User2 user2);
	
	int deleteUser(int id);
}

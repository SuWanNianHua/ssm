package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.User2;
import com.dao.User2Mapper;

@Service
public class User2ServiceImpl implements User2Service {
	
	//屬性注入
	@Resource(name="user2Mapper")
	User2Mapper um;
	
	/**
	 * 调用mapper通用接口中的增加方法
	 */
	@Override
	public int insert(User2 record) {
		return um.insert(record);
	}

	@Override
	public User2 selectUserById(int id) {
		return um.selectByPrimaryKey(id);
	}

	@Override
	public int updateUser(User2 user2) {
		return um.updateByPrimaryKeySelective(user2);
	}

	@Override
	public List<User2> selectAllUser(User2 user2) {
		return um.selectAllUser(user2);
	}

	@Override
	public int deleteUser(int id) {
		return um.deleteByPrimaryKey(id);
	}

	

	
	
	
}

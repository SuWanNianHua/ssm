package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Address;
import com.dao.AddressMapper;

@Service
public class AddressServiceImpl implements AddressService {
	
	/**
	 * 获取数据库中的所有地址
	 */
	@Resource(name="addressMapper")
	AddressMapper addressMapper;
	
	@Override
	public List<Address> selectAll() {
		return addressMapper.selectAll();
	}

	@Override
	public String getAll() {
		return getAll(0);
	}
	
	/**
	 * 动态定位显示数据库中的地址
	 */
	@Override
	public String getAll(int id) {
		List<Address> a = addressMapper.selectAll();
		StringBuilder sg = new StringBuilder();
		for (Address address : a) {
			if (id==address.getId()) {
				sg.append("<option selected='selected' value='" + address.getId() + "'>");
				sg.append(address.getCity());
				sg.append("</option>");
			}else {
				sg.append("<option value='" + address.getId() + "'>");
				sg.append(address.getCity());
				sg.append("</option>");
			}
			
		}
		return sg.toString();
	}
	
	

}

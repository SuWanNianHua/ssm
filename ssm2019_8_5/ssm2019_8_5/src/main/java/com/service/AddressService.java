package com.service;


import java.util.List;

import com.bean.Address;


public interface AddressService {
	List<Address> selectAll();
	
	String getAll();
	
	String getAll(int id);

}

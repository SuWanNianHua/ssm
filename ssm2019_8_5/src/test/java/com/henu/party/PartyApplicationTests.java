package com.henu.party;

import com.henu.party.bean.ItemBank;
import com.henu.party.mapper.ItemBankMapper;
import com.henu.party.mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.henu.party.mapper.SectionMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PartyApplicationTests {
	@Autowired
	SectionMapper mapper;

	@Autowired
	UserInfoMapper userInfoMapper;

	@Autowired
	ItemBankMapper itemBankMapper;
	@Test
	public void contextLoads() {
		ItemBank itemBank = new ItemBank(7,"学习十九大","十九大","不忘初心，牢记使命","不忘初心，牢记使命","不忘初心，牢记使命","不忘初心，牢记使命","D");
		System.out.println(itemBankMapper.selectBankbyContent("十九").toString());

	}

}

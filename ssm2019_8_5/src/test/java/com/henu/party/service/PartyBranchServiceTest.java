package com.henu.party.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import com.henu.party.bean.PartyBranch;


@RunWith(SpringRunner.class)
@SpringBootTest

public class PartyBranchServiceTest {
	@Autowired
	private PartyBranchService pbs;
	public PartyBranch test1 =  new PartyBranch();
	
	@Test
	public void testInsertOnePartyBranch(){
		test1.setNum("033");
		test1.setPartyId("6666");
		test1.setUserName("komachi");
		test1.setPassword("1111");
		test1.setAddress("henu");
		test1.setPartyType("dd");
		test1.setPartyName("春物");
		test1.setPartyAddress("henu");
		
		boolean b = pbs.insertOnePartyBranch(test1);
		System.out.println(b);
	}
	@Test
	public void testManagerByUsername() throws Exception{
		PartyBranch pb1 = pbs.ManagerByUsername("party5");
		
		System.out.println(pb1);
	}
	@Test
	public void testAllPartyBranch(){
		List<PartyBranch> list = pbs.AllPartyBranch();
		for(PartyBranch pb :list ){
			System.out.println(pb);
		}
	}
	@Test
	public void testFuzzy(){
		List<PartyBranch> list = pbs.PartyBranchFuzzy("春物");
		for(PartyBranch pb :list ){
			System.out.println(pb);
		}
	}
	@Test
	public void testUpdateUserPwd(){
		test1.setPassword("777");
		boolean res = pbs.updateUserPwd(test1);
		System.out.println(res);
		
		
	}
	@Test
	public void testBatchDeletePartyBranch(){
		String[] dpb= {"春物"};
//		boolean res = pbs.batchDeletePartyBranch(dpb);
//		System.out.println(res);
	}
}

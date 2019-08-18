package com.henu.party.mapper;

import com.henu.party.mapper.PartyBranchMapper;
import com.henu.party.bean.PartyBranch;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * 
 * @author SunQingxin
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class partyBranchMapperTest {
	
	@Autowired
	private PartyBranchMapper partyBranchMapper;
	
    @Test
    public void Test(){
    	PartyBranch pb =new PartyBranch();
    	pb.setNum("11");
    	pb.setPartyId("1");
    	pb.setPartyName("1");
    	pb.setPartyType("1");
    	pb.setPartyAddress("1");
    	pb.setUserName("001");
    	pb.setPassword("123");
    	partyBranchMapper.insertOnePartyBranch(pb);
//    	partyBranchMapper.batchDeletePartyBranch("11");
    	System.out.println(partyBranchMapper.selectAllPartyBranch());
    	
       
    }
}

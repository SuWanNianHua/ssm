package com.henu.party.mapper;

import com.henu.party.bean.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * @Description:
 * @Author: YangWuXin
 * @Date: 2018/11/10 21:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class userInfoMapperTest {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void Test(){
        userInfoMapper.selectByUserName("李大力");
        userInfoMapper.selectByPartyBranch("学生第一党支部");
    }
}

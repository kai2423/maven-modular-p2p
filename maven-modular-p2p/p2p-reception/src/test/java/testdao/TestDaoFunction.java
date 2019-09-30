package testdao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mapper.UserInfoMapper;
import pojo.Userinfo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestDaoFunction {
	
	@Autowired
	UserInfoMapper userInfoMapper;
	
	@Test
	public void testUserInfoMapper_Query()
	{
		Userinfo userinfo = userInfoMapper.queryUserInfoByID("4");
		System.out.println(userinfo);
		
	}
	
	
}
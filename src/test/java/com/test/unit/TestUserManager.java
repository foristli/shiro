package com.test.unit;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sh.service.UserInter;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:context.xml",
		
})
public class TestUserManager {
	private static final Logger LOGGER = Logger.getLogger(TestUserManager.class);
	@Autowired
	UserInter userManager;
	@Autowired
	ApplicationContext ctx;
	
	@Test
	public void save() {
		//User user = new User();
		//user.setUserName("forist");
		//user.setPassword("123456");
		//user.setGender(0);
		//Integer id = userManager.save(user);
		//JSON.toJSONString(id);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}


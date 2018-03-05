package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.user.impl.UserService;

public class UserServiceClient {
	
	public static void main(String[] args) {
		
		// 1. Spring
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring -> UserServiceImpl Lookup
		UserService userService = (UserService)container.getBean("userService");
		
		// 3. db
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		UserVO user = userService.getUser(vo);
		if (user != null) {
			System.out.println("login ok - " + user.getName() + " �� ȯ���մϴ�.");
		} else {
			System.out.println("�α��� ����");
		}
		
		// 5. close
		container.close();
	}
}

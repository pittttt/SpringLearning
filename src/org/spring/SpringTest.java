package org.spring;

import org.junit.Test;
import org.spring.dao.UserDao;
import org.spring.service.UserService;
import org.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	public void test(){
		//����service
		//UserService userservice=new UserServiceImpl();
		
		//�����spring�����л�ȡ����
		//��ȡ����
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)applicationContext.getBean("userService");
		userService.login();
	}
}

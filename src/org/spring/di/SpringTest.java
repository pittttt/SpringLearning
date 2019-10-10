package org.spring.di;

import org.junit.Test;
import org.spring.dao.UserDao;
import org.spring.service.UserService;
import org.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	@Test
	public void test() {
		// 得到工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//得到bean
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
	}
}

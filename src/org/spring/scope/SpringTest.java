package org.spring.scope;

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
		// 得到bean
		// 单例
		
		SingletonBean singletonBean = (SingletonBean) applicationContext.getBean("singletonBean");
		System.out.println(singletonBean);
		SingletonBean singletonBean2 = (SingletonBean) applicationContext.getBean("singletonBean");
		System.out.println(singletonBean2);
		// 多例
		//在多例的情况下，
		PrototypeBean protypeBean = (PrototypeBean) applicationContext.getBean("prototypeBean");
		System.out.println(protypeBean);
		PrototypeBean protypeBean2 = (PrototypeBean) applicationContext.getBean("prototypeBean");
		System.out.println(protypeBean2);
	}
}

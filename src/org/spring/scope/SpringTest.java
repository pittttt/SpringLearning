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
		// �õ�����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// �õ�bean
		// ����
		
		SingletonBean singletonBean = (SingletonBean) applicationContext.getBean("singletonBean");
		System.out.println(singletonBean);
		SingletonBean singletonBean2 = (SingletonBean) applicationContext.getBean("singletonBean");
		System.out.println(singletonBean2);
		// ����
		//�ڶ���������£�
		PrototypeBean protypeBean = (PrototypeBean) applicationContext.getBean("prototypeBean");
		System.out.println(protypeBean);
		PrototypeBean protypeBean2 = (PrototypeBean) applicationContext.getBean("prototypeBean");
		System.out.println(protypeBean2);
	}
}

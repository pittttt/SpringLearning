package org.spring.liferecycle;

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
		// 得到bean对象
		LifeRecycleBean lifeRecycleBean=(LifeRecycleBean) applicationContext.getBean("lifeRecycleBean");
		System.out.println(lifeRecycleBean);
		
		//手动关闭容器
		((ClassPathXmlApplicationContext)applicationContext).close();
		//多例无法强制销毁
		
	}
}

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
		// �õ�����
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// �õ�bean����
		LifeRecycleBean lifeRecycleBean=(LifeRecycleBean) applicationContext.getBean("lifeRecycleBean");
		System.out.println(lifeRecycleBean);
		
		//�ֶ��ر�����
		((ClassPathXmlApplicationContext)applicationContext).close();
		//�����޷�ǿ������
		
	}
}

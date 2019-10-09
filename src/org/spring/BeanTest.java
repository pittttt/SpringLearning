package org.spring;

import org.junit.Test;
import org.spring.newbean.Bean1;
import org.spring.newbean.Bean2;
import org.spring.newbean.Bean3;
import org.spring.newbean.Bean4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	@Test
	public void test() {
		// ��ӡ���bean����
		// 1�޲ι��췽ʽ
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
		System.out.println(bean1);

		// 2��̬����
		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
		System.out.println(bean2);

		// 3.ʵ������
		Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
		System.out.println(bean3);

		// 4.����bean�ķ�ʽ
		Bean4 bean4 = (Bean4) applicationContext.getBean("bean4");
		System.out.println(bean4);
	}
}

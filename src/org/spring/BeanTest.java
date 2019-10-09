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
		// 打印这个bean对象
		// 1无参构造方式
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
		System.out.println(bean1);

		// 2静态工厂
		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
		System.out.println(bean2);

		// 3.实例工厂
		Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
		System.out.println(bean3);

		// 4.工厂bean的方式
		Bean4 bean4 = (Bean4) applicationContext.getBean("bean4");
		System.out.println(bean4);
	}
}

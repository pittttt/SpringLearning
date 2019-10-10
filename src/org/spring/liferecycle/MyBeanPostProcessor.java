package org.spring.liferecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException {
		System.out.println("�ڳ�ʼ��֮����ǿ������ǿ��bean��������"+arg1);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
//		System.out.println("�ڳ�ʼ��֮ǰ����ǿ������ǿ��bean��������"+arg1);
		if(arg1.equals("lifeRecycleBean")){
			System.out.println("�ڳ�ʼ��֮ǰ����ǿ������ǿ��bean��������"+arg1);
		}
		return bean;
	}
}

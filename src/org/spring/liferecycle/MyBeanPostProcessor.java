package org.spring.liferecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException {
		System.out.println("在初始化之后被增强，被增强的bean的名字是"+arg1);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
//		System.out.println("在初始化之前被增强，被增强的bean的名字是"+arg1);
		if(arg1.equals("lifeRecycleBean")){
			System.out.println("在初始化之前被增强，被增强的bean的名字是"+arg1);
		}
		return bean;
	}
}

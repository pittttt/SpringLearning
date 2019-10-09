package org.spring.newbean;

import org.springframework.beans.factory.FactoryBean;

//工厂bean的方式实例化bean，泛型就是要实例化的对象类型
public class Bean4FactoryBean implements FactoryBean<Bean4> {

	//获取实例化对象，配置bean，得到的对象就从这里来的
	public Bean4 getObject() throws Exception {
		//初始化一些其他数据
		return new Bean4();
	}

	public Class getObjectType() {
		return null;
	}

	public boolean isSingleton() {
		return false;
	}

}

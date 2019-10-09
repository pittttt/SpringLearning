package org.spring.newbean;

//静态工厂：提供一个静态方法来实例化bean
public class Bean2Factory {

	// 该静态方法，用来获取bean2的对象
	public static Bean2 getBean2() {
		// 定制自己的工厂，更加灵活
		// 你可以在初始化这个bean的时候，做一些其他事情（初始化数据库连接、初始化一些依赖的东西）
		return new Bean2();
	}
}

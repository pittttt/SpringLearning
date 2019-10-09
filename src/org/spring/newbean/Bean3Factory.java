package org.spring.newbean;

//实例工厂，编写一个普通的方法用来初始化bean对象
public class Bean3Factory {
	public Bean3 getBean3(){
		//定制工厂:初始化一些数据等
		return new Bean3();
	}
}

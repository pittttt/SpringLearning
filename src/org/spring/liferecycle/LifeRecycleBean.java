package org.spring.liferecycle;

//测试生命周期：bean的初始化阶段和销毁阶段
public class LifeRecycleBean {

	public LifeRecycleBean() {
		System.out.println("bean的构造执行了");
	}

	public void initBean() {
		System.out.println("bean的初始化执行了");
	}
	public void destroyBean(){
		System.out.println("bean的销毁执行了");
	}
}

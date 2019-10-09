package org.spring.scope;

//多例
public class PrototypeBean {
	public PrototypeBean() {
		System.out.println("初始化了ProtypeBean");
	}
}

package org.spring.service;

import org.spring.dao.UserDao;
import org.spring.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
	//声明一个被依赖对象的引用
	private UserDao userDao;
	//提供一个setter方法:在spring容器注入dao的时候，会自动调用setter方法，将实例化好的对象，传入形参中
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	
	public void login() {
		System.out.println("service业务层被调用了");
		// 调用dao层（接口=实现类）
		//传统方式：对象自己new出来
		//UserDao userdao = new UserDaoImpl();
		
		
		//IOC方式：spring工厂方式：将new的权利将交给spring，对象从工厂获取
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取bean对象
		//UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		userDao.UserNameAndPassword();
	}

}

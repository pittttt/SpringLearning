package org.spring.service;

import org.spring.dao.UserDao;
import org.spring.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
	//����һ�����������������
	private UserDao userDao;
	//�ṩһ��setter����:��spring����ע��dao��ʱ�򣬻��Զ�����setter��������ʵ�����õĶ��󣬴����β���
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	
	public void login() {
		System.out.println("serviceҵ��㱻������");
		// ����dao�㣨�ӿ�=ʵ���ࣩ
		//��ͳ��ʽ�������Լ�new����
		//UserDao userdao = new UserDaoImpl();
		
		
		//IOC��ʽ��spring������ʽ����new��Ȩ��������spring������ӹ�����ȡ
		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡbean����
		//UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		userDao.UserNameAndPassword();
	}

}

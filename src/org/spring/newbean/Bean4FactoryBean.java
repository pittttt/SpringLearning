package org.spring.newbean;

import org.springframework.beans.factory.FactoryBean;

//����bean�ķ�ʽʵ����bean�����;���Ҫʵ�����Ķ�������
public class Bean4FactoryBean implements FactoryBean<Bean4> {

	//��ȡʵ������������bean���õ��Ķ���ʹ���������
	public Bean4 getObject() throws Exception {
		//��ʼ��һЩ��������
		return new Bean4();
	}

	public Class getObjectType() {
		return null;
	}

	public boolean isSingleton() {
		return false;
	}

}

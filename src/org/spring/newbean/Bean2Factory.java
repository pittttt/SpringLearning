package org.spring.newbean;

//��̬�������ṩһ����̬������ʵ����bean
public class Bean2Factory {

	// �þ�̬������������ȡbean2�Ķ���
	public static Bean2 getBean2() {
		// �����Լ��Ĺ������������
		// ������ڳ�ʼ�����bean��ʱ����һЩ�������飨��ʼ�����ݿ����ӡ���ʼ��һЩ�����Ķ�����
		return new Bean2();
	}
}

package org.spring.liferecycle;

//�����������ڣ�bean�ĳ�ʼ���׶κ����ٽ׶�
public class LifeRecycleBean {

	public LifeRecycleBean() {
		System.out.println("bean�Ĺ���ִ����");
	}

	public void initBean() {
		System.out.println("bean�ĳ�ʼ��ִ����");
	}
	public void destroyBean(){
		System.out.println("bean������ִ����");
	}
}

package org.spring.di;

public class Car {
	private Integer id;
	private String name;
	private Double price;

	// ����ʱ��ע������ֵ
	public Car(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}

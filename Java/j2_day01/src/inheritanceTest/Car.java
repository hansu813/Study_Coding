package inheritanceTest;

public class Car {
	
	String name;
	int price;
	String color;
	
	public Car(String name, int price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public Car() {}// �ڽ� Ŭ������ ������ �߻��ؼ� �⺻ ������ ��������.
	
	public void go() {
		System.out.println("������ ���ϴ�.");
	}
	
	public void engineOn() {
		System.out.println("����� �õ��� �׽��ϴ�.");
	}
	
	public void show() {
		System.out.println("---��������---");
		System.out.println("���� : " + name);
		System.out.println("���� : " + price);
		System.out.println("���� : " + color);
	}
	
	
	
	
	
	
}

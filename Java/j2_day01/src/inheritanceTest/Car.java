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
	
	public Car() {}// 자식 클래스에 오류가 발생해서 기본 생성자 생성해줌.
	
	public void go() {
		System.out.println("앞으로 갑니다.");
	}
	
	public void engineOn() {
		System.out.println("열쇠로 시동을 켰습니다.");
	}
	
	public void show() {
		System.out.println("---차량정보---");
		System.out.println("차주 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("색깔 : " + color);
	}
	
	
	
	
	
	
}

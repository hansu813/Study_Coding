package inheritanceTest;

public class main {
	public static void main(String[] args) {
		
		Car momCar = new Car("����",100,"blue");
		
		momCar.name = "����";
		momCar.color = "blue";
		momCar.price = 100;
		
		momCar.go();
		momCar.engineOn();
		momCar.show();
	}
}

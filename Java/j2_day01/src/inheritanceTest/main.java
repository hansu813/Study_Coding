package inheritanceTest;

public class main {
	public static void main(String[] args) {
		
		Car momCar = new Car("엄마",100,"blue");
		
		momCar.name = "엄마";
		momCar.color = "blue";
		momCar.price = 100;
		
		momCar.go();
		momCar.engineOn();
		momCar.show();
	}
}

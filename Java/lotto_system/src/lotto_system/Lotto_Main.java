package lotto_system;

public class Lotto_Main {

	public static void main(String[] args) {
		// 로또 자동과 수동 시스템 만들기.
		
		Lotto auto = new Lotto();
		auto.Auto();
		
		Lotto manual = new Lotto();
		manual.manual();
		
		Lotto point = new Lotto();
		point.point();
	}

}

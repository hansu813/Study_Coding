package day03;

public class RelOper {
	public static void main(String[] args) {
	
		//  비교 가능한 타입
		// <, >, ==, !=
		
		
		System.out.println(10 < 5);
		System.out.println(10 > 6.5);
		System.out.println(10 < 'a');
//		System.out.println(10 < "hello");
		System.out.println('a' < 'b');
		
//		System.out.println(3.14 < "hello");

//		대소 비교가 가능한 타입 : int, double, char
		
		
		System.out.println("hello" == "hello");
		// String 타입은 String 타입 끼리만 비교가 가능
		// String 타입의 관계연산자를 통한 비교는 절대적으로 바람직하지 않다.
		
		
		//String 타입이 서로 같은지 비교할 때는 반드시 메소드를 사용하자!!!!
		System.out.println("안녕".equals("안"));
		
}
}

package day03;

public class OperaterTest2 {
	public static void main(String[] args) {
		
		System.out.println("---int - ???---");
		System.out.println(10 - 10);	// int - int --> int
		System.out.println(10 - 3.14);	// int - double --> double
		System.out.println(10 - 'a');	// int - char --> int
//		System.out.println(10 - "hello");	// int - String --> 불가능
		
		
		System.out.println("---double - ???---");
		System.out.println(3.14 - 10);	// double - int --> double
		System.out.println(3.14 - 0.14);// double - double --> double
		System.out.println(3.14 - 'a');	// double - char --> double
//		System.out.println(3.14 - "hello");	// double - String --> 불가능
		
		System.out.println("---char - ???---");
		System.out.println('a' - 'A');	// char - char --> int

		System.out.println("---String - ???---");
//		System.out.println("abcd" - "ab"); 
		// String 타입은 뺄셈이 불가능하다.
		
		
		
		
	}

}

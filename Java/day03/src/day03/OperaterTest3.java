package day03;

public class OperaterTest3 {
	public static void main(String[] args) {
		System.out.println("---int * ???---");
		System.out.println(10 * 10);	// int * int --> int
		System.out.println(10 * 3.1);	// int * double --> double
		System.out.println(10 * 'a');	// int * char --> int
//		System.out.println(10 * "hello");	// int * String --> ºÒ°¡´É
		
		System.out.println("---double * ???---");
		System.out.println(3.14 * 10.2); //	double * double --> double
		System.out.println(3.14 * 'a');	// double * char --> double
		
		System.out.println("--- char * ???---");
		System.out.println('a' * 'a');	// char * char --> int
		
		
	}
}

package day03;

public class OperaterTest4 {
	public static void main(String[] args) {
		System.out.println("---int / ???---");
		System.out.println(10 / 4);	// int / int --> int ( �� ������ ����)
		System.out.println(10 / 3.14);	// int / double --> double
		System.out.println(10 / 'a');	// int / char --> int
//		System.out.println(10 / "hello");	// int / String --> ������ �Ұ���
		
		System.out.println("---double / ???---");
		System.out.println(3.14 / 10);	// double / int --> double
		System.out.println(3.14 / 10.2);	// double / double --> double
		System.out.println(3.14 / 'a');	// double / char --> double
//		System.out.println(3.14 / "hello");	//double / String --> ������ �Ұ���
		
		System.out.println("---char / ???---");
		System.out.println('a' / 10);	// char / int --> int
		System.out.println('a' / 3.14);	// char / double --> double
		System.out.println('a' / 'b');	// char / char --> int
//		System.out.println('a' / "hello");	// char / String --> ������ �Ұ���
		
		//	char --> int
		
		System.out.println(10%2);	//int % int
	}

}

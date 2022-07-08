package home_work01;
	
	import java.util.Scanner;
	
public class HomeWork01 {
public static void main(String[] args) {
	// 1. 사용자에게 두 정수를 입력 받아서 좀 더 큰 수를 출력하는 프로그램.
	Scanner sc = new Scanner(System.in);
	System.out.println("비교하실 두 정수를 입력해주세요. : ");
	int a,b;
	a = sc.nextInt();
	b = sc.nextInt();
	int c = a>b ? a : b;
	System.out.printf("두 정수 중 더 큰 정수는 %d 입니다.\n", c);
	a = 0;
	b = 0;

	// 2. 사용자에게 두 정수를 입력 받아서 두 정수의 차를 구하는 프로그램.
	System.out.println("차를 구할 두 정수를 입력해주세요. : ");
	a = sc.nextInt();
	b = sc.nextInt();
	int sub = a > b ? a - b : b - a;
	System.out.printf("두 정수의 차이는 %d 입니다.\n", sub);
	a = 0;
	b = 0;
	
	
	//3. 나이가 10 이상 25 이하면 1000원, 나머지 나이는 무료인 놀이공원이 있다.
    // 나이를 입력 받고 알맞은 금액을 출력하는 프로그램
	System.out.println("이용자의 나이를 입력해주세요. : ");
	a = sc.nextInt();
	int age = 10 <= a && a <= 25 ? 1000 : 0;
	System.out.printf("이용자가 지불하실 금액은 %d 원 입니다.\n", age);
	a = 0;
    
    //4. 사용자에게 키와 나이를 입력받아서 120cm 이상, 8살 이상이라면 탑승 가능, 아니라면 탑승 불가능을 출력하는 프로그램
    System.out.println("사용자의 키와 몸무게를 입력하여주세요. : ");
    a = sc.nextInt();
    b = sc.nextInt();
    String pos = a >= 120 && b >= 8 ? ("탑승 가능") : ("탑승 불가능");
    System.out.printf("사용자는 %s입니다.\n", pos);
    a = 0;
    b = 0;
    
    //5. 사용자에게 이름을 입력 받고 이름 "관리자"라면 관리자 모드로 전환합니다 출력하기, 아니라면 000님 환영합니다. 출력하기.
    sc.nextLine();
    System.out.println("사용자의 이름을 입력해주세요. : ");
    String name = new String(sc.nextLine());
    String manager = new String("관리자");
    String auth = name.equals(manager)? ("관리자 모드로 전환합니다.") : (name+" 님 환엽합니다.");
    System.out.println(auth);
    System.out.println("\n");
    
    //6. 사용자에게 두 정수를 입력 받아서 둘 중 더 큰 수를 출력하는 프로그램, 같다면 "같다"라고 출력하기.
    sc.nextLine();
    System.out.println("비교하실 두 정수를 입력해주세요. : ");
    a = sc.nextInt();
    b = sc.nextInt();
    String com = a > b ? a == b ? (a + "가 더 큽니다.") : (b +"가 더 큽니다.") :("같습니다.");
    System.out.printf(com);
    
     
	}
}

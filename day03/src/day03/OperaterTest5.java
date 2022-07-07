package day03;

import java.util.Scanner;

public class OperaterTest5 {
	public static void main(String[] args) {
		//1. 사용자에게 두 자릿수 정수를 입력 받고
		// 십의 자리와 일의 자리를 출력하는 프로그램 만들기
		
		//입력
		//정수입력 : 95
		///출력
		//십의 자리 : 9
		//일의 자리 : 5
		
		
		//2. 코인노래방 프로그램, 노래 한곡당 300원
		// 사용자에게 금액을 입력받고 부를 수 있는 노래 곡 수와 잔돈 출력하기
		// 입력
		// 금액 입력 : 1000
		// 출력
		// 3곡을 부를 수 있으며 잔돈 100원이 반납되었습니다.
		
		
		//3. 사용자에게 국어 수학 영어 점수를 입력받아서 평균을 구하여라
		// 입력
		// 국어 점수 :
		// 수학 점수 :
		// 영어 점수 :
		// 당신의 평균은 : 90.xx입니다.
		// 출력하기
		
		// 문제 #1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두 자리의 정수를 입력해주세요");
//		System.out.println("입력 : ");
//		int a;
//		a = sc.nextInt();
//		System.out.printf("십의 자리 : %d\n", a / 10);
//		int b = a / 10;
//		int c = a - (b * 10);
//		System.out.printf("일의 자리 : %d", c);
		
		
//		// 문제 #2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("사용하실 금액을 입력해주세요.");
//		System.out.println("입력 : ");
//		int a, b = 300;
//		a = sc.nextInt();
//		System.out.printf("%d 곡을 부를 수 있으며 잔돈 %d 원이 반환되었습니다.", a/b, a%b);
		
		// 문제 #3
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		System.out.println("국어 점수 : ");
		Double a;
		a = sc.nextDouble();
		System.out.println("수학 점수 : ");
		Double b;
		b = sc.nextDouble();
		System.out.println("영어 점수 : ");
		Double c;
		c = sc.nextDouble();
		double e = (a + b + c) / 3;
		System.out.printf("당신의 평균은 %.2f 점 입니다.", e);
		
		
		
	}

}

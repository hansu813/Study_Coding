package home_work02;

import java.util.Random;
import java.util.Scanner;

public class Atm_Machien {
	public static void main(String[] args) {
//	1. 계좌 발급받기
//	00-0000-0000 형식으로
//	비밀번호 설정하기 (4자리)
//	비밀번호 확인하기
//	계좌 개설 완료
//	랜덤하게 받기
//		만약에 틀리면 다시 비밀번호 설정
//		( 기회 3번 : 틀리면 다시 첫 화면으로 )
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int num1 = r.nextInt(100);
	int num2 = r.nextInt(10000);
	int num3 = r.nextInt(10000);
	int monney = 0;
	int bal = 0;
	int rem = 0;
	System.out.print("당신의 계좌는 ");
	if(num1 < 10) {
		System.out.print("0" + num1);
	}else {
		System.out.print(num1);
	}
	System.out.print("-");
	if(num2 < 10) {
		System.out.print("000" + num2);
	}else if(num2 < 100) {
		System.out.print("00" + num2);
	}else if(num2 < 1000) {
		System.out.print("0" + num2);
	}else {
		System.out.print(num2);
	}
	System.out.print("-");
	if(num2 < 10) {
		System.out.print("000" + num3);
	}else if(num2 < 100) {
		System.out.print("00" + num3);
	}else if(num2 < 1000) {
		System.out.print("0" + num3);
	}else {
		System.out.print(num3);
	}
	System.out.print(" 입니다.\n");
	System.out.println("숫자 4자리로 비밀번호를 설정해주세요 : ");
	int pw = sc.nextInt();
//2. 입금하기
//	계좌번호 입력
//	비밀번호 입력(제한 3회)
//	입금 금액 입력
//	입금 성공
	while(true) {
	System.out.println("입금하시려면 1번, 출금하시려면 2번, 프로그램을 종료하시려면 3번을 눌러주세요.");
	int choice = sc.nextInt();
	if(choice == 1) {
		System.out.println("입금하실 계좌를 입력해주세요 : ");
		String input = sc.next();
		System.out.println("입금하실 금액을 입력해주세요. : ");
		monney = sc.nextInt();
		System.out.println("입금 성공.");
	}		
	bal = monney; 
	
	
//
//3. 출금하기
//	계좌번호 입력
//	비밀번호 입력 ( 횟수 제한 3회)
//	출금금액 입력
//	잔액확인 후 성공 / 실패
	if(choice == 2) {
		System.out.println("출금하실 계좌의 비밀번호를 입력해주세요. : ");
		for(int i=0; i<3; i++) {
		int inputPass = sc.nextInt();
		if(inputPass == pw) {
		System.out.println("잔액 : "+monney+"원");
		System.out.println("출금하실 금액을 입력해주세요 : ");
		rem = sc.nextInt();
		if(monney > rem) {
			System.out.println("출금 성공");
			System.out.println("남은 잔액 : "+(monney-rem)+"원");
		}
		}else {
			System.out.println("비밀번호를 잘못입력하셨습니다. ("+(3-i)+"회 남음)");
			if(i==3) {
				break;
			}
		}
		}
	}
//
//4. 프로그램 종료하기
	
	else if(choice==3) {
		System.out.println("종료되었습니다.");
		break;
	}
	}
	}
}
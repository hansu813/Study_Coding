package day07;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		// 선언부
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		// 입력 --> Scanner
		// 변수 : 계좌, 비밀번호, 계좌 잔액
		// 계좌 발급 --> Random
		
		String myAccount = "";
		String pw = "";
		int wallet = 0;

		System.out.println("☆★☆★☆★ATM 기기를 시작합니다.☆★☆★☆★");
		while(true) {
			System.out.println("--main menu---");
			System.out.println("1. 계좌 개설하기");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 나가기");
			
			System.out.println("입력 >> ");
			int choice= Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				// 계좌 개설 메뉴
					
					// 비밀번호 설정 (횟수 제한 3번)
					for(int i=0; i<3; i++) {
						// 비밀번호 설정 코드
						System.out.print("설정할 비밀번호 입력 >> ");
						pw = sc.nextLine();
						System.out.print("비밀번호 확인 >> ");
						String ch_pw = sc.nextLine();
						
						if(pw.equals(ch_pw)) { 
							//비밀번호 확인후 일치할 경우 계좌 개설 후 반복 종료
							int account1 = r.nextInt(100);
							int account2 = r.nextInt(10000);
							int account3 = r.nextInt(10000);
							myAccount = String.format("%02d-%04d-%04d",account1,account2,account3);
							
							System.out.println("발급 계좌 : "+	myAccount);
							System.out.println("비밀번호 설정이 완료되었습니다.");
							break;	
						} // if
						
						if(i == 2) {
							// 횟수 제한을 초과 했을 때.
							System.out.println("횟수 제한을 초과하셨습니다.");
							break;
						} // if
						System.out.println("비밀번호가 일치하지 않습니다., 남은 기회 : "+ (2-i) +"회");
						
					}
				
			}else if(choice == 2) {
				// 입금하기 메뉴
				if(myAccount.equals("")) {
					System.out.println("계좌를 먼저 발급해주세요.");
					continue;
				}//if
				System.out.print("입급할 계좌 입력 : ");
				String inputAccount = sc.nextLine();
				
				if(inputAccount.equals(myAccount)) {
					// 비밀번호를 입력 받아야한다.
					for(int i=0; i<3; i++) {
						System.out.print("비밀번호 입력 >> ");
						String inputPw = sc.nextLine();
						
						if(inputPw.equals(pw)) {
							// 설정한 비밀번호와 입력한 비밀번호가 일치할 때.
							// 입금
							System.out.println("입금 금액 입력 >> ");
							int money = Integer.parseInt(sc.nextLine());
							wallet += money;
							System.out.println(money + "원이 정상적으로 입금되었습니다.");
							System.out.println("현재 통장 잔액 : "+wallet+"원");
							
							break;
						}
						if(i==2) {
							System.out.println("비밀번호 오류 횟수 초과, 메인 메뉴로 이동합니다.");
							break;
						}
						System.out.println("비밀번호가 일치하지 않습니다., 남은 기회 : "+ (2-i) +"회");
					}
					
				}else {
					System.out.println("해당 계좌가 없습니다.");
					continue;
				}
				
				
				
			}else if(choice == 3) {
				// 출금하기 메뉴
				if(myAccount.equals("")) {
					System.out.println("계좌를 먼저 발급해주세요.");
					continue;
				}//if
				System.out.print("출금할 계좌 입력 : ");
				String inputAccount = sc.nextLine();
				
				if(inputAccount.equals(myAccount)) {
					// 비밀번호를 입력 받아야한다.
					for(int i=0; i<3; i++) {
						System.out.print("비밀번호 입력 >> ");
						String inputPw = sc.nextLine();
						
						if(inputPw.equals(pw)) {
							// 설정한 비밀번호와 입력한 비밀번호가 일치할 때.
							// 입금
							System.out.println("출금 금액 입력 >> ");
							int money = Integer.parseInt(sc.nextLine());
							
							if(money > wallet) {
								System.out.println("잔액이 부족합니다.");
								break;
							}
							
							wallet -= money;
							System.out.println(money + "원이 정상적으로 출금되었습니다.");
							System.out.println("현재 통장 잔액 : "+wallet+"원");
							
							break;
						}
						if(i==2) {
							System.out.println("비밀번호 오류 횟수 초과, 메인 메뉴로 이동합니다.");
							break;
						}
						System.out.println("비밀번호가 일치하지 않습니다., 남은 기회 : "+ (2-i) +"회");
					}
					
				}else {
					System.out.println("해당 계좌가 없습니다.");
					continue;
				}
				
				
			}else if(choice == 4) {
				// 나가기 메뉴
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}else {
				// 잘못 입력한 경우
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				continue;
				
			}
						
		}//while
		System.out.println("ATM 프로그램을 종료합니다.");
		
	}// main 
}//ATM Class

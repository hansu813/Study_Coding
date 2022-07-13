package ioginTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 로그인 회원가입 기능 구현하기
		// 프로그램은
			// 1. 회원가입
			// 2. 로그인
			// 3. 나가기
		
			// 1. 을 누르면 이름, id, pw를 입력 받고
			// 한번에 모든 유저의 정보를 입력 받는 것이 아니라 한번에 
			// 한 유저의 정보만 입력 받도록
				// 최대 길이 4명
		User[] users = new User[4];
		
		while(true) {
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				// 1번 메뉴
				User u = new User();
				System.out.println("이름 : ");
				u.setName(sc.next());
				
				System.out.println("id : ");
				u.setId(sc.next());
				
				System.out.println("pw : ");
				u.setPw(sc.next());
				
				for(int i = 0; i < users.length; i++) {
					if(users[i] == null) {
						users[i] = u;
						break;
					}
				}
//				users[i] = u;
//				i++;
				

			}else if(choice == 2) {
				// 2번 메뉴
				
			}else if(choice == 3) {
				// 3번 메뉴
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				// 잘못 누른 경우
				System.out.println("1~3 사이의 숫자를 입력해주세요 ! ");
				continue;
			} // if문
			
			
			
			
			
		}// while
			
		
		
		
			//2. 를 누르면 아이디와 패스워드를 입력하여 학인한 후 로그인.
				// 000님 환영합니다.
	}
}

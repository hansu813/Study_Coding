package home_work01;

import java.util.Scanner;

public class HomeWork02 {
	public static void main(String[] args) {
		   // 1. 사용자에게 문자를 입력받아서
		   // 소문자라면 대문자로 변경해서 출력하고
		   // 대문자라면 소문자로 변경해서 출력
		   // 알파벳이 아니라면 그대로 출력
		   Scanner sc = new Scanner(System.in);
		   System.out.println("변경하실 알파벳을 입력해주세요 : \n");
		   char a = sc.next().charAt(0);
		   char small =(char)(a+32); 
		   char big = (char)(a-32);
		   if (a > 64 && a < 91) { 
			   System.out.println(small);
		   } else if (a > 96 && a < 123) {
			   System.out.println(big);
		   } else {
			   System.out.println(a);
		   }
		   a = 0;
		   
		   // 2. 윤년계산기
		   // 사용자에게 년도를 입력받아서
		   // 윤년인지 아닌지 출력하기
		   // 4의 배수 --> 윤년 : 4의 배수가 아니라면 평년
		   // 4의 배수이면서 100의 배수이면 --> 평년
		   // 4의 배수이면서 100의 배수이면서 400의 배수라면 윤년
		   System.out.println("계산할 년도를 입력해주세요. : \n");
		   int b = sc.nextInt();
		   if( b % 4 == 0 && b % 400 == 0) {
			   System.out.println("윤년입니다.\n");
		   }else if( b % 4 == 0 && b % 100 == 0) {
			   System.out.println("평년입니다. \n");
		   }else if( b % 4 == 0) {
			   System.out.println("윤년입니다. \n");
		   }else {
			   System.out.println("평년입니다. /n");
		   }
		   
		   // 3. 사용자에게 시간 (시간이랑 분)을 입력 받아서
		   // 입력받은 시간의 추가로 분을 입력 받아서
		   // 더한 시간을 출력
		   // 입력 시간은 24시간 형식 ex) 13시
		   // 출력 시간은 12시간 형식 ex) 오후 1시
		   //예시
		   // 시간 입력 : 10시
		   // 분입력 : 50분
		   // 추가 분 입력 : 40
		   //시간은 오전 11시 30분입니다.	
		   System.out.println("입력할 시간을 입력해주세요 : \n");
		   int clock = sc.nextInt();
		   System.out.println("입력할 분을 입력해주세요 : \n");
		   int minute = sc.nextInt();
		   System.out.println("추가하실 분을 입력해주세요. : \n");
		   int add = sc.nextInt();
		   
			if( clock >= 0 && clock < 12) {
				if( minute + add >= 60 ) {
					if( clock + 1 > 12){
						System.out.printf("시간은 오후 %d시 %d분 입니다. \n", clock - 12, minute + add - 60);
					} else {
						System.out.printf("시간은 오전 %d시 %d분 입니다. \n", clock + 1, minute + add - 60);
					}
				} else if( minute + add < 60) {
					System.out.printf("시간은 오전 %d시 %d분 입니다. \n", clock, minute + add);
				}
			} else if( clock < 24 && clock > 12) {
				if( minute + add >= 60) {
					if( clock + 1 >= 24) {
						System.out.printf("시간은 오전 %d시 %d분 입니다. \n", clock - 24, minute + add - 60);
					}else{
						System.out.printf("시간은 오후 %d시 %d분 입니다. \n", clock  - 11, minute + add - 60);
					}
				} else if( minute + add < 60) {
					System.out.printf("시간은 오후 %d시 %d분 입니다. \n", clock - 12, minute + add);
				}
			} else if( clock == 12) {
				if( minute + add >= 60) {
					System.out.printf("시간은 오후 %d시 %d분 입니다. \n", clock - 11, minute + add - 60);
				}else if( minute + add < 60) {
					System.out.printf("시간은 오후 %d시 %d분 입니다. \n", clock, minute + add);
				}
			}
		   } 
	}


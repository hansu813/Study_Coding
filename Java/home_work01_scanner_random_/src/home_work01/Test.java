package home_work01;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
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
	   } 		// 시간이 12 이상일 경우
}


package home_work01;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int b = r.nextInt(101);
		int i=0;
		while(true) {
			System.out.println("숫자를 입력하세요 : ");
			int a = sc.nextInt();
			
			if (a > b) {
				System.out.println("Down");
				i++;
			} else if(b > a) {
				System.out.println("Up");
				i++;
			} else if(a==b) {
				System.out.println("축하합니다. 정답을 "+ i +"회 만에 맞추셨습니다.");
				break;
			}
		}
		// 컴퓨터가 랜덤한 정수를 받아온 뒤 사용자가 이 숫자를 맞추는 게임.
		// 랜덤한 숫자보다 사용자가 입력한 숫자가 크다면 down을 출력
		// 랜덤한 숫자보다 사용자가 입력한 숫자가 작다면 up을 출력
		// 숫자가 같다면 축하합니다 정답을 00회 만에 맞추셨습니다.
		
		
		
	}
}

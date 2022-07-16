package coingame;

import java.util.Random;
import java.util.Scanner;
/**
 * 동전의 앞면, 뒷면을 맞추는 게임.
 * @author 김한수
 *
 */
public class Main {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int victory = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("0( 앞면 ), 1( 뒷면 ) 중 하나를 입력해주세요.");
			int coin = r.nextInt(2);

			int input = sc.nextInt();
			if (coin == input) {
				victory++;
				System.out.println("맞추셨습니다.");
			} else if (coin != input) {
				System.out.println("틀리셨습니다.");
			} else {
				System.out.println("0~1 중 하나를 입력해주세요.");
			}
			System.out.println("컴퓨터 : " + coin);
		}
		System.out.printf("승률 : %.2f", (double) (victory / 10 * 100));
	}
}

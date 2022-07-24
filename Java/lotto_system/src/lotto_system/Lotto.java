package lotto_system;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	Random auto = new Random();
	Scanner manual = new Scanner(System.in);
	int[] array = new int[6];
	int[] input = new int[6];
	int i = 0;
	private int[] points = new int[6]; // 당첨 번호
	Random point = new Random();

	/**
	 * 자동 뽑기 메소드
	 */
	public void Auto() {
		System.out.println("지금부터 번호 6개를 자동으로 뽑습니다.");
		for (i = 0; i < 6; i++) {
			array[i] = (auto.nextInt(45) + 1);
			System.out.printf("%d번째 숫자 : %d\t", i + 1, array[i]);
			if (i > 1) {
				if (array[i - 1] != 0) {
					if (array[i] == array[i - 1]) {
						i--;
					}
				}
			}
		}
	}

	/**
	 * 수동 뽑기 메소드
	 */
	public void manual() {
		System.out.println("숫자 6개를 입력해주세요.");
		for (i = 0; i < 6; i++) {
			System.out.println(i + 1 + "번째 숫자 입력 : ");
			input[i] = manual.nextInt();

			if (i > 1) {
				if (input[i] > 45 && input[i] < 1) {
					System.out.println("입력한 숫자가 범위를 벗어났습니다.");
					System.out.println("숫자를 다시 입력해주세요.");
					i--;
				}
				if (input[i] == input[i - 1]) {
					System.out.println("이미 입력한 숫자입니다.");
					System.out.println("숫자를 다시 입력해주세요.");
					i--;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d번째 숫자 %d\t", i + 1, input[i]);
		}
	}

	/**
	 * 당첨 번호
	 */
	public void point() {
		for (i = 0; i < 6; i++) {
			points[i] = point.nextInt(45) + 1;
		}
		for (i = 0; i < 6; i++) {
			System.out.printf("%d번째 숫자 %d\t", i + 1, points[i]);
		}
	}
}

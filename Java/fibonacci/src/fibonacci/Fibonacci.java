package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 피보나치 수열 두 항을 이용해서 만들기.
		int i = 0;
		int num1 = 0;
		int num2 = 1;
		System.out.println("수열을 구할 숫자를 입력해주세요 : ");
		int a = sc.nextInt();
		for (i = 0; i < a; i++) {
			System.out.println(num1 + " ");
			num1 = num1 + num2;
			num2 = num1 - num2;
		}
	}

}

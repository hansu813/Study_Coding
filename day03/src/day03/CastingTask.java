package day03;

import java.util.Scanner;

public class CastingTask {
	public static void main(String[] args) {
		// 사용자에게 소문자를 입력 받아서
		// 대문자로 변경하여 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		char small = sc.next().charAt(0);
		System.out.println((char)(small - 32));
		
		// 사용자에게 대문자 입력 받아서
		// 소문자로 출력하는 프로그램
		char big = sc.next().charAt(0);
		System.out.println((char)(big + 32));		
	}
}

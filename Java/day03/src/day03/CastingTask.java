package day03;

import java.util.Scanner;

public class CastingTask {
	public static void main(String[] args) {
		// ����ڿ��� �ҹ��ڸ� �Է� �޾Ƽ�
		// �빮�ڷ� �����Ͽ� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		char small = sc.next().charAt(0);
		System.out.println((char)(small - 32));
		
		// ����ڿ��� �빮�� �Է� �޾Ƽ�
		// �ҹ��ڷ� ����ϴ� ���α׷�
		char big = sc.next().charAt(0);
		System.out.println((char)(big + 32));		
	}
}

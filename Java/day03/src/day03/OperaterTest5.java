package day03;

import java.util.Scanner;

public class OperaterTest5 {
	public static void main(String[] args) {
		//1. ����ڿ��� �� �ڸ��� ������ �Է� �ް�
		// ���� �ڸ��� ���� �ڸ��� ����ϴ� ���α׷� �����
		
		//�Է�
		//�����Է� : 95
		///���
		//���� �ڸ� : 9
		//���� �ڸ� : 5
		
		
		//2. ���γ뷡�� ���α׷�, �뷡 �Ѱ�� 300��
		// ����ڿ��� �ݾ��� �Է¹ް� �θ� �� �ִ� �뷡 �� ���� �ܵ� ����ϱ�
		// �Է�
		// �ݾ� �Է� : 1000
		// ���
		// 3���� �θ� �� ������ �ܵ� 100���� �ݳ��Ǿ����ϴ�.
		
		
		//3. ����ڿ��� ���� ���� ���� ������ �Է¹޾Ƽ� ����� ���Ͽ���
		// �Է�
		// ���� ���� :
		// ���� ���� :
		// ���� ���� :
		// ����� ����� : 90.xx�Դϴ�.
		// ����ϱ�
		
		// ���� #1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�� �ڸ��� ������ �Է����ּ���");
//		System.out.println("�Է� : ");
//		int a;
//		a = sc.nextInt();
//		System.out.printf("���� �ڸ� : %d\n", a / 10);
//		int b = a / 10;
//		int c = a - (b * 10);
//		System.out.printf("���� �ڸ� : %d", c);
		
		
//		// ���� #2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("����Ͻ� �ݾ��� �Է����ּ���.");
//		System.out.println("�Է� : ");
//		int a, b = 300;
//		a = sc.nextInt();
//		System.out.printf("%d ���� �θ� �� ������ �ܵ� %d ���� ��ȯ�Ǿ����ϴ�.", a/b, a%b);
		
		// ���� #3
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���.");
		System.out.println("���� ���� : ");
		Double a;
		a = sc.nextDouble();
		System.out.println("���� ���� : ");
		Double b;
		b = sc.nextDouble();
		System.out.println("���� ���� : ");
		Double c;
		c = sc.nextDouble();
		double e = (a + b + c) / 3;
		System.out.printf("����� ����� %.2f �� �Դϴ�.", e);
		
		
		
	}

}

package ioginTest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �α��� ȸ������ ��� �����ϱ�
		// ���α׷���
			// 1. ȸ������
			// 2. �α���
			// 3. ������
		
			// 1. �� ������ �̸�, id, pw�� �Է� �ް�
			// �ѹ��� ��� ������ ������ �Է� �޴� ���� �ƴ϶� �ѹ��� 
			// �� ������ ������ �Է� �޵���
				// �ִ� ���� 4��
		User[] users = new User[4];
		
		while(true) {
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				// 1�� �޴�
				User u = new User();
				System.out.println("�̸� : ");
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
				// 2�� �޴�
				
			}else if(choice == 3) {
				// 3�� �޴�
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				// �߸� ���� ���
				System.out.println("1~3 ������ ���ڸ� �Է����ּ��� ! ");
				continue;
			} // if��
			
			
			
			
			
		}// while
			
		
		
		
			//2. �� ������ ���̵�� �н����带 �Է��Ͽ� ������ �� �α���.
				// 000�� ȯ���մϴ�.
	}
}

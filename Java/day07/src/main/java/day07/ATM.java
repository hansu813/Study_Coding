package day07;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		// �����
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		// �Է� --> Scanner
		// ���� : ����, ��й�ȣ, ���� �ܾ�
		// ���� �߱� --> Random
		
		String myAccount = "";
		String pw = "";
		int wallet = 0;

		System.out.println("�١ڡ١ڡ١�ATM ��⸦ �����մϴ�.�١ڡ١ڡ١�");
		while(true) {
			System.out.println("--main menu---");
			System.out.println("1. ���� �����ϱ�");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("3. ����ϱ�");
			System.out.println("4. ������");
			
			System.out.println("�Է� >> ");
			int choice= Integer.parseInt(sc.nextLine());
			
			if(choice == 1) {
				// ���� ���� �޴�
					
					// ��й�ȣ ���� (Ƚ�� ���� 3��)
					for(int i=0; i<3; i++) {
						// ��й�ȣ ���� �ڵ�
						System.out.print("������ ��й�ȣ �Է� >> ");
						pw = sc.nextLine();
						System.out.print("��й�ȣ Ȯ�� >> ");
						String ch_pw = sc.nextLine();
						
						if(pw.equals(ch_pw)) { 
							//��й�ȣ Ȯ���� ��ġ�� ��� ���� ���� �� �ݺ� ����
							int account1 = r.nextInt(100);
							int account2 = r.nextInt(10000);
							int account3 = r.nextInt(10000);
							myAccount = String.format("%02d-%04d-%04d",account1,account2,account3);
							
							System.out.println("�߱� ���� : "+	myAccount);
							System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
							break;	
						} // if
						
						if(i == 2) {
							// Ƚ�� ������ �ʰ� ���� ��.
							System.out.println("Ƚ�� ������ �ʰ��ϼ̽��ϴ�.");
							break;
						} // if
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�., ���� ��ȸ : "+ (2-i) +"ȸ");
						
					}
				
			}else if(choice == 2) {
				// �Ա��ϱ� �޴�
				if(myAccount.equals("")) {
					System.out.println("���¸� ���� �߱����ּ���.");
					continue;
				}//if
				System.out.print("�Ա��� ���� �Է� : ");
				String inputAccount = sc.nextLine();
				
				if(inputAccount.equals(myAccount)) {
					// ��й�ȣ�� �Է� �޾ƾ��Ѵ�.
					for(int i=0; i<3; i++) {
						System.out.print("��й�ȣ �Է� >> ");
						String inputPw = sc.nextLine();
						
						if(inputPw.equals(pw)) {
							// ������ ��й�ȣ�� �Է��� ��й�ȣ�� ��ġ�� ��.
							// �Ա�
							System.out.println("�Ա� �ݾ� �Է� >> ");
							int money = Integer.parseInt(sc.nextLine());
							wallet += money;
							System.out.println(money + "���� ���������� �ԱݵǾ����ϴ�.");
							System.out.println("���� ���� �ܾ� : "+wallet+"��");
							
							break;
						}
						if(i==2) {
							System.out.println("��й�ȣ ���� Ƚ�� �ʰ�, ���� �޴��� �̵��մϴ�.");
							break;
						}
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�., ���� ��ȸ : "+ (2-i) +"ȸ");
					}
					
				}else {
					System.out.println("�ش� ���°� �����ϴ�.");
					continue;
				}
				
				
				
			}else if(choice == 3) {
				// ����ϱ� �޴�
				if(myAccount.equals("")) {
					System.out.println("���¸� ���� �߱����ּ���.");
					continue;
				}//if
				System.out.print("����� ���� �Է� : ");
				String inputAccount = sc.nextLine();
				
				if(inputAccount.equals(myAccount)) {
					// ��й�ȣ�� �Է� �޾ƾ��Ѵ�.
					for(int i=0; i<3; i++) {
						System.out.print("��й�ȣ �Է� >> ");
						String inputPw = sc.nextLine();
						
						if(inputPw.equals(pw)) {
							// ������ ��й�ȣ�� �Է��� ��й�ȣ�� ��ġ�� ��.
							// �Ա�
							System.out.println("��� �ݾ� �Է� >> ");
							int money = Integer.parseInt(sc.nextLine());
							
							if(money > wallet) {
								System.out.println("�ܾ��� �����մϴ�.");
								break;
							}
							
							wallet -= money;
							System.out.println(money + "���� ���������� ��ݵǾ����ϴ�.");
							System.out.println("���� ���� �ܾ� : "+wallet+"��");
							
							break;
						}
						if(i==2) {
							System.out.println("��й�ȣ ���� Ƚ�� �ʰ�, ���� �޴��� �̵��մϴ�.");
							break;
						}
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�., ���� ��ȸ : "+ (2-i) +"ȸ");
					}
					
				}else {
					System.out.println("�ش� ���°� �����ϴ�.");
					continue;
				}
				
				
			}else if(choice == 4) {
				// ������ �޴�
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
			}else {
				// �߸� �Է��� ���
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
				
			}
						
		}//while
		System.out.println("ATM ���α׷��� �����մϴ�.");
		
	}// main 
}//ATM Class

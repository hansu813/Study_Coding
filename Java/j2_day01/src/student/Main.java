package student;

public class Main {
	public static void main(String[] args) {
		// �л��� 3���� �ִ�.
		// ��ö�� ���� : 100, ���� 70, ���� : 50
		// �ڿ��� ���� : 100, ���� : 100, ���� : 100
		// ȫ�浿 ���� : 50, ���� : 70, ���� : 60
		Student kim = new Student("��ö��", 100, 70, 50);
		Student park = new Student("�ڿ���",100,100,100);
		Student hong = new Student("ȫ�浿", 50, 70, 60);
		// �ش� ������ ���� kim, park, hong �̶�� ��ü�� �����ϰ�
		// �ش� �л��� ���� ���� ( ����, ����, ���� ����, ������� ) ����ϴ� �޼ҵ�
		kim.show();
		park.show();
		hong.show();
		
	}
}

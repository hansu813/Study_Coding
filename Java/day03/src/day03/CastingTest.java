package day03;

public class CastingTest {
	public static void main(String[] args) {
		System.out.println((int)3.14);
		System.out.println((double)97);
		System.out.println((char)97.8);
//		System.out.println((String)97);
		// String Ÿ������ ����ȯ�� �Ұ���
		
		
		// int --> String
		System.out.println(Integer.toString(50) + 20);
		// String --> int
		System.out.println(Integer.parseInt("100") + 50);
		// double --> String
		System.out.println(Double.toString(3.14) + 10);
		// String --> double
		System.out.println(Double.parseDouble("3.14") + 10);
		
		//���� �����ڸ� Ȱ���Ͽ� ����ȯ, �Ϲ��� ����ȯ.
		System.out.println("3.14");
		// ���� ĳ����(auto casting)
		
	}
}

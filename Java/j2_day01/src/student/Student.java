package student;

public class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	 public void show() {
		 System.out.print(name + " �л��� ������ ");
		 System.out.print("����" + kor + "�� ");
		 System.out.print("����" + eng + "�� ");
		 System.out.print("����" + math + "�� ");
		 System.out.print("��� ������ " + (kor + eng + math)/3 + "���Դϴ�. \n");
	 }
}

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
		 System.out.print(name + " 학생의 점수는 ");
		 System.out.print("국어" + kor + "점 ");
		 System.out.print("영어" + eng + "점 ");
		 System.out.print("수학" + math + "점 ");
		 System.out.print("평균 점수는 " + (kor + eng + math)/3 + "점입니다. \n");
	 }
}

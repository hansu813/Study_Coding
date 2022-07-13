package student;

public class Main {
	public static void main(String[] args) {
		// 학생이 3명이 있다.
		// 김철수 국어 : 100, 영어 70, 수학 : 50
		// 박영희 국어 : 100, 영어 : 100, 수학 : 100
		// 홍길동 국어 : 50, 영어 : 70, 수학 : 60
		Student kim = new Student("김철수", 100, 70, 50);
		Student park = new Student("박영희",100,100,100);
		Student hong = new Student("홍길동", 50, 70, 60);
		// 해당 값들을 각각 kim, park, hong 이라는 객체에 저장하고
		// 해당 학생의 성적 정보 ( 국어, 영어, 수학 점수, 평균점수 ) 출력하는 메소드
		kim.show();
		park.show();
		hong.show();
		
	}
}

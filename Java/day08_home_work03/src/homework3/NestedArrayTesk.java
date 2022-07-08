package homework3;

import java.util.Scanner;

public class NestedArrayTesk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int choice = 0;
		int sum = 0;
		int[][] scores = new int[4][3];
		String[] subjects = {"국어","영어","수학"};
	
		// 학생 성적 입줄력 프로그램
		// 학생 4명, 과목은 3개
		// 	국어, 영어, 수학
		//{
		//	{100,100,100}
		//	{90,90,90}
		//	{80,80,80}
		//	{70,70,70}
		//}
		// 학생 성적 입력하기(한번에 전부 다 입력)
		// 학생 성적 평균 보기(몇번 학생의 평균을 보시겠습니까?)
		System.out.println("----<학생 성적 입출력 프로그램>----");
		System.out.println("학생의 국어, 영어, 수학 성적을 차례대로 입력해주세요. >> ");
		
		for(i=0; i<4; i++) {
			System.out.println((i+1)+"번째 학생 점수 입력");
			for(int j=0; j<3; j++) {
				System.out.print(subjects[j] +"점수 >>");
				scores[i][j] = sc.nextInt();
			}
		}
		System.out.println("몇번 학생의 평균을 보시겠습니까? >> ");
		choice = sc.nextInt();
		for(int a=0; a<3; a++) {
			sum += scores[choice-1][a];
		}
		System.out.printf("%d번 학생의 평점은 %.2f점입니다.",choice,sum/3.0);
	}
}

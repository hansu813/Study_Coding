package casting_alpabet;

import java.util.Scanner;

/**
 * @author 김한수
 */
public class CastingAlpabet {
	public static void main(String[] args) {
		/**
		 * 알파벳을 입력받고 소문자는 대문자로, 대문자는 소문자로 변경해주는 프로그램
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("변경을 원하는 알파벳을 입력해주세요. : ");
		char alpabet = sc.next().charAt(0);

		if (alpabet >= 65 && alpabet <= 90) { // 대문자를 입력한 경우
			System.out.println((char) (alpabet + 32));
		} else if (alpabet >= 97 && alpabet <= 122) { // 소문자를 입력한 경우
			System.out.println((char) (alpabet - 32));
		} else { // 알파벳을 입력하지 않은 경우
			System.out.println("알파벳을 입력해주세요.");
		}
	}
}

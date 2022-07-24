package phoneNumberSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 이름과 전화번호를 입력 받아서 저장하는 프로그램
 * 
 * @author 김한수
 *
 */
public class Main {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		String name = null;
		String phoneNum = null;
		File number = new File("number.txt");
		Scanner input = new Scanner(System.in);
		boolean cheak = true;

		try {
			fw = new FileWriter(number);
			bw = new BufferedWriter(fw);

			while (cheak) {
				System.out.println("이름을 입력해주세요.");
				System.out.println("시스템 종료를 원하시면 '종료'를 입력해주세요.");
				name = input.nextLine();
				if (name.equals("종료")) {
					break;
				}
				System.out.println("전화번호를 입력해주세요.");
				System.out.println("시스템 종료를 원하시면 '종료'를 입력해주세요.");
				phoneNum = input.nextLine();
				if (phoneNum.equals("종료")) {
					break;
				}

				bw.write("이름 : " + name + "\t");
				bw.write("전화번호 : " + phoneNum + "\t");
				bw.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) bw.close();
				if (fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

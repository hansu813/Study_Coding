package overwatch_minigame;

import java.util.Scanner;

public class Aplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * 변수 선언부
		 */
		int choice = 0, action;
		boolean cheak = true;
		/**
		 * 캐릭터 설정 변수
		 */
		DPS[] dCharacter = new DPS[3];
		Tanker[] tCharacter = new Tanker[3];
		Healer[] hCharacter = new Healer[3];
		OverWatch player = new OverWatch();
		/**
		 * 딜러 객체
		 */
		dCharacter[0] = new DPS();
		dCharacter[0].name = "리퍼";
		dCharacter[1] = new DPS();
		dCharacter[1].name = "맥크리";
		dCharacter[2] = new DPS();
		dCharacter[2].name = "파라";

		/**
		 * 탱커 객체
		 */
		tCharacter[0] = new Tanker();
		tCharacter[0].name = "라인하르트";
		tCharacter[1] = new Tanker();
		tCharacter[1].name = "디바";
		tCharacter[2] = new Tanker();
		tCharacter[2].name = "윈스턴";

		/**
		 * 힐러 객체
		 */
		hCharacter[0] = new Healer();
		hCharacter[0].name = "루시우";
		hCharacter[1] = new Healer();
		hCharacter[1].name = "젠야타";
		hCharacter[2] = new Healer();
		hCharacter[2].name = "메르시";

		/**
		 * 게임 시작 화면 코딩( 역할군 )
		 */
		System.out.println("게임을 진행할 역할군을 정해주세요.");
		System.out.println("1. 딜러");
		System.out.println("2. 탱커");
		System.out.println("3. 힐러");
		System.out.println("입력 : ");
		choice = sc.nextInt();

		if (choice == 1) { // 딜러 선택
			System.out.println("캐릭터를 선택해주세요.");
			for (int i = 0; i < dCharacter.length; i++) {
				System.out.println(i + 1 + ". " + dCharacter[i].getName());
			}
			while (cheak) {
				System.out.println("입력 : ");
				choice = sc.nextInt();
				if (choice == 1) { // 딜러 [0] 선택
					player = dCharacter[0];
					System.out.println(dCharacter[0].getName() + "(을)를 선택하셨습니다.");
					cheak = false;
				} else if (choice == 2) { // 딜러 [1] 선택
					player = dCharacter[1];
					System.out.println(dCharacter[1].getName() + "(을)를 선택하셨습니다.");
					cheak = false;
				} else if (choice == 3) { // 딜러 [2] 선택
					player = dCharacter[2];
					System.out.println(dCharacter[2].getName() + "(을)를 선택하셨습니다.");
					cheak = false;
				} else {
					System.out.println("잘못 입력하셨습니다. \n 다시 선택해주세요.");
					cheak = true;
				}
			}
		} else if (choice == 2) { // 탱커 선택
			System.out.println("캐릭터를 선택해주세요.");
			for (int i = 0; i < tCharacter.length; i++) {
				System.out.println(i + 1 + ". " + tCharacter[i].getName());
			}
			while (cheak) {
				System.out.println("입력 : ");
				choice = sc.nextInt();
				if (choice == 1) { // 딜러 [0] 선택
					player = tCharacter[0];
					System.out.println(tCharacter[0].getName() + "(을)를 선택하셨습니다.");
					cheak = false;
				} else if (choice == 2) { // 딜러 [1] 선택
					player = tCharacter[1];
					System.out.println(tCharacter[1].getName() + "(을)를 선택하셨습니다.");
					cheak = false;
				} else if (choice == 3) { // 딜러 [2] 선택
					player = tCharacter[2];
					System.out.println(tCharacter[2].getName() + "(을)를 선택하셨습니다.");
					cheak = false;
				} else {
					System.out.println("잘못 입력하셨습니다. \n 다시 선택해주세요.");
					cheak = true;
				}
			}
		} else if (choice == 3) { // 힐러 선택
			System.out.println("캐릭터를 선택해주세요.");
			for (int i = 0; i < hCharacter.length; i++) {
				System.out.println(i + 1 + ". " + hCharacter[i].getName());
			}
			while (cheak) {
				System.out.println("입력 : ");
				choice = sc.nextInt();
				if (choice == 1) { // 딜러 [0] 선택
					player = hCharacter[0];
					System.out.println(hCharacter[0].getName() + "(을)를 선택하셨습니다.");
					cheak = false;
				} else if (choice == 2) { // 딜러 [1] 선택
					player = hCharacter[1];
					System.out.println(hCharacter[1].getName() + "(을)를 선택하셨습니다.");
					cheak = false;
				} else if (choice == 3) { // 딜러 [2] 선택
					player = hCharacter[2];
					System.out.println(hCharacter[2].getName() + "(을)를 선택하셨습니다.");
					cheak = false;
				} else {
					System.out.println("잘못 입력하셨습니다. \n 다시 선택해주세요.");
					cheak = true;
				}
			}
		}

		while (true) {
			System.out.println("--- " + player.getName() + "의 행 동 ---");
			System.out.println("1. 공격하기");
			System.out.println("2. 회복하기");
			System.out.println("3. 특수공격");
			System.out.println("10.게임종료");
			System.out.print("입력 : ");
			action = sc.nextInt();

			if (action == 1) { // 공격하기
				player.attack();
				System.out.println("---" + player.getName() + "의 현재 상태 ---");
				System.out.println(player.getName() + "의 현재 체력 : " + player.getHp());
				System.out.println(player.getName() + "의 남은 공격 : " + player.getAtCnt());
			} else if (action == 2) { // 회복하기
				player.healing();
				System.out.println("---" + player.getName() + "의 현재 상태 ---");
				System.out.println(player.getName() + "의 현재 체력 : " + player.getHp());
				System.out.println(player.getName() + "의 남은 공격 : " + player.getAtCnt());
			} else if (action == 3) { // 특수공격
				player.specialAtk();
				System.out.println("---" + player.getName() + "의 현재 상태 ---");
				System.out.println(player.getName() + "의 현재 체력 : " + player.getHp());
				System.out.println(player.getName() + "의 남은 공격 : " + player.getAtCnt());
			} else if (action == 10) {// 게임종료
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}

		} // end while
		boolean cancle = false;
		System.out.println("게임을 종료합니다.");
	}
}

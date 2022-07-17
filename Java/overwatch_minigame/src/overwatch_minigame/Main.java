package overwatch_minigame;

import java.util.Scanner;

/**
 * @author 김한수 오버워치 미니게임
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		boolean cheak = true;
		boolean cancle = true;
//		객체 생성
		Character[] ch = new Character[9];
		Character player = new Character();

		for (int i = 0; i < 3; i++) {
			ch[i] = new Dealer();
		}
		for (int i = 3; i < 6; i++) {
			ch[i] = new Healer();
		}
		for (int i = 6; i < 9; i++) {
			ch[i] = new Tanker();
		}
//		딜러 객체
		ch[0].name = "리퍼";
		ch[0].script ="전투 준비는 끝났다...";
		ch[1].name = "파라";
		ch[1].script ="하늘에서 정의가 빗발친다 ! ";
		ch[2].name = "맥크리";
		ch[2].script ="석양이 진다...";
//		힐러 객체
		ch[3].name = "루시우";
		ch[3].script ="오우~ 신나게 놀아볼까?";
		ch[4].name = "젠야타";
		ch[4].script ="우주와 하나가 되시오";
		ch[5].name = "메르시";
		ch[5].script ="영웅은 죽지 않아요.";
//		탱커 객체
		ch[6].name = "라인하르트";
		ch[6].script ="두려워 말게. 내가 그대들의 방패라네!";
		ch[7].name = "디바";
		ch[7].script ="시동 걸고~";
		ch[8].name = "윈스턴";
		ch[8].script ="제가 잠시 이성을 잃었나 봅니다.";

//		시작화면
		System.out.println("게임을 진행할 역할군을 정해주세요.");
		System.out.println("1) 딜러");
		System.out.println("2) 힐러");
		System.out.println("3) 탱커");
		System.out.println("입력 : ");
		choice = sc.nextInt();

		if (choice == 1) { // 딜러 선택
			System.out.println("캐릭터를 선택해주세요.");
			for (int i = 0; i < 3; i++) {
				System.out.println(i + 1 + ") " + ch[i].name);
			}
			while (cheak) {
				System.out.println("입력 : ");
				choice = sc.nextInt();
				if (choice == 1) {
					player = ch[0];
					player.hp();
					player.atCnt();
					System.out.println(player.name + " 선택.");
					System.out.println(player.script);
					cheak = false;
				} else if (choice == 2) {
					player = ch[1];
					player.hp();
					player.atCnt();
					System.out.println(player.name + " 선택.");
					System.out.println(player.script);
					cheak = false;
				} else if (choice == 3) {
					player = ch[2];
					player.hp();
					player.atCnt();
					System.out.println(player.name + " 선택.");
					System.out.println(player.script);
					cheak = false;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
					cheak = true;
				}
			} // end while
		} else if (choice == 2) { // 힐러 선택
			System.out.println("캐릭터를 선택해주세요.");
			for (int i = 3; i < 6; i++) {
				int j = 0;
				j++;
				System.out.println(j + 1 + ") " + ch[i].name);
			}
			while (cheak) {
				System.out.println("입력 : ");
				choice = sc.nextInt();
				if (choice == 1) {
					player = ch[3];
					player.hp();
					player.atCnt();
					System.out.println(player.name + " 선택.");
					System.out.println(player.script);
					cheak = false;
				} else if (choice == 2) {
					player = ch[4];
					player.hp();
					player.atCnt();
					System.out.println(player.name + " 선택.");
					System.out.println(player.script);
					cheak = false;
				} else if (choice == 3) {
					player = ch[5];
					player.hp();
					player.atCnt();
					System.out.println(player.name + " 선택.");
					System.out.println(player.script);
					cheak = false;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
					cheak = true;
				}
			} // end while
		} else if (choice == 3) { // 탱커 선택
			System.out.println("캐릭터를 선택해주세요.");
			for (int i = 6; i < 9; i++) {
				int j = 0;
				j++;
				System.out.println(j + 1 + ") " + ch[i].name);
			}
			while (cheak) {
				System.out.println("입력 : ");
				choice = sc.nextInt();
				if (choice == 1) {
					player = ch[6];
					player.hp();
					player.atCnt();
					System.out.println(player.name + " 선택.");
					System.out.println(player.script);
					cheak = false;
				} else if (choice == 2) {
					player = ch[7];
					player.hp();
					player.atCnt();
					System.out.println(player.name + " 선택.");
					System.out.println(player.script);
					cheak = false;
				} else if (choice == 3) {
					player = ch[8];
					player.hp();
					player.atCnt();
					System.out.println(player.name + " 선택.");
					System.out.println(player.script);
					cheak = false;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 선택해주세요.");
					cheak = true;
				}
			} // end while
		}

		while (cancle) { // 게임 화면
			System.out.println("===" + player.name + "의 행동===");
			System.out.println("1) 공격하기");
			System.out.println("2) 회복하기");
			System.out.println("3) 특수공격");
			System.out.println("9) 게임종료");
			System.out.println("입력 : ");
			choice = sc.nextInt();

			if (choice == 1) { // 공격하기
				player.attack();
				System.out.println("===" + player.name + "의 현재 상태 ===");
				System.out.println("남은 체력 : " + player.hp);
				System.out.println("남은 공격 : " + player.atCnt);
			} else if (choice == 2) { // 회복하기
				player.Heal();
				System.out.println("===" + player.name + "의 현재 상태 ===");
				System.out.println("남은 체력 : " + player.hp);
				System.out.println("남은 공격 : " + player.atCnt);
			} else if (choice == 3) { // 특수공격
				player.ability();
				System.out.println("===" + player.name + "의 현재 상태 ===");
				System.out.println("남은 체력 : " + player.hp);
				System.out.println("남은 공격 : " + player.atCnt);
			} else if (choice == 9) { // 게임 종료
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
			
			if(player.hp == 0) {
				System.out.println("남은 체력이 없습니다.. 게임을 종료합니다.");
				break;
			}else if(player.atCnt == 0) {
				System.out.println("남은 공격이 없습니다.. 게임을 종료합니다.");
				break;
			}
		}
		System.out.println("게임을 종료합니다.");
		cancle = false;
	}
}

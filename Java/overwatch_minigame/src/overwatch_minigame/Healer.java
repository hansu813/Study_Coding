package overwatch_minigame;

public class Healer extends OverWatch {
	// 힐러 포지션
	public Healer() {
		super();
	}

	int hp = 200;
	int atCnt = 30;

	public void attack() {
		System.out.println(name + "의 공격 !");
		System.out.println(super.hp + " - 10");
		System.out.println(super.atCnt + " - 10");
	}

	public void healing() {
		System.out.println(name + "의 회복하기 !");
		System.out.println(super.hp + " + 50");
		System.out.println(super.atCnt + " + 5");
	}

	public void specialAtk() {
		System.out.println(name + "의 특수 공격 !");
		for (int i = 0; i < 6; i++) {
			System.out.println("===");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(super.atCnt + " + 20");
		// 5sec
	}
}

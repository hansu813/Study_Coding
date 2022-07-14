package overwatch_minigame;

public class Tanker extends OverWatch {
	// 탱커 포지션
	public Tanker() {
		super();
	}

	int hp = 500;
	int atCnt = 50;

	public void attack() {
		System.out.println(name + "의 공격 !");
		System.out.println(super.hp + " - 20");
		super.hp -= 20;
		System.out.println(super.atCnt + "- 10");
		super.atCnt -= 10;
	}

	public void healing() {
		System.out.println(name + "의 회복하기 !");
		System.out.println(super.hp + " + 10");
		super.hp += 10;
		System.out.println(super.atCnt + " + 10");
		super.atCnt += 10;
	}

	public void specialAtk() {
		System.out.println(name + "의 특수 공격 !");
		for (int i = 0; i < 20; i++) {
			System.out.println("===");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(super.atCnt + " + 20");
		super.atCnt += 20;
	}
	// 10sec
}

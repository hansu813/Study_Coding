package overwatch_minigame;

/**
 * 오버워치 딜러 포지션
 * 
 * @author 김한수
 *
 */
public class DPS extends OverWatch {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DPS(String name) {
		super();
	}

	int hp = 200;
	int atCnt = 100;

	public DPS() {
	}

	/**
	 * 공격 메소드
	 */
	public void attack() {
		System.out.println(name + "의 공격 !");
		System.out.println(super.hp + " - 50");
		System.out.println(super.atCnt + " - 10");
	}

	/**
	 * 힐링 메소드
	 */
	public void healing() {
		System.out.println(name + "의 회복하기 !");
		System.out.println(super.hp + " + 10");
		System.out.println(super.atCnt + " + 10");
	}

	/**
	 * 특수 공격 메소드
	 */
	public void specialAtk() {
		System.out.println(name + "의 특수 공격 !");
		for (int i = 0; i < 10; i++) {
			System.out.println("===");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(super.atCnt + " + 20");
	}
	// 3sec

}

package overwatch_minigame;

public class OverWatch {
	int hp; // 체력
	int atCnt; // 공격 횟수
	String name; // 캐릭터 객체 이름

	public void attack() {
		System.out.println("공격하기 !");
	}

	public void healing() {
		System.out.println("회복하기 !");
	}

	public void specialAtk() {
		System.out.println("특수 공격 !");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtCnt() {
		return atCnt;
	}

	public void setAtCnt(int atCnt) {
		this.atCnt = atCnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println(hp);
		System.out.println(atCnt);
	}

}

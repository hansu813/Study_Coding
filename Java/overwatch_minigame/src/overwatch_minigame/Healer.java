package overwatch_minigame;

public class Healer extends Character {
	public Healer() {
		super();
	}

	@Override
	public void hp() {
		// TODO Auto-generated method stub
		super.hp();
	}

	@Override
	public void atCnt() {
		// TODO Auto-generated method stub
		super.atCnt();
	}

	@Override
	public void ability() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(script);
		atCnt += 20;
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		hp -= 10;
		atCnt -= 10;
	}
	
	@Override
	public void Heal() {
		// TODO Auto-generated method stub
		hp += 50;
		atCnt += 5;
	}
}

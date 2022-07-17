package overwatch_minigame;

public class Dealer extends Character {
	public Dealer() {
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
		atCnt = 100;
	}

	@Override
	public void ability() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++)
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		atCnt += 20;
		System.out.println(script);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		hp -= 50;
		atCnt -= 10;
	}
	
	@Override
	public void Heal() {
		// TODO Auto-generated method stub
		hp += 10;
		atCnt += 10;
	}
}

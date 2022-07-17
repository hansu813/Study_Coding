package overwatch_minigame;

public class Tanker extends Character {
	public Tanker() {
		super();
	}

	@Override
	public void hp() {
		// TODO Auto-generated method stub
		hp = 500;
	}

	@Override
	public void atCnt() {
		// TODO Auto-generated method stub
		atCnt = 50;
	}

	@Override
	public void ability() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++)
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
		hp -= 20;
		atCnt -= 10;
	}
	
	@Override
	public void Heal() {
		// TODO Auto-generated method stub
		hp += 10;
		atCnt += 10;
	}
}

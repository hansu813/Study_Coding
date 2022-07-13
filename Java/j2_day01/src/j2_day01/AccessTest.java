package j2_day01;

public class AccessTest {
	public int pubV = 10;
	protected int proV = 11;
	int defV = 12;	// default
	private int priV = 13;
	
	public void method() {
		System.out.println(pubV);
		System.out.println(proV);
		System.out.println(defV);
		System.out.println(priV);
	}
}

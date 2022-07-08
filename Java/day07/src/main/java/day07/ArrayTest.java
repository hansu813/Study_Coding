package day07;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] scores = {80, 70, 80};
		
//		System.out.println(scores[1]);
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		scores[2] = 100;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
	}
}

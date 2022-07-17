package yut_play;

import java.util.Random;

public class Yut_Play {
	public static void main(String[] args) {
		// 네 개의 윷을 던져서 배(0)와 등(1)이 나오는 숫자를
		// 세어 도,개,걸,윷,모를 결정
		Random r = new Random();
		int[] yut = new int[4];
		int sum = 0;
		String[] play = new String[4];
		
		yut[0] = r.nextInt(2);
		yut[1] = r.nextInt(2);
		yut[2] = r.nextInt(2);
		yut[3] = r.nextInt(2);
		
		for(int i=0; i<yut.length; i++) {
			if(yut[i] == 0) {
				play[i] = "배";
			}else if(yut[i]==1) {
				play[i] = "등";
			}
		}
		
		for(int i=0; i<yut.length; i++) {
			System.out.print(play[i] + " ");
			sum += yut[i];
		}
		System.out.println();
		
		if(sum == 0) {
			System.out.println("윷! 알을 4칸 전진시켜주세요.");
		}else if(sum == 1) {
			System.out.println("걸! 알을 3칸 전진시켜주세요.");
		}else if(sum == 2) {
			System.out.println("개! 알을 2칸 전진시켜주세요.");
		}else if(sum == 3) {
			System.out.println("도! 알을 1칸 전진시켜주세요.");
		}else if(sum == 4) {
			System.out.println("모! 알을 5칸 전진시켜주세요.");
		}
	}
}

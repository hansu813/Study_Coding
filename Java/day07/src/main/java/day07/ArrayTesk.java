package day07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTesk {
	public static void main(String[] args) {
		// 배열을 만들어서
		// array -> {10,20,30,40,50,60}
		
		// 배열의 모양대로 출력하기
		// 출력 -> {10,20,30,40,50,60}
		
		int[] array = {10,20,30,40,50,60};
//		System.out.print("{");
//		for (int i = 0; i < array.length; i++) {
//			if(i+1 == array.length) {
//			System.out.print(array[i]);
//			}else {
//				System.out.print(array[i]+", ");
//			}
//		}
		
//		for (int i =0; i < array.length - 1; i++) {
//			System.out.print(" " + array[i] + ",");
//		}
//		System.out.print(" " + array[array.length - 1] +" " );
//		System.out.print("}");
		
		
		String ar = Arrays.toString(array);
		System.out.println(ar);
		
	}
}

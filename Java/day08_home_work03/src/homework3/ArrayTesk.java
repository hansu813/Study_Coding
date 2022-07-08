package homework3;

public class ArrayTesk {
	public static void main(String[] args) {		
		char[] alphabets = {'a','D', '*', 'x'};
		int i = 0;
		int arr = alphabets.length;
		// 해당 배열에 소문자는 대문자로, 대문자는 소문자로
		// 그 외의 문자는 그대로
		// 배열의 모양대로 출력
		
		for (i = 0; i < arr; i++) {
			if(alphabets[i]<91 && alphabets[i]>64) {
				alphabets[i] = (char)(alphabets[i] + 32);
			}else if(alphabets[i]<123 && alphabets[i]>96) {
				alphabets[i] = (char)(alphabets[i]-32);
			}else {
				continue;
			}
		}
		System.out.print("{");
		for (int j=0; j<arr; j++) {
			if(j<arr-1) {
				System.out.print("'"+ alphabets[j] + "', ");
			}else if(j == arr-1){
				System.out.print("'"+ alphabets[j] +"'");
			}
		}
		System.out.print("}");
	}	
}


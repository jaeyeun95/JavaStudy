package day4;

public class ForTest2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if( (i%2) ==0) {
				sum = sum + i;
			}
		}
		
		System.out.println("1~100 사이 짝수의 합 : " + sum);
	}

}

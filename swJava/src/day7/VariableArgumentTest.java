package day7;

public class VariableArgumentTest {
//	public static int intSum(int... num) {
//		int sum = 0;
//		for (int i = 0; i < num.length; i++) {
//			sum = sum + num[i];
//		}
//		return sum;
//	}
	public static double scoreSum(double... score) {
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
//		System.out.println(intSum(1));
//		System.out.println(intSum(1,2));
//		System.out.println(intSum(1,2,3));
		
		System.out.println("국어 점수 총합 : " + scoreSum(80,60,90));
		System.out.println("영어 점수 총합 : " + scoreSum(80,100,100));
		System.out.println("자바 점수 총합 : " + scoreSum(54.2 , 78.5));
		
	}
}

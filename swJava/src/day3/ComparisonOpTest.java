package day3;

public class ComparisonOpTest {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 13;
		int num3 = 13;
		
		System.out.println("9 > 13 : " + (num1 > num2));
		System.out.println("9 >= 13 : " + (num1 >= num2));
		System.out.println("9 < 13 : " + (num1 < num2));
		System.out.println("13 <= 13 : " + (num1 <= num2));
		System.out.println("9 == 13 : "+ (num1 == num2));
		System.out.println("13 == 13 : "+ (num2 == num3));
		System.out.println("9 != 13 : "+ (num1 != num2));
	}

}

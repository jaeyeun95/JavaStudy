package day3;

public class LogicalOpTest {
	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 2;
		int num3 = 0;
		System.out.println((num1 == num2) && ((num1 / num3) > 0));	// 9 == 2가 false이므로 && 오른쪽 연산은 수행하지 않음
//		System.out.println((num1 == num2) & ((num1 / num3) > 0));   // 9를 0으로 나누려하니 오류발생
		
		System.out.println((num1 != num2) || ((num1 / num3) > 0));	// 9 != 2 참이므로 오른쪽 실행 X
//		System.out.println((num1 != num2) | ((num1 / num3) > 0));
		
	}

}

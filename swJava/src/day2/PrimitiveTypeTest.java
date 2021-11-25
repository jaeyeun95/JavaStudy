package day2;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		// int num = 2147483648;	// int 형의  표현범위를 초과한 값을 가질경우 컴파일 오류 발생
		
		int num1 = 2147483647;
		int num2 = 1;
		
		int num3 = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}

}

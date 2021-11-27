package day3;

public class CommandLineArgTest {
	public static void main(String[] args) {
		
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			int sum = num1 + num2;
			System.out.println("매개변수로 받은 정수의 합 : " + sum);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러 : " + e);
		}
		
	}

}

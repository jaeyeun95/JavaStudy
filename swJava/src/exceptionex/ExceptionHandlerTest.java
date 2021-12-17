package exceptionex;

public class ExceptionHandlerTest {
    public static void main(String[] args) {
        System.out.println("program start...");
        try {
            int num1 = 9;
            int num2 = 0;
            System.out.println("나누기 결과 : " + (num1 / num2));
            
        } catch (ArithmeticException e) {
            System.out.println("정수를 0으로 나눌 수는 없습니다.");
        }
        System.out.println("program end...");
    }
    
}

package chapter5.classpart;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다.");

        // 빼기
        minus(num1, num2);
        // 곱하기
        multiple(num1, num2);

        FunctionTest ft = new FunctionTest();
        // 나누기
        ft.devide(num1, num2);
    }

    public static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public static void minus(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("빼기");
        System.out.println(n1 + " - " + n2 + " = " + result);
    }

    static void multiple(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("곱하기");
        System.out.println(n1 + " X " + n2 + " = " + result);
    }

    void devide(int n1, int n2) {
        int result = n1 / n2;
        System.out.println("나누기");
        System.out.println(n1 + " / " + n2 + " = " + result);

    }

}

package chapter4.loopex;

public class ContinueExample {
    public static void main(String[] args) {
        int total = 0;
        int num;

        for (num = 1; num <= 100; num++) {
            if (num % 2 == 0)
                continue;
            total += num;
        }

        System.out.println("1부터 100까지 홀수의 합은 : " + total + "입니다.");

        System.out.println("3의 배수만 출력");

        // int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

}

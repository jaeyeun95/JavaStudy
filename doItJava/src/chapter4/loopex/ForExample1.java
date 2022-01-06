package chapter4.loopex;

public class ForExample1 {
    public static void main(String[] args) {
        int i, sum;

        for (i = 1, sum = 0; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

        System.out.println("-------------------------");

        for (int j = 1; j <= 10; j++) {
            System.out.println("안녕하세요" + j);
        }

    }

}

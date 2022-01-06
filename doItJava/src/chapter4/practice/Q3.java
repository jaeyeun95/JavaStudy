package chapter4.practice;

public class Q3 {
    public static void main(String[] args) {
        // 구구단을 단 보다 곱한느 수가 작거나 같은 경우까지만 출력

        int dan, times;

        for (dan = 2; dan <= 9; dan++) {
            for (times = 1; times <= 9; times++) {
                if (dan >= times)
                    System.out.print(dan + " * " + times + " = " + (dan * times) + " ");
            }
            System.out.println();
        }
    }

}

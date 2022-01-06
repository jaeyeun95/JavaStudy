package chapter4.practice;

public class Q2 {
    public static void main(String[] args) {
        // 구구단 짝수단만 출력 continue 문 사용
        int dan, times;

        for (dan = 1; dan <= 9; dan++) {
            if (dan % 2 != 0) {
                continue;
            }
            for (times = 1; times <= 9; times++) {
                System.out.print(dan + " * " + times + " = " + (dan * times) + " ");
            }
            System.out.println();
        }
    }

}

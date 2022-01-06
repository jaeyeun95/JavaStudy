package chapter4.loopex;

public class BreakExample2 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;

        for (num = 0;; num++) {
            sum += num;
            if (sum >= 100)
                break;
        }
        System.out.println("num : " + num);
        System.out.println("sum : " + sum);

        System.out.println("P122 1분 복습");

        // 1부터 더했을 때 그 합이 500이 넘는 자연수는 무엇인가요?

        int total = 0;
        int n;

        for (n = 1; total < 500; n++) {
            total += n;
            if (total >= 500)
                break;
        }

        System.out.println("total : " + total);
        System.out.println("n : " + n);
    }

}

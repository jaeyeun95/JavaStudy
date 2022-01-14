package chapter7.exercise.q3;

public class Q3 {
    public static void main(String[] args) {
        // 배열의 길이가 5인 정수형 배열
        int[] arr = { 2, 4, 6, 8, 10 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }

}

package chapter7.array;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = { "Java", "Android", "C", "JavaScript", "Python" };

        for (String lang : strArray) {
            System.out.println(lang);
        }

        // 1분 복습
        int[] numArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int number : numArray) {
            System.out.println(number);
        }
    }

}

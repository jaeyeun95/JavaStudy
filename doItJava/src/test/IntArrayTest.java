package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntArrayTest {
    public static void main(String[] args) {
        // for문 사용
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // 스트림 사용
//        Arrays.stream(arr).forEach(n -> System.out.println("스트림 사용 : " + n));

        int[] arr = {1, 2, 3, 4, 5};

        int sumVal = Arrays.stream(arr).sum();
        int count = (int)Arrays.stream(arr).count();

        System.out.println("sumVal : " + sumVal);
        System.out.println("count : " + count);

        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println("s : " + s));
        stream.sorted().forEach(s -> System.out.println("s2 " + s));


    }
}

package practice;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("score", 100);
        System.out.println("1 : " + map);

        map.put("score", 0);
        System.out.println("1 : " + map);

        int score = 10;
        map.put("score", 20 + score);

        System.out.println("1 : " + map);


    }
}

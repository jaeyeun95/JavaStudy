package collectionex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("정길용", "010-1234-5567");
        map.put("강성윤", "010-2222-5567");
        map.put("채규태", "010-3333-5567");

        Set<String> keys = map.keySet();
        System.out.println(keys.toString());

        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("=============================== LinkedHashMap =================");

        // LinkedHashMap 
        // HashMap과의 차이는 입력한 순서대로 출려된다
        LinkedHashMap<String, String> map2 = new LinkedHashMap<>();
        map2.put("강성윤", "010-2222-5567");
        map2.put("채규태", "010-3333-5567");
        map2.put("정길용", "010-1234-5567");

        Set<String> keys2 = map2.keySet();
        System.out.println(keys2.toString());

        Iterator<String> it2 = keys.iterator();
        while (it2.hasNext()){
            String key2 = (String) it2.next();
            System.out.println(key2 + " : " + map2.get(key2));
        }
        System.out.println("=============================== TreeMap =================");

        // TreeMap 
        // 오름차순 정렬
        TreeMap<String, String> map3 = new TreeMap<>();
        map3.put("강성윤", "010-2222-5567");
        map3.put("채규태", "010-3333-5567");
        map2.put("정길용", "010-1234-5567");

        Set<String> keys3 = map3.keySet();
        System.out.println(keys3.toString());

        Iterator<String> it3 = keys.iterator();
        while (it3.hasNext()){
            String key3 = (String) it3.next();
            System.out.println(key3 + " : " + map3.get(key3));
        }
    }
    
}

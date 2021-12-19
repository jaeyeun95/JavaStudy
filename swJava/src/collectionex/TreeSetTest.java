package collectionex;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("9.5");
        set.add("8.4");
        set.add("9.2");
        set.add("9.5"); 
        set.add("6.7"); 
        System.out.println(set.toString());

        set.remove("9.2");
        System.out.println(set.toString());
    }
    
}

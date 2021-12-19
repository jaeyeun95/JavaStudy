package collectionex;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("9.5");
        set.add("8.4");
        set.add("9.2");
        set.add("9.5"); // set 은 중복저장 허용 x
        
        set.add("6.7");
        System.out.println(set.toString());
        
        set.remove("9.2");
        System.out.println(set.toString());
        
        System.out.println("LinkedHashSet");
        // LinkedHashSet
        LinkedHashSet<String> link = new LinkedHashSet<String>();
        link.add("9.5");
        link.add("8.4");
        link.add("9.2");
        link.add("9.5"); 
        link.add("6.7"); 
        System.out.println(link.toString());

        link.remove("9.2");
        System.out.println(link.toString());
    }
    
}

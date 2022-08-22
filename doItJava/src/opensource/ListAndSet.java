package opensource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(1);
        intList.add(2);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(1);
        intSet.add(2);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);

        System.out.println("intList : " + intList);
        System.out.println("intSet : " + intSet);
    }
}

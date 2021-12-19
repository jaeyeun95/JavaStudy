package collectionex;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
    public static void main(String[] args) {
        LinkedList<Double> socreList = new LinkedList<Double>();
        socreList.add(new Double(9.5));
        socreList.add(new Double(7.5));
        socreList.add(new Double(8.2));
        System.out.println(socreList.toString());

        double sum = 0;
        Iterator<Double> it = socreList.iterator();
        while( it.hasNext()){
            sum += it.next();
        }
        System.out.println("점수의 총합 : " +sum);
    }
    
}

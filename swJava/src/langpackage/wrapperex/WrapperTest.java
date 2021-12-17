package langpackage.wrapperex;

public class WrapperTest {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("TRUE");
        Boolean b2 = new Boolean("???");
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        Double d = new Double(10.0);

        System.out.println("Boolean 객체 : " + b1);
        System.out.println("Boolean 객체 : " + b2);
        System.out.println("Integer 객체 : " + i1);
        System.out.println("Double 객체 : " + d);

        System.out.println("int의 최대값 : " + Integer.MAX_VALUE);
        System.out.println("int의 최소값 : " + Integer.MIN_VALUE);

        if(i1.equals(i2)) System.out.println("같다");
        System.out.println("a문자가 대문자인가 : " + Character.isUpperCase('a'));
        System.out.println("-1의 이진수 " + Integer.toBinaryString(-1));
        System.out.println("String 3.14를 실수로 변환 : " + Double.parseDouble("3.14"));
    }
    
}

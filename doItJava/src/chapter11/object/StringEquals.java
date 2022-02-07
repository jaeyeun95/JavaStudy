package chapter11.object;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";

        System.out.println(str1 == str2);   // 두 인스턴스의 주소 값이 같은지 비교
        System.out.println(str1.equals(str2));  // 두 인스턴스의 문자열 값이 같은지 비교

        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}

package chapter13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        // 클래스로 구현하기
        StringConCatImpl concat1 = new StringConCatImpl();
        concat1.makeString(s1,s2);

        System.out.println("--------------- 람다");

        // 람다식으로 구현하기
        StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
        concat2.makeString(s1, s2);
    }
}

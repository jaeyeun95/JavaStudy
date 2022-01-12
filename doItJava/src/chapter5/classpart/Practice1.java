package chapter5.classpart;

class Man {
    int age; // 나이
    String name; // 이름
    Boolean isMarried; // 결혼 여부
    int numberOfChildren; // 자식수
}

public class Practice1 {
    public static void main(String[] args) {
        Man man = new Man();
        man.age = 40;
        man.name = "홍길동";
        man.isMarried = true;
        man.numberOfChildren = 3;

        String married = man.isMarried == true ? "결혼함" : "결혼 안함";

        System.out.println("이 사람의 나이 : " + man.age);
        System.out.println("이 사람의 이름 : " + man.name);
        System.out.println("이 사람의 결혼 여부 : " + married);
        System.out.println("이 사람의 자녀 수 : " + man.numberOfChildren);

    }

}

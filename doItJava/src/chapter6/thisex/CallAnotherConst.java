package chapter6.thisex;

class Person {
    String name;
    int age;

    Person() {
        this("이름 없음", 1); // this를 사용해 아래의 Person(String,int) 생성자 호출
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person returnSelf() {
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person noName = new Person();
        System.out.println(noName.name);
        System.out.println(noName.age);

        Person p = noName.returnSelf();
        System.out.println(p);
        System.out.println(noName);
    }

}

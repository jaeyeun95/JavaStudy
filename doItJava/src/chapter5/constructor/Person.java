package chapter5.constructor;

public class Person {
    String name;
    float height;
    float weight;

    public Person() { // 디폴트 생성자
    }

    public Person(String pname) { // 매개변수가 있는 생성자
        name = pname;
    }

    // Alone
    public Person(String name, float height, float weight) { // 매개변수가 있는 생성자
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

}

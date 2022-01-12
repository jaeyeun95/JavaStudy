package chapter5.constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person kim = new Person(); // 생성자
        kim.name = "김유신";
        kim.weight = 85.5f;
        kim.height = 180.0f;

        Person lee = new Person("이순신", 175, 75);

        // Alone
        Person developer = new Person("재윤", 181, 80);
    }

}

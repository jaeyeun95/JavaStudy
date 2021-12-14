package day9.castingex;

class Parent {
    int num = 10;

    void printNum(){
        System.out.println(num);
    }
}

class Child extends Parent {
    int num = 20;
    void printNum(){
        System.out.println(num);
    }
}

public class ObjectCastTest {

    public static void main(String[] args) {
        // Parent p = new Parent();
        // p.printNum();
        // System.out.println(p.num);

        // Child c = new Child();
        // c.printNum();
        // System.out.println(c.num);
        Parent p = new Child(); // child 객체를 생성하여 부모 클래스인 Parent 타입의 변수에 할당함
        p.printNum();
        System.out.println(p.num);  // child 객체에 overriding 된 printNum() 메서드 호출과 num 변수의 값을 출력함
    }
    
}

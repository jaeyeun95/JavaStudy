package day9.innerclassex;

class Outside {
    // 내부 클래스
    public class Inside{

    }
}

class Animal{
    void performBehavior(){
        // 이름이 있는 지역 내부 클래스
        class Brain{

        }
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        // 내부 클래스의 객체 생성을 위해 외부 클래스의 객체를 생성해야 함
        Outside outer = new Outside();
        Outside.Inside inner = outer.new Inside();

        Animal a = new Animal();
        a.performBehavior();
    }
    
}

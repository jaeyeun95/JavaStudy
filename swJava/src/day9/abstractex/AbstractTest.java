package day9.abstractex;

abstract class AbstractClass{
    public void methodA(){}
    public abstract void methodB();
}
public class AbstractTest{
    public static void main(String[] args) {
        // AbstractClass ab = new AbstractClass(); // 추상 클래슨느 객체를 생성할 수 없음
        // ab.methodA();
        // ab.methodB();
        
    }
}

abstract class SuperClass {
    public void methodA(){
        System.out.println("methodA() 실행");
    }

    public abstract void methodB();
}

class SubClass extends SuperClass {

    @Override
    public void methodB() {
        System.out.println("methodB() 실행");
    }
    
}
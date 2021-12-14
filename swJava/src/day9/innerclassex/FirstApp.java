package day9.innerclassex;

class Outside{
    // static 내부 클래스
    public static class StaticInner{

    }
}

public class FirstApp {
    public static void main(String[] args) {
        // static 내부 클래스 객체를 생성할 때는 외부 클래스의 객체를 생성하지 않아도 생성
        Outside.StaticInner sinner = new Outside.StaticInner();
    }
    
}

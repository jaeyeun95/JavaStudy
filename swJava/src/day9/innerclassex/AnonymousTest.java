package day9.innerclassex;

abstract class TV{
    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void volumeUp();
    public abstract void volumeDown();
}

public class AnonymousTest {

    public static void watchTV(TV tv){
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }
    public static void main(String[] args) {
        // 이름이 없는 지역 내부 클래스 객체 생성
        watchTV(new TV(){

            @Override
            public void powerOn() {
                System.out.println("전원을 켠다.");
            }       

            @Override
            public void powerOff() {
                System.out.println("전원을 끈다.");
            }

            @Override
            public void volumeUp() {
                System.out.println("소리를 높인다.");
            }

            @Override
            public void volumeDown() {
                System.out.println("소리를 낮춘다.");
            }
            
        });
    }
    
}

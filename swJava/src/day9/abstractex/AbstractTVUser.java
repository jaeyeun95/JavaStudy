package day9.abstractex;

import java.util.Scanner;

abstract class TV {
    // TV 추상 클래스를 정의하고 모든 TV 클래스에 공통으로 포함되어야할 메서드들을 추상 메서드로 정의한다.
    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void volumeUp();
    public abstract void volumeDown();
}

// TV 클래스를 상속하여 S_TV 클래스를 정의한다.
class S_TV extends TV {

    @Override
    public void powerOn() {
        System.out.println("S_TV --- 전원을 켠다.");
    }
    
    @Override
    public void powerOff() {
        System.out.println("S_TV --- 전원을 끈다.");
    }

    @Override
    public void volumeUp() {
        System.out.println("S_TV --- 소리를 높인다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("S_TV --- 소리를 낮춘다.");
    }
    
}

// TV 클래스를 상속하여 L_TV 클래스를 정의한다.
class L_TV extends TV{
    @Override
    public void powerOn() {
        System.out.println("L_TV --- 전원을 켠다.");
    }
    
    @Override
    public void powerOff() {
        System.out.println("L_TV --- 전원을 끈다.");
    }
    
    @Override
    public void volumeUp() {
        System.out.println("L_TV --- 소리를 높인다.");
    }
    
    @Override
    public void volumeDown() {
        System.out.println("L_TV --- 소리를 낮춘다.");
    }

}

class TVFactory {
    public TV getTV(String tvName){
        if(tvName.equals("A사")){
            return new S_TV();
        } else if (tvName.equals("B사")){
            return new L_TV();
        }
        return null;
    }
}

public class AbstractTVUser {
    public static void main(String[] args) {
        // S_TV tv = new S_TV();
        // L_TV tv = new L_TV();

        Scanner sc = new Scanner(System.in);

        String tvName = sc.nextLine();

        TVFactory factory = new TVFactory();
        TV tv = factory.getTV(tvName);
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();

        sc.close();
    }
}

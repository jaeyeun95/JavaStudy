package interface_polymorphism.interfaceex;

interface Drawable {
    // 멤버 변수를 상수로 선언
    // static final 은 생략 가능
    public static final int PLAIN_PEN = 1;
    public int BOARD_PEN = 2;
    public int ITALIC_PEN = 3;
    // abstrct 예약어는 생략 가능
    public void draw();
    public abstract void move(int x, int y);
    
}

class Shape {
    int x = 0;
    int y = 0;

    Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Circle extends Shape implements Drawable{
    int radius;

    Circle(int x, int y, int radius){
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("(" + x + ", " + y + ") radius = " + radius);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("(" + (this.x + x) + ", " + (this.y + y) + ") radius = " + radius);
    }
}

class Rectangle extends Shape implements Drawable{
    int width;
    int hegith;
    
    Rectangle(int x, int y, int width, int heigth){
        super(x, y);
        this.width = width;
        this.hegith = heigth;
    }
    @Override
    public void draw() {
        System.out.println("(" + x + ", " + y + ") width = " + width + ", height = " + hegith);
    }
    @Override
    public void move(int x, int y) {
        System.out.println("(" + (this.x + x) + ", " + (this.y + y) + ") width = " + width + ", heigth = " + hegith);
    }
}

public class InterfaceEx1 {
    public static void main(String[] args) {
        Circle c = new Circle(10, 10, 100);
        c.draw();
        c.move(5, 5);

        Rectangle r = new Rectangle(20, 20, 50, 50);
        r.draw();
        r.move(5, 10);

        // Drawable 타입의 d 변수에 Circle 객체를 할당
        Drawable d = new Circle(10, 10, 100);
        d.draw();
        d.move(5, 5);

        // Drawable 타입의 d 변수에 Rectangle 객체 생성
        d = new Rectangle(20, 20, 50, 50);
        d.draw();
        d.move(5, 10);
    }

}
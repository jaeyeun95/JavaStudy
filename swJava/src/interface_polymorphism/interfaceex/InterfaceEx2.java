package interface_polymorphism.interfaceex;

interface Paintable{
    public void paint();
}

interface Drawable {
    public static final int PLAIN_PEN = 1;
    public int BOARD_PEN = 2;
    public int ITALIC_PEN = 3;
    public void draw();
    public abstract void move(int x, int y);
    
}

interface Printable extends Paintable, Drawable {
    public void print();
}

// Circle 클래스가 Printable 을 구현
class Circle implements Printable {

    @Override
    public void paint() {
        System.out.println("원을 색칠합니다.");
    }
    
    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }
    
    @Override
    public void move(int x, int y) {
        System.out.println("원을 이동합니다 : : (" + x + ", " + y + ")");
        
    }

    @Override
    public void print() {
        System.out.println("원을 출력합니다.");
    }
    
}

public class InterfaceEx2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.move(5, 5);
        c.paint();
        c.print();
        
    }
}

package day8;

class Shape{
	int x =0;
	int y =0;
	
	Shape(){
		this(0,0);
	}
	
	Shape(int x, int y){	// 부모 클래스인 Shape에서 x,y 좌표 값을 매개변수로 받은 값으로 초기화하는 생성자를 선언함
		this.x = x;
		this.y = y;
	}
}

class Circle extends Shape{
	int radius;
	Circle(int x, int y, int radius){
//		super(x,y);	// 부모 클래스인 Shape의 두 번째 생성자를 명시적으로 호출하여 x,y 좌표를 초기화함
		
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println(x + ", " + y + " 좌표에 반지름이 " + radius + "인  원을 그린다.");
	}
	
}

class Test{
//	public static void main(String[] args) {
//		Circle c = new Circle(200, 500, 100);
//		c.draw();
//	}
}

public class SuperConstructorTest {
	public static void main(String[] args) {
		Circle c = new Circle(200, 500, 100);
		c.draw();
	}
}

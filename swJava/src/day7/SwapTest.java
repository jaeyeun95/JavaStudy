package day7;

class Pair{
	int x;
	int y;
	
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class SwapTest {
	public static void swap(int x, int y) {	// int 유형의 매개변수를 입력받아서 그 값을 바꾸는 swap 메서드를 생성함
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
	}
	public static void swap(Pair p) {	// Pair 객체를 매개변수로 입력받아서 객체 변수 값을 서로 바꾸는 swqp 메서드를 Overloading 함
		int tmp;
		
		tmp = p.x;
		p.x = p.y;
		p.y = tmp;
	}
	public static void main(String[] args) {
		int x = 10, y =20;	// -> x,y 값과 Pair 객체를 초기화 함
		Pair p = new Pair(10, 20);
		
		System.out.println("before: x, y (" + x + ", " + y + ")");
		System.out.println("/tPair(" + p.x + ", " + p.y + ")");
		
		swap(x,y);
		swap(p);
		
		System.out.println("before: x, y (" + x + ", " + y + ")");
		System.out.println("/tPair(" + p.x + ", " + p.y + ")");
	}

}

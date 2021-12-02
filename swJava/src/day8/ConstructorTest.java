package day8;

class SuperClass{
	int num1;
	
	public SuperClass() {
		System.out.println("SuperClass 객체 생성");
		num1 = 100;
	}
}

class SubClass extends SuperClass{
	int num2;
	
	public SubClass() {
		System.out.println("SubClass 객체 생성");
		num2 = 10000;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		System.out.println(sub.num1);
		System.out.println(sub.num2);
	}

}

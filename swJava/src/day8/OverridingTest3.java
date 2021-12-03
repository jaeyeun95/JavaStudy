package day8;
class SuperClass1{
	void print(String str) {
		System.out.println("SuperClass 의 print(String s) 호출");
	}
}

class SubClass1 extends SuperClass1{
	void print() {
		System.out.println("SubClass 의 print() 호출");
	}
}

public class OverridingTest3 {
	public static void main(String[] args) {
		SubClass1 sub = new SubClass1();
		sub.print("테스트");
		sub.print();
	}

}

package day6;

public class Car {
	String name;
	int speed;
	public void printInfo() {
		System.out.println(name + "의 현재 속도 : " + speed);
	}

class Taxi extends Car{
	int currentOil;
	
	public void printInfo() {
		System.out.println(name + "의 현재 속도 : " + speed);
		System.out.println(name + "의 현재 연료: " + currentOil);
	}
}

}

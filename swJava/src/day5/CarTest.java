package day5;

public class CarTest {
	public static void main(String[] args) {
		// Car 객체(instance) 생성
		Car2 myCar = new Car2();
		
		// 초기 값 설정
		myCar.name = "Red";
		myCar.currentGear = 0;
		myCar.currentSpeed = 0;
		
		// 메서드 호출
		myCar.startEngine();
		System.out.println(myCar.getCurrentState());
		myCar.changeGear(2);
		System.out.println(myCar.getCurrentState());
		myCar.changeGear(3);
		System.out.println(myCar.getCurrentState());
		myCar.stopEngine();
		System.out.println(myCar.getCurrentState());
		
		// Car 객체 생성
		Taxi myTaxi = new Taxi();
		
		//초기 값 설정
		myTaxi.name = "대현 운수 308";
		myTaxi.currentGear = 2;
		myTaxi.fare = 3400;
		myTaxi.passengerYn = true;
		System.out.println(myTaxi.getCurrentState());
		
		// 운전자 객체 생성
		Driver kim = new Driver();
		kim.name = "성나정";
		
		System.out.println(kim.name + "이 운전합니다.");
		kim.driving();
	}

}

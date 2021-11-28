package day5;

public class Car {
	// 멤버 변수 선언
	public String name; 	// public 예약어를 통한 정보 공개
	private int currentSpeed;	// 은닉할 변수
	public int currentGear;	// 공개할 변수
	
	// 메서드 선언
	// 공개할 메서드
	public void startEngine() {
		System.out.println("-> " + name + "의 시동을 켠다.");
		currentSpeed = 1;
	}
	
	// 공개할 메서드
	public void changeGear(int gear) {
		System.out.println("-> 기어를 " + gear + "단으로 변경한다.");
		currentGear = gear;
	}
	
	// 은닉할 메서드
	private int getCurrentSpeed() {
		currentSpeed = currentSpeed + (currentGear * 10);
		return currentSpeed;
	}
	
	// 공개할 메서드
	public void stopEngine() {
		System.out.println("-> " + name + "의 시동을 끈다.");
		currentSpeed = 0;
	}
	
	// 공개할 메서드
	public String getCurrentState() {
		return name + "의 현재 속도 : " + getCurrentSpeed();
	}

}

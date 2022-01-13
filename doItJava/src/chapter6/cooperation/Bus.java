package chapter6.cooperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // 승객이 버스에 탄 경우
    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    // 버스 정보 출력
    public void showInfo() {
        System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 "
                + money + "입니다.");
    }

}

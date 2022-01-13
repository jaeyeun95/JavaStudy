package chapter6.cooperation;

public class Subway {
    String lineNumber; // 노선
    int passengerCount;
    int money;

    public Subway(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    // 승객이 지하철을 탄 경우
    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    // 지하철 정보 출력
    public void showInfo() {
        System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 "
                + money + "입니다.");
    }

}

package chapter6.cooperation;

public class Taxi {
    int money;
    String taxiName;

    public Taxi(String taxiName) {
        this.taxiName = taxiName;
    }

    public void take(int money) {
        this.money += money;
    }

    // 택시 정보를 출력하는 함수
    public void showInfo() {
        System.out.println(taxiName + " 택시 수입은 " + money + "입니다.");
    }

}

package chapter6.singleton;

public class Car {
    // 자동차 번호 10001부터 시작
    private static int serialNum = 10000;
    private int carNo;

    public Car() {
        serialNum++;
        carNo = serialNum;
    }

    public int getCarNum() {
        return carNo;
    }

    public void setCarNum(int carNo) {
        this.carNo = carNo;
    }
}

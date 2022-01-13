package chapter6.cooperation;

public class Student {
    public String studentName;
    public int grade;
    public int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    // 학생이 버스를 탔을 때 1000원 지불하는 기능을 구현한 메서드
    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    // 학생이 지하철 타면 1500원을 지불하는 메서드
    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    // 학생이 택시를 타면 10000원을 지불하는 메서드
    public void takeTaxi(Taxi taxi) {
        taxi.take(1000);
        this.money -= 10000;
    }

    // 학생 정보 출력
    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
    }

}

package chapter6.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Thomas", 10000);
        Student edward = new Student("Edward", 10000);

        // 버스를 탄 제임스, 버스 와 학생의 정보 출력
        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        james.showInfo();
        bus100.showInfo();

        System.out.println();

        // 지하철을 탄 토마스, 지하철과 토마스 정보 출력
        Subway subway = new Subway("2호선");
        tomas.takeSubway(subway);
        tomas.showInfo();
        subway.showInfo();

        System.out.println();

        // Edward가 택시를 탄 경우
        Taxi taxi = new Taxi("개인택시");
        edward.takeTaxi(taxi);
        edward.showInfo();
        taxi.showInfo();
    }

}

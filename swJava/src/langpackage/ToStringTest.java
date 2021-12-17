package langpackage;

class Car{
    String name;
    int speed;

    public Car (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car 객체의 정보" + name + ", speed=" + speed + "]";
    }
    

}



public class ToStringTest {
    public static void main(String[] args) {
        Car car = new Car("red", 220);

        System.out.println(car.toString());
        System.out.println(car);
    
    }
    
}

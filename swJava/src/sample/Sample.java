package sample;

class Car{
    String color;
    int size;
    public Car (){}
    public Car(String color, int size){
        this.color = color;
        this.size = size;
    }

}

public class Sample {
    public static void main(String[] args) {
        Car car1 = new Car("Red", 220);
        Car car2 = new Car("Red", 220);    

        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));

    }
    
}

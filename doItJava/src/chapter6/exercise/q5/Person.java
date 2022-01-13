package chapter6.exercise.q5;

public class Person {
    String name;
    int money;

    Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffee(StarCafe starCafe, int money) {
        this.money -= money;
        System.out.println(name + "씨는 " + starCafe.order(money));
    }

    public void buyCongCoffee(StarCafe starCafe, int money) {
        this.money -= money;
        System.out.println(name + "씨는 " + starCafe.order(money));
    }

}

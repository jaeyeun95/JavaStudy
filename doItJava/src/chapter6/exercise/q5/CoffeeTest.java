package chapter6.exercise.q5;

public class CoffeeTest {
    public static void main(String[] args) {
        // 김씨가 별다방에서 4000원 주고 아메리카노를 사먹었다.
        Person kim = new Person("kim", 10000);

        StarCafe starCafe = new StarCafe();
        StarCafe congCafe = new StarCafe();

        kim.buyStarCoffee(starCafe, 4500);
        kim.buyStarCoffee(congCafe, 4000);

        // 이씨가 콩다방에서 4500원 주고 라떼를 마셨다.
        Person lee = new Person("lee", 4000);
        lee.buyCongCoffee(starCafe, 4000);
    }

}

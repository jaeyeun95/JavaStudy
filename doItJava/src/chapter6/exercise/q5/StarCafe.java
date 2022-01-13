package chapter6.exercise.q5;

public class StarCafe {
    int money;

    public String order(int money) {
        if (money == Menu.AMERICANO_PRICE) {
            return "별 카페에서 아메리카노를 사먹었습니다.";
        } else if (money < Menu.AMERICANO_PRICE) {
            return "잔액이 부족합니다.";
        } else if (money == Menu.LATTE_PRICE) {
            return "별 카페에서 라떼를 사먹었습니다.";
        } else {
            return "아무것도 사먹지 않았습니다.";
        }
    }

}

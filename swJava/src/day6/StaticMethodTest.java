package day6;

class Dice{
	public static int dotCount = 5;
	public static int rollingCount = 0;
	
	public static void playGame() {
		dotCount++; // 클래스 변수로 선언된 dotCount 변수는 playGame()메서드에서 접근 가능
		rollingCount++;
		System.out.println("생성된 숫자 : " + rollingDice());
	}
	
	public static int rollingDice() {
		int generateNum = (int)(Math.random() * 6) + 1;
		return generateNum;
	}
}

public class StaticMethodTest {
	public static void main(String[] args) {
		Dice.playGame();
	}

}

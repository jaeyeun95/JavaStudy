package day3;

public class BasicArrayTest {
	public static void main(String[] args) {
		int[] scoreList = {80, 95, 68, 100, 54};
//		scoreList = new int[5];
//		
//		scoreList[0] = 80;
//		scoreList[1] = 95;
//		scoreList[2] = 68;
//		scoreList[3] = 100;
//		scoreList[4] = 54;
		System.out.println("scoreList 길이 = " + scoreList.length);
		
		System.out.println("< scoreList 배열 요소 출력 >");
		System.out.print(scoreList[0] + "\t");
		System.out.print(scoreList[1] + "\t");
		System.out.print(scoreList[2] + "\t");
		System.out.print(scoreList[3] + "\t");
		System.out.print(scoreList[4]);
	}

}

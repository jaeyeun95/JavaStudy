package day7;

public class CallByReferenceTest {
	public static void main(String[] args) {
		int[] scoreList = {40, 78, 98};
		System.out.println("reference address1 : " + scoreList);
		changeScore(scoreList);
		
		int[] scoreList2 = {40, 78, 98};
		System.out.println("변경전 score : " + scoreList2[0]);
		changeScore2(scoreList2);
		System.out.println("변경후 score : " + scoreList2[0]);
	}
	
	private static void changeScore(int[] scoreList) {
		System.out.println("reference address2 : " + scoreList);
	}
	
	private static int[] changeScore2(int[] scoreList) {
		scoreList[0] = 100;
		System.out.println("변경된 score : " + scoreList[0]);
		
		return scoreList;
	}

}

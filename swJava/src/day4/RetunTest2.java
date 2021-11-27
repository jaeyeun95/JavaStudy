package day4;

public class RetunTest2 {
	public static void main(String[] args) {
		int[] scoreList = {34, 56, 21, 73, 5, 17, 98};
		double avgScore = calcAvg(scoreList);
		System.out.println("평균 점수 : " + avgScore);
	}
	
	private static double calcAvg(int[] scoreList) {
		int sum = 0;
		for (int i = 0; i < scoreList.length; i++) {
			sum = sum + scoreList[i];
		}
		return (double)sum/scoreList.length;
	}

}

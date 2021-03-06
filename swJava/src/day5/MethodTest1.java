package day5;

public class MethodTest1 {
	public static void main(String[] args) {
		int[] enScore = {55, 70, 45, 90, 100, 90, 95};
		System.out.println("영어 평균 : " + getAvgScore(enScore));
		
		int[] koScore = {93, 55, 87, 80, 100, 95, 65};
		System.out.println("국어 평균 : " + getAvgScore(koScore));
	}
	
	private static double getAvgScore(int[] scoreList) {
		int sum = 0;
		double avgScore = 0.0;
		for (int i = 0; i < scoreList.length; i++) {
			sum = sum + scoreList[i];
		}
		avgScore = (double)sum/scoreList.length;
		return avgScore;
	}
}

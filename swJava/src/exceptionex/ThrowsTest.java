package exceptionex;

public class ThrowsTest {
    public static void main(String[] args) {
        System.out.println("program start...");
        int[] scoreList = {45, 77, 59, 88, 100};
        try {
            double avgScore = getAvgScore(scoreList);
            System.out.println("평균 점수 : " + avgScore);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("평균 구할 때 문제 발생");
        }
        System.out.println("program end...");
    }
    
    private static double getAvgScore(int[] scoreList){
        int sum = 0;
        for(int i =0 ; i<= scoreList.length; i++){
            sum = sum + scoreList[i];
        }

        return (double)sum/scoreList.length;

    }
}

package chapter4;

import java.util.Scanner;

public class GradeEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력해 주세요 : ");
        int score = sc.nextInt();

        checkGrade(score);

        sc.close();

    }

    public static char checkGrade(int score) {
        char grade = ' ';
        if (score >= 90 && score <= 100) {
            grade = 'A';
            System.out.println(grade + "학점입니다.");
            return grade;
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
            System.out.println(grade + "학점입니다.");
            return grade;
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
            System.out.println(grade + "학점입니다.");
            return grade;
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
            System.out.println(grade + "학점입니다.");
            return grade;
        } else {
            grade = 'F';
            System.out.println(grade + "학점입니다.");
        }
        return grade;

    }

}

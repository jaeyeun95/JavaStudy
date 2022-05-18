package chapter15.stream.others;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("이름 : ");
            String name = sc.nextLine();
            System.out.println("직업 : ");
            String job = sc.nextLine();
            System.out.println("사번 : ");
            int num;
            try {
                num = sc.nextInt();
                System.out.println(name);
                System.out.println(job);
                System.out.println(num);
                break;
            } catch (InputMismatchException e){
                sc = new Scanner(System.in);
                System.out.println(e.toString());
                System.out.println("예외 발생 ! 정수만 입력해 주세요.");
            } catch (Exception e){
                e.printStackTrace();
            }
        }




    }
}

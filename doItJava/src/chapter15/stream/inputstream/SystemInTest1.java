package chapter15.stream.inputstream;

import java.io.IOException;
import java.util.Scanner;

public class SystemInTest1 {
    public static void main(String[] args) {
        System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

        int i;
        try {
            i = System.in.read();
            System.out.println(i);
            System.out.println((char) i);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Scanner 사용한 버전
//        Scanner sc = new Scanner(System.in);
//        System.out.println("알파벳 입력하면 숫자로 변환시키는 프로그램입니다.");
//        System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
//        try {
//            String str = sc.next();
//            char alphabet = str.charAt(0);
//
//            System.out.println(alphabet);
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }



    }
}

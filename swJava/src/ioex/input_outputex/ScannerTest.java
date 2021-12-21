package ioex.input_outputex;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" < 이름을 입력하세요. >");
        String name = sc.nextLine();
        
        System.out.println(" < 전화번호를 입력하세요. >");
        String phone = sc.nextLine();

        sc.close();

        System.out.println(name + " 님의 전화번호 : " + phone);

    }
    
}

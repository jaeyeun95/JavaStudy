package utiles;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date currentDate = new Date();
        long start = currentDate.getTime();

        System.out.println(currentDate.toString());
        System.out.println(currentDate.toLocaleString());

        currentDate = new Date();
        long end = currentDate.getTime();
        System.out.println("프로그램이 수행에 걸린 시간 : " + (end -start) + "(ms)초");
    }
    
}

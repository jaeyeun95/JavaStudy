package utiles;

import java.text.Format;
import java.util.Calendar;
import java.util.Formatter;

public class FormatterTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Formatter formatter = new Formatter(sb);
        Calendar c = Calendar.getInstance();
        int i = 10;
        int j = 20;
        int k = i + j;
        String str = "<< 연산 결과 >>";

        formatter.format("%s%n", str);
        formatter.format("%d 과 %d 을 더하면 %d이 됩니다. %n", i, j, k);
        formatter.format("현재 시간은 %tk시 %tM분 %ts초입니다. %n", c,c,c);
        System.out.println(formatter.toString());
    }
    
}

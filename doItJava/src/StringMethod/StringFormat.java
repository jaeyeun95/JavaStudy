package StringMethod;

public class StringFormat {
    public static void main(String[] args) {
        /**
         * %d => Integer Formatting
         * %와 d 사이에 정수를 설정하면, 글자 길이를 설정할 수 있다.
         * 기본적으로 오른쪽 정렬이고, -를 붙일 경우 왼쪽정렬
         */

        int i = 23;
        System.out.println(String.format("%d", i));
        System.out.println(String.format("%d_", i));
        System.out.println(String.format("%5d_", i));
        System.out.println(String.format("%-5d_", i));
        System.out.println(String.format("%05d_", i));

        /**
         * %s => String Formatting
         * %s는 문자열을 그대로 출력한다.
         * %s 앞에 숫자(N)를 설정할 경우, str.length()가 N보다 작을 경우 공백을 추가한다.
         * 기본적으로 오른쪽 정렬이고, -를 붙일 경우 왼쪽정렬
         * 숫자(N)를 설정할 경우, 최대 N길이 만큼만 출력
         */
        String str = "tete";

        System.out.println(String.format("%s_", str));
        System.out.println(String.format("%12s_", str));
        System.out.println(String.format("%-12s_", str));
        System.out.println(String.format("%.2s_", str));
        System.out.println(String.format("%-12.2s_", str));
        System.out.println(String.format("%12.2s_", str));

        System.out.println("Format %s, %s : " + String.format("%s, %S", "KOREA", "japan"));

        String orderId = "20220321-241231";

        System.out.println("orderId %s : " + String.format("%s", orderId.replace("-","")));


    }
}

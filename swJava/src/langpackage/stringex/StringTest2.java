package langpackage.stringex;

public class StringTest2 {
    public static void main(String[] args) {
        char[] charArr = {'J','a','v','a'};
        byte[] byteArr = {65,66,67,68,69};

        String str1 = new String(charArr);
        String str2 = new String(charArr, 0, 2);

        String str3 = new String("Program");

        String str4 = new String(byteArr);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
    
}

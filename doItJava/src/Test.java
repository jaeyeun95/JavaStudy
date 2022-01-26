public class Test {
    public static void main(String[] args) {
        // String test = "abcd";
        // System.out.println(test.substring(1, 3));
        System.out.println("가운데 :: " + centerMsg("abcdefgh"));
    }

    public static String centerMsg(String msg) {
        String word = "";
        int length = msg.length();

        // System.out.println("length : " + length + " , " + length / 2);

        if (length % 2 == 0) {
            // System.out.println("짝수 " + length + ", " + length / 2);
            word = msg.substring((length / 2) - 1, (length / 2) + 1);
        } else {
            // System.out.println("홀수 " + msg.charAt((length / 2) + 1));
            word = String.valueOf(msg.charAt((length / 2)));
        }

        return word;
    }

}

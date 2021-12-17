package langpackage.stringbufferex;

public class StringBufferTest1 {
    public static void main(String[] args) {
        String str = "회사명";
        str.concat("자바전자");
        System.out.println("str ::"+str);

        StringBuffer strbuffer = new StringBuffer("회사명 : ");
        strbuffer.append("자바전자");
        System.out.println(strbuffer);
    }
    
}

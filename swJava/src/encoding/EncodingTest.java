package encoding;


public class EncodingTest {
    public static void main(String[] args) throws Exception {
        String str = "가나다똠, 펲, 믜, 븨, 뮹, 헿, 뷁";

        byte[] defaultbytes = str.getBytes();
        byte[] euchByte = str.getBytes("euc-kr");
        byte[] ksc5601Bytes = str.getBytes("ksc5601");
        byte[] ms949Bytes = str.getBytes("ms949");
        byte[] uniBytes = str.getBytes("unicode");
        byte[] utf16Bytes = str.getBytes("utf-16");
        byte[] utf16beBytes = str.getBytes("utf-16be");
        byte[] utf16leBytes = str.getBytes("utf-16le");
        byte[] utf8Bytes = str.getBytes("utf-8");
        byte[] latinBytes = str.getBytes("8859_1");

        System.out.println("기본인코딩으로 조합 : " + new String(defaultbytes));
        System.out.println("euc-kr로 조합 : " + new String(euchByte, "euc-kr"));
        System.out.println("ksc5601로 조합 : " + new String(ksc5601Bytes, "ksc5601"));
        System.out.println("MS-949로 조합 : " + new String(ms949Bytes, "ms949"));
        System.out.println("유니코드로 조합 : " + new String(uniBytes, "unicode"));
        System.out.println("utf-16 조합 : " + new String(utf16Bytes,"utf-16"));
        System.out.println("utf16beBytes : " + new String(utf16beBytes, "utf-16be"));
        System.out.println("utf16leBytes : " + new String(utf16leBytes, "utf-16le"));
        System.out.println("utf8Bytes : " + new String(utf8Bytes, "utf-8"));
        System.out.println("latinBytes : " + new String(latinBytes, "8859_1"));
    }
    
}

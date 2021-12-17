package langpackage.stringex;

public class StringTest1 {
    public static void main(String[] args) {
        String company1 = new String("자바");
        String company2 = company1.concat("마트");
        System.out.println(company1);
        System.out.println(company2);

        String str3 = "abc" + true;

        System.out.println(str3);
    }
    
}

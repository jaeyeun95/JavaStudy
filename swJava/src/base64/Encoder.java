package base64;

import java.util.Base64;

public class Encoder {
    public static void main(String[] args) {
        String originalInput = "test input";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println("original :: " + originalInput);
        System.out.println("base64 :: " + encodedString);
    }
    
}

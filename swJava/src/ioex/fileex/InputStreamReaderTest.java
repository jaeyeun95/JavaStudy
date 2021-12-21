package ioex.fileex;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        try {
            InputStream in = System.in;
            
            InputStreamReader reader = new InputStreamReader(in);

            BufferedReader buffReader = new BufferedReader(reader);

            System.out.println(" < 이름을 입력하세요. >");
            String name = buffReader.readLine();
            
            System.out.println(" < 전화번호를 입력하세요. >");
            String phone = buffReader.readLine();

            buffReader.close();
            reader.close();
            in.close();
            System.out.println(name + " 님의 전화번호 : " + phone);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

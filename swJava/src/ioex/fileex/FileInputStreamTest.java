package ioex.fileex;

import java.io.FileInputStream;

public class FileInputStreamTest {
    public static void main(String[] args) throws Exception {
        int data;
        FileInputStream input = new FileInputStream("D:\\test\\FileInputStreamTest.java");
        while( (data = input.available()) > 0){
            byte[] bytes = new byte[data];
            int result = input.read(bytes);
            if( result == -1)
                break;
            String str = new String(bytes);
            System.out.print(str);
        }
        input.close();
    }
    
}

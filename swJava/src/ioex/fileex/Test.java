package ioex.fileex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test{
    public static void main(String[] args) throws IOException {
        FileInputStream input = null;
        FileOutputStream output = null;

        input = new FileInputStream("D:\\test\\InputTest.java");
        output = new FileOutputStream("D:\\test\\OutputTest.java", false);
        long start = System.currentTimeMillis();
        int ch = 0;
        while( (ch = input.read()) != -1){
            output.write(ch);
        }
        long end = System.currentTimeMillis();
        System.out.println("파일 복사에 걸린 시간 : " + (end - start) + "ms(초)");
        output.close();

    }
}
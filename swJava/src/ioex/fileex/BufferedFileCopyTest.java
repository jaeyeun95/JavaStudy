package ioex.fileex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopyTest {
    public static void main(String[] args) throws Exception {
        FileInputStream input = null;
        BufferedInputStream buffInput = null;
        FileOutputStream output = null;
        BufferedOutputStream buffOutput = null;

        input = new FileInputStream("D:\\test\\InputTest.java");
        buffInput = new BufferedInputStream(input);
        output = new FileOutputStream("D:\\test\\InputTest_copy22.java", false);
        buffOutput = new BufferedOutputStream(output);

        long start = System.currentTimeMillis();
        int ch = 0;
        while ( (ch = buffInput.read()) != -1){
            buffOutput.write(ch);
        }
        long end = System.currentTimeMillis();
        buffInput.close();
        input.close();
        buffOutput.close();
        output.close();
        System.out.println("파일 복사에 걸린 시간 : " + (end -start) + "ms(초)");


    }
    
}

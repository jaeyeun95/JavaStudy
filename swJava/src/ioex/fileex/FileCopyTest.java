package ioex.fileex;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {
    public static void main(String[] args) throws Exception {
        FileInputStream input = null;
        FileOutputStream output = null;

        input = new FileInputStream("D:\\test\\InputTest.java");
        output = new FileOutputStream("D:\\test\\InputTest_copy.java", false);
        int size = input.available();
        byte[] buff = new byte[size];
        long start = System.currentTimeMillis();

        int readCount = input.read(buff);
        output.write(buff, 0, readCount);

        long end = System.currentTimeMillis();
        System.out.println("파일 복사에 걸린 시간 : " + (end -start) + "ms(초)");
        input.close();
        output.close();

    }
    
}

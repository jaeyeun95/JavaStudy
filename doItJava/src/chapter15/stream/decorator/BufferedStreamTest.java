package chapter15.stream.decorator;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {
        long milliseconds = 0;
        try (FileInputStream fis = new FileInputStream("a.zip")) {
            FileOutputStream fos = new FileOutputStream("copy.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            milliseconds = System.currentTimeMillis();
            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            milliseconds = System.currentTimeMillis() - milliseconds;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일 복사하는 데 " + milliseconds + " milliseconds 소요되었습니다.");

    }
}

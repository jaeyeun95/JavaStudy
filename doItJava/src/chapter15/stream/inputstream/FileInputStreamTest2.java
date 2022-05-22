package chapter15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    // 파일 끝까지 읽기
    // try~with~resource 구문을 사용
    // fis.read() 메서드는 파일을 읽는 경우 파일의 끝에 도달하면 -1을 반환한다.
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int i;
            while ((i = fis.read()) != -1){
                System.out.println((char) i);
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

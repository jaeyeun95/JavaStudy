package ioex.fileex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) {
        try {
            // 파일에서 데이터를 읽기 위해 FileReader 객체를 생성하고, 버퍼링 기능을 추가하기 위해서 BufferedReader 와 결합
            FileReader reader = new FileReader("D:\\coding\\study_workspace\\JavaStudy\\swJava\\src\\ioex\\fileex\\FileReaderTest.java");
            BufferedReader bReader = new BufferedReader(reader);

            String data = null;
            int lineNumber = 0;
            while((data = bReader.readLine()) != null){
                System.out.println(++lineNumber + " : " + data + "\n");
            }
            bReader.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

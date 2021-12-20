package ioex.fileex;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("D:\\coding\\study_workspace\\JavaStudy\\swJava\\src\\ioex\\fileex\\FileReaderTest.java");
            FileWriter writer = new FileWriter("D:\\coding\\study_workspace\\JavaStudy\\swJava\\src\\ioex\\fileex\\FileReaderTest_copy.java");

            int ch = 0;
            while ( (ch = reader.read()) != -1){
                System.out.print((char)ch);
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

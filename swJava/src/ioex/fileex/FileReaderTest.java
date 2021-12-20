package ioex.fileex;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("D:\\coding\\study_workspace\\JavaStudy\\swJava\\src\\ioex\\fileex\\FileReaderTest.java");
            // D:\coding\study_workspace\JavaStudy\swJava\src\ioex\fileex
            int ch = 0;
            while ( (ch = reader.read()) != -1){
                System.out.print((char)ch);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

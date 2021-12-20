package ioex.fileex;

import java.io.File;
import java.io.IOException;

public class FileTest{
    public static void main(String[] args) {
        File file = new File("D:\\test\\Test.java");
        String fileName= file.getName();
        System.out.println("fileName :: " + fileName);

        if(file.exists()){
            try {
                System.out.println(fileName);
                System.out.println(file.getPath());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.getCanonicalPath());
                System.out.println(file.getParent());
                if(file.canWrite()){
                    System.out.println(fileName + " 은 쓸 수 있다.");
                } else {
                    System.out.println(fileName + " 은 폴더다.");
                }
                System.out.println(fileName + " 의 크기 : " + file.length());

            } catch (IOException e) {
                System.out.println(e);
            } 
        }
        else {
            System.out.println("파일을 찾을 수 없다 : " + fileName);
        }
    }
}
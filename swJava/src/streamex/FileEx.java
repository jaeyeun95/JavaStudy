package streamex;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        String path = "D:\\test";

        String fileName = "123123123.txt";

        File file = new File(path + File.separator + fileName);

        System.out.println(file);
    }
    
}

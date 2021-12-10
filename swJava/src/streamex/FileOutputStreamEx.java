package streamex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = null;
        try {
            // 경로
            String path = "D:\\test";
            // 해당 경로에 파일 객체를 만들고
            File f = new File(path);
            // 해당 경로에 test 라는 파일이 없으면 만들어주고
            if(!f.exists())
                f.mkdirs();

            // FileOutputStream (String name, boolean append))
            // name = 파일 시스템의 실제 경로, append 가 true 면 이어쓰기의 기능, false 면 덮어쓰기의 기능
            fos = new FileOutputStream(path+File.separator+"fileout2.txt", true);
            String msg = "HI FILEOUTPUTSTREAM";
            fos.write(msg.getBytes());
        } catch (FileNotFoundException fn) {
            fn.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if(fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
    
}

package streamex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = null;
        try {
            String path = "D:\\test";
            File f = new File(path);
            if(!f.exists())
            f.mkdirs();

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

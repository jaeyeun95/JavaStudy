package ioex.fileex;

import java.io.FileWriter;
import java.util.Calendar;

public class FileWriterAppendTest {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\coding\\study_workspace\\JavaStudy\\swJava\\src\\ioex\\fileex\\logFile.txt");

            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int min = cal.get(Calendar.MINUTE);
            int sec = cal.get(Calendar.SECOND);
            String time = hour + "시 " + min + "분 " + sec + "초";
            String logMsg = time + "에 발생된 로그 메시지\n";
            writer.write(logMsg);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

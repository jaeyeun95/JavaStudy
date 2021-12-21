package ioex.input_outputex;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        InputStreamReader inReader = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(inReader);

        FileOutputStream output = new FileOutputStream("D:\\test\\PrintWriterTest.txt");
        PrintWriter writer = new PrintWriter(output, true);

        System.out.println("[저장할 메시지를 입력하세요.]");
        String msg = null;

        while( (msg = reader.readLine()) != null){
            writer.println(msg);
        }
        reader.close();
        inReader.close();
        in.close();
        writer.close();
        output.close();

    }
    
}

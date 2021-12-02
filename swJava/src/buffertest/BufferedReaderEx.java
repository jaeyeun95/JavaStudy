package buffertest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedReaderEx{
    public static void main(String[] args) throws IOException {
        // try {
        //     // 콘솔에서 입력 받을 경우
        //     // Scanner 와 비슷
        //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //     // String이 리턴값이라 형변환 필수, 라인단위임
        //     // int num = Integer.parseInt(br.readLine());
        //     br.close(); // 입출력이 끝난 후 닫아주기

        //     System.out.println("test");
            
        // } catch (IOException e) {
        //     e.printStackTrace();
        //     System.out.println(e.getMessage());
        // }
        // BufferedWriter bw = new BufferedWriter(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.append("bufferTest");


        System.out.println(msg(writer.toString()));
    }

    public static String msg(String msg){
        try {
            // 콘솔에서 입력 받을 경우
            // Scanner 와 비슷
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // String이 리턴값이라 형변환 필수, 라인단위임
            // int num = Integer.parseInt(br.readLine());
            br.close(); // 입출력이 끝난 후 닫아주기

            
            return br.toString();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return "에러발생";
    }

}
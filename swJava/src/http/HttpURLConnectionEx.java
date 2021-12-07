package http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionEx {
    public void restAPI(){
        String strUrl= "";
        String jsonMessage ="";
        try {
            URL url = new URL(strUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(5000);    // 서버에 연결되는 Timeout 시간 설정
            con.setReadTimeout(5000);   // InputStream 읽어 오는 Timeout 시간 설정
            // con.addRequestProperty("x-api-key", RestTestCommon.API_key); // request 설정

            con.setRequestMethod("POST"); // POST 로 요청, default 는 GET 이다.

            // json 으로 message를 전달하고자 할 때
            con.setRequestProperty("Content-Type", "application/json"); // header 에 Content-Type 설정
            con.setDoInput(true);   // InputStream 으로 응답 헤더와 메세지를 읽어들이겠다는 옵션

            // POST 데이터를 OutputStream 으로 넘겨 주겠다는 설정
            // 서버로부터 받는 값이 있다면 true
            con.setDoOutput(true);
            con.setUseCaches(false);
            con.setDefaultUseCaches(false);

            // input : 읽기, output : 쓰기 라고 생각하면 이해가 편하다.
            // OutputStreamWriter 객체에 서버로 전달할 데이터를  wr.write() 로 쓰고 wr.flush() 로 커밋

            // 새로운 OutputStream 에 요청할 OutputStream을 넣는다.
            OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
            // OutputStreamWriter 에 메시지를 써서 보낸다.
            wr.write(jsonMessage); // json 형식의 message 전달
            wr.flush();

            StringBuilder sb = new StringBuilder();
            if(con.getResponseCode() == HttpURLConnection.HTTP_OK){
                // Stream을 처리해줘야 하는 번거로움이 있음
                // 응답받은 메시지의 길이만큼 버퍼를 생성하여 utf-8 로 인코딩해서 읽어 들인다.
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
                String line;
                // 표준 출력으로 한 라인씩 출력한다.
                while( (line = br.readLine()) != null){
                    sb.append(line).append("\n");
                }
                br.close();
                System.out.println("" + sb.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}

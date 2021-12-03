package bufferex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx1 {
	public static void main(String[] args) {
		try {	// 예외처리 필수! 또는 throwsIOException 해주기
			// 콘솔에서 입력 받을 경우, Scanner 와 비슷
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner 로 입력받는 것과 비슷하다
			
			// 파일에서 입력받을 경우
//			FileReader fr = new FileReader("BufferedReaderEx1.java");
//			BufferedReader br_f = new BufferedReader(fr);
			
			// buffered
			System.out.println("br : " + br.readLine());
			// String이 리턴값이라 형변환 필수 ! 라인 단위임
//			int num = Integer.parseInt(br.readLine());
			br.close();	// 입출력이 끝난 후 닫아주기
			
			
			// 파일의 한 줄 한 줄 읽어서 출력
			String line = "";
//			for(int i =1; (line = br_f.readLine())!= null; i++) {
//				System.out.println(line);
//			}

			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}

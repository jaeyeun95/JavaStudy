package day2;

/**
 * 파일명 : CommentsTest.java
 * 작성일 : 
 * 작성자 : 
 * -> javadoc 형태의 주석 처리에 사용
 * 
 * */
public class CommentsTest {
	
	static String s = "출력될 내용은 다음과 같습니다. \n";
	
	// 두 번째 줄에 내용을 출력하는 메서드 선언
	static String getMessage() {
		return "처음 작성한 자바 프로그램입니다.";
	}
	public static void main(String[] args) {
		System.out.println(s + getMessage()); // 단일행 주석
	}
 
}

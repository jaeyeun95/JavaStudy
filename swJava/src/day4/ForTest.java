package day4;

public class ForTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자 : " + i);
//			int i =20; // error 조건식과 중복 선언
		}
//		System.out.println("최종 증가된 i 값 : " + i); // error, for 블록 안에서 선언된 변수를 밖에서 사용
	}

}

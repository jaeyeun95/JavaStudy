package chapter15.stream.others;

public class ScannerCatchLoop {
    public static void main(String[] args) {
        // 예외일 경우 반복 실행하기
        int i = -3;

        // 방법 1. while 문사용
        System.out.println("While문을 이용한 Exception발생시 반복 처리");

        while (true){
            try {
                if (i <= 0){
                    throw new IllegalArgumentException("예외발생 !! ");
                }
                return;
            } catch (Exception e){
                i++;
                System.out.println(e.getMessage());
            }
        }
    }
}

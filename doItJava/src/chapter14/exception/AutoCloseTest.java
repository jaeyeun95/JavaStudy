package chapter14.exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        try (AutoCloseObj obj = new AutoCloseObj()){
            throw new Exception();  // 가엦 에외 발생
        }catch (Exception e){
            System.out.println("예외 부분입니다.");
        }
    }
}

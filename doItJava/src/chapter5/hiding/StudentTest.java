package chapter5.hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student();
        // lee.studentName = "이상원"; private로 접근이 제한되어 있어서 에러
    }

}

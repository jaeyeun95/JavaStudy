package chapter5.classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student Ahn = new Student();
        Ahn.studentName = "안연수";

        System.out.println(Ahn.studentName);
        System.out.println(Ahn.getStudentName());
    }

}

package chapter6.staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 Lee = new Student2();
        Lee.setStudentName("이지원");
        System.out.println(Student2.getSerialNum());
        System.out.println(Lee.studentName + " 학번 : " + Lee.studentID);

        Student2 Son = new Student2();
        Son.setStudentName("손수경");
        System.out.println(Student2.getSerialNum());
        System.out.println(Son.studentName + " 학번 : " + Son.studentID);
    }

}

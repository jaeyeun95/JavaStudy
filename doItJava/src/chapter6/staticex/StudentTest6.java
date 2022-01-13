package chapter6.staticex;

public class StudentTest6 {
    public static void main(String[] args) {

        Student3 Lee = new Student3();
        Lee.setStudentName("이지원");
        System.out.println(Student3.getSerialNum());
        System.out.println(Lee.studentName + " 카드 번호 : " + Lee.studentNo);

        Student3 Son = new Student3();
        Son.setStudentName("손수경");
        System.out.println(Student3.getSerialNum());
        System.out.println(Son.studentName + " 카드 번호 : " + Son.studentNo);
    }

}

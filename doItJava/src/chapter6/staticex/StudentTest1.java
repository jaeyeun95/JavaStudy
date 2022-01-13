package chapter6.staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student Lee = new Student();
        Lee.setStudentName("이지원");
        System.out.println(Lee.serialNum);
        Lee.serialNum++;

        Student Son = new Student();
        Son.setStudentName("손수경");
        System.out.println(Son.serialNum);
        System.out.println(Lee.serialNum);
    }

}

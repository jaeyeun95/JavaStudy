package chapter5.classpart;

public class Student {
    // 멤버 변수
    int studentID;
    String studentName;
    int grade;
    String address;

    // 메서드
    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Student Ahn = new Student();
        Ahn.studentName = "안연수";
        // Ahn.setStudentName("안연수1");

        System.out.println(Ahn.studentName);
        System.out.println(Ahn.getStudentName());
    }
}

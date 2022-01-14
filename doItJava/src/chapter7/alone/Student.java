package chapter7.alone;

public class Student {
    int studentID;
    String name;

    Student() {
    }

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void showStudentInfo() {
        System.out.println(studentID + "," + name);
    }

}

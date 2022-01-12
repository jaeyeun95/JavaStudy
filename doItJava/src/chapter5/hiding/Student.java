package chapter5.hiding;

public class Student {
    int studentID;
    private String studentName;

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

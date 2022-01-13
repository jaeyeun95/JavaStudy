package chapter6.staticex;

public class Student1 {
    public static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    // 학생이 생성될 때마다 serialNum 이 1씩 증가하고 증가된 값을 학번 인스턴스에 부여
    public Student1() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

}

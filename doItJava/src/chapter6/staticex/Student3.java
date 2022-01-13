package chapter6.staticex;

public class Student3 {
    private static int serialNum = 1000;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;
    int studentNo; // 학생 카드 번호 = 학번 + 100;

    public Student3() {
        serialNum++;
        studentID = serialNum;
        studentNo = serialNum + 100;
    }

    // public int getStudentNo() {
    // return studentNo;
    // }

    // public void setStudentNo() {
    // studentNo = serialNum + 100;
    // }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    // serialNum
    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student3.serialNum = serialNum;
    }

}

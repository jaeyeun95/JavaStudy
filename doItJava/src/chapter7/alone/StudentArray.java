package chapter7.alone;

public class StudentArray {
    public static void main(String[] args) {
        // Student James = new Student(1001, "James");
        // Student Tomas = new Student(1002, "Tomas");
        // Student Edward = new Student(1003, "Edward");

        Student[] strArr = new Student[3];
        strArr[0] = new Student(1001, "James");
        strArr[1] = new Student(1002, "Tomas");
        strArr[2] = new Student(1003, "Edward");

        for (int i = 0; i < strArr.length; i++) {
            strArr[i].showStudentInfo();
        }
    }

}

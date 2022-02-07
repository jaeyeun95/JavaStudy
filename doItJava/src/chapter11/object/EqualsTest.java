package chapter11.object;

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentId + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentId == std.studentId)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentId;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student lee = new Student(100, "이상원");
        Student lee2 = lee; // 주소 복사
        Student sang = new Student(100, "이상원");

        if (lee == lee2) {
            System.out.println("lee 와 lee2의 주소는 같습니다.");
        } else {
            System.out.println("lee와 lee2의 주소값은 다릅니다.");
        }

        if (lee.equals(lee2)) {
            System.out.println("lee와 lee2는 동일합니다.");
        } else {
            System.out.println("lee 와 lee2 는 동일하지 않습니다.");
        }

        if (lee == sang) {
            System.out.println("lee와 sang의 주소는 같습니다.");
        } else {
            System.out.println("lee와 sang의 주소는 다릅니다.");
        }

        if (lee.equals(sang)) {
            System.out.println("lee와 sang은 동일합니다.");
        } else {
            System.out.println("lee와 sang은 동일하지 않습니다.");
        }

        System.out.println("lee의 hashCode : " + lee.hashCode());
        System.out.println("sang의 hashCode : " + sang.hashCode());

        System.out.println("lee의 실제 주소값 : " + System.identityHashCode(lee));
        System.out.println("sang의 실제 주소값 : " + System.identityHashCode(sang));

    }
}

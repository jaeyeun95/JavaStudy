package stream.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String name;
    int age;

    Student() {
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ListToMap2 {
    public static void main(String[] args) {
        int max = 3;

        Student student = new Student("학생1", 11);
        Student student2 = new Student("학생2", 12);
        Student student3 = new Student("학생3", 13);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println("studentList : " + studentList.toString());

        Student totalStudent;
        Map<String, Integer> studentMap = new HashMap<>();

        for (int i = 0; i < studentList.size(); i++) {
            totalStudent = studentList.get(i);
            studentMap.put(totalStudent.name, totalStudent.age);
        }
        System.out.println("studentMap : " + studentMap.toString());
        System.out.println(studentMap.get("학생1"));
        System.out.println(studentMap.size());

        // stream 사용
        Map<String, Integer> map = studentList.stream()
                .collect(Collectors.toMap(
                        i1 -> i1.name, i2 -> i2.age
                ));

        System.out.println("## map : " + map.toString());


    }
}

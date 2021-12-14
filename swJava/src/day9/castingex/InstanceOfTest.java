package day9.castingex;

class Employee {}

class Manager extends Employee{}

public class InstanceOfTest {
    public static void main(String[] args) {
        Manager m = new Manager();
        Employee e = new Employee();
        System.out.println(m instanceof Manager);   // true
        System.out.println(m instanceof Employee);  // true
        System.out.println(e instanceof Manager);   // true

    }
    
}

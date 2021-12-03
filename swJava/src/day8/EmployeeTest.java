package day8;

class Employee {
	String name;
	int deptNo;
	String grade;
}

class Manager extends Employee{
	String boss;
	char grade;
	
	void printGrade() {
		this.grade = 'A'; // Manager 자신이 가진 멤버 변수 grade 에 char 형의 값을 할당함
		super.grade = "A등급";
		System.out.println("자식 객체의 grade : " + this.grade);
		System.out.println("부모 객체의 grade : " + super.grade);
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Manager kim = new Manager();
		kim.printGrade();
	}
}

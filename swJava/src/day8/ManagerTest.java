package day8;

//class Employee {
//	public String name;
//	int employeeNo;
//	private int salary;
//	int age;
//	public String jobTitle;
//	protected int deptNo;
//	String grade;
//
//}
//
//class Mannager extends Employee{
//	String jobOfManage;
//	String boss;
//}

public class ManagerTest {
	public static void main(String[] args) {
		Manager kim = new Manager();
		kim.name = "김재준";
		kim.employeeNo = 12345;
//		kim.salary = 540;	private으로 선언된 변수는 선언된 클래스 내부에서만 사용 가능
		kim.age = 46;
		kim.jobTitle = "인사 팀장";
		kim.deptNo = 105;
		kim.grade = "A등급";
		kim.jobOfManage = "인사 관리";
		kim.boss = "성동일";
	}

}
